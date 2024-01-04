package oop.collection.list.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        node1.next = node2;
        Node<Integer> head = node1;

        SingleLinkedList<Integer> list3 = new SingleLinkedList<>();
        list3.addNode(1);
        list3.addNode(2);
        list3.addNode(3);
        list3.addNode(4);
        list3.addNode(5);

        list3.printAll();

    }
}
