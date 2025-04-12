package pertemuan7.Tugas;


public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();


        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);


        System.out.println("Element: ");
        list.displayElement();
        list.removeMid(3);
        list.displayElement();
        list.removeMid(6);
        list.removeMid(5);
        list.displayElement();

    }
}