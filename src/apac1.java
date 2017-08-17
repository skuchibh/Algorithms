import java.io.*;
import java.util.TreeSet;

/**
 * Created by skuchibh on 8/16/2017.
 */
public class apac1 {
    private static final String fileIn = "C:\\Users\\skuchibh\\Downloads\\File\\A-large-practice.in";
    private static final String fileOut = "C:\\Users\\skuchibh\\Downloads\\File\\A-large-practice.out";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileIn));
        PrintWriter out = new PrintWriter(new FileWriter(fileOut));
        TreeSet<Character> sizeset;
        int t = Integer.parseInt(br.readLine());
        for (int z = 1; z <= t; z++) {
            sizeset = new TreeSet<>();
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine().trim();
            String ans = str;
            for (char x : str.toCharArray()) {
                if (x != ' ')
                    sizeset.add(x);
            }
            int maxLength = sizeset.size();
            john:
            for (int i = 1; i < n; i++) {
                sizeset = new TreeSet<>();
                str = br.readLine();
                for (char x : str.toCharArray()) {
                    if (x != ' ')
                        sizeset.add(x);
                }
                int curr = sizeset.size();
                if (maxLength > curr) continue john;
                if (maxLength < curr) {
                    ans = str;
                    maxLength = curr;
                    continue john;

                }
                int xx = ans.compareTo(str);
                ans = xx < 0 ? ans : str;

            }
            out.println("Case #" + z + ": " + ans);
        }
        out.close();
    }
}
