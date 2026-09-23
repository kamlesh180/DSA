public class subArray {
    public static void sub_array(int numbers[]){
        int ts=0;
        //outer loop
        for(int i=0;i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;

                //print subarray
               for(int k=start; k<=end ;k++){
                System.out.print(numbers[k]+ " ");
               }
               ts++;
               System.out.println();
            }
             System.out.println();
        }
            System.out.println("Total subarray = " + ts);

    }
    public static void main(String args[] ){
        int numbers[]={2,4,6,8,10};
        sub_array(numbers);
    }
    
}
