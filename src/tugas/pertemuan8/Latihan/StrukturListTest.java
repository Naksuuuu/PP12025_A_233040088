package pertemuan8.Latihan;


public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();


        list.addTail(5);
        list.addTail(4);
        list.addTail(6);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println(list.find(6));



        list.clear();

        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println(list.size());







    }
}