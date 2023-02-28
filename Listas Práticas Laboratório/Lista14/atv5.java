import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String string1, string2;
        
        System.out.println("String 1: ");
            string1 = sc.nextLine();
        System.out.println("String 2: ");
            string2 = sc.nextLine();
        
        if (string1.substring((string1.length()-string2.length()), string1.length()).equals(string2)) {
            System.out.println("Está contida");
        } else {
            System.out.println("Não está contida"); 
        }
        sc.close();
    }
}