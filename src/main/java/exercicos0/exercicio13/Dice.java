package exercicos0.exercicio13;

public class Dice {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 7) {
                    System.out.println(i + " + " + j + " = 7");
                }
            }
        }
    }
}
