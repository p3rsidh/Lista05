package parte2.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem();
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos cuidar do seu jardim!!");
        System.out.println("Digite o nome dele:");
        jardim.nomeJardim(scan.next());
        System.out.println("Digite quantos metros tem seu jardim: ");
        jardim.quantidadeMetros(scan.nextFloat());
        System.out.println("Quantas plantas voce tem?");
        jardim.quantidadePlantas(scan.nextInt());
        System.out.println("Quantos metros de grama voce tem?");
        jardim.quantidadeMetrosGrama(scan.nextFloat());
        System.out.println("Quanto custa o quilo de adubo?");
        jardim.valorAdubo(scan.nextFloat());
        System.out.println("Quanto custa o metro da grama?");
        jardim.valorMetroGrama(scan.nextFloat());
        jardim.usarAdubo();
        System.out.println("O preco do adubo e : " +jardim.precoAdubo());
        System.out.println("O preco para cortar a grama e: " +jardim.precoCorteGrama());


    }
}
