import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    public void shouldReturnNameAndAge(){
        User user = new User("Anna", 28);
        User user1 = new User("Elsa", 30);

        String name = user.getName();
        String name1 = user1.getName();
        int age = user.getAge();
        int age1 = user1.getAge();

        assertEquals("Anna", name);
        assertEquals("Elsa", name1);

        assertEquals(28, age);
        assertEquals(30,age1);
    }
}
