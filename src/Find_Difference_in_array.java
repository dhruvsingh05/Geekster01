public class Find_Difference_in_array {
    public static void main(String args[]){
        int[] arr=new int[]{1,3,5,7,9,20,24};
        int j=0,k=1,diff,n=13;
        while(true){
            if((j==arr.length) || (k==arr.length)){
                System.out.println("Not Found");
                break;
            }
            diff=arr[k]-arr[j];

            if(diff<n){
                k++;
            }else if(diff>n){
                j++;
            }else{
                System.out.println("index are"+j+" and "+k+" value "+n);
                break;
            }

        }
    }
}
