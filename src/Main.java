import java.util.Scanner;
/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;
 */
/*
Ödev
Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14, alan, cevre, merkezAlan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz: ");
        r = input.nextInt();
        System.out.println("Merkez aciyi giriniz: ");
        a = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        merkezAlan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alani: " +  alan);
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Merkez acisi verilen dairenin alani: " + merkezAlan);

    }
}
