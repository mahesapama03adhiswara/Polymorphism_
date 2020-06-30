public class superclass {
    public static void main(String[] args) {
        //dari constuktor
        TokoKomputer tokokomputer1 = new TokoKomputer(2, "mouse", "hardware", 7, 25000);
        tokokomputer1.tampil_data_dengan_garis("--------------------------------");

        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.kode_barang=1;
        pelanggan1.nama_pelanggan="mahesa";
        pelanggan1.jumahPembelianUnit=2;
        System.out.println("pembeli \t:"+pelanggan1.kode_barang);
        pelanggan1.tampilDataPelanggan("______________________________");

        pemasok pemasok1 = new pemasok();
        pemasok1.kode_toko=98;
        pemasok1.id_pemasok=32;
        pemasok1.nama_merk="laptop acer";
        pemasok1.kode_barang=1;
        System.out.println("pemasok\t:"+pemasok1.kode_toko);
        pemasok1.tampilDataPemasok("88888888888888888888888888888888");



    }


}
