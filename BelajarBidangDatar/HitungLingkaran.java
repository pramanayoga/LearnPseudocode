import java.util.Scanner;
import java.lang.Math;

public class HitungLingkaran {
    public static void main(String[] args){
        double phi=3.14, r, luas, keliling;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: ");
        r = sc.nextDouble();
        keliling = 2*phi*r;
        luas = phi*(Math.pow(r,2));
        System.out.println("Luas lingkaran: "+luas);
        System.out.println("Keliling lingkaran: "+keliling);
    }
}