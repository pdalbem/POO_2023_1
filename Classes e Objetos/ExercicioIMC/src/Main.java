import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = ent.nextLine();

        System.out.println("Digite o peso: ");
        double peso = ent.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = ent.nextDouble();

        Paciente paciente1 = new Paciente(nome, altura, peso);
        paciente1.calcularIMC();

    }
}