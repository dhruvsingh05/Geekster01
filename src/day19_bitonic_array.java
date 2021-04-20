public class day19_bitonic_array {
    public static void main(String args[]){
        System.out.println("hello worlds");
        int[] arr=new int[]{12,4,78,90,45,23,33,33,33,44,55,44,33,22};
        int[] start=new int[arr.length];
        int[] end=new int[arr.length];
        start[0]=1;
        end[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                start[i]=start[i-1]+1;
            }else {
                start[i]=1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i+1]<=arr[i]){
                end[i]=end[i+1]+1;
            }else {
                end[i]=1;
            }
        }
        int temp=0,index=0;
        for(int i=0;i<arr.length;i++){
    //    System.out.println(end[i]);
        start[i]=start[i]+end[i]-1;
        if(temp<= start[i]){
            index=i;
            temp=start[i];
        }
        }
        System.out.println("Bitonic index is "+index+" and number is "+arr[index]);
    }
}
