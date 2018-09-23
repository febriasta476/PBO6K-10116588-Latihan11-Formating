/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan11.formating;

/**
 *
 * @author Indra F
 * NAMA                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan
 * Jenis - jenis tipe data  : integer
 */
public class PBO6K10116588Latihan11Formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 354674;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i );
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f );
        System.out.printf("%%.2f : %.2f%n", f );
        System.out.printf("%%12.2f : %12.2f%n", f );
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
    
}
