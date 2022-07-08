package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do lado do seu quadrado");
        float tamanhoLado = scan.nextFloat();
        Quadrado quadradinho = new Quadrado(tamanhoLado);
        while (rodando == true){
            System.out.println("");
            System.out.println("       MENU         ");
            System.out.println("DIGITE 1 - para alterar o tamanho do lado");
            System.out.println("DIGITE 2 - para mostrar a area do quadrado");
            System.out.println("DIGITE 3 - para sair                      ");
            System.out.println("");
            int menu = scan.nextInt();
            switch (menu){
                case 1:
                    quadradinho.mudarLado();
                    break;
                case 2:
                    quadradinho.ladoArea();
                    break;
                case 3:
                    rodando = false;
            }

        }
    }
}
