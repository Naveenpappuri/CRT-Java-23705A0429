public class Sum{
    public static void main(String[] args) {
        int[] nums = {25,100,75,125};
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println("sum of elements in array: "+sum);
    }
}