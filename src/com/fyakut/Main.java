package com.fyakut;


import java.util.Collection;
import java.util.HashMap;

/**
 * Map interface;
 * Eşleşme tablolarını temsil eder. Key value olarak .
 *Collection interfacesinden türetilmemiştir.Bu yapı elemaları benzersiz anahtarlar ile eşleştşrerek tablolarda tutar.
 * diğerlerinde ise elemaları kümede ya da listede tutup elemanların toplamını verir.
 * elemanlar ile ilgili işlemler sürekli benzersiz anahtarlar ile yapılr.
 * bu nedenle ayı iki anahtar olmamalı.
 *
 *
 * HashMap Sınıfı
 * karışık eşleme de denilebir.sıralama yapmaz
 * tabloya ekleme, çıkarma ve anahtarları verilen elemanları tabloda bulma işlmelerinde en hızlı çalışır
 *
 * LinkedHashMap
 * HashSet ile aynı matıkta çalışır
 * farklı elemanları ekleme sırasına göre tutar.
 * TreeMap;
 * belli bir sıraya göre ekleme yapıp tutmak istiyor isek Comparable implement edilmeli
 */

public class Main {

    public static  void main(String... args){

        HashMap<Integer,String>değerlertablo=new HashMap<>();
        değerlertablo.put(4,"umran");
        değerlertablo.put(2,"fatma");
        değerlertablo.put(9,"Yakut");
        değerlertablo.put(10,"ebru");

        System.out.println(değerlertablo);
        System.out.println(değerlertablo.size());//tablodaki eşeleşme sayısını verir

        Collection<String>a=değerlertablo.values();//tablodaki value değerlerini getirir
        System.out.println(a);

        Collection<Integer>b=değerlertablo.keySet();//tablodaki key/anahtar değerlerini getirir
        System.out.println(b);

     //   değerlertablo.clear();tablodaki değerlerini temizler
değerlertablo.keySet();//key değerlerinin toplandığı kümeyi getirir
değerlertablo.entrySet();//değerler tablosundaki verileri key ve value hepsini getirir

        System.out.println(değerlertablo.get(2));//key i 2 olanın değerini getr
    }




}
