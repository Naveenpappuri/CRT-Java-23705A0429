public class Sorted_or_not{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean ascending = ascending(arr);
        boolean descending = descending(arr);
        comparison(descending,ascending);
    }
    static boolean ascending(int arr[]){
        int flag = 0;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
            return false;
        
    }
    static boolean descending(int arr[]){
        int flag = 0;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
            return false;
        
    }
    static void comparison(boolean descending, boolean ascending){
        if(descending || ascending){
            System.out.println("Sorted");
        } else{
            System.out.println("Not Sorted");
        }
    }
}