public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55};
        int[] b={3,5,7,9};
        int m=a.length;
        int n=b.length;
        int[] c=new int[m+n];
        System.out.print("The first soretd array is: ");
        for(int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("The second sorted array is: ");
        for(int ele: b){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0; int j=0; int k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==m){
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        System.out.print("The merge sorted array elements are: ");
        for(int ele: c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
