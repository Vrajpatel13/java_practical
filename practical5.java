public class practical5 {
    import java.util.*;

class days {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of days");
        n = obj.nextInt();
        days func = new days();
        func.fibo(n);

    }

    void fibo(int days) {

        int arr[] = new int[days];
      
        if (days >= 1) {
            arr[0]=0;
            arr[1] = 1;
        }
        for (int i = 2; i < days; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int j = 0; j < days; j++) {
            System.out.println("Day:" + (j+1) +" routine time:" + arr[j] +" minutes");
        }
    }

}


}
