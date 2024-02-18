
/**
 * Class Pembeli
 * Program : Pembeli.java
 * Nama    : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 18 Februari 2024
 */

public class Pembeli            //Kelas Pembeli merepresentasikan pembeli sepatu.
{
    private String Namapembeli;     //Nama pembeli yang akan memesan sepatu
    private int JumlahUang;         //Jumlah uang yang dibayarkan pembeli
    private int JumlahPembelian;    //Jumlah pembelian sepatu

    public Pembeli (String Namapembeli, int JumlahUang, int JumlahPembelian)    //pembuatan objek Pembeli
    {
        this.Namapembeli = Namapembeli;       
        this.JumlahUang = JumlahUang;
        this.JumlahPembelian = JumlahPembelian;
    }

    public String getNama()     //Metode untuk memanggil nama pembeli.
    {
        return Namapembeli;
    }

    public int getJumlahUang()      //Metode untuk memanggil Jumlah Uang pembeli.
    {
        return JumlahUang;
    }

    public int getJumlahPembelian()     //Metode untuk memanggil jumlah pembelian sepatu yang ingin dibeli.
    {
        return JumlahPembelian;
    }

    public void PembayaranSepatu(Sepatu sepatu, Pembeli pembeli)        //metode untuk melakukan pemesanan sepatu
    {   
        //Dibawah adalah kondisi kondisi yang mungkin terjadi selama pemesanan sepatu supaya program dapat berjalan sebagaimana mestinya
        if (JumlahUang == (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()) && 
        sepatu.getStokSepatu() == pembeli.getJumlahPembelian())
        {
            System.out.println("\t\t\t\t\tSepatu sebanyak " +JumlahPembelian+ " pasang berhasil dipesan oleh "+Namapembeli);
            System.out.println("\t\t\t\t\t\t\t Uang Anda Pas");
            System.out.println("Stok Sepatu habis!!\n");
        }

        else if (JumlahUang >= (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()) && 
        sepatu.getStokSepatu() == pembeli.getJumlahPembelian())
        {
            JumlahUang -= (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian());
            sepatu.setStokSepatu(sepatu.getStokSepatu() - pembeli.getJumlahPembelian());
            System.out.println("\t\t\t\t\tSepatu sebanyak " +JumlahPembelian+ " pasang berhasil dipesan oleh "+Namapembeli);
            System.out.println("Silahkan cek apakah anda menerima kembalian, Jika ya uang kembalian anda akan kami kirim melalu e-money akun anda.");
            System.out.println("\t\t\t\t\t\tKembalian anda "+JumlahUang);
            System.out.println("\nSisa stok sepatu yang tersedia adalah " +sepatu.getStokSepatu());
        }

        else if (sepatu.getStokSepatu() < pembeli.getJumlahPembelian() && 
        JumlahUang >= (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()))
        {
            System.out.println("Mohon maaf Stok sepatu dengan "+sepatu.getMerkSepatu()+" tidak mencukupi batas pembelian yang ingin dilakukan");
            System.out.println("\t silahkan kurangi jumlah pesanan untuk dapat melakukan pembelian\n") ;
        }

        else if (JumlahUang >= (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()))
        {
            JumlahUang -= (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian());
            sepatu.setStokSepatu(sepatu.getStokSepatu() - pembeli.getJumlahPembelian());
            System.out.println("\t\t\t\t\tSepatu sebanyak " +JumlahPembelian+ " pasang berhasil dipesan oleh "+Namapembeli);
            System.out.println("Silahkan cek apakah anda menerima kembalian, Jika ya uang kembalian anda akan kami kirim melalu e-money akun anda.");
            System.out.println("\t\t\t\t\t\tKembalian anda "+JumlahUang);
            System.out.println("\nSisa stok sepatu yang tersedia adalah " +sepatu.getStokSepatu());
        }

        else if(sepatu.getStokSepatu() > pembeli.getJumlahPembelian() && 
        JumlahUang < (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()))
        {
            System.out.println(Namapembeli + " Silahkan isi saldo anda terlebih dahulu, saldo anda tidak cukup untuk membeli item ini.");
        }

        else if(JumlahUang < (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()) && 
        sepatu.getStokSepatu() == pembeli.getJumlahPembelian())
        {
            System.out.println(Namapembeli + " Silahkan isi saldo anda terlebih dahulu, saldo anda tidak cukup untuk membeli item ini.");
        }
        
        else if(sepatu.getStokSepatu() < pembeli.getJumlahPembelian())
        {
            System.out.println("Mohon maaf Stok sepatu dengan "+sepatu.getMerkSepatu()+" tidak mencukupi batas pembelian yang ingin dilakukan");
            System.out.println("\t silahkan kurangi jumlah pesanan untuk dapat melakukan pembelian\n") ;
        }
        else if (JumlahUang < (sepatu.getHargaSepatu() * pembeli.getJumlahPembelian()))
        {
            System.out.println(Namapembeli + " Silahkan isi saldo anda terlebih dahulu, saldo anda tidak cukup untuk membeli item ini.");
        }
    }


}
