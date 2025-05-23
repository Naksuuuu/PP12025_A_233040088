package pertemuan10.Tugas;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(3);

        queue.displayElement();
        queue.dequeue();
        queue.displayElement();
    }
}

