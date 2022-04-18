package day47_linkList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
        List'ten gelen ozellikler biliniyor`. deque'den gelen ozellikleri yapiyoruz burda
         */
        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);// basa element ekler,
        ll1.addLast(20);//sona element ekler, add(); methduna gore daha hizlidir
        //ll1.addAll(); liste bask abir list ekleyeceksek kullaniriz
        ll1.element();//ilk elementi getirir,silmeden


    }
}
