import java.util.Scanner;

class ZerosToEnd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("The value of array elements are: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.print("Now the upadated array is: ");
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}