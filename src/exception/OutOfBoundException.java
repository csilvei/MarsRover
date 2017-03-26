package exception;

public class OutOfBoundException extends Throwable {
    public OutOfBoundException(String outOfBound) {
        System.out.println(outOfBound);
    }
}