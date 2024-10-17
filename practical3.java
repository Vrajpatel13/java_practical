public class practical3 {
    import java.util.*;
 class budget {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of days ");
        int n=obj.nextInt();
        float arr[]=new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the daily expense of day:"+(i+1)+" ");
            arr[i]=obj.nextFloat();
        }
        float sum=0;
        for(int j=0;j<n;j++)
        {
            sum+=arr[j];
            
        }
        System.out.println("The sum of the daily expenses="+sum+" rupees");

    }
}


    
}
