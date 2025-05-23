package pertemuan11.Tugas.Tugas1;



public class StackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

//        System.out.println("#Sebelum push");
//        System.out.println("Size: " + stack.size());
//        System.out.println("Empty: " + stack.isEmpty());
//        System.out.println("Full: " + stack.isFull());
//        System.out.println("Top: " + stack.top());
//        System.out.print("Elemen from TOP: ");
//        stack.printStack();

        System.out.println("#Melakukan push 3x:");
        System.out.print("push 2; ");
        stack.push(2);
        System.out.print("push 4, ");
        stack.push(4);
        System.out.print("push 1\n");
        stack.push(1);
        System.out.println();

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();
        System.out.println();

        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();
        System.out.println();

        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();
    }
}

