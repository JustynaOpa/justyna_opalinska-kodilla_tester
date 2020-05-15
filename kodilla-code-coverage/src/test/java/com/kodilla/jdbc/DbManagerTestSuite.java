package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUser() throws SQLException{
        //given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()){
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Ottoman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);

        //when
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter ++;
        }
        int expected = count + 3;
        Assert.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }
    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //given
        DbManager dbManager = DbManager.getInstance();
        String postsQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POST_NR\n" +
                "FROM USERS U \n" +
                "JOIN POST P\n" +
                "ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(postsQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("ID");
        }


        //when
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME\n" +
                "FROM USERS U \n" +
                "JOIN POST P\n" +
                "ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >1;";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);


        //then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter ++;
        }
        int result = count;
        Assert.assertEquals(result, counter);

        rs.close();
        statement.close();
    }
}
