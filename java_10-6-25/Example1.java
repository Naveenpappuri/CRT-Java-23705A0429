/*we havetwo options 
1. divide the given number with anyone of the factor of that number but not itself and one.
2. subtract -1.
do this two steps until to get 1. And count how many steps that takes.*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n>=4){
            if(n%2 == 0){
                System.out.println(2+" Steps to get 1.");
            } else {
                System.out.println(3+" Steps to get 1.");
            }
        }else{
            System.out.println(n-1);
        }
    }
}