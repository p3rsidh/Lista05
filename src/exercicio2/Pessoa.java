package exercicio2;

import java.util.Scanner;

public class Pessoa {
    Scanner scan = new Scanner(System.in);
    String nome;
    float idade , peso , altura ;



    public Pessoa() {
        this.nome = "nome";
        this.idade = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public void construirPessoa(){
        System.out.println("Vamos construir uma pessoa");
        System.out.println("   (o.o)    " +
                           "\n  /(  /)" +
                           "\n   _| |_     ");
        System.out.println("Digite o nome da pessoa:");
        nome = scan.next();
        System.out.println("Digite a idade desta pessoa");
        idade = scan.nextFloat();
        System.out.println("Digite o peso (se não quiser, coloque 0)");
        peso = scan.nextFloat();
        System.out.println("Digite a altura");
        altura = scan.nextFloat();

    }

    public void mostrarPessoa(){
        System.out.println(nome  +" tem "  +idade +" anos ");
        System.out.println("pesa " +peso +" e mede "  +altura +"cm");
    }
    public void envelhecer(){
        float maisIdade;
        System.out.println("Deseja envelhecer quantos anos?");
        maisIdade = scan.nextFloat();
        System.out.println(maisIdade);
        if(maisIdade > 0){
            if(idade <= 20){
                for(float i = idade; i < (maisIdade+idade); i++){
                    altura += 0.5;
                }
            idade += maisIdade;
            }else{
                idade += maisIdade;
            }
        }else{
            System.out.println("Valor invalido");
        }
        mostrarPessoa();
    }

    public void engordar(){
    System.out.println("Digite quanto peso a pessoa vai ganhar");
    double maisPeso = scan.nextDouble();
    if (maisPeso > 0 ){
        peso += maisPeso;
    } else{
        System.out.println("Valor invalido");
    }
    mostrarPessoa();
    }

    public void emagrecer(){
        System.out.println("Digite quanto peso a pessoa vai perder");
        double menosPeso = scan.nextDouble();
        if (menosPeso > 0 ){
            peso -= menosPeso;
        } else{
            System.out.println("Valor invalido");
        }
        mostrarPessoa();
    }
    public void crescer(){
        System.out.println("Digite o quanto a pessoa vai crescer");
        double crescendo = scan.nextDouble();
        if (crescendo > 0){
            altura += crescendo;
        }else{
            System.out.println("Valor invalido");
        }
        mostrarPessoa();
        }
    }


