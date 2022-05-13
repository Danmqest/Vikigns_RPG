package Projeto;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author danilo.maximiano
 */
public class PlayOn {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Importação e Variaveis:

        Scanner input = new Scanner(System.in);
        String playUm, respostaCharada;
        String decisaoRito;
        int X, decisao01, decisaoClasse;
        double Y;
        
        //Inicio do Jogo:
        
        System.out.println("Descrição do jogo .... \n nosso jogo... \n no ano de 1066 \n os vikings....");
        System.out.println("Digite o nome de seu personagem: ");
        playUm = input.nextLine();
        System.out.println("Voce deseja que seu nome seja " + playUm +"?");
        System.out.println("[Digite (1)-SIM ou (2)-NÃO]");
        decisao01 = input.nextInt();
        
        //Primeira Decisao Nome do jogador!
        
        if(decisao01==1){
               System.out.println("Saudaçoes VIKINGS, " + playUm + " SKOOLLL!");
        }else{ System.out.println("Digite o nome desejado: ");
               playUm=input.next();
               System.out.println("Decidido isso, " + playUm + " vamos la jogar!!!");}
        
        //Continuação e Segunda Decisao Classe de guerreiro!
        
        System.out.println("Historia...\n Escolhar a sua classe de guerreiro:\n [ (1)Guerreiro - (2) Curandeiro - (3)Arqueiro - (4)Paladino ] ");
        decisaoClasse = input.nextInt();
        switch(decisaoClasse){
            case 1:
                System.out.println(playUm + "\n, da classe dos Guerreiro com habilidades em Armas: Espadas, escudos e machados.\n" +
"Guerreiros preferem o combate físico. Graças a seu tamanho e força, os Guerreiros podem dominar o combate corpo a corpo utilizando espadas e escudos."
                        + "\n este personagem é um dos que mais aguenta ataques de adversários. A raiva que domina os Guerreiros não pode ser contida enquanto eles viverem."
                        + " Fúria,\n um recurso que representa o ódio puro e a sede pelo combate, é o combustível para cada golpe brutal.");
                break;
            case 2:
                System.out.println(playUm + "\n, da classe dos Curandeiros com habilidades em Armas:\n Curandeiros manejam varas ou cetros na sua mão de armas e escudos em sua mão livre\n" +
"Curandeiros possuem uma alta defesa contra dano e ganham experiência  rapidamente.\n Suas habilidades os permitem se curar e curar outros membros de seu grupo, dão um buff de defesa ao grupo, "
                        + "\ne reduzem a vermelhidão de tarefas para reduzir o dano tomado por elas. Eles são aliados ótimos contra chefes.");
                break;
            case 3:
                System.out.println(playUm + "\n, da classe dos Arqueiros com habilidades em Armas: Arco\n" +
"Exímios atiradores no uso do arco, e estão muito além das capacidades de um guerreiro especialista.\nSua afinidade e dedicação a um único tipo de arma, torna possível que realizem verdadeiras proezas quando disparam suas flechas. \n" +
"Um arqueiro é um verdadeiro mestre no uso de arco, e nem mesmo um guerreiro muito experiente pode se igualar as suas capacidades.\nCom seu rigoroso treinamento em combate à distância, um arqueiro consegue enfraquecer seu inimigo, reduzir "
                        + "suas resistências, prejudicar sua capacidade de combate,\nou ampliar o dano causado em seu alvo. Sua capacidade de disparar uma grande quantidade de flechas o torna capaz de matar seu inimigo antes que ele consiga se aproximar. ");
                break;
            case 4:
                System.out.println(playUm + "\n, da classe dos Paladinos com habilidade em Armas: Espadas, machados, escudos e martelo.\n" +
"Paladinos são campeões da justiça, bondade e lealdade. Possuem habilidades de combate como um guerreiro, e prestam devoção a um deus (ou deuses),\nobtendo assim poder para lançar magias. Todavia, um paladino jamais pode servir um deus maligno. "
                        + "O Paladino é um guerreiro santo que promove o bem.\nEle possui poderosas habilidades combativas, tal qual o guerreiro, e algumas habilidades mágicas e sua fé é inabalável.");
                 }
            
        System.out.println("\nContinuação da historio apos a escolha da classe....\n e mais das historio ate a charada");
       
        
        // Laço de Repetiçao (For, while;);
        
        for(int i=1; i<2;i++){
             System.out.println("\nPrimeiro teste Primeiro Desafio Charada .... ?");
        respostaCharada = input.next();
            
            if(respostaCharada.equals("Agua") || respostaCharada.equals("água") 
            || respostaCharada.equals("agua") || respostaCharada.equals("Água")
            || respostaCharada.equals("ÁGUA") || respostaCharada.equals("AGUA") ) {
                System.out.println("Otimo if ");
                
                
            } else {
                System.out.println("Voce errou tem mais [" + i +"] Tentativas \n Primeiro Desafio Charada .... ?");
        respostaCharada = input.next();
                      if(respostaCharada.equals("Agua") || respostaCharada.equals("água") 
                      || respostaCharada.equals("agua") || respostaCharada.equals("Água")
                      || respostaCharada.equals("ÁGUA") || respostaCharada.equals("AGUA") ) {
            
                System.out.println("else acerto");
                   
            }
           
        } 
        }
            System.out.println("\n Continuação da Historios ....");
            System.out.println("\n desafio do Rito de Passagem... ");
            System.out.println("\n qual a sua decisao (A) ou (B)....");
            decisaoRito = input.next();

            switch(decisaoRito){
                case "A":
                    System.out.println("..case A.");
                    break;
                case "a":
                    System.out.println("...case a ..");
                    break;
                case "B":
                    System.out.println("...case B....");
                    break;
                case "b":
                    System.out.println(" case b");
                    break;

            }
            
            
            
        
       
        
         
        
         
       
        
        
        
            
        }
        
        
              
    }
    

