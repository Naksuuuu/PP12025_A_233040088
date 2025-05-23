package pertemuan11.Tugas.Tugas1;



public class StrukturStack {
    private int[] array;
    private int capacity;
    private int top;

    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        top = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack sudah penuh");
        } else {
            top++;
            array[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak bisa pop.");
            return -1;
        }
        int data = array[top--];
        System.out.println("Pop: " + data);
        return data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int top() {
        return top == -1 ? -1 : array[top];
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        System.out.print("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
