package Chapter6Assign1;

import java.util.Scanner;

public class SecondDegreeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       //Kullanıcıdan alınan katsayılara göre kök sonucu yapılacak.
        System.out.println("A katsayısını giriniz: ");
        double a = scanner.nextDouble();

        System.out.println("B katsayısını giriniz: ");
        double b = scanner.nextDouble();

        System.out.println("C katsayısını giriniz: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b,2) - 4 * a * c;

        // Discriminant sonucunun durumuna göre kök sayısı kontrol ediliyor.

        if (discriminant > 0){
            double kok1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double kok2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println("Discriminant 0'dan büyük olduğu için 2 kök vardır.\nKök 1 = "+ kok1 + "\n Kök 2 =" + kok2);
        } else if (discriminant == 0) {
            double kok = -b / 2 * a;
            System.out.println("Discriminant 0'a eşit olduğundan tek kök vardır.\n Kök = " + kok);
        }
        else {
            System.out.println("Gerçek kök yoktur. Çünkü discriminant sıfırdan küçük.");
        }
    }
}
