package example;

import java.util.*;
public class DuplicateArrayList {
    public static void main(String [] args){

        List<String> ar = new ArrayList<String>();
        ar.add("first");
        ar.add("second");
        ar.add("thrid");
        ar.add("fourth");
        ar.add("first");
        ar.add("second");

        for(int i=0; i<ar.size()-1; i++){
            for(int j=0; j<ar.size(); j++){
                if(ar.get(i).equalsIgnoreCase(ar.get(j))){
                    ar.remove(j);
                }
            }
        }
        System.out.println(ar);
    }
}



