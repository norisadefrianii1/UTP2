package utp2;;

public class BarangLelang {
    public String namaBarang;
    public double hargaAwal;
    public double penawaranTertinggi;
    public Peserta pemenang;
    public boolean statusLelang;

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.penawaranTertinggi = hargaAwal;
        this.statusLelang = false;
    }

    public void mulaiLelang() {
        statusLelang = true;
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai");
        System.out.println("dengan harga awal Rp" + (int) hargaAwal);
    }

    public void terimaPenawaran(Peserta peserta, double jumlah) {
        System.out.println(peserta.nama + " menawar Rp" + (int) jumlah);

        if (!statusLelang) {
            System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
        } else if (jumlah <= penawaranTertinggi) {
            System.out.println("Penawaran tidak valid! penawaran harus lebih");
            System.out.println("tinggi dari Rp" + (int) penawaranTertinggi);
        } else if (jumlah > peserta.saldo) {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.nama + " tidak mencukupi");
        } else {
            penawaranTertinggi = jumlah;
            pemenang = peserta;
            System.out.println("Penawaran disetujui!");
        }
    }

    public void tutupLelang() {
        statusLelang = false;
        if (pemenang != null) {
            System.out.println("Lelang ditutup! " + namaBarang + " terjual dengan");
            System.out.println("harga " + (int) penawaranTertinggi + " kepada " + pemenang.nama);
            pemenang.saldo -= penawaranTertinggi;
            System.out.println("Sisa saldo " + pemenang.nama + ": Rp" + (int) pemenang.saldo);
        } else {
            System.out.println("Lelang ditutup! Tidak ada pemenang untuk " + namaBarang);

        }
    }
}

