package example;

public class WordPermitation {


    static void callfunperumation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            callfunperumation(ros, ans + ch);
           // System.out.println(ros);
        }
    }


    public static void main(String[] args) {
        String s = "ram";
        callfunperumation(s, "");
    }
}