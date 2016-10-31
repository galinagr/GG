package module10.HW10;

/**
 * Create a class with two methods, f( ) and g( ). In g( ),
 * throw an exception of a new type that you define. In f( ),
 * call g( ), catch its exception and, in the catch clause,
 * throw a different exception (of a second type that you define).
 * Test your code in main( ).
 */
public class TaskTenFour {
    public static void f() throws MyExceptions {
        try {
            g("GGG");
        } catch (MyExceptions e) {
            e.printStackTrace();
            System.out.println("Here is another bad attempt!!!");
        }

    }

    public static void g (String message) throws MyExceptions{
        if (message.equals("non"))
        System.out.println("Happy!~");
      else {
            Exception ex = new Exception();
            throw new MyExceptions("Here is a mistake in g()");
        }
    }
}


