/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criteria;
import KuisPBO.HitungNilai;

/**
 *
 * @author user
 */
public class Designer extends DaftarNilai implements HitungNilai{
    public Designer(String nama, int nilaiA, int nilaiB, int nilaiC) {
        super(nama, nilaiA, nilaiB nilaiC);
    }
    
    public void inputNilaiA(int nilaiA) {
        this.nilaiA = nilaiA;
    }

    public void inputNilaiB(int nilaiB) {
        this.nilaiB = nilaiB;
    }

    public void inputNilaiC(int nilaiC) {
        this.nilaiC = nilaiC;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.3 * super.nilaiA) + (0.45 * super.nilaiB) + (0.25 * super.nilaiC);
    }

    @Override
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Designer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Designer\n";
    }

}
