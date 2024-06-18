package example;

public class ReverseStringExample {
    public static void main(String [] args){
        String str = "tell me what you can do";
        ReverseStringExample rs = new ReverseStringExample();
        rs.reverseUsingIndex(str);
        System.out.println();
        rs.usingCharArray(str);

    }

    public void reverseUsingIndex(String str){
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }

    public void usingCharArray(String str){
        char [] ch = str.toCharArray();
        for(int i = ch.length-1; i>=0 ; i--){
            System.out.print(ch[i]);
        }
    }
}
