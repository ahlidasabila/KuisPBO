/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criteria;
import perhitungan.HitungNilai;


/**
 *
 * @author user
 */
public class Manager extends DaftarNilai implements HitungNilai {
    public Manager(String nama, int tesA, int tesB, int tesC) {
        super(nama, tesA, tesB, tesC);
    }
    
    public void inputTesA(int tesA) {
        this.tesA = tesA;
    }

    public void inputTesB(int tesB) {
        this.tesB = tesB;
    }

    public void inputTesC(int tesC) {
        this.tesC = tesC;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.4 * super.tesA) + (0.3 * super.tesB) + (0.3 * super.tesC);
    }

    @Override
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Manager\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Manager\n";
    }

}
