package pertemuan9.Tugas;

public class ListMkTest {
    public static void main(String[] args) {
        ListMataKuliah List = new ListMataKuliah();

        List.addHead(new Matakuliah("IF001", "PP1", 3));
        List.addHead(new Matakuliah("IF002", "PRAKTIKUM WEB", 3));
        List.addTail(new Matakuliah("IF003", "PRAKTIKUM MULTIMEDIA", 3));
        List.addMid(new Matakuliah("IF004", "BASIS DATA", 3), 2);
        List.displayElement();
    }
}
