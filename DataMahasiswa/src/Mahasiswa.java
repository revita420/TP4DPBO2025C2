public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String fakultas; // Atribut baru yang ditambahkan

    public Mahasiswa(String nim, String nama, String jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.fakultas = "FPMIPA"; // Default fakultas
    }

    public Mahasiswa(String nim, String nama, String jenisKelamin, String fakultas) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.fakultas = fakultas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}