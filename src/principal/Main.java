package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int poltrona, filme, fileiraNumerica, entrada = 0;
        char fileira, sessao;
        Scanner leitura = new Scanner(System.in);
        int opc;

        do {
            exibirMenu();
            opc = leitura.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Saindo..");
                    break;
                case 1:
                    exibirListaFilmes();
                    System.out.println("Informe o filme: ");
                    filme = leitura.nextInt();
                    
                    System.out.println("Informe a sessao");
                    exibirSessoes();
                    
                    sessao = leitura.next().charAt(0);
                    mostrarAssentos();
                    
                    System.out.println();
                    System.out.println("Informe a fileira que deseja comprar : ");
                    fileira = leitura.next().charAt(0);
                    
                    fileiraNumerica = converteFileiraCharToInt((char) fileira);

                    System.out.println("Informe a poltrona: ");
                    poltrona = leitura.nextInt();
                    System.out.println();

                    String bilhete = montarBilhete(fileira, poltrona, filme, sessao, entrada);

            }

        } while (opc != 0);
    }

    public static int converteFileiraCharToInt(char fileira) {

        if (fileira == 'a' || fileira == 'A') {
            return 0;
        } else if (fileira == 'b' || fileira == 'B') {
            return 1;
        } else if (fileira == 'c' || fileira == 'C') {
            return 2;
        } else if (fileira == 'd' || fileira == 'D') {
            return 3;
        } else if (fileira == 'e' || fileira == 'E') {
            return 4;
        } else if (fileira == 'f' || fileira == 'F') {
            return 5;
        } else if (fileira == 'g' || fileira == 'G') {
            return 6;
        } else if (fileira == 'h' || fileira == 'H') {
            return 7;
        } else if (fileira == 'i' || fileira == 'I') {
            return 8;
        } else if (fileira == 'j' || fileira == 'J') {
            return 9;
        }
        return 0;
    }

    public static String montarBilhete(char fileira, int poltrona, int filme, char sessao, int entrada) {
        String text = "";
        text += "ID: " + fileira + poltrona + "\n";
        text += "Sessao: " + sessao + "\n";
        text += "Filme: " + obterNomeDeFilme(filme) + "\n";
        text += "Entrada: " + (entrada == 1) + "Meia" + ":" + "Inteira" + "\n";
        return text;
    }

    public static String obterNomeDeFilme(int filme) {
        if (filme == 1) {
            return "Tarzan";
        } else if (filme == 2) {
            return "De volta para o futuro.";
        } else if (filme == 3) {
            return "Coringa";
        } else {
            return "Not Found - 404";
        }
    }

    public static void mostrarAssentos() {
        String matriz[][] = new String[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] == "") {
                    System.out.print(" *__*\t");
                } else {
                    System.out.print("X\t");
                }
            }
            System.out.println();
        }

    }

    public static void exibirMenu() {
        System.out.println("CINEMA ABC");
        System.out.println("(1) - Venda");
        System.out.println("(2) - Histórico");
        System.out.println("(3) - Relatório");
        System.out.println("(0) - Sair");

    }

    public static void exibirListaFilmes() {

        System.out.println("Catálogo de Filmes");
        System.out.println("(1) - Tarzan");
        System.out.println("(2) - De volta para o futuro");
        System.out.println("(3) - Coringa");
        System.out.println("(0) - Sair");

    }

    private static void exibirSessoes() {
        System.out.println("Lista de Sessões");
        System.out.println("(1) - Manhão");
        System.out.println("(2) - Tarde");
        System.out.println("(3) - Noite");
        System.out.println("(0) - Sair");
    }
}