import java.util.*;

public class HelloWorld{
    
    private static void multiplicativePersistance(int numbers) {
        if (numbers >= 0 && numbers < 10) return;
        String stringNumber = String.valueOf(numbers);
        char[] numberArray = stringNumber.toCharArray();
        int numberA = Integer.parseInt(String.valueOf(numberArray[0]));
        int numberB = Integer.parseInt(String.valueOf(numberArray[1]));
        int total = numberA * numberB;
        System.out.println(numberA+ " * "+numberB+" = "+ total+"\n");
        multiplicativePersistance(total);
    }

     public static void main(String []args){
        multiplicativePersistance(39);
     }
}