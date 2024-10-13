import java.util.Scanner;

public class persegi {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int sisi;
        System.out.println("Rumus Menghitung Luas Persegi");
        System.out.println("==============================");
        System.out.print("Input Sisi : ");
        sisi = a.nextInt();
        luas = sisi * sisi;

        System.out.println("Hasilnya : "+luas);
    }
}