/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import criteria.DaftarNilai;
import criteria.Designer;
import criteria.Manager;
import criteria.Programmer;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("+------------------------------+");
        System.out.println("| Pelamaran Lowongan Pekerjaan |");
        System.out.println("+------------------------------+");
        System.out.println(" Terdapat 3 posisi yang kosong : ");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih pekerjaan yang dilamar : ");
        int pilih = input.nextInt();
        
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Nama Lengkap : ");
        String nama = data.next();
        
        System.out.println("--- Penilaian --- ");
        System.out.println(" Keterangan : Nilai yang valid berada di antara 0-100");
        
        //Scanner input= new Scanner(System.in);
        System.out.print(" Nilai Programming Knowledge : ");
        int nilaiProg = data.nextInt();
        System.out.print(" Nilai Clean Coding : ");
        int nilaiCoding = data.nextInt();
        System.out.print(" Nilai Debugging : ");
        int nilaiDebug = data.nextInt();
        
        if (pilih == 1){
            //UNTUK Programmer
            Programmer Programmer = new Programmer(nama,nilaiProg,nilaiCoding,nilaiDebug);
            //input variabel disimpan
            do{
                //Scanner input= new Scanner(System.in);
                System.out.println("+++ MENU +++");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Keluar");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    //hasil seleksi
                    System.out.println("Nilai Akhir : " + Programmer.hitungNilai());
                    System.out.println("KETERANGAN : " + Programmer.keterangan());
                }
                else if (pilihMenu == 2){
                    //input ketika edit
                    System.out.println("*** Edit Nilai ***");
                    System.out.print(" Nilai Programming Knowledge  ");
                    Programmer.inputnilaiProg(input.nextInt());
                    System.out.print(" Nilai Clean Coding : ");
                    Programmer.inputnilaiCoding(input.nextInt());
                    System.out.print(" Nilai Debugging : ");
                    Programmer.inputnilaiDebug(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            int nilaiA= data.nextInt();
            System.out.print("Input Nilai Prototyping : ");
            int nilaiB = data.nextInt();
            System.out.print("Input Nilai Creativity : ");
            int nilaiC = data.nextInt();
            Designer des = new Designer(nama, nilaiA, nilaiB, nilaiC);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + des.hitungNilaiTotal());
                    System.out.println("Keterangan : " + des.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    des.inputnilaiA(input.nextInt());
                    System.out.print("Input Nilai Prototyping : ");
                    des.inputnilaiB(input.nextInt());
                    System.out.print("Input Nilai Creativity : ");
                    des.inputnilaiC(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            int tesA= data.nextInt();
            System.out.print("Input Nilai Decision Making : ");
            int tesB = data.nextInt();
            System.out.print("Input Nilai Communication: ");
            int tesC = data.nextInt();
            Manager manager = new Manager(nama, tesA, tesB, tesC);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + manager.hitungNilai());
                    System.out.println("Keterangan : " + manager.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    manager.inputTesA(input.nextInt());
                    System.out.print("Input Nilai Decision Making  : ");
                    manager.inputTesB(input.nextInt());
                    System.out.print("Input Nilai Communication: ");
                    manager.inputTesC(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }

    }
    
}
