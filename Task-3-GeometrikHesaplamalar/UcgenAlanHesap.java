
public class UcgenAlanHesap {
    public static void main(String[] args) {

        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        
        double s = (a + b + c) / 2.0;

        double kokici = s * (s - a) * (s - b) * (s - c);

        double alan = Math.sqrt(kokici);

        System.out.println("Kenarları 3, 4, 5 olan üçgenin alanı (Heron Formülü ile):");
        System.out.println("Hesaplanan Yarı Çevre (s): " + s);
        System.out.println("Alan: " + alan);
    }
}