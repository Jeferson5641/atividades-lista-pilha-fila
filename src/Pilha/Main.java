package Pilha;

public class Main {
    public static void main(String[] args) {
        PilhaLigada pilha = new PilhaLigada();

        // Inserir elementos na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        // Imprimir a pilha
        System.out.println("Pilha original:");
        pilha.imprimir();

        // Copiar a pilha
        PilhaLigada copia = (PilhaLigada) pilha.copiar();
        System.out.println("Cópia da pilha:");
        copia.imprimir();

        // Inverter a pilha
        pilha.inverter();
        System.out.println("Pilha invertida:");
        pilha.imprimir();

        // Remover elementos da pilha
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Pilha após remoção:");
        pilha.imprimir();
    }
}
