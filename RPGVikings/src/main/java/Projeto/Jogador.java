package Projeto;

import java.util.Scanner;


public class Jogador {
    Scanner input = new Scanner(System.in);


    int escolha, vida, forca, magia;
    String nome;

public void escolherNome(){


    System.out.println("---------------------------------");
    System.out.println("-------Escolha o seu nome--------");
    System.out.println("---------------------------------");
    this.nome = input.next();

    System.out.println("Avante, óh grande " + nome);

}

public void escolherClasse(){

        boolean opcao = false;

        while (!opcao){
            System.out.println("----------------------------------------");
            System.out.println("-------Escolha a classe desejada--------");
            System.out.println("----------------------------------------");
            System.out.println("");

            System.out.println("[1] Mago \n" 
            +"Vida: 10\n" 
            +"Força: 0 \n"
            +"Magia: 10\n");

            System.out.println("[2] Guerreiro \n" 
            +"Vida: 20\n" 
            +"Força: 10\n"
            +"Magia: 0\n");

            System.out.println("[3] Paladino \n" 
            +"Vida: 10\n" 
            +"Força: 5\n"
            +"Magia: 5\n");
            escolha = input.nextInt();

            switch (escolha) {

                    case 1:
                    System.out.println("Vamos seguir em frente, nobre mago!");
                    this.vida = 10;
                    this.forca = 0;
                    this.magia = 10;
                    opcao = true;
                    break;

                    case 2:
                    System.out.println("Vamos seguir em frente, corajoso guerreiro!");

                    this.vida = 20;
                    this.forca = 10;
                    this.magia = 0;
                    opcao = true;
                    break;

                    case 3:
                    System.out.println("Vamos seguir em frente, esforçado paladino!");
                    this.vida = 15;
                    this.forca = 5;
                    this.magia = 5;
                    opcao = true;
                    break;

                    default:
                    System.out.println("Escolha uma opção válida!");
                    System.out.println("");
                    opcao = false;

                    break;
                }
                
            }
        }
}