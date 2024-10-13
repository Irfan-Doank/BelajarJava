import java.util.Scanner;
class coba {
    public static void main (String args[]){
        Scanner a = new Scanner(System.in);
        String barang;
        int harga,qty,total;
        System.out.println("===== Toko Berkah =====");
        System.out.println("=======================");
        System.out.print("Nama Barang : ");
        barang = a.nextLine();
        System.out.print("Harga : ");
        harga = a.nextInt();
        System.out.print("QTY : ");
        qty = a.nextInt();

        total = harga * qty;
        System.out.println("=======================");
        System.out.println("Nama Barang : "+barang);
        System.out.println("Harga : "+harga);
        System.out.println("QTY : "+qty);
        System.out.println("Total : "+total);
        System.out.println("=======================");
    }
}