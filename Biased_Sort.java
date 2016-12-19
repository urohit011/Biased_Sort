import java.util.Arrays;

class Biased_Sort{
    public static void main(String[] args){
        int[] ar = {9,8,7,6,5,4,3,2,1};
        doSort(ar);
        System.out.println(Arrays.toString(ar));
    }
    
    public static void doSort(int[] ar){
        int i,j,v;
        for(int i = 1; i < ar.length; i++){
            v = ar[i];
            j = i;
            while(ar[j-1] > v && j >= 1){
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = v;
        }
    }
}
