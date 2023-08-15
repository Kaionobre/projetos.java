import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora simples");

        System.out.println("Digite aqui o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("Digite aqui o segundo número");
        int numero2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o operador");
        String operador = sc.nextLine();

        int soma = 0;

        if (operador.equals("+")) {
            soma = numero1 + numero2;
        } else if (operador.equals("-")) {
            soma = numero1 - numero2;
        } else if (operador.equals("*")) {
            soma = numero1 * numero2;
        } else if (operador.equals("/")){
            soma = numero1 / numero2;
        }
        else {
            System.out.println("Operador inválido");
            return;
        }

        System.out.println("Resultado: " + soma);
    }}



