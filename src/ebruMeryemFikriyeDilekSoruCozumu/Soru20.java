package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru20 {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin kucuk harf ise consola
        // “Kucuk Harf” , buyuk harfse consola “Buyuk Harf” yoksa
        // “girdiginiz karakter harf degil” yazdirin
        char harf='B';
        System.out.println(harf>='a' && harf<='z'?"kucuk harf":harf>='A' && harf<='Z'? "buyk harf":"hatali giris");
    }
}
