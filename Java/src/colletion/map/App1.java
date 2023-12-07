package colletion.map;

import java.util.*;

public class App1 {

    public static void main(String[] args){

        /* Map 인터페이스의 특징
         *
         * Collection 인터페이스와는 다른 저장방식을 가진다
         * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 키(key)란?
         * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *
         * HashMap이 가장 많이 사용되며 HashTable은 HashMap과 동일하게 동작한다.
         * 하위 호환을 위해 남겨놓았기 때문에 가급적 HashMap을 사용하는 것이 좋다.
         * */

        HashMap hmap = new HashMap();
        Map hmap2 = new HashMap();

        /* 키와 값 쌍으로 저장한다. */
        /* List계열, Set계열은 요소를 추가할 때 add()를 주로 사용
         * Map계열은 요소를 추가할 때 put()을 사용한다.
         * */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap: " + hmap); //toString Overriding되어있음.
        //{key = value, key2 = value2, ...}

        hmap.put(12, "yellow banana");
        System.out.println("hmap: " + hmap); //key값 중복이 안되서, 덮어씌워버림
        //->그래서 값을 수정하고 싶을 때에는 그냥 put으로 새로은 value로 덮어씌워버리면 됨.
        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");

        hmap2.put("one", "java 11");
        hmap2.put("two", "oracle 18c");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");
        System.out.println("hmap: " + hmap);

        System.out.println("키 9에 대한 객체 :" + hmap.get(9));

        /* 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록을 만든다. */
        Set<String> keys = hmap.keySet(); // set특징 : 중복제거 + 순서저장x
        Iterator<String> keyiter2 = keys.iterator();

        Iterator<String> keyIter = hmap2.keySet().iterator();
        System.out.println("keyIter : " + keyIter);

        while(keyIter.hasNext()){

            String key = keyIter.next();
//            String key = (String)keyIter.next(); // 다른 형태를 String으로 받고 싶을 때.
            String value = (String)hmap2.get(key);
            System.out.println(value);
        }

        /* 2. 저장된 value객체들만 values()로 Collection으로 만든다. */
        Collection<String> values = hmap2.values();
        System.out.println("values : "+values);
        //values : [html5, java 11, oracle 18c, jdbc, css3]
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()){

            System.out.println(valueIter.next());
        }
        System.out.println();
        Object[] valueArr = values.toArray();
        //Object배열이기 때문에 toString해도 내용물이 보이지 않고, 주소값만 보임
        for(int i = 0; i < valueArr.length; i++){

            System.out.println(i + " : " + valueArr[i]);
        }

        /* 3.Map의 내부클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        // Entry : 키 객체와 값 객체를 쌍으로 묶은 것
        //Set<>객체 안에 Map.Entry<String, String>만 받아줄것이다
        //hamp2 는 이미 HashMap 클래스이고, entrySet메소드를 통해 Entry로 변화했다.
        System.out.println(set);
        //[four=html5, one=java 11, two=oracle 18c, three=jdbc, five=css3]

        Iterator<Map.Entry<String,String>> entryIter = hmap2.entrySet().iterator();

        while(entryIter.hasNext()){

            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

            System.out.println(entry);

            System.out.println();
        }

    }
}
