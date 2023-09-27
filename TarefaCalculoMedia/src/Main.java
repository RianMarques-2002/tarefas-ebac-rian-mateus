import java.util.Scanner; // Biblioteca necessária para criar o objeto de input

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota da atividade 1: ");
        double a1 = input.nextDouble();

        System.out.println("Informe a nota da atividade 2: ");
        double a2 = input.nextDouble();

        System.out.println("Informe a nota da atividade 3: ");
        double a3 = input.nextDouble();

        System.out.println("Informe a nota da atividade 4: ");
        double a4 = input.nextDouble();

        double soma = a1 + a2 + a3 + a4; // Faz a soma dos valores inseridos pelo usuário
        double media = soma / 4;  // Realiza a média dos valores

        System.out.println("Sua média final foi: " + media);

        if (media >= 7) {
            System.out.println("Parabéns pela aprovação!");
        }   else {
            System.out.println("Infelizmente você não atingiu a nota necessária :(");
        }
    }
}
