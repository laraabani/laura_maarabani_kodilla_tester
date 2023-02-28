public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[3];
        movies[0] = "laland";
        movies[1] = "dziewczyny z dubaju";
        movies[2] = "moj brat niedzwiedz";

        String movie = movies[2];
        System.out.println(movie);

        int numberOfElements = movies.length;
        System.out.println(numberOfElements);

        System.out.println(movies[0]);
    }
}
