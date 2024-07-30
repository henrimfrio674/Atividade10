package Atividades;
import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o último número do intervalo: ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido!");
        } else {
            System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }
    }
}

