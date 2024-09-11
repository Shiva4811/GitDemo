class SortZeroesAndOnesSecondWay
{
    public static void main(String args[]){
        int[] arr={1,0,0,1,1,0};
        System.out.print("The array elements are: ");
        for(int ele: arr)
        {
         System.out.print(ele+" ");
        }
        System.out.println(" ");
        int n=arr.length;
        System.out.println("The length of the array is: "+n);
        int j=n-1;
        for(int i=0; i<arr.length; i++)
        {
         if(arr[i]==0) i++;
         else if(arr[j]==1) j--;
         else if(arr[i]==1 && arr[j]==0){
           arr[i]=0;
           arr[j]=1; //swaping 
           i++;
           j--;
         }   
        } 
      
       for(int ele: arr)
       {
         System.out.print(ele+" ");
       }
       System.out.println();  
  
    }
}