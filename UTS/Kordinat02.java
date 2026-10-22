import java.util.Scanner;

public class Kordinat02 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int x,y;

     System.out.println("Masukkan nilai x: ");
     x = input.nextInt();

     System.out.println("Masukkan nilai y: ");
     y = input.nextInt();

    if (x == 0) {
        System.out.println("Tepat di sumbu x");
    } else if (y == 0) {
        System.out.println("Tepat di sumbu y");
    } else if (x == 0 && y == 0) {
        System.out.println("Berada di titik pusat");
    } else if (x <= 0 && y >= 0) {
        System.out.println("Berada di kuadran 1");
    } else if (x >= 0 && y >= 0) {
        System.out.println("Berada di kuadran 2");
    } else if (x <= 0 && y <= 0) {
        System.out.println("Berada di kuadran 3");
    } else if (x >= 0 && y <= 0) {
        System.out.println("Berada di kuadran 4");
    } else {
        System.out.println("Input tidak valid");
    }
      input.close();

    }
}