import java.util.Scanner;

public class SecondLargestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of element: ");
        int n=sc.nextInt();

        System.out.print("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];             // int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("The largest array element is: "+max);
        
        int secmax=arr[0];
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=max && arr[i]>secmax)
            {
                secmax=arr[i];
            }
        }
        System.out.print("The second largest element is: "+secmax);
    }
    
}
