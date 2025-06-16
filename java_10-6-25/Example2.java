/*juice machine-A produces 10 glasses and charge 10rs per use
Machine-B produces 2 galsses and charge 5rs per use
calculate the least amount for Order of juices.*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a=10,b=2,x=15,y=5;
        int val1 = n%a ==0? n/a : n/a+1;
        int res = Integer.MAX_VALUE;
        for(int i=0; i<=val1;i++){
            int rem = n-10*i;
            int val2 = 0;
            if(rem>0){
                val2 = rem%b==0 ? rem/b :rem/b+1;
            }
            res = Math.min(res,x*i+y*val2);
        }
        System.out.println("--> "+res+" rupees.");
    }
}