import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TAM =5;
        double[] notas = new double[TAM];
        Scanner ent = new Scanner(System.in);

        double soma=0;
        for (int i=0; i<TAM; i++){
            System.out.println("Digite a nota " +(i+1)+":" );
            notas[i] = ent.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / TAM;
        System.out.println("Média: " + media);

        System.out.println("Notas maiores que a média: ");

        /*for (int i=0; i<TAM; i++)
            if (notas[i]> media)
                System.out.println("Nota: " + notas[i]);
*/
        //for aprimorado:
        for (double n:notas)
            if (n>media)
                System.out.println("Nota: " +n);

    }
}