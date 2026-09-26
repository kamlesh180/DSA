
public class problem1 {

    public static boolean contraDuplicate(int numbers[]) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 1};

        System.out.println(contraDuplicate(numbers));
    }
}