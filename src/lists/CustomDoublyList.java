package lists;

import java.time.Duration;

public class CustomDoublyList<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;

    public void addToFront(T newElement){
        DoubleNode<T> newNode = new DoubleNode<>(newElement);
        if(head == null){
            tail = newNode;
        }else{
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public T removeFromFront(){
        DoubleNode<T> nodeToRemove = head;

        if(size == 1){
            head = null;
            tail = null;
        }else{
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        size--;
        return nodeToRemove.getValue();
    }

    public void addToEnd(T newElement){
        DoubleNode<T> newNode = new DoubleNode<>(newElement);
        if(tail == null){
            head = newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
    }

    public T removeFromEnd(){
        DoubleNode<T> removedNode = tail;
        if(size == 1){
            tail = null;
            head = null;
        }else{
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        size--;
        return removedNode.getValue();
    }

    public void printFromStart(){
        DoubleNode<T> current = head;

        while(current != null){
            System.out.print(current.getValue());
            if(current.getNext() != null){
                System.out.print(" <-> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    public void printFromEnd(){
        DoubleNode<T> current = tail;

        while(current != null){
            System.out.print(current.getValue());
            if(current.getPrev() != null){
                System.out.print(" <-> ");
            }
            current = current.getPrev();
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return head == null;
    }
    public DoubleNode<T> getHead() {
        return head;
    }

    public void setHead(DoubleNode<T> head) {
        this.head = head;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

    public void setTail(DoubleNode<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
