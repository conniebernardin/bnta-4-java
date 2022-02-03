import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyFirstTest {

    //method for a test is void. Doesn't receive or return any parameters

    @Test
    void hello(){
        int result = 3 * 5;
        assertEquals(15, result); //assertion from JUnit
        assertThat(result).isEqualTo(15); // assertion from assertJ with better API and nicer syntax
    }
    @Test //use Given, When, Then format for structuring test assertions
    void hello1(){
        //Given
        int numberOne = 4;
        int numberTwo = 4;
        //When
        int result = numberOne + numberTwo;
        //Then
        assertThat(result).isEqualTo(8);

    }
}
