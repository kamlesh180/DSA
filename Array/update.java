public class update {
    public static void update_element(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {8,5,6,4,9};
        update_element(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        
         System.out.println();
    }
    
}
