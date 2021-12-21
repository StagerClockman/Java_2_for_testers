package lesson2;

/**
 * Java1.Main
 *
 * @author Pavel.Stolyarov
 * @version 21.12.2021
 */
public class Main {
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"1","1","1","1"},{"1","1","1","1"}};
        String[][] error_array = {{"1","2","3","4","1"},{"1","2","3","4"}};
        String[][] error_data = {{"1","1","3","4",},{"1","2","a","4"}};

        System.out.println("Случай корректного массива");
        try {
            result = 0;
            result = analyze(array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + result);
            System.out.println("-----------------------");
        }

        System.out.println("Случай некорректного массива");
        try {
            result = 0;
            result = analyze(error_array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + result);
            System.out.println("-----------------------");
        }

        System.out.println("Случай некорректных данных");
        try {
            result = 0;
            result = analyze(error_data);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна " + result);
        }
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int count = 0;
        int value;
        int row;
        int cell;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<3;i++){
            row = i;
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    count += value;
                } catch (IllegalArgumentException e){
                    String message = "в " + row + " ряду, " + cell + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return count;
    }
}
