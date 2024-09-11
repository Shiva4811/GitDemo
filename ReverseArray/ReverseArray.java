class ReverseArray
{
    public static void main(String args[])
    {
        int[] arr={1,2,4,6,5,8,9};
        System.out.print("These are the array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int n=arr.length;
        System.out.println("The reverse of the array elements are: ");
       
        for(int i=0; i<n/2; i++)
        {
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
}