package pertemuan10.Tugas;

public class StrukturQueue  {
    private Node REAR;
    private Node FRONT;




    public boolean isEmpty() {
        return FRONT == null && REAR == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
             REAR = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        int data = FRONT.getData();
        FRONT = FRONT.getNext();
        return data;
    }


    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public void displayElement() {

        if (isEmpty()) {
            System.out.println("Queue Kosong");
            return;
        }

        System.out.println(size());
        System.out.println(isEmpty());

        Node curNode = FRONT ;
        System.out.print("Elemen Queue: ");
        while (curNode != null ) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
        System.out.println("FRONT: " + front());




    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
}
