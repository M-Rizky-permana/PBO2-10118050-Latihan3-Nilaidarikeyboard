/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO210118050Latihan3NilaidariKeyboard;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Muhamad Rizky Permana
 * KELAS    : IF-2
 * NIM      : 10118050
 * Deskripsi Program : Menampilkan Nilai dari keyboard
 */
public class PBO210118050Latihan3NilaidariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda:  ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
        
    }
    
}
