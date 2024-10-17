import java.util.*;

public class pra7 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        a = sc.nextLine();

        System.out.println("Enter the number of time you want to repeat the first three character :");
        int n = sc.nextInt();
        String newstr = front_times(a, n);

        System.out.println("The new string is \n" + newstr);

    }

    static String front_times(String a, int b) {

        String newstr = "";
        if (a.length() <= 3) {
            for (int i = 0; i < b; i++) {
                newstr += a;
            }
        } else {
            for (int i = 0; i < b; i++) {
                newstr += a.substring(0, 3);
            }
        }
        return newstr;
    }

