import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NotebookTestSuite {

    @Test
    public void shouldReturnWeight(){
        Notebook notebook = new Notebook(1200,2800,2020);
        int weight = notebook.getWeight();
        assertEquals(1200, weight);
    }
}
