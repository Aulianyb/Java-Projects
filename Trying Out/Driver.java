import java.util.*; 

public class Driver {

    static class Pair<T1, T2> {
        T1 first; T2 second;
        Pair(T1 first, T2 second){ this.first = first; this.second = second; }
        public String toString() {return first + "=" + second; }
    }

    public static void main(String[] args){
        List<Pair<String, Integer>> list = new ArrayList<Pair<String, Integer>>();
    }
}
