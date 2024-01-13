public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {1, 3, 2};

        System.out.println(isSorted(array));
        
    }
    
    public static int findMissingInt (int [] array) {
        int N = array.length;
        int missingNum = 0;
        int[] temp = new int[N+1];
        for (int i = 0; i < N; i++) {
            temp[array[i]]++;
            }
            for (int j = 0; j < N+1; j++) {
             if (temp[j] == 0) {
                missingNum = j;
             }
            }
        return missingNum;
    }

    public static int secondMaxValue(int [] array) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secMax = max;
                max = array[i];
            }else if( array[i] != max || array[i] > secMax) {
                secMax = array[i];
            }
        }
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
             if (array1[i] == array2[j]){
             break;
             }
             else if (j == array2.length - 1) {
             return false;
             }
        }
    } 
    for (int i = 0; i < array2.length; i++) {
        for (int j = 0; j < array1.length; j++) {
         if (array2[i] == array1[j]){
         break;
         }
         else if (j == array1.length - 1) {
         return false;
         }
    }
} 
        return true;
    }

    public static boolean isSorted(int [] array) {
        int num1 = array[0];
        int num2 = array[1];
        boolean decrease = (num1 <= num2);
        boolean Increase = (num1 >= num2);

        if (decrease){
            for (int i = 1; i < array.length - 1; i++){
                num1 = num2;
                num2 = array[i+1];
                if (num1 >= num2){
                    return false;
                }
            }
        }
        else if (Increase){
            for (int i = 1; i < array.length - 1; i++){
                num1 = num2;
                num2 = array[i+1];
                if (num1 <= num2){
                    return false;
                }
            }
        }
        return true;
    }

}
