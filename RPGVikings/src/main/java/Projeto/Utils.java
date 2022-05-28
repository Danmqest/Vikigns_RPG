package Projeto;

public class Utils {

    public static void limpar() {

        System.out.print("\033\143");
    }

    public static void sleep(int parametro) {

        try {

            Thread.sleep(parametro);
        } catch (Exception e) {
        }

    }

    public static void printSleep(String text, int parametro) {

        System.out.println(text);
        sleep(parametro);
    }

}
