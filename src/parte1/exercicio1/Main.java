package parte1.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bola bola1 = new Bola();

    int respostaUsuario;
    bola1.mostrarBola();
        System.out.println("Deseja montar sua propria bola? Digite 1");
        System.out.println("Deseja mostrar a cor da bola? Digite 2");
        System.out.println("Deseja trocar a cor? Digite 3");
        System.out.println("Não deseja nada? Digite qualquer outro valor");
        respostaUsuario = scan.nextInt();
        if (respostaUsuario == 1){
            Bola bolaUser = new Bola();
            bolaUser.alterarBola();
        } else if (respostaUsuario == 2) {
            bola1.mostrarCor();
        } else if (respostaUsuario == 3) {
            bola1.trocaCor();
        } else{
            System.out.println("Voce nao tem uma bola, mas veja a do mostruario: ");
            bola1.mostrarBola();
        }
    }
}
