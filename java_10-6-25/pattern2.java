/* 
   * * * *
   * * *
   * *  
   *  
   
   */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value :");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}