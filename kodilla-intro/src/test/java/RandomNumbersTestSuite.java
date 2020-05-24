import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RandomNumbersTestSuite {

    @Test
    public void shouldReturnMinValue(){
        RandomNumbers randomNumbers = new RandomNumbers(200, 3);
        randomNumbers.calculateOfRandomNumbers();
        int min = randomNumbers.getMinNn();
        System.out.println(min);
    }
}
