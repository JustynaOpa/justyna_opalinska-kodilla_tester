public class LeapYear {
    public boolean leapYear(int year) {
        if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0) {
            System.out.println("YES! This is leap year");
            return true;

        } else if ((year % 4) == 0 &&(year % 100) == 0) {
            System.out.println("Ohh...this is not a leap year...");
            return false;

        } else if ((year % 4) == 0) {
            System.out.println("YES! This is leap year");
            return true;

        } else {
            System.out.println("Ohh...this is not a leap year...");
            return false;
        }

    }
}


