package ConditionalStatements;

import java.util.Scanner;

public class NumberOfOccures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ////using of integers
//        Long number =  sc.nextLong();
//        int Occurs = sc.nextInt();
////        String num = String.valueOf(number);
//        int count=0;
//        int r=0;
//        while(number>0){
//            r= (int) (number%10);
//            if(r==Occurs){
//                count++;
//            }
//            number=number/10;
//        }
//        System.out.println(count);

        //using of Strings;
        String str = sc.nextLine();
        int selnumber = sc.nextInt();
        String occurs = String.valueOf(selnumber);
        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==occurs.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
