package com.fyakut;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap {


    public static  void main(String... args) {

        Map<Integer, String> tablo = new java.util.LinkedHashMap<>();
        tablo.put(4, "umran");
        tablo.put(2, "fatma");
        tablo.put(9, "Yakut");
        tablo.put(10, "ebru");

        System.out.println(tablo);

Map<Integer,String>kopystablo=new java.util.LinkedHashMap<>(16,075f,true);
kopystablo.put(5,"berivan");
        kopystablo.put(2,"aslı");
        kopystablo.put(11,"leylo");
        kopystablo.put(7,"tarife");
        System.out.println("kopyala"+kopystablo);

        TreeMap<Integer,String>tablomap=new TreeMap<>(tablo);
        System.out.println(tablomap.entrySet()+"treemap");

        //anahtarları ile for da gezinme
        for (int i:tablo.keySet())
            System.out.println(i);

        //value/değerler ile for da gezinme

        for (String s:tablo.values())
            System.out.println(s);

        for (Map.Entry<Integer,String>mapsatır:tablo.entrySet()) {


            int anahtar = mapsatır.getKey();
            String değer=mapsatır.getValue();
            System.out.println("anahatar:"+anahtar+" "+"deger:"+değer);
        }

        Iterator<Map.Entry<Integer,String>>satrlar=tablo.entrySet().iterator();
        while (satrlar.hasNext()){
            Map.Entry<Integer,String> tekeleman=satrlar.next();
        System.out.println(tekeleman.getKey()+"  "+tekeleman.getValue());}
    }

}
