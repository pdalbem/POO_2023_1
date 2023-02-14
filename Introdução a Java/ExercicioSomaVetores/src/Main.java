import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.println("Digite o valor " +(i+1)+ " para o vetor A:");
            vetA[i] = ent.nextInt();
            System.out.println("Digite o valor " +(i+1)+ " para o vetor B:");
            vetB[i] = ent.nextInt();
            vetC[i] = vetA[i]+ vetB[i];
        }

        System.out.println("Vetor C: ");
        for (int v:vetC)
            System.out.println(v);

    }
}