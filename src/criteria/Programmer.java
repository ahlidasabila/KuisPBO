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
public class Programmer extends DaftarNilai implements HitungNilai {
    public Programmer(String nama, int nilaiProg, int nilaiCoding, int nilaiDebug){
        super(nama,nilaiProg,nilaiCoding,nilaiDebug);
    }

    public void inputNilaiProg(int nilaiProg) {
        this.nilaiProg = nilaiProg;
    }

    public void inputNilaiCoding(int nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void inputNilaiDebug(int nilaiDebug) {
        this.nilaiDebug = nilaiDebug;
    }

    @Override
    public double hitungNilai() {
        return (0.6 * super.nilaiProg) + (0.15 * super.nilaiCoding) + (0.25 * super.nilaiDebug);
    }

    @Override
    public String keterangan() {
        if(this.hitungNilai() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " mendapatkan pekerjaan sebagai Programmer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " tidak mendapatkan pekerjaan sebagai Programmer\n";
    }
}
