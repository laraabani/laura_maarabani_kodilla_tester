public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementy");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}