package self;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        // input nama variable 
        Scanner scan = new Scanner(System.in);
        int kuantity, hargaJual;
        String kodeBarang, namaProduk, jenisProduk;

        // input data variable 
        System.out.print("\nMasukan kode barang = ");
        kodeBarang = scan.nextLine();
        System.out.print("Masukan nama produk = ");
        namaProduk = scan.nextLine();
        System.out.print("Masukan harga jual = ");
        hargaJual = scan.nextInt();
        System.out.print("Masukan kuantity produk = ");
        kuantity = scan.nextInt();
        System.out.print("Masukan jenis produk = ");
        jenisProduk = scan.next();
        System.out.println("______________________________");

        // deklarasi penghitungan harga jual 
        hargaJual = kuantity * hargaJual;

        // if statment jenis produk import 
        if (jenisProduk.equalsIgnoreCase("import")) {
            int pajak = hargaJual * 10/100;
            System.out.println("\nKode barang = " + kodeBarang);
            System.out.println("Nama produk " + namaProduk);
        // if statment diskon
            if (hargaJual >= 100000 && hargaJual <= 199999) { 
                int diskon = hargaJual * 2/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            } else if (hargaJual >= 200000 && hargaJual <= 499999) {
                int diskon = hargaJual * 10/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            } else if (hargaJual >= 500000 ) {
                int diskon = hargaJual * 15/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            }
        }
        
        // if statment jenis produk lokal
        if (jenisProduk.equalsIgnoreCase("lokal")) {
            int pajak = hargaJual * 2/100;
            System.out.println("\nKode barang = " + kodeBarang);
            System.out.println("Nama produk = " + namaProduk);
        // if statment diskon 
            if (hargaJual >= 100000 && hargaJual <= 199999) {
                int diskon = hargaJual * 2/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            } else if (hargaJual >= 200000 && hargaJual <= 499999) {
                int diskon = hargaJual * 10/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            } else if (hargaJual >= 500000 ) {
                int diskon = hargaJual * 15/100;
                System.out.println("Diskon = " + diskon);
                System.out.println("Pajak = " + pajak);
                int pembayaran = hargaJual + pajak - diskon;
                System.out.println("Totala biaya = " + pembayaran);
            }
        }
        scan.close();
    }
}
