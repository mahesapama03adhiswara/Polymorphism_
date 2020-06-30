public class TokoKomputer {
    //atribut
    int kode_barang;
    String nama_barang;
    String jenis_barang;
    int stok_barang;
    double harga_barang;

    //construktor


    public TokoKomputer() {

    }

    public TokoKomputer(String nama_barang, String jenis_barang, int kode_barang, int stok_barang, double harga_barang) {
        this.nama_barang = nama_barang;
        this.jenis_barang = jenis_barang;
        this.kode_barang = kode_barang;
        this.stok_barang = stok_barang;
        this.harga_barang = harga_barang;
    }

    //method
    void tampil_data(){
        System.out.println("Kode Barang\t :"+kode_barang);
        System.out.println("Nama Barang\t:"+nama_barang);
        System.out.println("Jenis Barang\t:"+jenis_barang);
        System.out.println("Stok Barang\t:"+stok_barang);
        System.out.println("Harga Barang \t:"+harga_barang);


    }
    void tampil_data_dengan_garis(String karakter){
        System.out.println("Kode Barang\t :"+kode_barang);
        System.out.println("Nama Barang\t:"+nama_barang);
        System.out.println("Jenis Barang\t:"+jenis_barang);
        System.out.println("Stok Barang\t:"+stok_barang);
        System.out.println("Harga Barang \t:"+harga_barang);
        System.out.println(karakter);


    }

    double getHarga_barang(){
        return harga_barang;
    }



}
