import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ent = new Scanner(System.in);
        System.out.println("Lado a: ");
        a = ent.nextInt();
        System.out.println("Lado b: ");
        b = ent.nextInt();
        System.out.println("Lado c: ");
        c = ent.nextInt();

        if (a<(b+c) && b<(a+c) && c<(a+b)){
           if (a==b && b==c)
              System.out.println("Triângulo equilátero");
             else if (a==b || a==c || b==c)
               System.out.println("Triângulo isósceles");
               else
               System.out.println("Triângulo escaleno");
        }
        else
            System.out.println("Não forma triângulo");
    }
}