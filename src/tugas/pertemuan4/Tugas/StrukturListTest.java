package pertemuan4.Tugas;


public class StrukturListTest {
    public static void main(String[] args) {
    StrukturList list = new StrukturList();
    StrukturList list2 = new StrukturList();

        list.addHead(2.1);
        list.addMid(3.4, 2);
        list.addTail(4.5);

        System.out.println("Element: ");
        list.displayElement();


        list2.addHead(3.4);
        list2.addTail(2.1);
        list2.addTail(5.5);
        list2.addMid(1.1, 3);
        list2.addMid(4.5, 4);

        System.out.println("Element: ");
        list2.displayElement();






    }
}
