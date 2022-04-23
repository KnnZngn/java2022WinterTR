package day01_variables;

import java.util.Scanner;

public class Kahve {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("Hos geldiniz");
        System.out.println("Kahvenize seker ister misiniz evet ya da hayir diye cevap giriniz:");
    String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
        System.out.println("Kac seker istersiniz?");
        int seker = scan.nextInt();
        System.out.println(seker + " adet seker hazirlaniyor");
    } else if (cevap.equalsIgnoreCase("hayir")) {
        System.out.println("Sekersiz kahveniz hazirlaniyor...");
        System.out.println("Lutfen bardak secimine geciniz");
    } else {
        System.out.println("Lutfen gecerli bir cevap veriniz");
    }
        System.out.println("Kahveniz hazirlaniyor. Bu arada lutfen bardak boyutunuz seciniz.");
        System.out.println("buyuk boy bardak icin=1");
        System.out.println("kucuk boy bardak icin =2");
        System.out.println("orta boy bardak icin=3 giriniz.");
    int bardak=0;
        while(true) {
        try {
            bardak = scan.nextInt();
            if (bardak < 1 || bardak > 3) {
                System.out.println("tercihler 1, 2, ya da 3 olmalidir.");
            } else break;
        } catch(Exception e){
            //e.printStackTrace();
            String srt = scan.nextLine();
            System.out.println("Hatali giris yaptiniz.");
        }
    }
        switch (bardak) {
        case 1:
            System.out.println("Kahveniz buyuk boy brdakta hazirlaniyor...");
           // Thread.sleep(3000);
            break;
        case 2:
            System.out.println("Kahveniz kucuk boy bardakta hazirlaniyor...");
           // Thread.sleep(3000);
            break;
        case 3:
            System.out.println("Kahveniz orta boy bardakta hazirlaniyor");
            //Thread.sleep(3000);
            break;
        default:
            System.out.println("Lutfen gecerli bir sayi giriniz");
            break;
    }
        System.out.println("Kahveniz hazir,afiyet olsun");

}
}