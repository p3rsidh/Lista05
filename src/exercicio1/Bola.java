package exercicio1;

import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Bola {
    Scanner scan = new Scanner(System.in);
    String cor, marca, material;
    double circunferencia, velocidade;

    public Bola() {
        this.circunferencia = circunferencia;
        this.cor = "branca";
        this.marca = "Adidas";
        this.velocidade = 30;
        this.material = "couro";
    }

    public void mostrarBola() {
        System.out.println("__________________________________________");
        System.out.println("A bola tem a cor " + cor);
        System.out.println("A marca da bola e " + marca);
        System.out.println("Tem o material " + material);
        System.out.println("A circunferencia dela e  " + circunferencia);
        System.out.println("Com velociade de " + velocidade);
        System.out.println("___________________________________________");
    }

    public void alterarBola() {
        System.out.println("Deseja uma bola de que cor?");
        cor = scan.next();
        System.out.println("Deseja uma bola de que marca?");
        marca = scan.next();
        System.out.println("Deseja uma bola de que material?");
        material = scan.next();
        System.out.println("A bola tera qual circunferencia? ");
        circunferencia = scan.nextDouble();
        System.out.println("Qual velocidade a bola atingira? ");
        velocidade = scan.nextDouble();
        mostrarBola();

    }

    public void mostrarCor() {
        System.out.println(cor);
    }

    public void trocaCor() {
        System.out.println("Qual cor deseja usar? ");
        cor = scan.next();
        System.out.println("A nova cor : ");
        mostrarCor();
    }
}
