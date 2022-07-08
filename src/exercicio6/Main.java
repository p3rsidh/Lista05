package exercicio6;

import exercicio5.Quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean rodando = true;

        System.out.println("Digite o valor do lado A");
        float ladoA = scan.nextFloat();
        System.out.println("Digite o valor do lado B");
        float ladoB = scan.nextFloat();
        Retangulo retangulinho = new Retangulo(ladoA, ladoB);
        System.out.println("");
        while (rodando == true){
        System.out.println("       MENU             ");
        System.out.println("DIGITE 1 - para mudar o valor dos lados");
        System.out.println("DIGITE 2 - para saber o valor dos lados");
        System.out.println("DIGITE 3 - para calcular a area");
        System.out.println("DIGITE 4 - para calcular o perimetro");
        System.out.println("Digite 5 - para sair");
        int menu = scan.nextInt();
        switch (menu){
            case 1:
                retangulinho.mudarLados();
                break;
            case 2:
                retangulinho.mostrarLados();
                break;
            case 3:
                retangulinho.calcularArea();
                break;
            case 4:
                retangulinho.calcularPerimetro();
                break;
            case 5:
                rodando = false;
                break;
        }}
    }}

