package SortingAlgorithms;

/**
 * Created by skuchibh on 6/5/2017.
 */
public class Main {

    public static void main(String[] args) {
        int[]arr={9,8};
        mergesort sort=new mergesort();
        sort.sort(arr);
        for(int x:arr) System.out.println(x);

    }
}
