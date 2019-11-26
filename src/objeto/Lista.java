package objeto;

import excecao.EmptyListException;
import excecao.ExistentValueException;

import java.util.ArrayList;

public class Lista {
    private Nodo primeiro = null, ultimo = null;

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public ArrayList<String> Listar() throws EmptyListException {
        ArrayList<String> lista = new ArrayList<String>();
        if (primeiro == null)
            throw new EmptyListException("A lista está vazia! ");
        else {
            Nodo aux = getPrimeiro();
            while (aux != null) {
                String v1 = aux.getValor();
                lista.add(v1);
                aux = aux.getProximo();
            }
            return lista;
        }
    }

    public boolean Procura(String valor) {
        Nodo aux = getPrimeiro();
        while (aux != null) {
            if (valor.equals(aux.getValor())) {
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }

    public void Insere_Inicio(String valor) throws ExistentValueException {
        boolean procura = false;
        procura = Procura(valor);
        if (procura == false) {
            Nodo novo = new Nodo();
            if (primeiro == null) {
                novo.setValor(valor);
                setPrimeiro(novo);
                setUltimo(novo);
            } else {
                primeiro.setAnterior(novo);
                novo.setValor(valor);
                novo.setProximo(primeiro);
                setPrimeiro(novo);
            }
        } else {
            throw new ExistentValueException("Valor já existe na lista!");
        }
    }

    public void Insere_Fim(String valor) throws ExistentValueException {
        Nodo novo = new Nodo();
        boolean procura = false;
        procura = Procura(valor);
        if (procura == true)
            throw new ExistentValueException("Valor já existe na lista!");
        else {
            if (ultimo == null) {
                novo.setValor(valor);
                primeiro = novo;
                ultimo = novo;
            } else {
                ultimo.setProximo(novo);
                novo.setValor(valor);
                ultimo = novo;
            }
        }
    }


}