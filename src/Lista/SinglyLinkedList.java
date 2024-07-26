package Lista;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // a) Inserção de elementos no início
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // b) Inserção de elementos no final
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next!= null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // c) Inserção de um elemento em uma posição específica
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Posição inválida");
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current!= null; i++) {
                current = current.next;
            }
            if (current == null) {
                throw new IllegalArgumentException("Posição inválida");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // d) Remoção de elementos do início
    public void removeFromBeginning() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        head = head.next;
    }

    // e) Remoção de elementos do final
    public void removeFromEnd() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next!= null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Impressão da lista
    public void printList() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Busca de um elemento
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // f) Remoção de um elemento em uma posição específica
    public void removeAtPosition(int position) {
        if (position < 0 || head == null) {
            throw new IllegalArgumentException("Posição inválida ou lista vazia");
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }
            if (current.next == null) {
                throw new IllegalArgumentException("Posição inválida");
            }
            current.next = current.next.next;
        }
    }

    // g) Inversão da lista
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // h) Concatenação de listas
    public void concatenate(SinglyLinkedList otherList) {
        if (head == null) {
            head = otherList.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = otherList.head;
        }
    }

    // i) Divisão da lista em duas listas em uma posição específica
    public SinglyLinkedList[] splitAtPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Posição inválida");
        }
        SinglyLinkedList[] lists = new SinglyLinkedList[2];
        lists[0] = new SinglyLinkedList();
        lists[1] = new SinglyLinkedList();

        if (head == null) {
            return lists;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; i < position && current != null; i++) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            lists[0].head = head;
            return lists;
        }

        lists[0].head = head;
        lists[1].head = current;
        prev.next = null;
        return lists;
    }

    // j) Adição de vários elementos
    public void addAll(int... elements) {
        for (int element : elements) {
            insertAtEnd(element);
        }
    }

    // k) Remoção de um elemento por índice
    public void remove(int index) {
        if (index < 0 || head == null) {
            throw new IllegalArgumentException("Índice inválido ou lista vazia");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current.next != null; i++) {
                current = current.next;
            }
            if (current.next == null) {
                throw new IllegalArgumentException("Índice inválido");
            }
            current.next = current.next.next;
        }
    }

    // l) Verificação de existência de um elemento
    public boolean contains(int element) {
        Node current = head;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // m) Adição de vários elementos a partir de outra lista
    public void addAll(SinglyLinkedList otherList) {
        Node current = otherList.head;
        while (current != null) {
            insertAtEnd(current.data);
            current = current.next;
        }
    }

    // n) Divisão da lista em duas listas em uma posição específica (versão simplificada)
    public SinglyLinkedList[] split(int index) {
        return splitAtPosition(index);
    }

    // Classe interna Node
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}