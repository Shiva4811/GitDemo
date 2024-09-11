import java.util.ArrayList;
class DoubletElementSum
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println("The arraylist elements are: "+arr.size());
        int target=60;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0; j<arr.size();j++)
            {
                int sum=arr.get(i)+arr.get(j);
                if(target==sum)
                {
                    System.out.println(arr.get(i)+" "+arr.get(j));
                }
                else 
                {
                    System.out.println();
                }
            }
        }
    }
}
