package pertemuan8.Tugas;


public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();


//        list.addTail(5);
//        list.addTail(4);
//        list.addTail(6);

//        System.out.println("Element: ");
//        list.displayElement();
//
//        System.out.println(list.find(6));


        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);

        System.out.println("Element: ");
        list.displayElement();

        list.clear();

        System.out.println("Element: ");
        list.displayElement();





    }
}