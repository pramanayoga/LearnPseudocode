import java.util.Scanner;

public class HitungPersegiPanjang {
    public static void main (String[] args){
        double panjang, lebar, luas, keliling;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        panjang = sc.nextDouble();
        System.out.println("Masukkan lebar: ");
        lebar = sc.nextDouble();
        luas = panjang*lebar;
        keliling = 2*(panjang+lebar);
        System.out.println("Luas Persegi Panjang: "+luas);
        System.out.println("Keliling Persegi Panjang: "+keliling);
    }
}