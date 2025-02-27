package pertemuan4.Tugas;


public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }


    public void addMid(int data, int pos) {
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

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " -> ");
            curNode = curNode.getNext();
        }
        System.out.println("NULL");
    }

    public void addTail(int data) {
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
}


//jika double gunakan :

//public class StrukturList {
//    private Node HEAD;
//
//    public StrukturList() {
//        this.HEAD = null;
//    }
//
//    public boolean isEmpty() {
//        return HEAD == null;
//    }
//
//    public void addHead(double data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//            newNode.setNext(HEAD);
//            HEAD = newNode;
//        }
//    }
//
//    public void addMid(double data, int pos) {
//        Node posNode = null, curNode = null;
//        int i;
//
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//            curNode = HEAD;
//            if (pos == 1) {
//                newNode.setNext(curNode);
//                HEAD = newNode;
//            } else {
//                i = 1;
//                while (curNode != null && i < pos) {
//                    posNode = curNode;
//                    curNode = curNode.getNext();
//                    i++;
//                }
//                posNode.setNext(newNode);
//                newNode.setNext(curNode);
//            }
//        }
//    }
//
//    public void addTail(double data) {
//        Node posNode = null, curNode = null;
//
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            HEAD = newNode;
//        } else {
//            curNode = HEAD;
//            while (curNode != null) {
//                posNode = curNode;
//                curNode = curNode.getNext();
//            }
//            posNode.setNext(newNode);
//        }
//    }
//
//    public void displayElement() {
//        Node curNode = HEAD;
//        while (curNode != null) {
//            System.out.print(curNode.getData() + " -> ");
//            curNode = curNode.getNext();
//        }
//        System.out.println("NULL");
//    }
//}