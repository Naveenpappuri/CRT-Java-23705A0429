
public class Minimum_of_array{
    public static void main(String[] args) {
        int[] arr = {25,100,75,125};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("minmum value is: "+min);
    }
}    