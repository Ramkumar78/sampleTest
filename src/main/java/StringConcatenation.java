public class StringConcatenation {

    public String twoStringConcat(String a, String b) {
        String c = a + b;
        System.out.println(c);
        return a + b;
    }
    public String twoStringOneIntConcat(String a, String b,int c) {
        String x = a + b+c;
        System.out.println(x);
        return x;
    }
public int twoIntConcat(int a, int b,int c) {
        int x = a + b+c;
        System.out.println(x);
        return x;
    }

}
