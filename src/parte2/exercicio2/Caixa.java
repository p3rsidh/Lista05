package parte2.exercicio2;

import java.util.Scanner;

public class Caixa {
    float saldo, credito, debito, lancamento;
    Scanner scan = new Scanner(System.in);
    public Caixa() {
        this.credito = credito;
        this.debito = debito;
        this.saldo = 1000;

    }

    public float credito(){
       saldo += lancamento;
       return saldo;
        }

        public float debito(){
        if (lancamento <= saldo){
        saldo -= lancamento;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
        }
    }

