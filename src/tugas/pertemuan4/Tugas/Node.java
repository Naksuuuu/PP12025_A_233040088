package pertemuan4.Tugas;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}


// jika double gunakan :

//public class Node {
//    private double data;
//    private Node next;
//
//    public Node(double data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    public double getData() {
//        return data;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//}