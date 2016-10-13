package module7.module7.HW;

import java.util.List;

class Time_methods {

    static int timeCalculation_List_Int(int duration, List<Integer> o) {
        long startTime_add = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.add(i);
        }
        long finishTime_add = System.currentTimeMillis();
        long startTime_get = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.get(i);
        }
        long finishTime_get = System.currentTimeMillis();
        long startTime_set = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.set(i, i);
        }
        long finishTime_set = System.currentTimeMillis();
        long startTime_remove = System.currentTimeMillis();
        for (int i = 0; i < o.size(); i++) {
            o.remove(i);
        }
        long finishTime_remove = System.currentTimeMillis();
        System.out.println("Delta of add of OrdersInt   " + duration + " = " + String.format("%.4f", (float) (finishTime_add - startTime_add)));
        System.out.println("Delta of get of OrdersInt   " + duration + " = " + String.format("%.4f", (float) (finishTime_get - startTime_get)));
        System.out.println("Delta of set of OrdersInt   " + duration + " = " + String.format("%.4f", (float) (finishTime_set - startTime_set)));
        System.out.println("Delta of remove of OrdersInt   " + duration + " = " + String.format("%.4f", (float) (finishTime_remove - startTime_remove)));
        return 0;
    }

    static String timeCalculation_List_String(int duration, List<String> o) {
        long startTime_add = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.add("strings");
        }
        long finishTime_add = System.currentTimeMillis();
        long startTime_get = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.get(i);
        }
        long finishTime_get = System.currentTimeMillis();
        long startTime_set = System.currentTimeMillis();
        for (int i = 0; i < duration; i++) {
            o.set(i, "strings");
        }
        long finishTime_set = System.currentTimeMillis();
        long startTime_remove = System.currentTimeMillis();
        for (int i = 0; i < o.size(); i++) {
            o.remove(i);
        }
        long finishTime_remove = System.currentTimeMillis();
        System.out.println("Delta of add of OrdersString   " + duration + " = " + String.format("%.4f", (float) (finishTime_add - startTime_add)));
        System.out.println("Delta of get of OrdersString   " + duration + " = " + String.format("%.4f", (float) (finishTime_get - startTime_get)));
        System.out.println("Delta of set of OrdersString   " + duration + " = " + String.format("%.4f", (float) (finishTime_set - startTime_set)));
        System.out.println("Delta of remove of OrdersString   " + duration + " = " + String.format("%.4f", (float) (finishTime_remove - startTime_remove)));
        return null;
    }
}