
/**
 * Class Sepatu
 * Program : Sepatu.java
 * Nama    : Nobby Dharma Khaulid
 * NIM     : 231524020
 * Tanggal : 18 Februari 2024
 */


public class Sepatu         //Kelas untuk mendeklarasikan sepatu yang akan dijual
{
    private String MerkSepatu; //merk sepatu yang digunakan selama obral dilaksanakan 
    private int HargaSepatu;    //harga sepatu per satu pasang
    private int StokSepatu;     //total stok sepatu selama obral berlangsung

    public Sepatu(String MerkSepatu, int HargaSepatu, int StokSepatu)   //pembuatan objek sepatu
    {
        this.MerkSepatu = MerkSepatu;
        this.HargaSepatu = HargaSepatu;
        this.StokSepatu = StokSepatu;
    }
    public void setStokSepatu(int StokSepatu) //Metode untuk mengatur stok sepatu
    {
        this.StokSepatu = StokSepatu;
    }

    public String getMerkSepatu()       //Metode untuk memanggil merk sepatu
    {
        return MerkSepatu;
    }

    public int getHargaSepatu()     //metode untuk memanggil harga sepatu per satu pasang
    {
        return HargaSepatu;
    }

    public int getStokSepatu()      //Metode untuk memanggil jumlah stok sepatu
    {
        return StokSepatu;
    }

}
