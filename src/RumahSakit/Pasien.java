/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RumahSakit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {
    private String nama;
    private Date tanggalLahir;
    private String noRekamMedis;

    public Pasien(){
        
    }
    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        tanggalLahir = new Date(tahun-1900,bulan-1,tanggal);
    }
    
    public int getUsia(){
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }
    
    public void NomorRekamMedis(){
        Date tgl = new Date();
        noRekamMedis = "yyyyMMdd";
        SimpleDateFormat ft = new SimpleDateFormat(noRekamMedis);
        String nm = getNama();
        System.out.println(ft.format(tgl)+ nm.substring(0, 3));
    }
}

// String nomorRekamMedis
//Tanggal daftar berformat yyyyMMdd PUS(PUS
//public void buatNomorRekamMedis(){}
