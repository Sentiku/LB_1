package Lab_6.les_1;

public class Base {
    private char ch;
    private String str;

    public Base(char c){
        ch = c;
    }
    public Base (String s){
        str = s;
    }
    public Base(char[] m){
        if (m.length == 1){
            ch = m[0];
        }
        else {
            str = "";
            for (int i=0; i<m.length; i++)
                str += m[i];
        }
    }
    public char getCh() {
        return ch;
    }
    public String getStr() {
        return str;
    }
}
