import java.util.Scanner;
class RotateArray
{
    public static void reverse(int[] arr, int i, int j)
    {
        while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
        i++;
        j--;
        }
    }
    public static void main(String args[])
    {
        int[] arr={10,20,30,40,50,60,70};
        System.out.println("The array elements are: ");
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of steps: ");
        int k=sc.nextInt();
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        System.out.println("The rotate array element in "+k+" steps are: " );
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        
    }
}