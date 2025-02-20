package pertemuan3.Latihan4;

public class StrukturList {
    private   Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(int data) {
          Node posNode = null, curNode =  null;

          Node newNode = new   Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " -> ");
            curNode = curNode.getNext();
        }
        System.out.println("NULL");
    }
}
