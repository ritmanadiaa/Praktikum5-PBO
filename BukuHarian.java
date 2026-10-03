/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak5;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BukuHarian {
    // 1. Deklarasi Atribut (Wajib S Kapital pada String)
    String namaPemilik;
    String namaFile;

    // 2. Constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replaceAll("\\s+", "_") + ".txt";
    }

    // 3. Method tulisCatatan
    public void tulisCatatan(String tanggal, String isi) {
        try (FileWriter writer = new FileWriter(this.namaFile, true)) {
            String barisCatatan = "[" + tanggal + "] - " + isi + "\n";
            writer.write(barisCatatan);
            System.out.println("Catatan berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }
    
        // 4. Method bacaCatatan
    public void bacaCatatan() {
        File file = new File(this.namaFile);

        if (!file.exists() || file.length() == 0) {
            System.out.println("Belum ada catatan harian.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String baris;
            System.out.println("\n=== Catatan Harian " + namaPemilik + " ===");
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }

    // Getter
    public String getNamaPemilik() {
        return namaPemilik;
    }
}

