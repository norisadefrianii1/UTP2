package utp2;

public class Seni extends BarangLelang {
    public String seniman;

    public Seni(String namaBarang, double hargaAwal, String seniman) {
        super(namaBarang, hargaAwal);
        this.seniman = seniman;
    }

    @Override
    public void mulaiLelang() {
        super.mulaiLelang();
        System.out.println("Karya seni ini dibuat oleh: " + seniman);
    }
}