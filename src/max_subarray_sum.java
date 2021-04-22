import java.util.*;
public class max_subarray_sum {
    public static void main(String args[]){
        int[] arr=new int[]{2,6,-40,3,5,7,-6,9,-80};
        int j=0,k=0,sum=0,maxsum=0;
        for(int i=0;i<(arr.length);i++)
        {
            sum=sum+arr[k];
            if(sum>0){
                k++;
                maxsum=sum;
            }else{
                maxsum=sum-arr[j];
                sum=0;
                //i=k+1;
                k=k+1;
            }
        }
        System.out.println("hello world fuck");
    }
}
