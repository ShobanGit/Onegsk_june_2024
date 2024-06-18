// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class checkStringBalanced {
    public static void main(String[] args) {

        String s = "([s{hoba}n])";
        char [] c = s.toCharArray();
        int [][] order = new int[3][2];
        int checkStatus = 0;
        HashMap<Character, Character> hm = new HashMap<Character,Character>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');

        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                order[0][0]= i;
                if(s.contains(hm.get('(').toString())){
                    order[0][1] = s.indexOf(hm.get('(').toString());
                }else{
                    checkStatus = 1;
                }
            }else if(c[i] == '{'){
                order[1][0]= i;
                if(s.contains(hm.get('{').toString())){
                    order[1][1] = s.indexOf(hm.get('{').toString());
                }else{
                    checkStatus = 1;
                }
            }else if(c[i] == '['){
                order[2][0]= i;
                if(s.contains(hm.get('[').toString())){
                    order[2][1] = s.indexOf(hm.get('[').toString());
                }else{
                    checkStatus = 1;
                }
            }

        }

        if(checkStatus == 0 &&
                (order[0][0] > order[1][0] && order[0][0] > order[2][0] &&
                        order[0][1] < order[1][1] && order[0][1] < order[2][1]) ||
                (order[0][0] < order[1][0] && order[0][0] > order[2][0] &&
                        order[0][1] > order[1][1] && order[0][1] < order[2][1]) ||
                (order[0][0] < order[1][0] && order[0][0] < order[2][0] &&
                        order[0][1] > order[1][1] && order[0][1] > order[2][1])
                        &&
                        (order[1][0] > order[0][0] && order[1][0] > order[2][0] &&
                                order[1][1] < order[0][1] && order[1][1] < order[2][1]) ||
                (order[1][0] < order[0][0] && order[1][0] > order[2][0] &&
                        order[1][1] > order[0][1] && order[1][1] < order[2][1]) ||
                (order[1][0] < order[0][0] && order[1][0] < order[2][0] &&
                        order[1][1] > order[0][1] && order[1][1] > order[2][1])
                        &&
                        (order[2][0] > order[0][0] && order[2][0] > order[1][0] &&
                                order[2][1] < order[0][1] && order[2][1] < order[1][1]) ||
                (order[2][0] < order[0][0] && order[2][0] > order[1][0] &&
                        order[2][1] > order[0][1] && order[2][1] < order[1][1]) ||
                (order[2][0] < order[0][0] && order[2][0] < order[1][0] &&
                        order[2][1] > order[0][1] && order[2][1] > order[1][1])

        ){
            System.out.println("Given String is balanced");
        }else{
            System.out.println("Given String is not balanced");
        }
    }
}