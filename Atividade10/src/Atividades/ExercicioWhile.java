package Atividades;
import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int menoresDe21 = 0;
        int maioresDe50 = 0;

        System.out.print("Digite uma idade: ");
        idade = scanner.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
                menoresDe21++;
            } else if (idade > 50) {
                maioresDe50++;
            }
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);
    }
}

