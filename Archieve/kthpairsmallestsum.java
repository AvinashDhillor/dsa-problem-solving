import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    
    static class Pair {
        int row;
        int col;
        int sum;

        public Pair(int r, int c, int s) {
            row = r;
            col = c;
            sum = s;
        }
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums1.length == 0 || k <= 0) return null;

        List<List<Integer>> list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.sum - b.sum
            );

        int m = nums1.length;
        int n = nums2.length;

        for(int i = 0; i < n && i < k; i++) {
            pq.add(new Pair(0, i, nums1[0] + nums2[i]));
        }

        while(k != 0 && !pq.isEmpty()) {
            Pair p = pq.poll();
            List<Integer> res = new ArrayList<>();
            res.add(nums1[p.row]);
            res.add(nums2[p.col]);
            list.add(res);
            k--;
            if(p == null || p.row == m-1) continue;
            pq.add(new Pair(p.row + 1, p.col, (nums1[p.row+1] + nums2[p.col])));
        }

        return list; 
    }  

    static void solution() {
        // solution code
        int[] a =  {1, 1, 2};
        int[] b = {1, 2, 3};

        List<List<Integer>> list  = kSmallestPairs(a, b, 3);
        print(list); 
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        sb = new StringBuilder();

        solution();
        print(sb);

        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 

    static void start() {
        startTime = System.nanoTime();
    }

    static void end() {
        endTime = System.nanoTime();
        timeDiff();
    }

    static void timeDiff() {
        double divideby = 1e9;
        double diff = (endTime - startTime)/divideby;
        print("\nTime Taken : " + diff + " sec\n");
    }
}

class Pair1 implements Comparator<Pair>, Comparable<Pair> {
    public int first, second;
    public Pair1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compare(Pair p1, Pair p2) {
        return p2.first + p2.second - p1.first + p1.second;
    }

    public int compareTo(Pair p1) {
        if(this.first == p1.first)
            return this.second - p1.second;
        return this.first - p1.first;
    }

    public List<Integer> toList() {
        Integer[] e = {first, second};
        return Arrays.asList(e);
    }

    public String toString() {
        return "["+first+", "+second+"]";
    }
}

