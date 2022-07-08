package parte1.exercicio6;

import java.util.Scanner;

public class Retangulo {

    float ladoA, ladoB;
    Scanner scan = new Scanner(System.in);

    Retangulo(float ladoA, float ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudarLados() {
        System.out.println("Insira o valor do lado A");
        ladoA = scan.nextFloat();
        System.out.println("Insira o valor do lado B");
        ladoB = scan.nextFloat();
    }
    public float mostrarLados(){
        System.out.println("Lado A: " +ladoA);
        System.out.println("Lado B: " +ladoB);
        return ladoB + ladoA;
    }
    public void calcularArea(){
        float area = ladoA * ladoB;
        System.out.println("A area é de: " +area);

    }
    public void calcularPerimetro(){
        float perimetro = (2*ladoA) + (2 * ladoB);
        System.out.println("O perimetro é de: " +perimetro);
    }
}