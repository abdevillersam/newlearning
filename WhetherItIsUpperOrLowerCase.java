package ConditionalStatements;

import java.util.Scanner;

public class WhetherItIsUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println("element you enter is an upper letter");
        }
        else if (ch>=97 && ch<=122){
            System.out.println("element you enter is an lower letter");
        }
        else{
            System.out.println("None");
        }
    }
}
