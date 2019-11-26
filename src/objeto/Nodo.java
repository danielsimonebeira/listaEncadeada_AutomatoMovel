package objeto;

public class Nodo {
    private Nodo anterior;
    private Nodo proximo;
    private String valor;

    public void setValor (String valor) {
        this.valor = valor;
    }
    public String getValor() {
        return valor;
    }
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    public Nodo getAnterior() {
        return anterior;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    public Nodo getProximo() {
        return proximo;
    }

}
