package day47_linkList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        linkedList'in 2 tane parent interface'i vardir.
        LinkedList olustururken data turu olarak ;
        LinkedList secersek : iki parent'daki tum methodlar kullanilabirl.
        List secersek sadece List interface'indeki methodlar
        Deque/queue secersek: Dequ'deki method'lari kullanabiliriz.
         */
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);//LinkedList
        //sadece list interface'inden gelen ozellikler kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();

        ll2.add(10);//liste bos oldugu icin once ekle sonra remove yap yoksa hata verir
        ll2.remove(0);

        //sadece deque 'den gelen ozellikleri kullanmak icin
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);//20 'den onceye ekleyecektir
        System.out.println(ll3);
        ll3.addLast(40);//sona ekler
        System.out.println(ll3);


    }
}
