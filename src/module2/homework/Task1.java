package module2.homework;

public class Task1 {
    /**
     * This methods resolves the sum of integer elements of input array
     */

    public static void main(String[] args) {
        int[] dataOfArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10};
        double[] dataOfArray1 = {-1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        int sum = sum(dataOfArray);
        System.out.println("Sum of integer elements = " + sum);
        int max = max(dataOfArray);
        System.out.println("Max of integer array = " + max);
        int min = min(dataOfArray);
        System.out.println("Min of integer array = " + min);
        int maxPositiveOfArray = maxPositive(dataOfArray);
        if (maxPositiveOfArray > 0) {
            System.out.println("Max positive of integer array = " + maxPositiveOfArray);
        } else System.out.println("No positive data((");
        int multi = multi(dataOfArray);
        System.out.println("Multiplication of int array data = " + multi);
        int modulus = modulus(dataOfArray);
        System.out.println("Modulus of the first and the last elements of integer array = " + modulus);
        int secondLargest = secondLargest(dataOfArray);
        System.out.println("Second largest element of an integer array = " + secondLargest);
        double sum1 = sum(dataOfArray1);
        System.out.println("Sum of double elements = " + sum1);
        double max1 = max(dataOfArray1);
        System.out.println("Max of double array = " + max1);
        double min1 = min(dataOfArray1);
        System.out.println("Min of double array = " + min1);
        double maxPositiveOfArray1 = maxPositive(dataOfArray1);
        if (maxPositiveOfArray1 > 0) {
            System.out.println("Max positive of integer array = " + maxPositiveOfArray1);
        } else System.out.println("No positive data((");
        double multi1 = multi(dataOfArray1);
        System.out.println("Multiplication of double array data = " + multi1);
        double modulus1 = modulus(dataOfArray1);
        System.out.println("Modulus of the first and the last elements of double array = " + modulus1);
        double secondLargest1 = secondLargest(dataOfArray1);
        System.out.println("Second largest element of an double array = " + secondLargest1);
    }


    /**
     * This method resolves the sum of integer elements of input array
     */
    static int sum(int dataOfArray[]) {
        int sumOfArray = 0;
        for (int i = 0; i < dataOfArray.length; i++) {
            sumOfArray = dataOfArray[i] + sumOfArray;
        }
        return sumOfArray;
    }

    /**
     * This method resolves the sum of double elements of input array
     */
    static double sum(double dataOfArray1[]) {
        double sumOfArray = 0;
        for (int i = 0; i < dataOfArray1.length; i++) {
            sumOfArray = sumOfArray + dataOfArray1[i];
        }
        return sumOfArray;
    }

    /**
     * This method resolves the max of integer elements of input array
     */
    static int max(int dataOfArray[]) {
        int maxOfArray = dataOfArray[0];
        for (int i = 1; i < dataOfArray.length; i++) {
            if (dataOfArray[i] > maxOfArray) {
                maxOfArray = dataOfArray[i];
            }
        }
        return maxOfArray;
    }

    /**
     * This method resolves the max of double elements of input array
     */
    static double max(double dataOfArray1[]) {
        double maxOfArray = dataOfArray1[0];
        for (int i = 1; i < dataOfArray1.length; i++) {
            if (dataOfArray1[i] > maxOfArray) {
                maxOfArray = dataOfArray1[i];
            }
        }
        return maxOfArray;
    }

    /**
     * This method resolves the min of integer elements of input array
     */
    static int min(int dataOfArray[]) {
        int minOfArray = dataOfArray[0];
        for (int i = 1; i < dataOfArray.length; i++) {
            if (dataOfArray[i] < minOfArray) {
                minOfArray = dataOfArray[i];
            }
        }
        return minOfArray;
    }

    /**
     * This method resolves the min of double elements of input array
     */
    static double min(double dataOfArray1[]) {
        double minOfArray = dataOfArray1[0];
        for (int i = 1; i < dataOfArray1.length; i++) {
            if (dataOfArray1[i] < minOfArray) {
                minOfArray = dataOfArray1[i];
            }
        }
        return minOfArray;
    }

    /**
     * This method resolves the max positive of integer elements of input array
     */
    static int maxPositive(int dataOfArray[]) {
        int maxPositiveOfArray = 0;
        for (int i = 0; i < dataOfArray.length; i++) {
            if (dataOfArray[i] > maxPositiveOfArray) {
                maxPositiveOfArray = dataOfArray[i];
            }
        }
        return maxPositiveOfArray;
    }

    /**
     * This method resolves the max positive of double elements of input array
     */
    static double maxPositive(double dataOfArray1[]) {
        double maxPositiveOfArray = 0;
        for (int i = 0; i < dataOfArray1.length; i++) {
            if (dataOfArray1[i] > maxPositiveOfArray) {
                maxPositiveOfArray = dataOfArray1[i];
            }
        }
        return maxPositiveOfArray;
    }

    /**
     * This method resolves the multiplication of integer elements of input array
     */
    static int multi(int dataOfArray[]) {
        int multiOfArray = 1;
        for (int i = 0; i < dataOfArray.length-1; i++) {
            multiOfArray = dataOfArray[i] * dataOfArray[i + 1];
        }
        return multiOfArray;
    }

    /**
     * This method resolves the multiplication of double elements of input array
     */
    static double multi(double dataOfArray1[]) {
        double multiOfArray = 1;
        for (int i = 0; i < dataOfArray1.length-1; i++) {
            multiOfArray = dataOfArray1[i] * dataOfArray1[i + 1];
        }
        return multiOfArray;
    }

    /**
     * This method resolves the modulus of first and last integer elements of input array
     */
    static int modulus(int dataOfArray[]) {
        int modulus = dataOfArray[0] % dataOfArray[dataOfArray.length-1];
        return modulus;
    }

    /**
     * This method resolves the modulus of first and last double elements of input array
     */
    static double modulus(double dataOfArray1[]) {
        double modulus = dataOfArray1[0] % dataOfArray1[dataOfArray1.length-1];
        return modulus;
    }

    /**
     * This method resolves the second largest of integer elements of input array
     */
    static int secondLargest(int dataOfArray[]) {
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

    /**
     * This method resolves the the second largest of double elements of input array
     */
    static double secondLargest(double dataOfArray1[]) {
        double maxOfArray = dataOfArray1[0];
        double secondLargest = dataOfArray1[0];
        for (int i = 1; i < dataOfArray1.length; i++) {
            if (dataOfArray1[i] > maxOfArray) {
                secondLargest = maxOfArray;
                maxOfArray = dataOfArray1[i];
            }
        }
        return secondLargest;
    }
}
