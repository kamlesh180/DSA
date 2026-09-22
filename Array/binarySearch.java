public class binarySearch {
    public static int binary_search(int numbers[],int key){
        int start=0,end= numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key ){
                start = mid +1;
            }
            else {
                 end= mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,8,2,1,6,7,9};
        int key = 6;
        System.out.print("Key is at index : " + binary_search(numbers, key));
  }
}
