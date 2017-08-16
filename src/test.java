/**
 * Created by skuchibh on 8/16/2017.
 */
public class test {
    public static void main(String[] args) {
        String a = "A AB C";
        String b = "DEF";
        System.out.println(a.compareTo(b)<0?a:a.compareTo(b)>0?b:"Equal");
    }
}
