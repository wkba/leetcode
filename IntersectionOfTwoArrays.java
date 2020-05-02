import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class IntersectionOfTwoArrays {
	public static void main(String[] args){
		System.out.println("test");
    	int[] nums1 = {1,2,2,1};
    	int[] nums2 = {2,2};
		int[] n = intersection(nums1, nums2);
        System.out.println("---ans-----------");
        System.out.println(Arrays.toString(n));

    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int[] uniqNum1 = Arrays.stream(nums1).distinct().toArray();
        int[] uniqNum2 = Arrays.stream(nums2).distinct().toArray();


        for(int num:uniqNum1) System.out.println(num);
        System.out.println("--------------");
        for(int num:uniqNum2) System.out.println(num);
        System.out.println("--------------");

		List<Integer> result = new ArrayList<>();

        for(int num: uniqNum1){
            boolean isInclude = IntStream.of(uniqNum2).anyMatch(x -> x == num);
            if(isInclude) result.add(num);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
