package Chapter6Assign2;

import java.util.Scanner;

public class YildizEklemeProgrami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aralarına yıldız eklemek istediğiniz kelimeyi giriniz. ");
        String kelime = scanner.next();


        //Yıldız koyulacak kelimeyi harf harf sonuc değişkenine ekleyip yazdıran döngü.
        String sonuc = "";
        for (int i = 0; i < kelime.length(); i++){

            sonuc += kelime.charAt(i);

            if (i != kelime.length() - 1){
                sonuc = sonuc + "*";
            }
        }
        System.out.println(sonuc);
    }
}
