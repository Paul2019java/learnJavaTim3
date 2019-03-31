package fundamentalsCoding.base;

public class Throwables {

    public static void main(String[] args) throws Exception {

        //functionThatThrows();
        functionThatThrowsException();

        //functionThatThrowsError();
    }

    private static void functionThatThrows() throws Throwable {
        throw new Throwable();
    }

    private static void functionThatThrowsException() throws Exception {
        throw new Exception();
    }

    private static void functionThatThrowsError(){
        throw new Error();
    }

}

