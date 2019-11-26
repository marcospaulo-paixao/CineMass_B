/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Principal {

    public static String filmes[] = {"Malévola: Dona do Mal", "Os Parças", "As Panteras"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean sair = false;
        String opcao = null;
        do {

            do {
                lblMenu();
                ;
                if (util.ValidaInput.int_no_intervalo(opcao = input.nextLine(), 0, 3) == false) {
                    System.out.printf("Opção Inválida\n");
                } else {
                    sair = true;
                }
            } while (!sair);
            switch (Integer.parseInt(opcao)) {
                case 1:
                    registrarVenda();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (sair);

    }

    public static void lblMenu() {
        System.out.printf(
                "CINEMass\n\n"
                + " 1.Registrar venda de ingresso\n"
                + " 2.Reimprimir Ingresso\n"
                + " 3.Relatório\n"
                + "\n"
                + " 0.sair\n"
                + "> "
        );
    }

    public static void lblregistrarVenda(String[] filmes) {
        System.out.printf(
                "CINEMass:Registrar venda de ingresso\n\n");

        for (int i = 0; i < filmes.length; i++) {
            System.out.printf(" %d.%s\n", i + 1, filmes[i]);
        }

        System.out.printf("\n0.voltar\n"
                + "> "
        );

    }

    public static void registrarVenda() {
        lblregistrarVenda(filmes);

    }

}
