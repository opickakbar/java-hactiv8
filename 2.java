public class HelloWorld{
    
    private static int getMean(int[] numbers){
        int mean = 0;
        int size = numbers.length;
        for(int i = 0; i < size; i++) {
            mean += numbers[i];
        }
        return mean/size;
    }
    
    private static int getMode(int[] numbers) {
        int mode = 0;
        int size = numbers.length;
        int totalCurrentSameNumber = 0;
        int totalPreviousSameNumber = 0;
        for (int i = 0; i < size; i++) {
            totalCurrentSameNumber = 0;
            for(int j = 0; j < size; j++) {
                if (numbers[j] == numbers[i]) {
                    totalCurrentSameNumber++;
                }
            }
            if(totalCurrentSameNumber > totalPreviousSameNumber) {
                mode = numbers[i];
                totalPreviousSameNumber = totalCurrentSameNumber;
            }
        }
        return mode;
    }
   
    private static int meanMode(int mean, int mode) {
        if (mean == mode) return 1;
        return 0;
    }

     public static void main(String []args){
        int[] numbers = {5, 3, 3, 3, 1};
        int mean = getMean(numbers);
        int mode = getMode(numbers);
        System.out.print(meanMode(mean, mode));
     }
}