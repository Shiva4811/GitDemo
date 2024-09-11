class DoubletElementSum2
{
    public static void main(String args[])
    {
        int[] arr={1,2,4,3,5};
        System.out.println("The array elements are: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int target=3;
        System.out.println("The target element is: "+target);
        System.out.print("The doublet elements are: ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(arr[i]+" "+arr[j]);
                    System.out.println();
                }
            }
        }
    }
}