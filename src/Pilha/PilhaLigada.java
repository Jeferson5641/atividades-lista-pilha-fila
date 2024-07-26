package Pilha;

public class PilhaLigada implements Pilha {
    private Node topo;

    public PilhaLigada() {
        this.topo = null;
    }

    @Override
    public void push(int elemento) {
        Node novoNo = new Node(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    @Override
    public int pop() {
        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }
        int valor = topo.getValor();
        topo = topo.getProximo();
        return valor;
    }

    @Override
    public void imprimir() {
        Node atual = topo;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    @Override
    public Pilha copiar() {
        PilhaLigada copia = new PilhaLigada();
        Node atual = topo;
        while (atual != null) {
            copia.push(atual.getValor());
            atual = atual.getProximo();
        }
        return copia;
    }

    @Override
    public void inverter() {
        PilhaLigada auxiliar = new PilhaLigada();
        while (topo != null) {
            auxiliar.push(pop());
        }
        topo = auxiliar.topo;
    }
}
