package example;
import java.util.*;

public class ConverstionsClass {
    public static void main(String [] args){

       /***********************Collect Convertions *************************/
        List<Integer> sourceList = Arrays.asList(0,1,2,3,4,5);
        Set<Integer> targetSet = new HashSet<>(sourceList);
        sourceList = new ArrayList<>(targetSet);

        System.out.println(sourceList.size());
        System.out.println(targetSet.size());
        System.out.println(sourceList.size());

        /***********************Collect Convertions *************************/




    }
}
