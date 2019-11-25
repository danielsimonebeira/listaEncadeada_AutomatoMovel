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
            System.out.println("[1] - Frente" +
                    "\n[2] - Traz" +
                    "\n[3] - Esquerda" +
                    "\n[4] - Direita" +
                    "\n[5] - Soma das direções" +
                    "\n[6] - Mostra todas as distâncias" +
                    "\n[7] - Sair" +
                    "\nDigite sua opção: ");
            resp = dadosUser.nextInt();
            if (resp == 1) {
                System.out.println("Digite um valor: ");
                valor = dadosUser.next();
                try {
                    lista.Insere_Inicio(idTrecho + " - " + valor + " km - Frente");

                } catch (ExistentValueException e) {
                    e.printStackTrace();
                }
            } else if (resp == 2) {
                System.out.println("Digite um valor: ");
                valor = dadosUser.next();
                try {
                    lista.Insere_Fim(idTrecho + " - " + valor + " km - Trás");
                } catch (ExistentValueException e) {
                    e.printStackTrace();
                }
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
        } while (resp != 7);
    }
}

