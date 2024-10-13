import java.util.Scanner;

public class lingkaran {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double luas,phi = 3.14;
        int jari;
        System.out.print("Masukkan Jari-Jari : ");
        jari = a.nextInt();
        luas = phi * (jari * jari);
        System.out.println("Hasilnya : "+luas);
    }
}