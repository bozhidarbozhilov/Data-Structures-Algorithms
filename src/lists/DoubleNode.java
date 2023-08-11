package lists;

import java.util.ArrayList;
import java.util.List;

public class DoubleNode<T> {

    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;

    public DoubleNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
