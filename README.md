# Janji
Saya Syahraini Revita Puri dengan NIM 2301895 berjanji mengerjakan TP4 DPBO dengan keberkahan-Nya, maka saya tidak akan melakukan kecurangan sesuai yang telah di spesifikasikan, Aamiin

# Desain Program
Program ini merupakan aplikasi manajemen data mahasiswa dengan GUI (Graphical User Interface) menggunakan Java Swing. Terdiri dari dua class utama:


**1.Class Mahasiswa**: 

- **Tujuan**: Merepresentasikan data setiap mahasiswa

- **Atribut**:
  - `nim` : String untuk menyimpan NIM mahasiswa
  - `nama` : String untuk menyimpan nama mahasiswa
  - `jenisKelamin` : String untuk menyimpan jenis kelamin mahasiswa
  - `fakultas` : String untuk menyimpan fakultas mahasiswa

- **Konstruktor**:
  -Konstruktor dengan 3 parameter(nim, nama, jenisKelamin) dengan default fakultas "FPMIPA"
  -KOnstruktor dengan 4 parameter(nim, nama, jenisKelamin,fakultas)

- **Getter dan Setter**: Untuk mengakses dan memodifikasi atribut


**2. Class Menu**:

- **Tujuan:** Menampilkan UI dan mengelola operasi CRUD (Create, Read, Update, Delete)

- **Komponen UI:**
  - `JFrame` sebagai window utama
  - `JPanel` sebagai container
  - `JTextField` untuk input NIM dan nama
  - `JComboBox` untuk pilihan jenis kelamin dan fakultas
  - `JTable` untuk menampilkan data mahasiswa
  - `JButton` untuk operasi Add/Update, Delete, dan Cancel
  - `JLabel` untuk judul dan label field

- **Atribut:**
  - `selectedIndex`: Integer untuk menyimpan indeks baris yang dipilih
  - `listMahasiswa`: ArrayList yang menyimpan objek Mahasiswa


# Alur Program
**1.Inisialisasi Program:**
- Program dimulai dengan membuat objek Menu
- Window diatur dengan ukuran 600x500 pixels dan diletakkan di tengah layar
- Background diatur berwarna pink pastel (RGB: 255, 209, 220)
- ArrayList listMahasiswa diinisialisasi dan diisi dengan data awal 20 mahasiswa melalui method populateList()
- Combo box jenis kelamin diisi dengan opsi "Laki-laki" dan "Perempuan"
- Combo box fakultas diisi dengan 7 opsi fakultas (FPMIPA, FPIPS, FPBS, FPEB, FPTK, FPOK, FPSD)
- Tabel diisi dengan data mahasiswa dari listMahasiswa

**2.Menambah Data Mahasiswa:**
- User mengisi field NIM, nama, dan memilih jenis kelamin serta fakultas
- User menekan tombol "Add"
- Program memeriksa apakah semua field terisi
- Jika ya, data baru ditambahkan ke listMahasiswa melalui method insertData()
- Tabel diperbarui untuk menampilkan data baru
- Form dibersihkan melalui method clearForm()
- User diberi notifikasi "Data berhasil ditambahkan!"

**3.Memilih Data untuk Edit/Delete:**
- User mengklik baris data pada tabel
- Data dari baris tersebut dipindahkan ke form input
- Tombol "Add" berubah menjadi "Update"
- Tombol "Delete" muncul
- Variable selectedIndex diperbarui dengan indeks baris yang dipilih

**4.Mengupdate Data Mahasiswa:**
- User mengubah data pada form
- User menekan tombol "Update"
- Program memeriksa apakah semua field terisi
- Jika ya, data pada listMahasiswa diperbarui melalui method updateData()
- Tabel diperbarui untuk menampilkan perubahan
- Form dibersihkan
- User diberi notifikasi "Data berhasil diupdate!"

**5.Menghapus Data Mahasiswa:**
- User memilih data pada tabel
- User menekan tombol "Delete"
- Program menampilkan konfirmasi penghapusan
- Jika user mengkonfirmasi, data dihapus dari listMahasiswa melalui method deleteData()
- Tabel diperbarui
- Form dibersihkan
- User diberi notifikasi "Data berhasil dihapus!"

**6.Membatalkan Operasi:**
- User menekan tombol "Cancel"
- Form dibersihkan melalui method clearForm()
- Tombol "Update" kembali menjadi "Add"
- Tombol "Delete" disembunyikan
- Variable selectedIndex diatur ulang menjadi -1

# Dokumentasi
![WhatsApp Image 2025-03-17 at 22 13 25_06b24b3e](https://github.com/user-attachments/assets/ba952110-c859-407a-9826-0f2fa2f290c7)
![WhatsApp Image 2025-03-17 at 22 13 25_b9a2af1e](https://github.com/user-attachments/assets/49734e00-ff99-4d1d-89a6-568f70eacdee)
![WhatsApp Image 2025-03-17 at 22 13 25_515ff133](https://github.com/user-attachments/assets/02099cbc-df53-4d8c-8339-332a7be3fd63)
![WhatsApp Image 2025-03-17 at 22 13 26_a3329db6](https://github.com/user-attachments/assets/a76aa81b-2d12-474c-9f6e-aef624cfbf91)
![WhatsApp Image 2025-03-17 at 22 13 26_0e35b5c1](https://github.com/user-attachments/assets/ef6b5c38-2931-4a84-8030-09ab6fd80596)
![WhatsApp Image 2025-03-17 at 22 13 27_8473c94b](https://github.com/user-attachments/assets/d25c8bd3-b25d-473b-92dc-d4e467bb7cad)
![WhatsApp Image 2025-03-17 at 22 13 27_74903773](https://github.com/user-attachments/assets/ae6b8dcb-2147-4559-97a9-b32937e21838)
![WhatsApp Image 2025-03-17 at 22 13 28_f177a882](https://github.com/user-attachments/assets/40d34268-979e-4a1c-b535-89cc46c2ed48)



