import java.util.*;
public class max_subarray_sum {
    public static void main(String args[]){
        int[] arr=new int[]{2,6,-40,3,5,7,-6,9,-8};
        int start=0,end=0,k=0,sum=0,maxsum=0;
        for(int i=0;i<(arr.length);i++)
        {
            sum=sum+arr[i];
            if(sum>maxsum){

                maxsum=sum;
               // end=k-1;
            //    System.out.println(maxsum);

            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("max array"+maxsum);
    }
}
