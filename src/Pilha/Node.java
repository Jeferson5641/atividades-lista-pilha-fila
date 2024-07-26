package Pilha;

public class Node {
    private int valor;
    private Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return proximo;
    }
}
