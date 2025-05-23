package pertemuan11.Tugas.Tugas2;

public class MyStack extends AbstractStack {

    public MyStack (int capacity) {
        super(capacity);
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.print("Stack (bottom-->): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }

    public int peekN(int n) {
        return arr[n];
    }
}
