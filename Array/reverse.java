public class reverse {
    public static void reverse_number(int numbers[]){

        int first= 0, last=numbers.length-1;
       while(first < last){
      //swap
      int temp =  numbers[last];
      numbers[last]= numbers[first];
      numbers[first]=temp;

      first++;
      last--;

       }
    }
    public static void main(String args[] ){
        int numbers[] = {4,5,6,8,7,9};
        
        reverse_number(numbers);

        for(int i=0; i<numbers.length ; i++){
            System.out.print(numbers[i]+ " ");
        }

        System.out.println();
    
    }
}
