package ConditionalStatements;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number= sc.nextInt();
//        int number =12345;
//        int r=0;
//        int rev=0;
//        int count=0;
//        while(number>0){
//           r=number%10;
//           rev= (int) (rev*10+r);
//           number=number/10;
//           count++;
//        }
//        System.out.println(rev);
        ////method2
        int number =12345;
        int lengthofnumber= (int) (Math.log10(number)+1);
        System.out.println(lengthofnumber);


    }
}
