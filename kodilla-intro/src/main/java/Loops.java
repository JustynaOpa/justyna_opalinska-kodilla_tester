public class Loops {
    public static void main(String[] args) {


        String[] names = new String[]{"Ala", "Ola", "Ula", "Ela", "Iza"};
        int numberOfNames = names.length;
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }


        String[] number = new String[]{"2", "4", "6", "8", "10"};
        int summary = number.length;
        {
            System.out.println(number.length);
        }


        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }

    public int Suma(int[] liczby) {
        int wynik;
        for (int i = 0; i < liczby.length; i++) ;
        {
            wynik = liczby.length;
        }
        return wynik;


    }


}
