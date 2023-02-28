public class Loops2 {
    public static void main(String[] args) {
        int[] liczby = new int[]{1, 2, 3, 4, 5};
        int suma = 0;
        int numberOfElements = liczby.length;
        System.out.println(numberOfElements);
        for (int i = 1; i < liczby.length; i = i + 1) {
                suma = suma + liczby[i];
            System.out.println(suma);
            } }
    }

