package lesson2;

/**
 * Java1.MyArrayDataException
 *
 * @author Pavel.Stolyarov
 * @version 21.12.2021
 */
public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("Некорректные данные " + message);
    }
}
