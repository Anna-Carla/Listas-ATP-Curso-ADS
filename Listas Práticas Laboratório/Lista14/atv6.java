import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String string1, string2;
        int num;
        
        System.out.println("String 1: ");
            string1 = sc.nextLine();
        System.out.println("String: ");
            string2 = sc.nextLine();
        System.out.println("Número: ");
            num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            string1 += string2.charAt(i);
        }
        string1+="0";

        System.out.println(string1);
        sc.close();
    }
}