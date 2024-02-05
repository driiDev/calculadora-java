import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Escolha uma operação: +, -, x, /");
        String operacao = tc.next();

        System.out.println("Digite um número:");
        double a = tc.nextDouble();
        System.out.println("Digite outro número:");
        double b = tc.nextDouble();

        if (operacao.equals("+")){
           double soma = a + b;
           System.out.println("O resultado é: " + soma);
        } else if (operacao.equals("-")) {
            double subtracao = a - b;
            System.out.println("O resultado é: " + subtracao);
        }
        else if (operacao.equals("x")){
            double multiplicacao = a * b;
            System.out.println("O resultado é: " + multiplicacao);
        }
        else if (operacao.equals( "/")){
            double divisao = a / b;
            System.out.println("O resultado é: " + divisao);
        }
    }
}