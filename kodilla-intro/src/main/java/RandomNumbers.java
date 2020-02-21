import java.util.Random;

public class RandomNumbers {
    int maxSum;
    int bound;

    public RandomNumbers(int maxSum, int bound) {
        this.maxSum = maxSum;
        this.bound = bound;

    }

    public int minOfRandomNumbers(){
        Random random = new Random();
        int sum = 0;
        int minNn = Integer.MAX_VALUE;  // 31;
        while(maxSum >= sum) {
            int nn = random.nextInt(bound);
            sum = sum + nn;
            if(nn < minNn){
                minNn = nn;
            }
        }

        return minNn;

    }

    public int maxOfRandomNumbers(){
        Random random = new Random();
        int sum = 0;
        int maxNn = Integer.MIN_VALUE;  // -1;
        while(maxSum >= sum) {
            int nn = random.nextInt(bound);
            sum = sum + nn;
            if(nn > maxNn){
                maxNn = nn;
            }
        }

        return maxNn;

    }

    public static void main(String[] ags) {
        RandomNumbers randomNumbers = new RandomNumbers(5000, 30);
        System.out.println(randomNumbers.maxOfRandomNumbers());
        System.out.println(randomNumbers.minOfRandomNumbers());
    }

}
