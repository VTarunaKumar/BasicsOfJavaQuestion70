import java.util.*;
public class Question5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Float x = sc.nextFloat();
        Float y = sc.nextFloat();
        float rem = x%y;
        float quotient = x/y;
        System.out.println("Reminder is"+ Float.toString(rem));
        System.out.println("Quotient is "+ Float.toString(quotient));
    }
}
