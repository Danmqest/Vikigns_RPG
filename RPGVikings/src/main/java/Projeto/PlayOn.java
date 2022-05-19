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
        System.out.println(
                "A história se inicia em 1066 d.C, no pequeno vilarejo de Kategard, um dos quatro maiores reinos situados ao norte\n"
                + "da Escandinávia.\n"
                + "Em um raro dia de primavera, um casal de comerciantes festeja com os aldeões a chegada de\n"
                + "seu filho primogênito, com muita comida e música. Ele era chamado de? ");
        System.out.println("\nDigite o nome do seu personagem: ");
        playUm = input.nextLine();
        System.out.println("\nVoce deseja que seu nome seja " + playUm + "?");
        System.out.println("[Digite (1)-SIM ou (2)-NÃO]");
        decisao01 = input.nextInt();

        //Primeira Decisao Nome do jogador!
        if (decisao01 == 1) {
            System.out.println("\n Saudaçoes VIKINGS, " + playUm + " SKOOLLL!");
        } else {
            System.out.println("Digite o nome desejado: ");
            playUm = input.next();
            System.out.println("\nDecidido isso, " + playUm + " vamos la jogar!!!");
        }

        //Continuação e Segunda Decisao Classe de guerreiro!
        // Laço de Repetiçao (For);
        System.out.printf("\n A comemoração do nascimento de " + playUm + " continuou mas em uma determinada hora, por um infortúnio\n+"
                + "do acaso,\n"
                + "um grupo de mercenários do reino vizinho se aproximam da aldeia. Ao\n"
                + "ser avisado sobre a invasão, Oraco(Pai) se coloca à frente para proteger Kaira(Mãe) e " + playUm + ", o que\n"
                + "não foi o suficiente para evitar que os ataques chegassem até eles, percebendo que não\n"
                + "conseguiria sair dali vivo, grunhe para que sua esposa fuja com a criança.");

        for (int i = 3; i >= 0; i--) {

            System.out.println("\nKaira corre o mais rápido possível para longe dos ataques e quando pensa estar longe o\n"
                    + "suficiente para sentir algum tipo de alívio é acertada por uma flecha, desesperada continua\n"
                    + "em frente na esperança de proteger o seu bem mais precioso.\n"
                    + "Sendo dilacerada pela dor no chão e segura um grito de dor para não chamar ainda mais\n"
                    + "atenção para si.\n\n Como último ato de coragem se arrasta até um pequeno riacho e deposita\n"
                    + "o cesto de seu filho traçando um destino incerto, mas melhor do que a morte para ele.");

            
        System.out.println("\n Encontrado pela rainha que por misericórdia\n"
                + "do rei, o cria em seu castelo. A partir desse momento, ele passa a ser treinado e educado\n"
                + "como parte da nobreza, mas o rei embora tenha concordado com em criá-lo no reino, ao\n"
                + "passar dos anos passou a desenvolver um certo rancor pelo bastardo, pois tinha que dividir\n"
                + "a atenção de sua rainha com alguém que sequer carregava o seu sangue nas veias, o rei\n"
                + "só não livrou-se dele pois chateava-se ainda mais com a ideia de que sua rainha sofresse.\n"
                + "Dois anos após a criança estar no reino a rainha teve Draco, seu filho primogênito com o\n"
                + "rei.");

        System.out.println("\nDurante toda a vida ambos foram criados juntos, Draco sendo preparado para assumir o trono e voce " + playUm + " para se tornar um nobre...\n+"
                + " Escolhar a sua classe :\n [ (1)Guerreiro - (2)Curandeiro - (3)Arqueiro - (4)Paladino ] ");
        decisaoClasse = input.nextInt();
        switch (decisaoClasse) {
            case 1:
                System.out.println("\n" +playUm + ", da classe dos Guerreiro com habilidades em Armas: Espadas, escudos e machados.\n"
                        + "Guerreiros preferem o combate físico. Graças a seu tamanho e força, os Guerreiros podem dominar o combate \n+"
                        + "corpo a corpo utilizando espadas e escudos."
                        + "\n este personagem é um dos que mais aguenta ataques de adversários. A raiva que domina os Guerreiros não \n+"
                        + "pode ser contida enquanto eles viverem."
                        + " Fúria,\n um recurso que representa o ódio puro e a sede pelo combate, é o combustível para cada golpe brutal.");
                break;
            case 2:
                System.out.println("\n" +playUm + ", da classe dos Curandeiros com habilidades em Armas:\n Curandeiros manejam varas ou\n+"
                        + " cetros na sua mão de armas e escudos em sua mão livre\n"
                        + "Curandeiros possuem uma alta defesa contra dano e ganham experiência  rapidamente.\n Suas habilidades os permitem\n+"
                        + " se curar e curar outros membros de seu grupo, dão um buff de defesa ao grupo, "
                        + "\ne reduzem a vermelhidão de tarefas para reduzir o dano tomado por elas. Eles são aliados ótimos contra chefes.");
                break;
            case 3:
                System.out.println("\n" +playUm + ", da classe dos Arqueiros com habilidades em Armas: Arco\n"
                        + "Exímios atiradores no uso do arco, e estão muito além das capacidades de um guerreiro especialista.\nSua afinidade \n+"
                        + "e dedicação a um único tipo de arma, torna possível que realizem verdadeiras proezas quando disparam suas flechas. \n"
                        + "Um arqueiro é um verdadeiro mestre no uso de arco, e nem mesmo um guerreiro muito experiente pode se igualar as suas\n+"
                        + " capacidades.\nCom seu rigoroso treinamento em combate à distância, um arqueiro consegue enfraquecer seu inimigo, reduzir "
                        + "suas resistências, prejudicar sua capacidade de combate,\nou ampliar o dano causado em seu alvo. Sua capacidade de disparar\n+"
                        + " uma grande quantidade de flechas o torna capaz de matar seu inimigo antes que ele consiga se aproximar. ");
                break;
            case 4:
                System.out.println("\n" +playUm + ", da classe dos Paladinos com habilidade em Armas: Espadas, machados, escudos e martelo.\n"
                        + "Paladinos são campeões da justiça, bondade e lealdade. Possuem habilidades de combate como um guerreiro, e prestam devoção\n+"
                        + " a um deus (ou deuses),\nobtendo assim poder para lançar magias. Todavia, um paladino jamais pode servir um deus maligno. "
                        + "O Paladino é um guerreiro santo que promove o bem.\nEle possui poderosas habilidades combativas, tal qual o guerreiro,\n+"
                        + " e algumas habilidades mágicas e sua fé é inabalável.");
        }

        System.out.println("\n Ao passar dos tempo " + playUm + " desenvolve uma ânsia por descobrir o que houve com os pais\n"
                + "biológicos, Mais isso ainda não o incomoda mais pode se tornar um desejo de vingança contra os culpados futuramente.\n"
                + "\nAos 16 anos ambos estão na idade de participar do grande rito de passagem para deixarem\n"
                + "de ser apenas adolescentes para se tornarem homens guerreiros. Antes de partir para esta\n"
                + "jornada, o rei pede para que o adotado cuide de seu filho legítimo para que ele volte vivo,\n"
                + "prometendo para ele um cargo de destaque no exército do rei\n"
                + "Durante o rito a primeira batalha, um mero descuido de Draco e seu companheiro " + playUm + "fez com que ambos os dois ficassem \n+"
                        + "incurralados, draco estava gravemente ferido.\n"
                + "E AGORA" + playUm + "O QUE FAZER?");

        System.out.println("\n[ (A) Draco esta gravemente ferido, sem condições de andar e com uma espada em suas costas. Voce escolher deixar ele morrer e se salvar ?.] \n[ (B)Draco esta ferido mas como um ato de coragem escolho salvar meu  meio-irmao mesmo sabendo que ambos os dois vão se ferir gravemente?.] ");
        System.out.println("\n qual a sua decisao (A) ou (B)?");
        decisaoRito = input.next();

        switch (decisaoRito) {
            case "A":
                System.out.println("\nVocê escolheu não salvar seu meio-irmão Draco," + playUm + " ao voltar para o reino\n"
                        + "tera que informar ao rei sua escolha... BOA SORTE!!");
                System.out.println("\nLidando coma furia do rei, por ter perdido seu unico filho, e culpa-lo por um ato inteligente porem covarde,  agora voce," + playUm + " acabou de se tornar prisioneiro ,\n+"
                        + "e sua primeira obrigação é  ir em uma missão para ele em busca de um velho amigo que o deve alguns favores");

                break;

            case "B":
                System.out.println("\n Retorne ao reino se recupere ao lado do seu irmao e com os melhores curandeiros do castelo, pois ambos estao gravemente ferido.\n+"
                        + "Apos sua recuperção ganha uma comemoração e o rei cumpre a sua palavra e o dá um pouco de ouro, e uma missão que é encontrar um velho amigo do rei pois ele o deve alguns favores");
                break;

        }

        System.out.println("\nEstratégias salvam vidas");
        System.out.println("\n A missão de encontrar o amigo do rei é  uma missão quase que suicida o PP  tem que  atravessa um extenso território gelado onde ele nunca tinha passado.\n+"
                + " O deserto de neve o faz ter ilusões fazendo o acreditar que está chegando em um belo e pequeno vilarejo, quando na verdade ele está muito próximo a um pequeno chalé\n+"
                + " de um bruxo que costuma usar seus reféns como ingredientes para suas porções, para conseguir sobreviver o  PP deverá ludibriar o bruxo ou matá-lo.");

        System.out.println("\nSem consgeuir desviar daquele local voce" + playUm + " esta encurralado, faça sua escolha pois o bruxo ja te avistou :");
        System.out.println("\n Entre no chalé do bruxo e procure por uma porção que possa utilizar como arma.");
        System.out.println("\nEscolha um número. Boa Sorte!!");
        System.out.println("\nNumero (1)");
        System.out.println("\nNumero (2)");
        System.out.println("\nNumero (3)");
        int bruxo = input.nextInt();

        switch (bruxo) {
            case (1):
                System.out.println("Porção da verdade:");
                System.out.println("Boa  escolha, utilize a porção no bruxo e faça o falar seu ponto mais fraco e fuja do local");
                break;
            case (2):
                System.out.println("Porção de cura:");
                System.out.println("Otimo agora vc pode lutar contra o bruxo e conseguir se curar se for ferido, fuja dai");
                break;
            case (3):
                System.out.println("Porção da invencibilidade");
                System.out.println("Perfeito voce é invencivel, SKOOOL!!!, utilize a porção mate o bruxo e fuja dai");
                break;
        }
        System.out.println("Apos essa missão solitaria e suicida o jogadorr retorna ao reino e pede reforços ao rei para continuar.\n+"
                + " O rei por sua vez libera os seu melhores soldados para seguir com a missão.");

        System.out.println("Desafio 3:");
        System.out.println("A sua vida depende disso");
        System.out.println("Depois de conseguir se livrar do Bruxo  e reuniar mais soldados o playUm continua a sua trajetória para encontrar o velho amigo do rei, neste momento, ele tem\n"
                + "apenas quatro dias para conseguir chegar a vila antes que o inverno alcance o seu pico\n"
                + "máximo. Então ele passa a ter a necessidade de controlar corretamente os seus recursos e\n"
                + "poupar energia para não morrer.");
        System.out.println("(1) - Seguir pela floresta junto com os soldados e sofrer o risco?");
        System.out.println("(2) - Seguir pelo mar  e correr o risco de não chegar a tempo?");
        int floresta = input.nextInt();

        switch (floresta) {
            case (1):
                System.out.println("Sua escolha levou voce e seu soldado a um chale onde podem investigar mais sobre  a missão");
                break;
            case (2):
                System.out.println("Escolha corajosa admito, mas conseguiu chegar até o outro lado e encontrou um chale onde pode investigar mais sobre o Amigo do rei ");
                break;
        }
        System.out.println("Desafio 4:");
        System.out.println("Vasculhando o passado");
        System.out.println("Após lutar contra a morte  o PP finalmente chega à cidade para falar com um antigo soldado aposentado do rei que vaga sobre os territórios como os olhos e ouvidos do rei.\n+"
                + " Nesse momento, o PP entende que talvez esse seja o momento de tentar descobrir um pouco mais sobre o passado e pergunta ao informante se ele sabe alguma coisa sobre um ataque que\n;"
                + " houve há dezessete anos atrás num vilarejo próximo ao jardim da rainha.");
        System.out.println("(1)- Gostaria de saber mais sobre sua historia passada?");
        System.out.println(" (2) - Não, somente seguir com a missão ?");
        int passado = input.nextInt();
        switch (passado) {
            case (1):
                System.out.println("- O informante fala  que  não tem muitas informações sobre a real origem do PP e sobre o acontecimento e conta que quando foi encontrou próximo ao riacho havia um objeto\n+"
                        + " junto a ele, mas que ele acabou se perdendo pelo castelo.Sua mae por sua vez foi uma grande mulher e seu pai um grande guerreiro pp foi salvo pela força de um pais e o amor incodicional de sua mae.");
                System.out.println("Então" + playUm + " orgulhoso ao saber mais sobre sua história segue com a missão");
                break;
            case (2):
                System.out.println("Ok vamos seguir...");
                break;
        }
        System.out.println("Desafio 5");
        System.out.println("Voltando ao foco:");
        System.out.println("Ao encontrar o informante do rei a missão do PP é levá-lo ao reino em segurança, pois a informação que o vigia tem para passar ao rei deve ser entregue pessoalmente. Durante o caminho\n+"
                + " o informante é envenenado por uma flecha jogada por mercenarios e a cura é uma das duas plantas disponíveis no jardim da taverna, vvoce" + playUm + "precisa escolher entre a correta para salvar o informante:");
        System.out.println("(1)- Flor...");
        System.out.println("(2)- Flor...");
        int flor = input.nextInt();

        switch (flor) {
            case (1):
                System.out.println(" Opção errada volte ao começo do desfio ");
                return;
            case (2):
                System.out.println(" A flor escolhida e antido necessario para salvar o informante");
                System.out.println("Gratidão é uma flor roxa. O informante se sente grato pela ajuda e permite um\n"
                        + "desvio no caminho para encontrar informaçoes sobre os mercenarios que o atacaram.");
                break;

        }
        System.out.println("Desafio 6");
        System.out.println("Nem tudo são flores");
        System.out.println("O jogador e o informante acaba descobrindo que os mercenarios estavão assaltando o reino,\n+"
                + " ao chegar na cidade eles se deparam com alguns mercenários invadindo uma taberna e precisam intervir,\n+"
                + " mas ambos estão em desvantagem numérica e precisam acertar a ordem de ataque para que consigam bloquear os mercenários sem morrer:\n"
                + " (aqui é meio que\n"
                + "um quebra cabeça)");

        System.out.println("Desafio 7");
        System.out.println("Missão Cumprida... SKOOOL");
        System.out.println("O informante levado  em segurança até o castelo e  entregue  ao rei.\n;"
                + " Boatos são espalhados dizendo que o informante carregava um diario escrito mais ou menos na mesma época\n+"
                + " em que" + playUm + "  foi abandonado no castelo. Furioso ele decide entrar no salão e confrontar o rei,\n+"
                + " ao conseguir capturar o que o informante entregou ao rei ele descobre que se trata de um diário\n+"
                + " escrito a partir da visão do grupo inimigo.Ao ler o diario ele se depara com uma charada:");
         
        System.out.println("O que salvou que poderia ter matado ? (Sem acentuação)");
            respostaCharada = input.next();

            if (respostaCharada.equalsIgnoreCase("Agua")) {
                System.out.println("Otimo vamos seguir a historia ");
                break;

            } else {
                System.out.println("Voce errou tem mais [" + i + "] Tentativas \nOque na historio o salvou quando sua mãe fugia mas poderia o ter matado ? (Sem acentuação)");
                respostaCharada = input.next();
                if (respostaCharada.equalsIgnoreCase("Agua")) {

                    System.out.println("UFA ATE QUEM FIM HEMMM KKKKKK");
                    System.out.println("A charada destravava uma pagina em que falava sobre o ataque que aconteceu na vila na epoca que encontraram\n" + playUm
                            + "Quem atacou a sua família e o motivo dos ataques atuais dos mercenários.");
                    break;
                } else {
                    System.out.println(" Leia Mais meu jovem...");

                }
            }
        }
    }

}
