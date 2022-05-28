package Projeto;

public class Play {

    public void start() {

        // region variaveis iniciais
        Jogador jogador = new Jogador();
        String text = "", nomeIrmao = "Draco";
        int parametro = 2500;
        jogador.escolherClasse();
        Utils.limpar();
        jogador.escolherNome();
        Utils.limpar();
        // endregion

        // #region Prologo

        text = "Você cresceu na fámilia real, aos olhos de todos viveu como um principe.";
        Utils.printSleep(text, parametro);
        text = "Mesmo sendo o filho mais velho, sabia que o sucessor do trono era " + nomeIrmao
                + ", seu irmão mais novo.";
        Utils.printSleep(text, parametro);
        text = "Embora não soubesse exatamente o motivo, nunca se importou com isso, afinal, tinha tudo do bom e do melhor.";
        Utils.printSleep(text, parametro);
        text = "Teve o privilégio de poder treinar e se tornar o maior  " + jogador.classe + " do reino.";
        Utils.printSleep(text, parametro);
        text = "Foi amado incondicionalmente por sua \"mãe\" e rainha. ";
        Utils.printSleep(text, parametro);
        text = "Até o fádico dia de sua morte, no nascimento de seu último filho.";
        Utils.printSleep(text, parametro);
        text = "Depois disso, o rei furioso pela morte de sua amada esposa, o tornou alvo de sua fúria.";
        Utils.printSleep(text, parametro);
        text = "Nesse momento, você descobriu que é adotado e por isso o rei o desprezava tanto.";
        Utils.printSleep(text, parametro);
        text = "Mesmo com ódio, por respeito a rainha o rei permitiu que você ficasse no reino até o seu vigésimo oitavo aniversário.";
        Utils.printSleep(text, parametro);
        System.out.println("...");
        text = "Quando decidiria o seu futuro no rito de passagem.";
        Utils.printSleep(text, parametro);
        Utils.limpar();

        // endregion

        text = "---------------------------------------------------- \n"
                + "----------------CINCO ANOS DEPOIS------------------- \n"
                + "----------------------------------------------------";
        Utils.printSleep(text, parametro);
        Utils.limpar();

        parametro = 3000;

        // region desafio um
        text = "Servo: Senhor " + jogador.nome + ", o rei o espera na sala do trono, imediatamente!! \n"
                + "...";
        Utils.printSleep(text, parametro);

        text = "Rei: " + jogador.nome + ", há cinco anos atrás você recebeu a misericórdia do rei.";
        Utils.printSleep(text, parametro);

        text = "Mas, agora é o momento de enfrentar o seu destino.";
        Utils.printSleep(text, parametro);

        text = "Você e " + nomeIrmao
                + " irão para o rito de passagem, onde o jovem se torna um guerreiro e concretiza o seu poder.";
        Utils.printSleep(text, parametro);

        text = "A sua missão é trazer o futuro rei da Escandinávia vivo e em segurança, idependente do que tiver que ser feito. Ou lidará com as consequências";
        Utils.printSleep(text, parametro);
        System.out.println("");
        text = "Você está pronto?";
        Utils.printSleep(text, parametro);

        text = "[1] Sim \n"
                + "[2] Não";
        System.out.println(text);

        int resposta;
        resposta = jogador.input.nextInt();

        switch (resposta) {
            case 1:
                text = "Arrume as suas coisas e siga para a batalha!";
                System.out.println(text);
                break;

            case 2:
                text = "Não fale como se tivesse escolha, jovem rapaz!";
                System.out.println(text);
                break;

            default:
                text = "Volte ao inicio e pense um pouco mais";
                System.out.println(text);
                Utils.sleep(parametro);
                Menu.menu();
                break;
        }
        Utils.sleep(parametro);
        Utils.limpar();
        // endregion
        text = "---------------------------------------------------- \n"
                + "---------------------BATALHA------------------------ \n"
                + "----------------------------------------------------";
        Utils.printSleep(text, parametro);
        Utils.limpar();

        // region desafio dois
        text = "Você e " + nomeIrmao + " estão enfrentando uma batalha em meio a floresta";
        Utils.printSleep(text, parametro);
        text = nomeIrmao
                + " está distraído lutando contra um inimigo e você avista um mercenário indo golpea-lô nas costas";
        Utils.printSleep(text, parametro);
        text = "Você se encontra em um dilema, pois caso decida salva-lo você da as costas para o inimigo que está enfrentando e corre o risco de ser gravemente ferido.";
        Utils.printSleep(text, parametro);
        text = "Mas caso você não vá ajuda-lo, ele provavelmente não conseguirá se salvar desse embate.";
        Utils.printSleep(text, parametro);
        text = "Decida rapidamente para que as consequências sejam minimas.";
        Utils.printSleep(text, parametro);

        text = "[1] Ajudar o seu irmão \n"
                + "[2] Lutar contra seus próprios inimigos";
        Utils.printSleep(text, parametro);

        resposta = jogador.input.nextInt();
        switch (resposta) {
            case 1:
                jogador.vida = jogador.vida - 5;
                text = "Você escolheu salvar o seu irmão e foi gravemente ferido, perdeu 5 pontos de vida e desmaiou";
                Utils.printSleep(text, parametro);
                System.out.println("Vida atual: " + jogador.vida);
                break;
            case 2:
                text = "Você escolheu lutar sua própria batalha e " + nomeIrmao
                        + " morreu, volte para o reino e lide com as consequências";
                Utils.printSleep(text, parametro);

                break;

            default:
                text = "Seja um viking mais astuto da próxima vez!";
                System.out.println(text);
                Utils.sleep(parametro);
                Menu.menu();
        }
        Utils.sleep(parametro);
        Utils.limpar();

        // endregion
        text = "---------------------------------------------------- \n"
                + "----------------DE VOLTA AO REINO------------------ \n"
                + "----------------------------------------------------";
        Utils.printSleep(text, parametro);
        Utils.limpar();

        // region outros desafios | A - Derivados da resposta 1 do desafio 2, B
        // derivados da resposta 2 do desafio 2.
        // region A
        if (resposta == 1) {

            // region desafio tres A

            text = " Você voltou para o reino e salvou a vida de " + nomeIrmao
                    + " e o rei está muito agraciado por isso";
            Utils.printSleep(text, parametro);
            text = "E o deixou mais algum tempo no castelo para decidir o caminho que te mandará";
            Utils.printSleep(text, parametro);
            Utils.limpar();
            text = "Você está muito ferido e precisa repousar, mas está ansioso para descobrir mais sobre o seu passado";
            Utils.printSleep(text, parametro);
            text = "Então precisa se decidir se ficará de repouso ou sairá pelo castelo em busca de mais informações";
            Utils.printSleep(text, parametro);
            text = "[1] Ficar de repouso e recuperar 2 de vida \n"
                    + "[2] Ir em busca de informações e descobrir mais sobre o seu passado";
            Utils.printSleep(text, parametro);

            int escolha;
            escolha = jogador.input.nextInt();
            Utils.limpar();
            switch (escolha) {
                case 1:
                    jogador.vida = jogador.vida + 2;
                    text = "Você escolheu repousar e recuperou 2 de vida";
                    Utils.printSleep(text, parametro);
                    text = "Vida atual: " + jogador.vida;
                    Utils.printSleep(text, parametro);
                    break;

                case 2:
                    text = "Você levantou mesmo machucado e conseguiu entrar escondido no aposento da antiga rainha";
                    Utils.printSleep(text, parametro);
                    text = "Após vasculhar alguns lugares encontrou um pequeno diário";
                    Utils.printSleep(text, parametro);
                    text = "Agora você pode ir embora antes que seja pego ou continuar vasculhando";
                    Utils.printSleep(text, parametro);
                    text = "[1] Ir embora \n"
                            + "[2] Continuar";
                    Utils.printSleep(text, parametro);
                    int alternativa;
                    alternativa = jogador.input.nextInt();
                    Utils.sleep(parametro);
                    Utils.limpar();
                    switch (alternativa) {
                        case 1:
                            text = "Você voltou para o seu aposento e começou a ler o diário";
                            Utils.printSleep(text, parametro);
                            text = "Encontrou um trecho que fala sobre a sua chegada ao castelo";
                            Utils.printSleep(text, parametro);
                            text = "";
                            Utils.printSleep(text, 1000);
                            text = "----------------------------Diário-----------------------------";
                            Utils.printSleep(text, 0);
                            text = "...Era o último dia primaveril, você chegou como um presente...";
                            Utils.printSleep(text, parametro);
                            text = "...Através de algo que te salvou, mas poderia ter matado...";
                            Utils.printSleep(text, parametro);
                            text = "----------------------------------------------------------------";
                            Utils.printSleep(text, 0);
                            text = "";
                            Utils.printSleep(text, parametro);
                            Utils.limpar();

                            text = "Você fica intrigado com essa informação, o que salvou que poderia ter matado?";
                            Utils.printSleep(text, parametro);
                            text = "Continue investigando para saber a resposta.";
                            Utils.printSleep(text, parametro);
                            Utils.limpar();
                            break;

                        case 2:
                            text = "Você escapou por pouco, voltou para o seu aposento correndo e sentiu o seu corpo piorar, perdeu 1 de vida.";
                            Utils.printSleep(text, parametro);
                            jogador.vida = jogador.vida - 1;
                            text = "Vida atual: " + jogador.vida;
                            Utils.printSleep(text, parametro);
                            Utils.limpar();
                            text = "Ao se recuperar começou a ler o diário";
                            Utils.printSleep(text, parametro);
                            text = "Encontrou um trecho que fala sobre a sua chegada ao castelo";
                            Utils.printSleep(text, parametro);
                            text = "";
                            Utils.printSleep(text, 1000);
                            text = "----------------------------Diário-----------------------------";
                            Utils.printSleep(text, 0);
                            text = "...Era o último dia primaveril, você chegou como um presente...";
                            Utils.printSleep(text, parametro);
                            text = "...Através de algo que te salvou, mas poderia ter matado...";
                            Utils.printSleep(text, parametro);
                            text = "----------------------------------------------------------------";
                            Utils.printSleep(text, 0);
                            text = "";
                            Utils.printSleep(text, parametro);
                            Utils.limpar();
                            text = "Você fica intrigado com essa informação, o que salvou que poderia ter matado?";
                            Utils.printSleep(text, parametro);
                            text = "Continue investigando para saber a resposta.";
                            Utils.printSleep(text, parametro);
                            Utils.limpar();
                            break;

                        default:
                            text = "Seja um viking mais astuto da próxima vez!";
                            System.out.println(text);
                            Utils.sleep(parametro);
                            Menu.menu();

                            break;
                    }

                    break;

                default:
                    text = "Seja um viking mais astuto da próxima vez!";
                    System.out.println(text);
                    Utils.sleep(parametro);
                    Menu.menu();
                    break;
            }
            // endregion
            // region desafio quatro A
            text = "Servo: Senhor " + jogador.nome + ", o rei lhe aguarda na sala do trono \n"
                    + "...";
            Utils.printSleep(text, parametro);

            text = "Rei: Vou enviar-lhe a primeira missão junto ao meu filho " + nomeIrmao;
            Utils.printSleep(text, parametro);
            text = "Vão até a vila e investiguem uma onda de assalto que está acontecendo lá.";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            text = "---------------------------------------------------- \n"
                    + "-------------------INVESTIGANDO--------------------- \n"
                    + "----------------------------------------------------";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            text = "Vocês estavam investigando os assaltos quando se depararam com cinco mercenários ";
            Utils.printSleep(text, parametro);
            text = "Eles estão em vantagem, pois estão em maior quantidade.";
            Utils.printSleep(text, parametro);
            text = "Para que vocês possam se safar precisam descobrir a média de mercenários";
            Utils.printSleep(text, parametro);
            text = "Para atacar o ladrão correspondente";
            Utils.printSleep(text, parametro);
            text = "Qual a média de mercenários?  ";
            Utils.printSleep(text, parametro);

            int resp;
            resp = jogador.input.nextInt();
            while (resp != 3 && jogador.vida > 0) {
                jogador.vida = jogador.vida - 1;
                if (jogador.vida > 0 && resp != 3) {
                    text = "Você foi atacado e perdeu 1 de vida, tente novamente.";
                    Utils.printSleep(text, parametro);
                    text = "Vidas restantes:" + jogador.vida;
                    Utils.printSleep(text, parametro);
                    resp = jogador.input.nextInt();

                } else if (jogador.vida == 0) {
                    text = "Você morreu! Tente novamente";
                    Utils.printSleep(text, parametro);
                    Menu.menu();
                }
            }

            text = "Você atingiu o mercenário mais forte e conseguiu uma vantagem na luta! Siga em frente!";
            Utils.printSleep(text, parametro);
            Utils.limpar();
            text = "Missão cumprida!!! Volte para o reino e informe o progresso ao rei.";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            // endregion
            // region desafio cinco A
            parametro = 2000;
            text = "Rei: Muito bem " + jogador.nome
                    + "!! Você conseguiu descobrir o problema e eliminar os mercenários \n"
                    + "...";
            Utils.printSleep(text, parametro);
            text = "O próximo passo é encontrar o meu informante ao sul do reino para descobrir mais informações ";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            text = "---------------------------------------------------- \n"
                    + "------------------REINO DO NORTE--------------------- \n"
                    + "----------------------------------------------------";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            text = "Informante: Veja se não é o queridinho adotado da rainha e seu primogênito";
            Utils.printSleep(text, parametro);
            text = "Você está se perguntando como eu sei sobre isso?";
            Utils.printSleep(text, parametro);
            text = "Ora...Eu sei sobre tudo neste reino, estava lá quando você chegou"
                    + "";
            Utils.printSleep(text, parametro);
            text = "Mas suponho que você não não tenha vindo até aqui a mando do rei para falarmos sobre isso...";
            Utils.printSleep(text, parametro);
            text = "Soube que os ataques de mercenários voltaram a acontecer no reino da Escandinávia";
            Utils.printSleep(text, parametro);
            text = "Não está muito diferente do que aconteceu a dezoito anos atrás...";
            Utils.printSleep(text, parametro);
            Utils.limpar();

            text = "Informante: Me leve ao rei para que eu possa informa-lo sobre o que eu descobri.";
            Utils.printSleep(text, parametro);
            text = "Estou...estou com falta de ar...tinha alguma coisa em minha bebida...socorro"
                    + "";
            Utils.printSleep(text, parametro);
            // endregion
            // endregion
            // region B
        } else if (resposta == 2) {

        } // endregion
        else {
            Menu.menu();
        }

        /*
         * 
         * text = "Quer saber mais sobre a sua história?"
         * + "[1] Sim"
         * + "[2] Não";
         * int resp = jogador.input.nextInt();
         * 
         * switch (resp) {
         * case 1:
         * text = "Você era pequeno, havia um rio, e uma cesta";
         * Utils.printSleep(text, parametro);
         * text = "Lembro-me de que a rainha registrava tudo em seu diário";
         * Utils.printSleep(text, parametro);
         * text = "Deve haver mais informações sobre isso lá";
         * Utils.printSleep(text, parametro);
         * text = "É tudo o que eu tenho a dizer.";
         * Utils.printSleep(text, parametro);
         * 
         * break;
         * 
         * case 2:
         * 
         * break;
         * 
         * default:
         * break;
         * }
         * Utils.limpar();
         */

        // endregion

    }
}
