package parte2.exercicio1;

import java.util.Scanner;

public class Jardinagem {
    Scanner scan = new Scanner(System.in);
    String nome;
    float quantidadeMetros, quantidadeMetrosGrama, quilosAdubo, valorAdubo, valorMetroGrama,valorCorteGrama;
    int quantidadePlantas;
    float aduboUsando;

        public String nomeJardim(String nome){
            this.nome = nome;
        return nome;
        }

        public float quantidadeMetros(float quantidadeMetros){
               this.quantidadeMetros = quantidadeMetros;
        return quantidadeMetros;
        }
        public int quantidadePlantas(int quantidadePlantas){
            this.quantidadePlantas = quantidadePlantas;
        return quantidadePlantas;
        }

        public float quantidadeMetrosGrama(float quantidadeMetrosGrama){
                this.quantidadeMetrosGrama = quantidadeMetrosGrama;
        return quantidadeMetrosGrama;
        }
        public float quilosAdubo(float quilosAdubo){
                this.quilosAdubo = quilosAdubo;
        return quilosAdubo;
        }
        public float valorAdubo(float valorAdubo){
                this.valorAdubo = valorAdubo;
        return valorAdubo;
        }
        public float valorMetroGrama(float valorMetroGrama){
                this.valorMetroGrama = valorMetroGrama;
        return valorMetroGrama;
        }
        public float valorCorteGrama(float valorCorteGrama){
                this.valorCorteGrama = valorCorteGrama;
        return valorCorteGrama;
        }
        //----------------------------------------------- METODOS -------------------------------------------
            public float usarAdubo(){
                System.out.println("Quantos metros de grama deseja adubar?");
                float adubandoGrama = scan.nextFloat();
                aduboUsando = ((adubandoGrama/2)*(100));
                quilosAdubo = (aduboUsando / 1000);
            System.out.println("Usaremos " +aduboUsando/1000 +"quilos de adubo");
                return aduboUsando;
        }
            public float precoAdubo(){
                    float precoAdubo = aduboUsando * valorAdubo;
                    return precoAdubo;
        }
            public float precoCorteGrama(){
                valorCorteGrama = quantidadeMetrosGrama * valorMetroGrama;
                return valorCorteGrama;
        }
        }
