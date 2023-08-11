package lists;

public class CustomSinglyList<T> {
    private SingleNode<T> head;
    private int size;


    public void addToFront(T element){
        SingleNode<T> newElement = new SingleNode<>(element);
        newElement.setNext(head);
        head = newElement;
        size++;
    }

    public T removeFromFront(){
        if(head == null){
            return null;
        }
        SingleNode<T> nodeToRemove = head;
        head = head.getNext();
        size--;
        nodeToRemove.setNext(null);
        return nodeToRemove.getValue();

    }

    public boolean isEmpty(){
        return head == null;
    }
    public SingleNode<T> getHead() {
        return head;
    }

    public void setHead(SingleNode<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        SingleNode<T> current = head;

        while(current != null){
            System.out.print(current.getValue());
            if(current.getNext() != null){
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }
}
