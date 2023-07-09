import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserInteractionTests {

    @Mock
    private Scanner mockedScanner;
    private UserInteraction userInteraction;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userInteraction = new UserInteraction();
        userInteraction.setScanner(mockedScanner);
    }

    @After
    public void tearDown() {
        userInteraction.closeScanner();
    }

    @Test
    public void shouldGreetUserIfInputGreaterThanSeven() {
        when(mockedScanner.hasNextInt()).thenReturn(true);
        when(mockedScanner.nextInt()).thenReturn(8);

        userInteraction.greetUserIfInputGreaterThanSeven();
        String expectedOutput = "Hello!";
        String actualOutput = userInteraction.getOutput();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldGreetUserIfProvidedNameIsValid() {
        when(mockedScanner.next()).thenReturn("Vyacheslav");

        userInteraction.getGreetingAndUsernameIfNamesMatch();
        String expectedOutput = "Hello, Vyacheslav";
        String actualOutput = userInteraction.getOutput();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldPrintElementsDivisibleByThree() {
        int[] userNumbers = {1, 3, 5, 9};
        userInteraction.printArrayElementsDivisibleByThree(userNumbers);
        String expectedOutput = "3\n9\n";
        String actualOutput = userInteraction.getOutput();
        assertEquals("\nExpected result should be:\n"+expectedOutput+"but was:\n"+actualOutput,expectedOutput, actualOutput);
    }
}
