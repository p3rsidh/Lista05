package parte1.exercicio2;

import java.util.Scanner;

public class Pessoa{
    Scanner scan = new Scanner(System.in);
    String nome;
    float idade , peso , altura ;


    public Pessoa(String nome, float altura, float idade, float peso) {
        this.nome = "nome";
        this.idade = 0;
        this.peso = 0;
        this.altura = 0;

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


