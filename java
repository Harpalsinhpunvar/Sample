package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPr{
    public static void main (String [] args){
        ArrayList<Integer> o = new ArrayList<Integer>();
        o.add(10);
        o.add(20);
        o.add(30);
        o.add(40);
        o.add(50);

        Iterator<Integer> it = o.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i<20){
                it.remove();
            }
        }
        System.out.println(o);

    }
}
