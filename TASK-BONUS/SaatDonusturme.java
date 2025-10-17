
public class SaatDonusturme {
    public static void main(String[] args) {

        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;

        int kalanSaniye = toplamSaniye % 3600;

        int dakika = kalanSaniye / 60;

        int saniye = kalanSaniye % 60;

        System.out.println(toplamSaniye + " saniye, şu anlama gelir:");

        System.out.printf("%d:%02d:%02d\n", saat, dakika, saniye);
    }
}