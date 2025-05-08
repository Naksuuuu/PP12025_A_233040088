package pertemuan9.Tugas;

public class Node {
    private Matakuliah data;
    private Node next;

    public Node (Matakuliah data) {
        this.data = data;
    }

    //setter and getter

    public void setData (Matakuliah data) {
        this.data = data;
    }

    public Matakuliah getData() {
        return this.data;
    }

    public void setNext (Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

}
