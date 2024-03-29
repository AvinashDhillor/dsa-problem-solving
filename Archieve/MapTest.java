import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    final static int mod = (int) (1e9 + 7.0);
    final static String endl = "\n";
    static Scanner sc = null;
    static StringBuilder sb = null;
    static double startTime, endTime;

    static void solution() {
        // solution code

        Runtime runtime = Runtime.getRuntime();
        print(runtime.availableProcessors() + endl);

        int limit = (int) 1e7;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new TreeMap<>();
        startTime();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                print("Start 1 Thread" + endl);
                for(int i = 0; i < limit; i++) {
                    map1.put(i, i); 
                }

                for(int i = 0; i < limit; i++) {
                    map1.containsKey(i);
                }
                print("End 1 Thread " + endl);
            }
        });
    
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                print("Start 2 Thread" + endl);
                for(int i = 0; i < limit; i++) {
                    map.put(i, i); 
                }


                for(int i = 0; i < limit; i++) {
                    map.containsKey(i);
                }
                print("End 2 Thread " + endl);
            }
        });
        try  {
            startTime();
            t1.start();
            t2.start();
            print(runtime.availableProcessors() + endl);
            t1.join();
            t2.join();
            endTime();
        } catch (Exception e) {
            print(e);
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

    static void startTime() {
        startTime = System.nanoTime();
    }
    static void endTime() {
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

