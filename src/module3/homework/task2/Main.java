package module3.homework.task2;

class Main extends Adder {
    public static void main(String[] args) {
        Integer array[] = new Integer[2];
        array[0] = new Integer(5);
        array[1] = new Integer(6);
        System.out.println(Arithmetic.add(array[0], array[1]));
        Adder.check(array[0], array[1]);
    }
}
