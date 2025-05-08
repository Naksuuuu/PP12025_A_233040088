package pertemuan9.Tugas;



public class ListMataKuliah {
    private Node HEAD;

    public ListMataKuliah() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
            Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) {
        Node posNode = null, curNode =  null;

        Node newNode = new Node(data);
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

    public void addMid(Matakuliah data, int pos) {
        Node posNode = null, curNode = null;
        int i;

        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (pos == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i  < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }


    public void displayElement () {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

//    System.out.println(curNode.getData().getKode() +
//            " - " + curNode.getData().getNama() +
//            " - " + curNode.getData().getSks());

}
