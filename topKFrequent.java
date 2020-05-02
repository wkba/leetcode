import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Iterator;

public class topKFrequent {

  public static void main(String[] args) {

    int[] a = {1,1,1,2,2,3}; 
    int[] result = topKFrequent(a, 2);
                System.out.println("----------------------");

  }

  public static int[] topKFrequent(int[] nums, int k) {
        // count frequency
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n: nums){
            hm.put(n, hm.getOrDefault(n,0) + 1);
        }
        
        // build maxHeap
        PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> hm.get(n2) - hm.get(n1));
        
        for(int n: hm.keySet()){
            heap.add(n);
        }
        
        System.out.println("----pqの中身を見てみる------------------");
        Iterator<Integer> iter = heap.iterator();
        while(iter.hasNext()){
            Integer current = iter.next();
            System.out.println("current:" + current);
        } 
        System.out.println("----------------------");

        // build int[]
        int[] rst = new int[k];
        for(int i=0;i<k;i++){
            rst[i] = heap.poll();
        } 
        return rst;
    }

}
