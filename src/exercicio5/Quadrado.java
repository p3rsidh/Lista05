package exercicio5;

import java.util.Scanner;

public class Quadrado {
    float tamanhoLado;
    Scanner scan = new Scanner(System.in);
    Quadrado(float tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarLado(){
        System.out.println("Qual será o novo tamanho do lado? ");
        tamanhoLado = scan.nextFloat();
    }
    public float ladoArea(){
        float areaQuadrado = tamanhoLado * tamanhoLado;
        System.out.println("A area é de: " +areaQuadrado);
    return tamanhoLado;
    }
}
