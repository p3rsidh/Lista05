package parte1.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean carroLigado = false;

        System.out.println("Insira os dados do seu carro:");
        System.out.println("Quantas portas ele tem? ");
        int numeroPortas = scan.nextInt();
        System.out.println("Qual o modelo do seu carro? ");
        String modelo = scan.next();
        System.out.println("Qual a marca do seu carro? ");
        String marca = scan.next();
        System.out.println("Deseja inserir a potencia? 1 - SIM | qualquer outro numero - NAO");
        int escolherPotencia = scan.nextInt();
        if (escolherPotencia == 1){
            System.out.println("QUal a potencia do seu carro?");
            float potencia = scan.nextFloat();
        } else {

        }
        Carro carro1 = new Carro(numeroPortas, modelo, marca);

        System.out.println("Deseja ligar seu carro? 1 - SIM | qualquer outro numero - NAO");
        int ligarCarro = scan.nextInt();
        if (ligarCarro == 1){
            while (carroLigado == false){
            System.out.println("Aperte o botão na chave do carro");
            System.out.println("Pressione o botão A -> abrir");
            String abrir = scan.next();
            if (abrir.equals("A")){
                carro1.ligarCarro();
                carroLigado = true;
            } else {
                System.out.println("Você precisa apertar o botão");
            }

        }}
    }
}
