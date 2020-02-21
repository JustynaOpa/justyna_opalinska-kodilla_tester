public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        User user1 = new User("Adam", 40);
        User user2 = new User("Ewa", 39);
        User user3 = new User("Kain", 18);
        User user4 = new User("Abel", 16);

        User[] users = new User[]{user1, user2, user3,user4};


        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        int wynik = 0;
        for (int i = 0; i < users.length; i++) {
            wynik += users[i].getAge();  // wynik = wynik + age[i];
        }
        int srednia = wynik / users.length;

        System.out.println(srednia);


        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < srednia) {
                System.out.println(users[i].getName());
            }


        }


    }


}
