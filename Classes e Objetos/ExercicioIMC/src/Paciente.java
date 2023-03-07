public class Paciente {
    private String nome;
    private double altura;
    private double peso;

    public void calcularIMC()
    {
        double imc = this.peso / (this.altura * this.altura);
        System.out.printf("IMC: %.2f", imc);
        if (imc<18.5)
            System.out.println("Abaixo do peso");
        else if (imc<24.9)
            System.out.println("Peso normal");
        else if (imc < 29.9)
            System.out.println("Acima do peso");
        else if (imc < 34.9)
            System.out.println("Obesidade I");
        else if (imc < 39.9)
            System.out.println("Obesidade II");
        else if (imc >40)
            System.out.println("Obesidade III");

    }

    public Paciente() {
    }

    public Paciente(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
