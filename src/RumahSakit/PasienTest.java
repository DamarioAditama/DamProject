/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RumahSakit;

public class PasienTest {
    public static void main(String[] args) {
        Pasien damar = new Pasien("Damar");
        damar.setTanggalLahir(1999, 3, 17);
        System.out.println("Umur          = "+damar.getUsia());
        System.out.println("Tanggal Lahir = "+damar.getTanggalLahir());
        System.out.print  ("Nomor Pasien  = "); damar.NomorRekamMedis();
        
    }
    
}

