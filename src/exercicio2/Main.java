package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoinha = new Pessoa();
        boolean continuarJogando = true;
        System.out.println("Deseja criar uma nova pessoa? Digite 1 para sim e qualquer outro valor para não");
        int escolha = scan.nextInt();
        if (escolha == 1){
            pessoinha.construirPessoa();
            while (continuarJogando == true) {
                System.out.println("Agora podemos brincar!!");
                System.out.println("DIGITE 1 - para envelhecer " + pessoinha.nome);
                System.out.println("DIGITE 2 - para engordar " + pessoinha.nome);
                System.out.println("DIGITE 3 - para emagrecer " + pessoinha.nome);
                System.out.println("DIGITE 4 - para fazer " + pessoinha.nome + " crescer");
                System.out.println("DIGITE 5 - para mostrar as caracteristicas de " + pessoinha.nome);
                System.out.println("DIGITE 6 - para sair");
                int opcao = scan.nextInt();
                switch (opcao){
                    case 1:
                        pessoinha.envelhecer();
                        break;
                    case 2:
                        pessoinha.engordar();
                        break;
                    case 3:
                        pessoinha.emagrecer();
                        break;
                    case 4:
                        pessoinha.crescer();
                        break;
                    case 5:
                        pessoinha.mostrarPessoa();
                        break;
                    case 6:
                        continuarJogando = false;
                        break;
            }
        }
    }

    }
}
