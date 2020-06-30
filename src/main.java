public class main {
    public static void main(String[] args) {
        TokoKomputer tokoKomputer = new TokoKomputer();


        tokoKomputer.kode_barang=2;
        tokoKomputer.nama_barang="mouse";
        tokoKomputer.jenis_barang="hardware";
        tokoKomputer.stok_barang=5;
        tokoKomputer.harga_barang=75000;
        tokoKomputer.tampil_data();

        System.out.println("tampil value harga barang:"+tokoKomputer.getHarga_barang());

        tokoKomputer.tampil_data_dengan_garis("=================================");
        tokoKomputer.tampil_data_dengan_garis("*********************************");
        double hasilReturnValue=tokoKomputer.getHarga_barang();


        //dari constuktor
        TokoKomputer tokokomputer1 = new TokoKomputer(2, "mouse", "hardware", 7, 25000);
        tokokomputer1.tampil_data_dengan_garis("--------------------------------");

    }
}
