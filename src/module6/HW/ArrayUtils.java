package module6.HW;

public final class ArrayUtils {

    public static int sum(int dataOfArray[]) {
        int sumOfArray = 0;
        for (int i = 0; i < dataOfArray.length; i++) {
            sumOfArray = dataOfArray[i] + sumOfArray;
        }
        return sumOfArray;
    }

    public static int max(int dataOfArray[]) {
        int maxOfArray = dataOfArray[0];
        for (int i = 1; i < dataOfArray.length; i++) {
            if (dataOfArray[i] > maxOfArray) {
                maxOfArray = dataOfArray[i];
            }
        }
        return maxOfArray;
    }

    public static int min(int dataOfArray[]) {
        int minOfArray = dataOfArray[0];
        for (int i = 1; i < dataOfArray.length; i++) {
            if (dataOfArray[i] < minOfArray) {
                minOfArray = dataOfArray[i];
            }
        }
        return minOfArray;
    }

    public static int maxPositive(int dataOfArray[]) {
        int maxPositiveOfArray = 0;
        for (int aDataOfArray : dataOfArray) {
            if (aDataOfArray > maxPositiveOfArray) {
                maxPositiveOfArray = aDataOfArray;
            }
        }
        return maxPositiveOfArray;
    }

    public static int multi(int dataOfArray[]) {
        int multiOfArray = 1;
        for (int i = 0; i < dataOfArray.length - 1; i++) {
            multiOfArray = dataOfArray[i] * dataOfArray[i + 1];
        }
        return multiOfArray;
    }

    public static int modulus(int dataOfArray[]) {
        return dataOfArray[0] % dataOfArray[dataOfArray.length - 1];
    }

    public static int secondLargest(int dataOfArray[]) {
        int maxOfArray = dataOfArray[0];
        int secondLargest = dataOfArray[0];
        for (int i = 1; i < dataOfArray.length; i++) {
            if (dataOfArray[i] > maxOfArray) {
                secondLargest = maxOfArray;
                maxOfArray = dataOfArray[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int dataOfArray[]) {
        for (int i = 0; i < dataOfArray.length / 2; i++) {
            int temp = dataOfArray[i];
            dataOfArray[i] = dataOfArray[dataOfArray.length - i - 1];
            dataOfArray[dataOfArray.length - i - 1] = temp;
        }
        return dataOfArray;
    }

    public static int[] findEvenElements(int[] dataOfArray) {
        int[] evenElements = new int[0];
        int count = 0;
        for (int i = 0; i < dataOfArray.length; i++) {
            if (dataOfArray[i] % 2 == 0) {
                evenElements[i] = dataOfArray[i];
                count++;
            }
        }
        if (count > 0)
            return evenElements;
        else {
            System.out.println("No even elements in an array");
            return dataOfArray;
        }
    }
}