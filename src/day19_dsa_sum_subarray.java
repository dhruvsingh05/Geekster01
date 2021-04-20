import java.util.*;

public class day19_dsa_sum_subarray {
    public static int[] sum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;

    }

    public static void main(String args[]){
         int[] arr= new int[]{1,2,3,4,5,6,9,5,28,55,3,4};//1,3,6,10,15,21
    //    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] sum=new int[arr.length];
        sum=sum(arr);

        int start=0,end=1,n=330,status=0;
    //    System.out.println(sum[5]);
        if(n>sum[arr.length-1]){
            status=1;
            System.out.println("not found");
        }
        for(int i=0;i<sum.length;i++){
            if(sum[i]==n){
                System.out.println("index from"+0+" to "+i);
                status=1;
                break;
            }
        }

    for(int i=0;i<2*sum.length;i++){
        if(status==1){
            break;
        }
        if((sum[end]-sum[start])<n){
            end++;
        }else if((sum[end]-sum[start])>n){
            start++;
        }else{
            System.out.println("index from"+(start+1)+" to "+end);
            status=1;
            break;
        }

    }
    if (status==0){
        System.out.println("Not Found");
    }

    }
}
