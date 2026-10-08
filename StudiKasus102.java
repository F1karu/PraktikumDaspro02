import java.util.Scanner;

public class StudiKasus102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, 
        diskon, totalBayar, kembalian, kurang;


        System.out.println("Selamat datang di Kedai Kopi Senja");
        
        System.out.println("Masukkan jumlah Kopi Susu Gula Aren yang ingin dibeli: ");
        jumlahCup = input.nextInt();

        System.out.println("Jumlah uang pembayaran: ");
        uangBayar = input.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga > 100000){
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar > totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        }else if (uangBayar < totalBayar){
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda kurang: " + kurang);
        } else {
              System.out.println("Uang anda pas");
        }
        
        input.close();

    }
}
