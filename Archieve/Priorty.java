import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() {
        // solution code
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(53);
        pq.add(17);

        while(!pq.isEmpty()) {
            print(pq.poll() + " ");
        }

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

    static double time() {
        return System.nanoTime();
    }

    static void timeDiff(double startTime, double endTime) {
        double divideby = 1e9;
        double diff = (endTime - startTime)/divideby;
        print("\nTime Taken : " + diff + " sec\n");
    }

}

class Pair implements Comparator<Pair>, Comparable<Pair> {
    public int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compare(Pair p1, Pair p2) {
        if(p1.first == p2.first) 
            return p1.second - p2.second;
        return p1.first - p2.first;
    }

    public int compareTo(Pair p1) {
        if(this.first == p1.first)
            return this.second - p1.second;
        return this.first - p1.first;
    }

    public String toString() {
        return "["+first+", "+second+"]";
    }
}

