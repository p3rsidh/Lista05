package exercicio4;

public class Carro {

    int quantidadePortas;
    String modelo, marca;
    float potencia;

    Carro(int quantidadePortas, String modelo, String marca){
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2;
    }
    public void ligarCarro(){
        System.out.println("Portas abertas ");
        System.out.println("O carro está ligado");
    }
}
