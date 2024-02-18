import java.util.Scanner; //library untuk dapat menggunakan inputan manual dalam program

/**
 * Class ObralSepatu sebagai Main Program
 * Program : ObralSepatu.java
 * Nama    : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 18 Februari 2024
 */


//Kelas utama untuk menjalankan program
public class ObralSepatu        
{
    public static void main (String[] args)
    {
        Scanner Inputan = new Scanner(System.in);
        
        //Inputan untuk mengisi data pembeli
        System.out.println("Harga sepatu obral per satu pasang adalah RP100.000 \n");
        System.out.print("Ketikkan Nama Pembeli                   : ");
        String NamaPembeli = Inputan.nextLine();
        System.out.print("Ketikkan Jumlah Pembelian Sepatu        : ");
        int JumlahPembeli = Inputan.nextInt();
        System.out.print("Ketikkan Jumlah Uang                    : ");
        int UangPembeli = Inputan.nextInt();
        System.out.print("\n===============================================================================================================================================\n\n");

        //membuat objek sepatu dan pembeli
        Pembeli pembeli = new Pembeli(NamaPembeli, UangPembeli, JumlahPembeli);
        Sepatu sepatu = new Sepatu("Merk NobNob", 100000, 10 );

        pembeli.PembayaranSepatu(sepatu,pembeli);   //memanggil prosedur pembayaran sepatu
        Inputan.close();
    }
}