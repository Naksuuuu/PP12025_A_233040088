package pertemuan8;


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

    // Menghapus node di bagian head
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus HEAD.");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }


    // Menghapus node di bagian tail
    public void removeTail() {
        Node preNode = null;
        Node lastNode;

        if (HEAD != null) {
            if (HEAD.getNext() == null) { // jika hanya satu elemen dalam list
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    // Menghapus node di posisi tertentu (bukan head atau tail)
    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;

            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu == true) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }





    public boolean find(int x)
    {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu)
        {
            if (curNode.getData() == x) {
                ketemu = true;
            }
            else {
                curNode = curNode.getNext();
            }
        }

        return ketemu;
    }



    public int size()
    {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null)
        {
            jumlah = jumlah + 1;
            curNode = curNode.getNext();
        }

        return jumlah;
    }

    public void clear() {
        HEAD = null;
        System.out.println("Semua elemen dalam list telah dihapus.");
    }


}





