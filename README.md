# Janji
Saya Syahraini Revita Puri dengan NIM 2301895 berjanji mengerjakan TP4 DPBO dengan keberkahan-Nya, maka saya tidak akan melakukan kecurangan sesuai yang telah di spesifikasikan, Aamiin

# Desain Program
Program ini merupakan aplikasi manajemen data mahasiswa dengan GUI (Graphical User Interface) menggunakan Java Swing. Terdiri dari dua class utama:


**1.Class Mahasiswa**: 


**Tujuan**: Merepresentasikan data setiap mahasiswa


**Atribut**:
- **nim** : String untuk menyimpan NIM mahasiswa
- **nama** : String untuk menyimpan nama mahasiswa
- **jenisKelamin** : String untuk menyimpan jenis kelamin mahasiswa
- **fakultas** : String untuk menyimpan fakultas mahasiswa


## 2. Class Menu

- **Tujuan:** Menampilkan UI dan mengelola operasi CRUD (Create, Read, Update, Delete)

- **Komponen UI:**
  - `JFrame` sebagai window utama
  - `JPanel` sebagai container
  - `JTextField` untuk input NIM dan nama
  - `JComboBox` untuk pilihan jenis kelamin dan fakultas
  - `JTable` untuk menampilkan data mahasiswa
  - `JButton` untuk operasi Add/Update, Delete, dan Cancel
  - `JLabel` untuk judul dan label field



**Single Inheritance**:
- KomputerGaming mewarisi dari Komputer.


**Composition**:
- Komputer memiliki komposisi dengan Cpu, Ram, dan Harddrive
- Komputer memiliki komposisi dengan list of Periferal dan list of Software

# Alur Program
Pertama data komponen komputer diisi secara statis, lalu program membuat objek komponen dasar (Cpu, Ram, Harddrive). Setelah itu program membuat objek periferal (Mouse, Keyboard, Monitor) dan software (OS, Antivirus, Gaming).
Selanjutnya program membuat array untuk menyimpan periferal dan software. Kemudian program membuat objek komputer gaming dengan komponen-komponen yang telah dibuat sebelumnya.
Program kemudian menampilkan informasi komputer gaming yang telah dibuat. Setelah itu program membuat objek keyboard gaming yang menunjukkan implementasi multiple inheritance.
Kemudian program melakukan beberapa aksi:
- Menampilkan informasi keyboard gaming
- Mengubah status RGB pada keyboard gaming dengan memanggil method toggle_rgb()
- Menambahkan RAM baru pada komputer gaming dengan method add_ram()
- Menambahkan periferal baru (headset) pada komputer gaming dengan method add_periferal()
- Menambahkan software baru (game) pada komputer gaming dengan method add_software().


Terakhir, program menampilkan informasi terbaru komputer gaming setelah dilakukan modifikasi.
