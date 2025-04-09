package Assignment4;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("daniel");
        cal(s);
    }

    public static void cal(StringBuffer s) {
        if (s.length() < 2) {
            System.out.println(s); 
            return;
        }

        StringBuffer s2 = new StringBuffer();
        s2.append(s.charAt(s.length() - 1));
        for (int i = 1; i < s.length() - 1; i++) {
            s2.append(s.charAt(i));
        }
        s2.append(s.charAt(0));

        System.out.println(s2);
    }
}