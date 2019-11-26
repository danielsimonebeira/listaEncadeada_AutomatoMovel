import excecao.EmptyListException;
import excecao.ExistentValueException;
import objeto.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner dadosUser = new Scanner(System.in);
        Lista lista = new Lista();
        String valor = null;
        int resp = 0, idTrecho = 0;

        do {
            System.out.println("\nMenu de opções\n");
            System.out.println("[1] - Adiciona percurso no inicio da lista" +
                    "\n[2] - Adiciona percurso no fim da lista" +
                    "\n[3] - Procura distancia" +
                    "\n[4] - Mostra todas as distâncias" +
                    "\n[5] - Soma das direções" +
                    "\n[6] - Sair" +
                    "\nDigite sua opção: ");
            resp = dadosUser.nextInt();
            if (resp == 1) {
                direcoes(valor, idTrecho, dadosUser, lista);
            } else if (resp == 2) {
                direcoes(valor, idTrecho, dadosUser, lista);
            } else if (resp == 3) {
                System.out.println("Digite um valor: ");
                valor = dadosUser.next();
                if (lista.Procura(valor) == true)
                    System.out.println("Valor existe na lista!");
                else
                    System.out.println("Valor não existe na lista!");
            } else if (resp == 4) {
                ArrayList<String> listar = new ArrayList<String>();
                try {
                    listar = lista.Listar();
                } catch (EmptyListException e) {
                    e.printStackTrace();
                }

                for (String elemento : listar) {
                    System.out.println(elemento + " ");
                }
                System.out.println();
            } else if (resp <1 || resp > 7) {
                System.out.println("Opção inválida!");
            }
            idTrecho += 1;
        } while (resp != 6);
    }

    private static void direcoes(String valor, int idTrecho, Scanner dadosUser, Lista lista) {
        int direcao = 0;
        System.out.println("\nAdicione as direções de opções\n");
        System.out.println("[1] - Frente" +
                "\n[2] - Trás" +
                "\n[3] - Direita" +
                "\n[4] - Esquerda" +
                "\n[6] - Sair" +
                "\nDigite sua opção: ");
        direcao = dadosUser.nextInt();
        if (direcao == 1) {
            System.out.println("Digite a distância: ");
            valor = dadosUser.next();
            try {
                lista.Insere_Inicio(idTrecho + " - " + valor + " km - Frente");

            } catch (ExistentValueException e) {
                e.printStackTrace();
            }
        } else if (direcao == 2) {
            System.out.println("Digite a distância: ");
            valor = dadosUser.next();
            try {
                lista.Insere_Inicio(idTrecho + " - " + valor + " km - Trás");

            } catch (ExistentValueException e) {
                e.printStackTrace();
            }
        } else if (direcao == 3) {
            System.out.println("Digite a distância: ");
            valor = dadosUser.next();
            try {
                lista.Insere_Inicio(idTrecho + " - " + valor + " km - Direita");

            } catch (ExistentValueException e) {
                e.printStackTrace();
            }
        } else if (direcao == 4) {
            System.out.println("Digite a distância: ");
            valor = dadosUser.next();
            try {
                lista.Insere_Inicio(idTrecho + " - " + valor + " km - Esquerda");

            } catch (ExistentValueException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Voltando para o menu inicial... ");
        }
    }
}

