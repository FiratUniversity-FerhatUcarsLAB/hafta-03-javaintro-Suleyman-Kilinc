
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 90.0;
        double boy = 1.92;
        
        double bmi = kilo / (boy * boy);

        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " m");
        System.out.println("---------------------------------");

        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.2f\n", bmi);
    }
}