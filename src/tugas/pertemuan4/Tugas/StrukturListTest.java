package pertemuan4.Tugas;


public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(3);
        list.addTail(4);
        list.addMid(7,2);
        list.addMid(8,2);
        list.addHead(5);

        System.out.println("Element: ");
        list.displayElement();
    }
}




// jika double gunakan :


//        StrukturList list2 = new StrukturList();
//        list2.addHead(3.4);
//        list2.addTail(2.1);
//        list2.addTail(5.5);
//        list2.addMid(1.1, 3);
//        list2.addMid(4.5, 4);
//
//        System.out.println("Element: ");
//        list2.displayElement();

//        StrukturList list = new StrukturList();

//
//        list.addHead(2.1);
//        list.addMid(3.4, 2);
//        list.addTail(4.5);
//
//        System.out.println("Element: ");
//        list.displayElement();