import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static double startTime, endTime;
    static Scanner sc = null;
    static StringBuilder sb = null;
    

    static void solution() {
        // solution code

first: for(int i = 0; i < 10; i++) {
    second : for(int j = 0; j < 10; j++) {
        third: for(int k = 0; k < 10; k++) {
            if(k == 5) {
                print(k + endl);
                break second;
            }
        }
    }
    print(i + " ");
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

