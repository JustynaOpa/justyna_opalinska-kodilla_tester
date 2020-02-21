public class SimpleyArray {
    public static void main(String[] args)

    {
        String[] movies = new String[5];
        movies[0] = "Szogun";
        movies[1] = "Home Alone";
        movies[2] = "Home Alone 2";
        movies[3] = "Equalizer";
        movies[4] = "Romeo and Juliet";

        String movie = movies[3];
        System.out.println(movies[3]);

        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera" + " " +numberOfElements + " " +"elementów");
    }
}
