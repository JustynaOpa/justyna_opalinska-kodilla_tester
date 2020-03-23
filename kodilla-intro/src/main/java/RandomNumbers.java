import java.util.Random;

public class RandomNumbers {
    int maxSum;                             //klasa RundomNumbers w ktorej zadeklarowane są zmienne.
    int bound;
   private int minNn = Integer.MAX_VALUE;
    private int maxNn = Integer.MIN_VALUE;

    public RandomNumbers(int maxSum, int bound) {
        this.maxSum = maxSum;                   //konstruktor: przypisanie argumentów do zmiennych
        this.bound = bound;

    }

    public void calculateOfRandomNumbers() {        //metoda obliczająca
        Random random = new Random();           //tworzenie nowego obiektu typu Random
        int sum = 0;                            //wartosc poczatkowa 0
        while (maxSum >= sum) {                 //warunek losowania czyli losujemy az nie przkrozczymy wartosci maxSum
            int nn = random.nextInt(bound);     //losowanie liczb z okreslnoego zakresu
            sum = sum + nn;                     //wylosowana wartosc + wartosc poczatkowa
            if (nn < minNn) {     //warunek: jezeli wylosowana wartość jest mniejsza niż minNn wtedy przyjmuje watosc minNn.
                minNn = nn;
            }
            if (nn > maxNn) {     //warunek2: jezeli wylosowana wartość jest większa od maxNn wtedy przyjmyje wartość maxNN
                maxNn = nn;
            }
        }
    }




    public int getMinNn() {
        return minNn;           //metoda get, ktora zwraca wartosc minimalna
    }

    public int getMaxNn() {
        return maxNn;           //metoda get, ktora zwraca wartośc maksymalną
    }

    public static void main(String[] ags) {     //metoda main
        RandomNumbers randomNumbers = new RandomNumbers(5000, 30);     //nowy obiekt klasy RandomNumbers ze zdefiniowanymi wartosciami
        randomNumbers.calculateOfRandomNumbers();  //wywołanie metody calculateOfRndNbrs
        System.out.println(randomNumbers.getMaxNn());   //wyswietlanie wartosci min i max
        System.out.println(randomNumbers.getMinNn());

    }

}
