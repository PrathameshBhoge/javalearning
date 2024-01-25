package learnjava.Search.LinearSearch;

public class linearsearch {
    public static void main(String[] args) {
        int [] arr={12,34,5,67,46,78,90,23,12,56};
        int target = 46;
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] == target) {
//                System.out.println("The target element " + target + " is found at the index of " + i);
//            }
//        }
        int ans= linear(arr,target);
        System.out.println(ans);
    }


    static int linear(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
