public class LeapYear {
    public static void main(String[] args) {
        int rok = 2024;
        System.out.println(rok);

        if (rok % 4 == 0 && rok % 100 > 0 || rok % 400 == 0) {
            System.out.println("rok przystepny");
        } else {
            System.out.println("nie przystepny");
        }
    }
}

