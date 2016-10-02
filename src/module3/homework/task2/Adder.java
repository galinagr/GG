package module3.homework.task2;

class Adder extends Arithmetic {
    static boolean check(Integer a, Integer b) {
        boolean c = false;
        if (a.intValue() >= b.intValue()) {
           c = true;
        }
        System.out.println(c);
        return c;

    }
}