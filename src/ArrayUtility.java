public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        
    }

    public static int minimum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int maximum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == str) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) { //not tested
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) { //not tested
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String newStr = "";
        for (int i = 0; i < array.length-1; i++){
            newStr = newStr + array[i] + ", ";
        }
        newStr += array[array.length-1];
        return newStr;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i]+array[j]==num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] test = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(i==0) test[i] = array[array.length-1];
            else test[i] = array[i-1];
        }
        System.out.println(Arrays.toString(test));
        for(int i = 0; i<array.length; i++){
            array[i] = test[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftLeft(int[] array) {
        int[] test = new int[array.length];
        for(int i = 0; i<array.length-1; i++){
            if(i==0) test[i] = array[1];
            else test[i] = array[i+1];
        }
        test[array.length-1] = array[0];
        System.out.println(Arrays.toString(test));
        for(int i = 0; i<array.length; i++){
            array[i] = test[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int last = array[array.length-1];
            for (int j = array.length-1; j >0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }


}
