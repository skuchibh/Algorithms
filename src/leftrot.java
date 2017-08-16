import java.io.*;

/**
 * Created by skuchibh on 7/28/2017.
 */
public class leftrot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int rot = Integer.parseInt(first[1]);
        int[] arr = new int[n];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        if (n == rot)
            for (int x : arr) pw.print(x + " ");
        else {
            rot = rot % n;
            for (int from = rot; from < n; ++from) {
                pw.print(arr[from] + " ");
            }

            for (int i = 0; i < rot; i++) {
                pw.print(arr[i] + " ");
            }
        }

        pw.close();
    }
}
