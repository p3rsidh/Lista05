package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja abrir uma conta? Digite 1 para sim e qualquer valor para não");
        int iniciar = scan.nextInt();
        if (iniciar == 1){
            System.out.println("Digite o numero da conta");
            String numeroConta = scan.next();
            System.out.println("Digite o nome do titular ");
            String nomeCorrentista = scan.next();
            System.out.println("Há um saldo? Digite 1 para sim e qualquer tecla para não");
            int haSaldo = scan.nextInt();
            if (haSaldo == 1) {
                System.out.println("DIgite o valor do saldo ");
                float saldo = scan.nextFloat();
            }
            ContaCorrente conta1 = new ContaCorrente(numeroConta, nomeCorrentista);
            conta1.mostrarConta();
        boolean continuarAcesso = true;
        while (continuarAcesso == true){
            System.out.println("");
            System.out.println("             MENU              ");
            System.out.println("Digite 1 para mostrar a conta  ");
            System.out.println("Digite 2 para fazer um deposito");
            System.out.println("Digite 3 para fazer um saque   ");
            System.out.println("Digite 4 para sair             ");
            System.out.println("");
            int escolha = scan.nextInt();
            switch (escolha){
                case 1:
                    conta1.mostrarConta();
                    break;
                case 2:
                    conta1.depositoConta();
                    break;
                case 3:
                    conta1.saqueConta();
                    break;
                case 4:
                    continuarAcesso = false;
                    break;
            }
        }}

    }
}
