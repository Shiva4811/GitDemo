import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of array element: ");
        int n=sc.nextInt();

        System.out.print("Enter the array elements:" );
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            System.out.println("Element found!");
        }
        else System.out.println("Element not found!");
    }
    
}
