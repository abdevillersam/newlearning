package ConditionalStatements;

import java.util.Scanner;

public class VersionCheck {
    public VersionCheck() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float min = sc.nextFloat();
        float curr = sc.nextFloat();
        float device = sc.nextFloat();
//        if(curr<min){
//            System.out.println("bad");
//        }
//        else if(device>curr){
//            System.out.println("good");
//        }
//        else{
//            System.out.println("okay okay");
//        }
        if(curr<min){
            System.out.println("bad");
        }
        else if(min<device && device<curr){
            System.out.println("Okay Okay");
        }
        else{
            System.out.println("Good");
        }
    }
}
