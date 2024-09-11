class SortZeroesAndOnes
{
    public static void main(String args[]){
        int[] arr={0,1,0,1,0,0,1,1,1,0};
        int zeroes=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else arr[i]=1;
        }
        System.out.print("The sorted binary numbers: ");
        for(int ele: arr)
        {
            System.out.print(ele+" ");
            
        }
    }
}