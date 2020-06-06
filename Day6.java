import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        int[][] ans = reconstructQueue(people);
        for (int[] x : ans) {
            System.out.println(x[0] + ", " + x[1]);
        }
    }

    public static int[][] reconstructQueue(int[][] people) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(people, Comparator.comparing((int[] e) -> e[0]).reversed().thenComparing((int[] e) -> e[1]));
        for (int[] x : people) {
            res.add(x[1], x);
        }
        return res.toArray(people);
    }
}