package oop.collection.list.linkedlist;

public class Node<T> { //T는... 데이터타입을 나중에 정할거다..하는것...객체를 생성할때 타입을 지정하겠다.

    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
