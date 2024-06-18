package example;

import java.util.HashMap;

public class CheckBalancedString {
    public static void main(String args[]){
        String str = "[{(checkString}])";
        char [] ch = str.toCharArray();
        boolean sCheckStatus = true;
        int [][] order = new int[3][3];

        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        hm.put('{','}');
        hm.put('[',']');
        hm.put('(',')');

        for(int len =0; len<ch.length; len++){
            if(ch[len] == '{'){
                if(!str.contains(hm.get('{').toString())) {
                    sCheckStatus = false;
                }else{
                    order[0][0] = len;
                    order[0][1] = str.indexOf('}');
                }
            }else if(ch[len] == '[') {
                if (!str.contains(hm.get('[').toString())) {
                    sCheckStatus = false;
                }else{
                    order[1][0] = len;
                    order[1][1] = str.indexOf(']');
                }
            }else if(ch[len] == '(') {
                if (!str.contains(hm.get('(').toString())) {
                    sCheckStatus = false;
                }else{
                    order[2][0] = len;
                    order[2][1] = str.indexOf(')');
                }
            }
        }
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(order[i][j]+",");
            }
            System.out.println("*************");
        }

        System.out.println("**************************************");
        System.out.println(sCheckStatus);
    }
}
