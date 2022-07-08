package parte2.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Caixa conta = new Caixa();
        System.out.println("Bem vindo a sua conta, você tem 1000 caixinhas de saldo");
        System.out.println("Quantos lançamentos deseja fazer? ");
        int numeroLancamentos = scan.nextInt();
        for (int i = numeroLancamentos; i > 0; i--) {
            System.out.println("Digite um lançamento");
           conta.lancamento = scan.nextFloat();
            System.out.println("DIGITE 1 PARA CREDITO");
            System.out.println("       2 PARA DEBITO ");
            int escolha = scan.nextInt();
            if (escolha == 1){
                conta.credito();
            } else if (escolha == 2){
                conta.debito();
            } else {

            }
            System.out.println(conta.saldo +" caixinhas estão em sua conta");
        }
    }}