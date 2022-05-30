package Projeto;

import java.util.concurrent.TimeoutException;

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
                                                        text = "----------------------------Diário-----------------------------\n"
                                                                        + "...Era o último dia primaveril, você chegou como um presente...\n"
                                                                        + "...Através de algo que te salvou, mas poderia ter matado...\n"
                                                                        + "----------------------------------------------------------------";
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
                                                        text = "----------------------------Diário-----------------------------\n"
                                                                        + "...Era o último dia primaveril, você chegou como um presente...\n"
                                                                        + "...Através de algo que te salvou, mas poderia ter matado...\n"
                                                                        + "----------------------------------------------------------------";
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
                        // endregion
                        // endregion
                        // region B
                } else if (resposta == 2) {
                        // region desafio tres B
                        text = " Você optou por lutar a sua própria batalha e " + nomeIrmao
                                        + " morreu, o rei está furioso!";
                        Utils.printSleep(text, parametro);
                        text = "E por vingança, você se torna-rá serviçal do rei e terá que trabalhar para ele em troca da sua vida.";
                        Utils.printSleep(text, parametro);
                        Utils.limpar();
                        text = "A sua primeira missão é ir em busca de um velho amigo e informante do rei, para saber mais sobre os ataques de mercenários";
                        Utils.printSleep(text, parametro);
                        text = "No meio do caminho, em meio a uma floresta de gelo você encontra uma cabana";
                        Utils.printSleep(text, parametro);
                        text = "[1] Continuar o caminho \n"
                                        + "[2] Entrar na cabana";
                        Utils.printSleep(text, parametro);

                        int escolha;
                        escolha = jogador.input.nextInt();
                        Utils.limpar();
                        switch (escolha) {
                                case 1:
                                        jogador.vida = jogador.vida - 4;
                                        if (jogador.vida > 0) {
                                                text = "Você decidiu continuar o caminho e perdeu 4 de vida!";
                                                Utils.printSleep(text, parametro);
                                                text = "Vidas restantes:" + jogador.vida;
                                                Utils.printSleep(text, parametro);
                                                Utils.limpar();
                                        } else {

                                                text = "---------------------------------------------------- \n"
                                                                + "Você optou por seguir o caminho e morreu congelado!! \n"
                                                                + "Tente novamente \n"
                                                                + "----------------------------------------------------";
                                                Utils.printSleep(text, parametro);
                                                Menu.menu();
                                        }
                                case 2:
                                        text = "Você entrou na caverna e se deparou com um bruxo";
                                        Utils.printSleep(text, parametro);
                                        text = "Você pode enfrentar o bruxo ou tentar engana-lo para que ele o deixe sair com vida";
                                        Utils.printSleep(text, parametro);
                                        text = "[1] Lutar contra o Bruxo \n"
                                                        + "[2] Tentar enganar o bruxo";
                                        Utils.printSleep(text, parametro);
                                        int alternativa;
                                        alternativa = jogador.input.nextInt();
                                        Utils.sleep(parametro);
                                        Utils.limpar();
                                        switch (alternativa) {
                                                case 1:
                                                        if (jogador.classe == "Guerreiro") {
                                                                text = "Você embanhou sua espada e o atacou por trás";
                                                                Utils.printSleep(text, parametro);
                                                        } else if (jogador.classe == "Mago") {
                                                                text = "Você embanhou o seu cajado e lançou um feitiço de atordoamento";
                                                                Utils.printSleep(text, parametro);
                                                        } else if (jogador.classe == "Paladino") {
                                                                text = "Você lançou um feitiço de atordoamento e o atacou por trás";
                                                                Utils.printSleep(text, parametro);
                                                        }
                                                        text = "O Bruxo não esperava por seu ataque e recebeu dano crítico";
                                                        Utils.printSleep(text, parametro);
                                                        text = "Você pode optar por mata-lo ou apenas o prender";
                                                        text = "[1] Mata-lo\n"
                                                                        + "[2] Prende-lo";
                                                        Utils.printSleep(text, parametro);
                                                        alternativa = jogador.input.nextInt();
                                                        Utils.sleep(parametro);
                                                        Utils.limpar();
                                                        if (alternativa == 1) {
                                                                text = "Você matou o Bruxo e recebeu parte do seu poder";
                                                                Utils.printSleep(text, parametro);
                                                                if (jogador.classe == "Guerreiro") {
                                                                        jogador.forca = jogador.forca + 5;
                                                                        text = "Sua força aumentou 5 pontos \n"
                                                                                        + "Força atual: "
                                                                                        + jogador.forca;
                                                                        Utils.printSleep(text, parametro);
                                                                } else if (jogador.classe == "Mago") {
                                                                        jogador.magia = jogador.magia + 5;
                                                                        text = "Sua magia aumentou 5 pontos \n"
                                                                                        + "Magia atual: "
                                                                                        + jogador.magia;
                                                                        Utils.printSleep(text, parametro);

                                                                } else if (jogador.classe == "Paladino") {
                                                                        jogador.forca = jogador.forca + 2;
                                                                        jogador.magia = jogador.magia + 2;
                                                                        text = "Sua força e magia aumentaram 2 pontos \n"
                                                                                        + "Força atual: "
                                                                                        + jogador.forca + "\n"
                                                                                        + "Magia atual: "
                                                                                        + jogador.magia;
                                                                        Utils.printSleep(text, parametro);
                                                                }
                                                                Utils.limpar();
                                                        } else if (alternativa == 2) {
                                                                text = "Você prendeu e dominou o Bruxo \n"
                                                                                + "Agora ele lhe concederá a uma resposta de algo que deseja do fundo do seu coração"
                                                                                + "(...)";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Bruxo: " + jogador.nome
                                                                                + ", há muito tempo ouço falar do filho perdido que foi acolhido pela bondosa rainha.";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Há muitas coisas que acontecem entre os céus e a terra deste reino, e não há como esconder daquele que tudo escuta.";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Eu vejo em seu coração que gostaria muito de saber o que aconteceu com você";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Para que você cumpra o seu caminho sem que eu interfira a única coisa que posso lhe dizer é"
                                                                                + "(...)";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Você chegou como um presenta para rainha, através de algo que lhe salvou mas poderia ter matado";
                                                                Utils.printSleep(text, parametro);
                                                                text = "(...)"
                                                                                + "É tudo o que tenho a dizer";
                                                                Utils.printSleep(text, parametro);
                                                                Utils.limpar();

                                                        } else {
                                                                text = "Seja um viking mais astuto da próxima vez!";
                                                                Utils.printSleep(text, parametro);
                                                                Menu.menu();
                                                        }
                                                        break;

                                                case 2:
                                                        text = "Você entrou na cabana do Bruxo e ele o percebeu";
                                                        Utils.printSleep(text, parametro);
                                                        text = "Para lidar com a fúria do Bruxo é preciso lhe contar uma piada ou contar uma curiosidade";
                                                        Utils.printSleep(text, parametro);
                                                        text = "[1] Contar uma piada  \n"
                                                                        + "[2] Contar uma curiosidade";
                                                        Utils.printSleep(text, parametro);
                                                        alternativa = jogador.input.nextInt();
                                                        Utils.sleep(parametro);
                                                        Utils.limpar();

                                                        if (alternativa == 1) {
                                                                text = "-------------------------------------------------------------------------------\n"
                                                                                + "Era uma vez um pintinho que se chama Relam. Toda vez que chovia, Relam piava!\n"
                                                                                + "-------------------------------------------------------------------------------";
                                                                Utils.printSleep(text, parametro);
                                                                text = " "
                                                                                + "O Bruxo ficou com dó na sua piada ruim e decidiu lhe dar uma poção de cura antes de lhe expulsar de sua cabana";
                                                                Utils.printSleep(text, parametro);
                                                                Utils.limpar();
                                                        } else if (alternativa == 2) {
                                                                text = "------------------------------------------------------------------------------------------------\n"
                                                                                + "Existe uma luz que ilumina o céu e se chama Aurora Boreal, é possivel ve-la no hemisfério norte!\n"
                                                                                + "------------------------------------------------------------------------------------------------";
                                                                Utils.printSleep(text, parametro);
                                                                text = " "
                                                                                + "O Bruxo ficou tão intrigado com a curiosidade que decidiu lhe contar um pequeno segredo";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Bruxo: " + jogador.nome
                                                                                + ", há muito tempo ouço falar do filho perdido que foi acolhido pela bondosa rainha.";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Há muitas coisas que acontecem entre os céus e a terra deste reino, e não há como esconder daquele que tudo escuta.";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Eu vejo em seu coração que gostaria muito de saber o que aconteceu com você";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Para que você cumpra o seu caminho sem que eu interfira a única coisa que posso lhe dizer é"
                                                                                + "(...)";
                                                                Utils.printSleep(text, parametro);
                                                                text = "Você chegou como um presenta para rainha, através de algo que lhe salvou mas poderia ter matado";
                                                                Utils.printSleep(text, parametro);
                                                                text = "(...)"
                                                                                + "É tudo o que tenho a dizer";
                                                                Utils.printSleep(text, parametro);
                                                                Utils.limpar();

                                                        } else {
                                                                text = "Seja um viking mais astuto da próxima vez!";
                                                                Utils.printSleep(text, parametro);
                                                                Menu.menu();
                                                        }
                                                        break;

                                                default:
                                                        text = "Seja um viking mais astuto da próxima vez!";
                                                        Utils.printSleep(text, parametro);
                                                        Menu.menu();
                                                        break;
                                        }
                                        break;

                                default:
                                        text = "Seja um viking mais astuto da próxima vez!";
                                        Utils.printSleep(text, parametro);
                                        Utils.limpar();
                                        Menu.menu();
                                        break;
                        }
                        // endregion
                        // region desafio quatro B
                        text = "Você sobreviveu ao deserto de gelo e conseguiu chegar na cidade"
                                        + "...";
                        Utils.printSleep(text, parametro);
                        text = "Agora precisa encontrar o informante do rei";
                        Utils.printSleep(text, parametro);
                        text = "Existem duas tabernas na cidade, ele deve estar em uma delas ";
                        Utils.printSleep(text, parametro);
                        text = "Em qual você gostaria de procura-lo primeiro?";
                        Utils.printSleep(text, parametro);

                        int resp = 0;
                        while (resp != 1) {
                                text = "[1] Taberna dos Sacrificios \n"
                                                + "[2] Taberna dos Desejos";
                                Utils.printSleep(text, parametro);
                                resp = jogador.input.nextInt();
                                Utils.limpar();

                                if (resp == 1) {
                                        text = "Você encontrou o informante do rei";
                                        Utils.printSleep(text, parametro);
                                        text = "Ele está caindo de bebâdo";
                                        Utils.printSleep(text, parametro);
                                        text = "Você pode tentar deixa-lo sóbrio tentando uma dessas coisas";
                                        Utils.printSleep(text, parametro);
                                        text = "[1] Jogar hidromel em sua cara \n"
                                                        + "[2] Dar um tapa em sua cara";
                                        Utils.printSleep(text, parametro);
                                        int opcao;
                                        opcao = jogador.input.nextInt();
                                        switch (opcao) {
                                                case 1:
                                                        jogador.vida = jogador.vida - 1;
                                                        text = "O informante ficou furioso por você ter desperdiçado a sua bebida";
                                                        Utils.printSleep(text, parametro);
                                                        text = "E te deu um soco muito forte na sua cara, perdeu 1 de vida \n"
                                                                        + "Vidas restantes: " + jogador.vida;
                                                        Utils.printSleep(text, parametro);
                                                        text = "Pelo menos isso o deixou um pouco mais sóbrio";
                                                        Utils.printSleep(text, parametro);
                                                        Utils.limpar();
                                                        break;
                                                case 2:
                                                        text = "O tapa funcionou muito bem para deixa-lo alerta!";
                                                        Utils.printSleep(text, parametro);
                                                        Utils.limpar();
                                                        break;

                                                default:
                                                        break;
                                        }
                                } else {
                                        text = "Opa, o informante não está nessa taberna";
                                        Utils.printSleep(text, parametro);
                                        text = "Tente em outra!";
                                        Utils.printSleep(text, parametro);
                                }
                                resp =1;
                        }

                        // endregion
                        // endregion

                } // endregion
                else {
                        Menu.menu();
                }

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
                Utils.limpar();
                text = "Estou...estou com falta de ar...tinha alguma coisa em minha bebida...socorro"
                                + "";
                Utils.printSleep(text, parametro);
                Utils.limpar();
                text = "O informante foi envenenado, para salva-lo você precisa escolher entre três plantas que estão no jardim da taverna."
                                + "Conte com a sorte e faça sua escolha! \n"
                                + "[1] Flor vermelha \n"
                                + "[2] Flor preta \n"
                                + "[3] Flor rosa";
                Utils.printSleep(text, parametro);
                int escolha;
                escolha = jogador.input.nextInt();

                switch (escolha) {
                        case 1:
                                text = "Você escolheu a flor certa e conseguiu salvar informante";
                                Utils.printSleep(text, parametro);
                                text = "Ele se sente grato por te-lo salvado e decide te ajudar a entender mais sobre o seu passado.";
                                Utils.printSleep(text, parametro);
                                text = "Vocês fazem uma parada no caminho para que você fale com uma antiga criada do rei.\n"
                                                + "\n"
                                                + "---------------------------------------------------------------------------------------------------";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();

                                text = "Criada: O que eu me lembro sobre a sua chegada, jovem rapaz";
                                Utils.printSleep(text, parametro);
                                text = "Você chegou num lindo dia de primavera, nos o encontramos em uma cesta";
                                Utils.printSleep(text, parametro);
                                text = "Na borda de um riacho.";
                                Utils.printSleep(text, parametro);
                                text = "O que ouvi falar é que naquele mesmo dia, havia tido uma invasão de mercenários";
                                Utils.printSleep(text, parametro);
                                text = "Num pequeno vilarejo próximo ao rio acima do reino";
                                Utils.printSleep(text, parametro);
                                text = "Os seus pais devem ter feito o que fizeram para tentar te salvar.";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();

                                text = "Depois dessa conversa, você se lembra de que viu uma charada em algum lugar";
                                Utils.printSleep(text, parametro);
                                text = "O que matou que poderia ter salvado?";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();
                                text = "Você pensa um pouco sobre isso \n"
                                                + "(...)";
                                text = "E percebe que ao resolver a charada descobrirá o que realmente aconteceu com você no passado";
                                Utils.printSleep(text, parametro);
                                text = "O que matou que poderia ter salvado? (Minusculo e sem acento)";
                                Utils.printSleep(text, parametro);
                                String charada;
                                boolean teste = false;

                                while (!teste) {
                                        charada = jogador.input.nextLine().trim().toLowerCase();
                                        switch (charada) {
                                                case "agua":
                                                case "água":

                                                        text = "--------------------------------------------------------------------------- \n"
                                                        +"Você desvendou a charada e conseguiu desbloquear a memória de sua história\n"
                                                        +"Conseguiu chegar ao final do Game!!!!!!!\n"
                                                        +"---------------------------------------------------------------------------\n";
                                                        Utils.printSleep(text, 4000);
                                                        teste = true;
                                                        Utils.limpar();
                                                        break;
                                                default:
                                                        text = "É claro como a água, tente novamente e você desbloqueará o mistério";
                                                        Utils.printSleep(text, parametro);
                                                        teste = false;
                                                        break;
                                        }
                                }

                                break;
                        case 2:

                                text = "Você escolheu a flor errada e matou o informante, fracassou na missão e não poderá seguir em frente. \n"
                                                + "Volte ao inicio do jogo";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();
                                Menu.menu();
                                break;
                        case 3:
                                text = "Você escolheu a flor errada e matou o informante, fracassou na missão e não poderá seguir em frente. \n"
                                                + "Volte ao inicio do jogo";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();
                                Menu.menu();

                                break;

                        default:
                                text = "Escolha uma opção válida da próxima vez!";
                                Utils.printSleep(text, parametro);
                                Utils.limpar();
                                Menu.menu();
                                break;
                }
                Creditos.credito();
                // endregion

        }
}
