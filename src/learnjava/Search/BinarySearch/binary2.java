package learnjava.Search.BinarySearch;

public class binary2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int target=5;

        int start= 0;
        int end=arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;

            if(target==arr[mid]){
                System.out.println(mid);
            }else if(target<arr[mid]){
                end= mid-1;
            }else{
                start= mid+1;
            }
        }

    }
}
