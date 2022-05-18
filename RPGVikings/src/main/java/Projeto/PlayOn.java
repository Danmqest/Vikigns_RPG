package Projeto;

import java.util.Scanner;

/*
 * @author danilo.maximiano
 */
public class PlayOn {

    /**
     * @param args the command line arguments
     */
    static void Menu() {

        //Importação e Variaveis:
        Scanner input = new Scanner( System.in );
        String playUm, respostaCharada;
        String decisaoRito;
        int X, decisao01, decisaoClasse;
        double Y;

        //Inicio do Jogo:
        System.out.println(
                "A história se inicia em 1066 d.C, no pequeno vilarejo de Kategard, um dos quatro maiores reinos situados ao norte\n"
                        + "da Escandinávia.\n"
                        + "Num raro dia primaveril, um casal de comerciantes festeja com os aldeões a chegada de\n"
                        + "seu filho primogênito, com muita comida e música. Com o nome de ? " );
        System.out.println( "\nDigite o nome do seu personagem: " );
        playUm = input.nextLine();
        System.out.println( "Voce deseja que seu nome seja " + playUm + "?" );
        System.out.println( "[Digite (1)-SIM ou (2)-NÃO]" );
        decisao01 = input.nextInt();

        //Primeira Decisao Nome do jogador!
        if (decisao01 == 1) {
            System.out.println( "Saudaçoes VIKINGS, " + playUm + " SKOOLLL!" );
        } else {
            System.out.println( "Digite o nome desejado: " );
            playUm = input.next();
            System.out.println( "Decidido isso, " + playUm + " vamos la jogar!!!" );
        }

        //Continuação e Segunda Decisao Classe de guerreiro!
        // Laço de Repetiçao (For);
        System.out.printf( "\n A comemoração do nascimento de " + playUm + " continuou mas em uma determinada hora, por um infortúnio do acaso,\n"
                + "um grupo de mercenários do reino vizinho se aproximam da aldeia. Ao\n"
                + "ser avisado sobre a invasão, Oraco(Pai) se coloca à frente para proteger Kaira(Mãe) e " + playUm + ", o que\n"
                + "não foi o suficiente para evitar que os ataques chegassem até eles, percebendo que não\n"
                + "conseguiria sair dali vivo, grunhe para que sua esposa fuja com a criança." );

        for (int i = 3; i >= 0; i--) {

            System.out.println( "\nKaira corre o mais rápido possível para longe dos ataques e quando pensa estar longe o\n"
                    + "suficiente para sentir algum tipo de alívio é acertada por uma flecha, desesperada continua\n"
                    + "em frente na esperança de proteger o seu bem mais precioso.\n"
                    + "Sendo dilacerada pela dor no chão e segura um grito de dor para não chamar ainda mais\n"
                    + "atenção para si.\n\n Como último ato de coragem se arrasta até um pequeno riacho e deposita\n"
                    + "o cesto de seu filho traçando um destino incerto, mas melhor do que a morte para ele." );

            System.out.println( "\nUma charada para você, \nO que salvou que poderia ter matado ? (Sem acentuação)" );
            respostaCharada = input.next();

            if (respostaCharada.equalsIgnoreCase( "Agua" )) {
                System.out.println( "Otimo vamos seguir a historia " );
                break;

            } else {
                System.out.println( "Voce errou tem mais [" + i + "] Tentativas \nOque na historio o salvou quando sua mãe fugia mas poderia o ter matado ? (Sem acentuação)" );
                respostaCharada = input.next();
                if (respostaCharada.equalsIgnoreCase( "Agua" )) {

                    System.out.println( "UFA ATE QUEM FIM HEMMM KKKKKK" );
                    break;
                } else {
                    System.out.println( " Leia Mais meu jovem..." );

                }
            }
        }
        System.out.println( "\n Encontrado pela rainha que por misericórdia\n"
                + "do rei, o cria em seu castelo. A partir desse momento, ele passa a ser treinado e educado\n"
                + "como parte da nobreza, mas o rei embora tenha concordado com em criá-lo no reino, ao\n"
                + "passar dos anos passou a desenvolver um certo rancor pelo bastardo, pois tinha que dividir\n"
                + "a atenção de sua rainha com alguém que sequer carregava o seu sangue nas veias, o rei\n"
                + "só não livrou-se dele pois chateava-se ainda mais com a ideia de que sua rainha sofresse.\n"
                + "Dois anos após a criança estar no reino a rainha teve Draco, seu filho primogênito com o\n"
                + "rei." );

        System.out.println( "\nDurante toda a vida ambos foram criados juntos, Draco sendo preparado para assumir o\n" +
                "trono e voce " + playUm + " para se tornar um nobre guerreiro.\n Escolhar a sua classe :\n [ (1)Guerreiro - (2)Curandeiro - (3)Arqueiro - (4)Paladino ] " );
        decisaoClasse = input.nextInt();
        switch (decisaoClasse) {
            case 1:
                System.out.println( playUm + ", da classe dos Guerreiro com habilidades em Armas: Espadas, escudos e machados.\n"
                        + "Guerreiros preferem o combate físico. Graças a seu tamanho e força, os Guerreiros podem dominar o combate corpo a corpo utilizando espadas e escudos."
                        + "\n este personagem é um dos que mais aguenta ataques de adversários. A raiva que domina os Guerreiros não pode ser contida enquanto eles viverem."
                        + " Fúria,\n um recurso que representa o ódio puro e a sede pelo combate, é o combustível para cada golpe brutal." );
                break;
            case 2:
                System.out.println( playUm + ", da classe dos Curandeiros com habilidades em Armas:\n Curandeiros manejam varas ou cetros na sua mão de armas e escudos em sua mão livre\n"
                        + "Curandeiros possuem uma alta defesa contra dano e ganham experiência  rapidamente.\n Suas habilidades os permitem se curar e curar outros membros de seu grupo, dão um buff de defesa ao grupo, "
                        + "\ne reduzem a vermelhidão de tarefas para reduzir o dano tomado por elas. Eles são aliados ótimos contra chefes." );
                break;
            case 3:
                System.out.println( playUm + ", da classe dos Arqueiros com habilidades em Armas: Arco\n"
                        + "Exímios atiradores no uso do arco, e estão muito além das capacidades de um guerreiro especialista.\nSua afinidade e dedicação a um único tipo de arma, torna possível que realizem verdadeiras proezas quando disparam suas flechas. \n"
                        + "Um arqueiro é um verdadeiro mestre no uso de arco, e nem mesmo um guerreiro muito experiente pode se igualar as suas capacidades.\nCom seu rigoroso treinamento em combate à distância, um arqueiro consegue enfraquecer seu inimigo, reduzir "
                        + "suas resistências, prejudicar sua capacidade de combate,\nou ampliar o dano causado em seu alvo. Sua capacidade de disparar uma grande quantidade de flechas o torna capaz de matar seu inimigo antes que ele consiga se aproximar. " );
                break;
            case 4:
                System.out.println( playUm + ", da classe dos Paladinos com habilidade em Armas: Espadas, machados, escudos e martelo.\n"
                        + "Paladinos são campeões da justiça, bondade e lealdade. Possuem habilidades de combate como um guerreiro, e prestam devoção a um deus (ou deuses),\nobtendo assim poder para lançar magias. Todavia, um paladino jamais pode servir um deus maligno. "
                        + "O Paladino é um guerreiro santo que promove o bem.\nEle possui poderosas habilidades combativas, tal qual o guerreiro, e algumas habilidades mágicas e sua fé é inabalável." );
        }


        System.out.println( "\nAo passar dos tempo " + playUm + " desenvolve uma ânsia por descobrir o que houve com os pais\n" +
                "biológicos, Mais isso ainda não o incomoda mais pode se tornar um desejo de vingança contra os culpados futuramente.\n" +
                "\nAos 16 anos ambos estão na idade de participar do grande rito de passagem para deixarem\n" +
                "de ser apenas adolescentes para se tornarem homens guerreiros. Antes de partir para esta\n" +
                "jornada, o rei pede para que o adotado cuide de seu filho legítimo para que ele volte vivo,\n" +
                "prometendo para ele um cargo de destaque no exército do rei" );


        System.out.println( "\n[ (A) Deixar seu meio-irmão morrer, e lidar com as consequencias.] \n[ (B) Salvar seu irmão, se ferindo gravimente.] " );
        System.out.println( "\n qual a sua decisao (A) ou (B)?" );
        decisaoRito = input.next();

        switch (decisaoRito) {
            case "A":
                System.out.println( "Você escolheu não salvar seu meio-irmão Draco, e você " + playUm + " ao voltar para o reino\n" +
                        "é informado que ao não salvar seu irmão terá que lidar\n" +
                        "com a ira do rei.\nQue acaba de decretar que tomará sua vida como “prisioneiro” para compensar a\n" +
                        "morte do filho primogênito." );
                System.out.println( "\nE você e obrigado a ir numa missão para ele em busca de um velho amigo\n" +
                        "que o devia alguns favores" );
                break;
            case "a":
                System.out.println( "Você escolheu não salvar seu meio-irmão Draco, e você " + playUm + " ao voltar para o reino\n" +
                        "é informado que ao não salvar seu irmão terá que lidar\n" +
                        "com a ira do rei.\nQue acaba de decretar que tomará sua vida como “prisioneiro” para compensar a\n" +
                        "morte do filho primogênito." );
                System.out.println( "\nE você e obrigado a ir numa missão para ele em busca de um velho amigo\n" +
                        "que o devia alguns favores" );
                break;
            case "B":
                System.out.println( "És um grande guerreiro " + playUm + " salvando seu meio-irmão. \nTodos contaram seu grande feito ao rei,\n" +
                        "que por sua vez colocou os melhores curandeiros e magos para cuidar de seus machucado.\nSe recuperando o Rei cumpre a sua palavra e o dá um pouco de ouro e a preparação para o cargo\n" +
                        "prometido." );
                System.out.println( "\nApós ter se recuperado 100%, e festejado um banquete de comemoração, se\n" +
                        "questiona sobre seus pais e vai em busca da rainha para obter informações sobre a sua chegada ao castelo e sobre o que aconteceu com os seus pais." );
                break;
            case "b":
                System.out.println( "És um grande guerreiro " + playUm + " salvando seu meio-irmão. \nTodos contaram seu grande feito ao rei,\n" +
                        "que por sua vez colocou os melhores curandeiros e magos para cuidar de seus machucado.\nSe recuperando o Rei cumpre a sua palavra e o dá um pouco de ouro e a preparação para o cargo\n" +
                        "prometido." );
                System.out.println( "\nApós ter se recuperado 100%, e festejado um banquete de comemoração, se\n" +
                        "questiona sobre seus pais e vai em busca da rainha para obter informações sobre a sua chegada ao castelo e sobre o que aconteceu com os seus pais." );
                break;

        }

    }
}