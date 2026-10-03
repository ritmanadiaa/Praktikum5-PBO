/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
public class MainDiary {
    public static void main(String[] args) {
        // a. Instansiasi satu objek BukuHarian (menggunakan nama Anda)
        BukuHarian diary = new BukuHarian("Ritma");
        
        diary.tulisCatatan("03-10-2026", "Hallo nama aku ritma.");
        diary.tulisCatatan("04-10-2026", "Mahasiswa semester 3 yang punya banyak tugass.");

        // c. Panggil method bacaCatatan untuk menampilkan data tersebut
        diary.bacaCatatan();
    }
}
