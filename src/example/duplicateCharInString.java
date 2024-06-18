package example;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;;

public class duplicateCharInString {
    public static void main(String args[]){
        String str = "skalajduriowu4tr;ldsfm;lkowepur;lkdfskjeeri";
        duplicateCharInString dc = new duplicateCharInString();
        dc.countChar(str);
    }

    public void countChar(String str){
        HashMap<Character, Integer>  hashmap = new HashMap<Character, Integer>();
        char [] ch = str.toCharArray();
        for(char c : ch){
            if(hashmap.containsKey(c)){
                hashmap.put( c, hashmap.get(c)+1);
            }else{
                hashmap.put(c, 1);
            }
        }
        Set<Entry<Character, Integer>> entryl = hashmap.entrySet();
        int maxCount = 0;
        char maxChar = 0;
        for (Entry<Character, Integer> entry : entryl)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Maximum Occurring char and its count :"+ maxChar+" : "+maxCount);
    }
}
