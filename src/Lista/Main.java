package Lista;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserção de elementos
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        // Impressão da lista
        System.out.println("Lista original:");
        list.printList();

        // Inserção de um elemento no início
        list.insertAtBeginning(0);
        System.out.println("Lista após inserção no início:");
        list.printList();

        // Inserção de um elemento no final
        list.insertAtEnd(6);
        System.out.println("Lista após inserção no final:");
        list.printList();

        // Remoção do primeiro elemento
        list.removeFromBeginning();
        System.out.println("Lista após remoção do início:");
        list.printList();

        // Remoção do último elemento
        list.removeFromEnd();
        System.out.println("Lista após remoção do final:");
        list.printList();

        // Busca de um elemento
        int searchElement = 3;
        if (list.search(searchElement)) {
            System.out.println("Elemento " + searchElement + " encontrado!");
        } else {
            System.out.println("Elemento " + searchElement + " não encontrado!");
        }

        // Inversão da lista
        list.reverse();
        System.out.println("Lista invertida:");
        list.printList();

        // Concatenação de listas
        SinglyLinkedList otherList = new SinglyLinkedList();
        otherList.insertAtEnd(7);
        otherList.insertAtEnd(8);
        otherList.insertAtEnd(9);
        list.concatenate(otherList);
        System.out.println("Lista após concatenação:");
        list.printList();

        // Divisão da lista em duas listas
        SinglyLinkedList[] splitLists = list.split(3);
        System.out.println("Lista 1:");
        splitLists[0].printList();
        System.out.println("Lista 2:");
        splitLists[1].printList();
    }
}