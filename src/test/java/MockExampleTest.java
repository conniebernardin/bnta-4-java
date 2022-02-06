import com.bnta.oop.PersonExample;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;


public class MockExampleTest {

    @Test
    void example() {
        PersonExample connie = Mockito.mock(PersonExample.class);//creating mock using mockito
        given(connie.getAge()).willReturn(22);
        connie.setName("Connie");

        System.out.println("How old are you?");
        System.out.println(connie.getAge());
        verify(connie).setName("Connie");
    }
}
