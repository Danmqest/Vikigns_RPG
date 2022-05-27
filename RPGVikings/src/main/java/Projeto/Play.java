package Projeto;

public class Play {

    public void start(){

        Jogador jogador = new Jogador();

        jogador.escolherClasse();
        jogador.escolherNome();

        System.out.println("[1] Mago \n" 
            +"Vida: 10\n" 
            +"Força: 0 \n"
            +"Magia: 10\n");

  }
}
