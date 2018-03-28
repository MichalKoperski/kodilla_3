package com.kodilla;

import java.util.*;

class EvenAndOddSplitter {
    List<String> evenList = new ArrayList<String>();
    List<String> oddList = new ArrayList<String>();

    public EvenAndOddSplitter(Deque<String> theNumber) {
        for (int z=0; z < 50; z++) {
            String temporaryValue = theNumber.poll();
            if(temporaryValue.length()%2==0) {
                evenList.add(temporaryValue);
            } else {
                oddList.add(temporaryValue);
            }
        }
    }
    public List<String> getEven() {
        return evenList;
    }
    public List<String> getOdd() {
        return oddList;
    }
}
class Filling {
    public static void main (String[] args) throws java.lang.Exception {
        String str="a";
        Deque<String> theList = new ArrayDeque<String>();
        Random theGenerator = new Random();
        for(int n=0; n < 50; n++){
            for(int i=1; i <= theGenerator.nextInt(50);i++) {
                str+="a";
            }
            theList.offer(str);
            str="a";
        }
        theList.toArray();
        System.out.println(theList.size());
        System.out.println(theList);
        System.out.println();

        EvenAndOddSplitter splitter = new EvenAndOddSplitter(theList);
        System.out.println("EVEN "+splitter.getEven().size());
        System.out.println(splitter.getEven());
        System.out.println();
        System.out.println("ODD "+splitter.getOdd().size());
        System.out.println(splitter.getOdd());
    }
}