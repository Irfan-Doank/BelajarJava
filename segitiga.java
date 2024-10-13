import java.util.Scanner;

public class segitiga {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int alas, tinggi, luas;
        System.out.println("Rumus Menghitung Luas Segitiga");
        System.out.println("==============================");
        System.out.print("Input Alas : ");
        alas = a.nextInt();
        System.out.print("Input Tinggi : ");
        tinggi = a.nextInt();
        luas = alas * tinggi / 2;

        System.out.println("Hasilnya : "+luas);
    }
}