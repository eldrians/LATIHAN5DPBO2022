/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author Axel Eldrian Hadiwibowo - 2000352
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String MK;
    
    public Mahasiswa(String n1, String n2, String n3, String n4){
        nim = n1;
        nama = n2;
        nilai = n3;
        MK = n4;
    }
    
    public void setNim(String n) {
        nim = n;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNama(String n) {
        nama = n;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNilai(String n) {
        nilai = n;
    }
    
    public String getNilai() {
        return nilai;
    }
    
    public void setMK(String n) {
        MK = n;
    }
    
    public String getMK() {
        return MK;
    }
    // Axel Eldrian Hadiwibowo 2000352
}
