
public class ParaBozma {
    public static void main(String[] args) {

        int para = 278;
        int kalanPara = para;

        System.out.println(para + " TL için para üstü hesabı:");

        int yuzluk = kalanPara / 100;
        kalanPara = kalanPara % 100;


        int ellilik = kalanPara / 50;
        kalanPara = kalanPara % 50;


        int yirmilik = kalanPara / 20;
        kalanPara = kalanPara % 20;


        int onluk = kalanPara / 10;
        kalanPara = kalanPara % 10;


        int beslik = kalanPara / 5;
        kalanPara = kalanPara % 5;


        int birlik = kalanPara;

        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(onluk + " x 10 TL");
        System.out.println(beslik + " x 5 TL");
        System.out.println(birlik + " x 1 TL");
    }
}