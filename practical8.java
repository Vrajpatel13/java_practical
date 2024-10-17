
import java.util.*;

class pra8 {
    public static void main(String[] args) {

        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = obj.nextInt();
        int arr[] = new int[n];
        int count=0;
    

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element:" + (i + 1));

            arr[i] = obj.nextInt();
            if(arr[i]==9)
            {
            count++;
            }

        }
       
        System.out.println(“Number of 9’s in array: “+count);

    }
}
