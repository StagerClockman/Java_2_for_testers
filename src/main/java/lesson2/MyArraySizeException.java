package lesson2;

/**
 * Java1.MyArraySizeException
 *
 * @author Pavel.Stolyarov
 * @version 21.12.2021
 */
public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}
