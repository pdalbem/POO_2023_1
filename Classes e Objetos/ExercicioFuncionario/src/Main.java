import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TAM =5;
        Scanner ent = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[TAM];


        double soma = 0;
        for (int i=0;i<TAM;i++)
        {
            System.out.println("Digite o nome: ");
            String nome = ent.nextLine();
            System.out.println("Digite o salário: ");
            double sal = ent.nextDouble();
            ent.nextLine();
            soma = soma+sal;
            Funcionario f = new Funcionario(nome,sal);
         /*   Funcionario f = new Funcionario();
            f.setNome(nome);
            f.setSalario(sal);*/
            funcionarios[i] = f;
            //A linha abaixo substitui as 2 acima
            //funcionarios[i] = new Funcionario(nome,sal);
        }
        double media = soma/TAM;
        System.out.println("Média dos salários: "+ media);

        for (Funcionario func:funcionarios)
        {
            if (func.getSalario()>=media) {
                System.out.println("Nome: "+ func.getNome());
                func.setSalario(func.getSalario()*1.05);
            }
            else func.setSalario(func.getSalario()*1.10);
        }

        for (Funcionario func:funcionarios){
            System.out.println("Nome: "+ func.getNome());
            System.out.println("Salário: " +func.getSalario());
        }






    }
}