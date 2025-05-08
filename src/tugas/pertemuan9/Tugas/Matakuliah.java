package pertemuan9.Tugas;

public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
// setter and getter

    public String getKode() {
        return this.kode ;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "Matakuliah: " + kode + ", " + nama + ", " + sks;
    }

}


