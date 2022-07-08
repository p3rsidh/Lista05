package exercicio3;

import java.util.Scanner;

public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    String numeroConta, nomeCorrentista;
    float saldo;
    ContaCorrente(String numeroConta, String nomeCorrentista, float saldo){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;

    }

    public void depositoConta(){
        System.out.println("Qual o valor que deseja depositar? ");
        float somaSaldo = scan.nextFloat();
        if (somaSaldo > 0){
            saldo += somaSaldo;
            System.out.println("O novo saldo e : " +saldo);
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void saqueConta(){
        System.out.println("Qual valor deseja sacar? ");
        float subtraiSaldo = scan.nextFloat();
        if (subtraiSaldo > 0 && subtraiSaldo <= saldo){
            saldo -= subtraiSaldo;
            System.out.println("O novo saldo e de : " +saldo);
        } else {
            System.out.println("Valor invalido");
        }
    }
}
