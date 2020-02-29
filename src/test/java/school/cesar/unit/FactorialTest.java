package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


public class FactorialTest {

    //Quantas vezes o calculate será chamado

    @Test
    public void calculate_CallAmountForEight(){
        class FactorialSpy extends Factorial {
            public int countCalculate = 0;

            @Override
            public int calculate(int number) {
                countCalculate++;
                return super.calculate(number);
            }
        }
        FactorialSpy spy = new FactorialSpy();
        spy.calculate(8);

        Assertions.assertEquals(8, spy.countCalculate);
    }
}
