package Chapter6Assign3;

import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("SAYI GİRİNİZ");
        int num = scanner.nextInt();

        int sayac = 0;
        for (int i = 2; i<=num; i++){
            boolean asalMi = true;
            for (int j = 2; j <= i / 2; j++){
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi){
                sayac++;
                System.out.println(sayac + ". Asal sayı: " + i);
            }
        }
        System.out.println("Girdiğiniz sayıya kadar olan toplam asal sayılar: " + sayac);
    }
}
