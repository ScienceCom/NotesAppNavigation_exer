Latihan Pertemuan 5: Navigasi Antar Layar

Repositori ini berisi hasil latihan praktis mata kuliah Pengembangan Aplikasi Mobile (Teknik Informatika - ITERA) mengenai implementasi **Navigation Component** di Compose Multiplatform.

🚀 Fitur & Latihan

Aplikasi ini mendemonstrasikan tiga konsep utama navigasi:

1. Latihan 1: Navigasi Dasar (Basic Navigation)
* Tujuan: Berpindah antar layar menggunakan `NavController`.
* Implementasi: 
    * Penggunaan `NavHost` sebagai kontainer layar.
    * Mekanisme *Forward Navigation* (pindah ke depan) dan *Back Navigation* (kembali ke layar sebelumnya menggunakan `popBackStack`).
    * Layar yang terlibat: `HomeScreen` dan `NoteDetailScreen`.

2. Latihan 2: Pengiriman Argumen (Passing Arguments)
* Tujuan: Mengirim data dari satu layar ke layar lainnya melalui rute (URL-like patterns).
* Implementasi:
    * Pendefinisian rute dinamis: `note_detail/{noteId}`.
    * Penggunaan `navArgument` dengan tipe data `NavType.IntType`.
    * Menampilkan data ID catatan secara spesifik di `NoteDetailScreen` berdasarkan item yang diklik di `HomeScreen`.

3. Latihan 3: Navigasi Panel Bawah (Bottom Navigation)
* Tujuan: Mengimplementasikan menu navigasi utama di bagian bawah aplikasi.
* Implementasi:
    * Menggunakan komponen `Scaffold` sebagai struktur utama.
    * Implementasi `NavigationBar` dan `NavigationBarItem` (Material Design 3).
    * Pengaturan state navigasi menggunakan `currentBackStackEntryAsState` agar ikon menu aktif sesuai dengan layar yang sedang dibuka.
    * Optimasi navigasi dengan `launchSingleTop` dan `restoreState` untuk menjaga performa *back stack*.

---

🛠️ Struktur Folder

```text
composeApp/src/commonMain/kotlin/
 └── [package_name]/
     ├── navigation/
     │    ├── screen.kt        # Definisi Sealed Class untuk Rute
     │    └── navgraph.kt   # Pusat pengaturan NavHost & Alur Navigasi
     ├── ui/
     │    ├── homescreen.kt    # Tampilan Utama (Latihan 1 & 2)
     │    ├── notedetailccreen.kt # Tampilan Detail (Latihan 2)
     │    └── mainscreen.kt    # Container dengan Bottom Nav (Latihan 3)
     └── App.kt                # Entry Point Aplikasi
