package DesafioAlura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Kaio";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.0;
        int entrada;
        double receberValor;
        double transferirValor;

        System.out.println("**************************");
        System.out.println("Dados iniciais do Cliente: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("**************************");
        System.out.println(" ");


        System.out.println("Operações");
        System.out.println(" ");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");
        System.out.println(" ");
        System.out.println("Digite a opção desejada: ");
        entrada = leitura.nextInt();

        while (entrada != 4){

            if (entrada == 1){
                System.out.println("Você possui " + saldoInicial);
                System.out.println("Digite a opção desejada: ");
                entrada = leitura.nextInt();
            } else if (entrada == 2) {
                System.out.println("Quanto você deseja receber? ");
                receberValor = leitura.nextDouble();
                saldoInicial += receberValor;
                System.out.println("O seu saldo foi atualizado: " + saldoInicial);
                System.out.println("Digite a opção desejada: ");
                entrada = leitura.nextInt();

            } else if (entrada == 3) {
                System.out.println("Quanto você deseja transferir? ");
                transferirValor = leitura.nextDouble();

                if (transferirValor > saldoInicial) {
                    System.out.println("Você está tentando transferir um valor maior do que tem");
                    System.out.println("Digite a opção desejada: ");
                    entrada = leitura.nextInt();
                } else {
                    double resultadoTransferido = saldoInicial - transferirValor;
                    saldoInicial = resultadoTransferido;
                    System.out.println("O seu saldo foi atualizado " + saldoInicial);
                    System.out.println("Digite a opção desejada: ");
                    entrada = leitura.nextInt();
                }
            }
        }
    }
}
