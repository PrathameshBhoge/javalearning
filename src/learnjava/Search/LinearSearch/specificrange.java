package learnjava.Search.LinearSearch;

public class specificrange {
    public static void main(String[] args) {
        int [] arr= {18,12,-7,-8,3,14,28};
        int target= -8;

        int ans= linear(arr,target,1,5);
        System.out.println(ans);


    }

    public static int linear(int []arr,int target, int start, int end ){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
