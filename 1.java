import java.util.*;
public class HelloWorld{
   
    private static void simpleSort(int[] numbers) {
        int size = numbers.length;
        for(int i = 0; i < size; i++) {
            for(int j = 1; j < (size-i); j++) {
                 if(numbers[j-1] > numbers[j]) {  
                     int temp = numbers[j-1];  
                     numbers[j-1] = numbers[j];  
                     numbers[j] = temp;  
                 }  
            }
        }
    }
    
    private static void secondGreatLow(int[] numbers) {
        int size = numbers.length;
        List<Integer> secondGreatestList = new ArrayList<>();
        List<Integer> secondLowestList = new ArrayList<>();
        int secondGreatest = getSecondGreatest(numbers);
        int secondLowest = getSecondLowest(numbers);
        for (int i = 0; i < size; i++) {
            if (numbers[i] == secondLowest) {
                secondLowestList.add(numbers[i]);
            }
            
            if (numbers[i] == secondGreatest) {
                secondGreatestList.add(numbers[i]);
            }
        }
        printAll(secondLowestList, secondGreatestList);
    }
    
    private static void printAll(List<Integer> secondLowest, List<Integer> secondGreatest){
        for (int i = 0; i < secondLowest.size(); i++) {
            System.out.print(secondLowest.get(i) +" ");
        }
        for (int i = 0; i < secondGreatest.size(); i++) {
            System.out.print(secondGreatest.get(i) +" ");
        }
    }
    
    private static int getSecondLowest(int[] numbers) {
        int lowest = numbers[0];
        int size = numbers.length;
        int secondLowest = -1;
        for(int i = 0; i < size; i++){
            if (numbers[i] > lowest && secondLowest == -1) {
                secondLowest = numbers[i];
                return secondLowest;
            }
        }
        return secondLowest;
    }
    
    private static int getSecondGreatest(int[] numbers) {
        int size = numbers.length;
        int greatest = numbers[size-1];
        int secondGreatest = 999999999;
        for(int i = size-1; i > 0; i--){
            if (numbers[i] < greatest) {
                secondGreatest = numbers[i];
                return secondGreatest;
            }
        }
        return secondGreatest;
    }

     public static void main(String []args){
        int[] numbers = {7, 7, 12, 98, 106};
        simpleSort(numbers);
        secondGreatLow(numbers);
     }
}