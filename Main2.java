import java.util.Scanner;
public class Main2{ // menghitung pembayaran produk 

    public static void main(String[] args) {
        // input data 
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String kodeBarang, namaProduk, jenisProduk;
        int kuantity, hargaJual;
        String lokal = "lokal";
        String impor = "impor";
        
    
            System.out.println("MASUKAN");
            System.out.print("kode barang = ");
            kodeBarang = scan.nextLine();
            System.out.print("Nama produk = ");
            namaProduk = scan.nextLine();
            System.out.print("Kuantity = ");
            kuantity = scan.nextInt();
            System.out.print("Harga jual = ");
            hargaJual = scan.nextInt();
            System.out.print("Jenis Produk = ");
            jenisProduk = scan2.nextLine();
            System.out.println("________________________________________");
            
            int pembelian = kuantity * hargaJual;
            int diskon1 = pembelian * 2/100;
            int diskon2 = pembelian * 10/100;
            int diskon3 = pembelian * 15/100;
            int diskon;

            int pajakLokal = pembelian * 2/100;
            int pajakImpor = pembelian * 10/100;
            int pajak;

            boolean pembayaran;
            // DISKON 
                if (pembelian >= 100000 && pembelian <= 199999 && jenisProduk.equals(lokal)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakLokal;
                    diskon = pembelian * diskon1;
                    System.out.println("jumlah pajak " + pajakLokal);
                    System.out.println("jumlah diskon " + diskon1);
                    pembelian = pembelian - diskon1;
                    pembelian = pembelian + pajakLokal;
                    System.out.println("Pembayaran produk" + pembelian);
                } else if (pembelian >= 200000 && pembelian <= 499999 && jenisProduk.equals(lokal)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakLokal;
                    diskon = pembelian * diskon2;
                    System.out.println("jumlah pajak " + pajakLokal);
                    System.out.println("jumlah diskon " + diskon2);
                    pembelian = pembelian - diskon2;
                    pembelian = pembelian + pajakLokal;
                    System.out.println("Pembayaran produk " + pembelian);
                } else if (pembelian >= 500000 && jenisProduk.equals(lokal)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakLokal;
                    diskon = pembelian * diskon3;
                    System.out.println("jumlah pajak " + pajakLokal);
                    System.out.println("jumlah diskon " + diskon3);
                    pembelian = pembelian - diskon3;
                    pembelian = pembelian + pajakLokal;
                    System.out.println("Pembayaran produk " + pembelian);
                } else if (pembelian >= 100000 && pembelian <= 199999 && jenisProduk.equals(impor)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakImpor;
                    diskon = pembelian * diskon1;
                    System.out.println("jumlah pajak " + pajakImpor);
                    System.out.println("jumlah diskon " + diskon1);
                    pembelian = pembelian - diskon1;
                    pembelian = pembelian + pajakImpor;
                    System.out.println("Pembayaran produk " + pembelian);
                } else if (pembelian >= 200000 && pembelian <= 499999 && jenisProduk.equals(impor)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakImpor;
                    diskon = pembelian * diskon2;
                    System.out.println("jumlah pajak " + pajakImpor);
                    System.out.println("jumlah diskon " + diskon2);
                    pembelian = pembelian - diskon2;
                    pembelian = pembelian + pajakImpor;
                    System.out.println("Pembayaran produk " + pembelian);
                } else if (pembelian >= 500000 && jenisProduk.equals(impor)) {
                    System.out.println("Kode barang = " + kodeBarang);
                    System.out.println("Nama produk " + namaProduk);
                    System.out.println("kuantity " + kuantity);
                    System.out.println("Harga jual " + hargaJual);
                    pajak = pembelian * pajakImpor;
                    diskon = pembelian * diskon3;
                    System.out.println("jumlah pajak" + pajakImpor);
                    System.out.println("jumlah diskon " + diskon3);
                    pembelian = pembelian - diskon1;
                    pembelian = pembelian + pajakLokal;
                    System.out.println("Pembayaran produk" + pembelian);
            } 
        scan.close();
        scan2.close();
    }
}