package ConditionalStatements;

import java.util.Scanner;

public class LarestOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=sc.nextInt();
        //method1;
//        int max=a;
//        if(b>max){
//            max=b;
//        }
//         if(c>max){
//            max=c;
//        }

//       method2

//        int max=0;
//        if(a>b){
//            max=a;
//        }
//        else{
//            max=b;
//        }
//
//        if(c>max){
//            max=c;
//        }

        //method3

        System.out.println(Math.max(Math.max(a,b),c));
    }
}
