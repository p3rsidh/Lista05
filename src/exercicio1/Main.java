package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bola bola1 = new Bola();

    int respostaUsuario;
    bola1.mostrarBola();
        System.out.println("Deseja montar sua propria bola? Digite 1 para sim e qualquer valor para não");
        respostaUsuario = scan.nextInt();
        if (respostaUsuario == 1){
            Bola bolaUser = new Bola();
            bolaUser.alterarBola();
        } else{
            System.out.println("Voce nao tem uma bola, mas veja a do mostruario: ");
            bola1.mostrarBola();
        }
    }
}
