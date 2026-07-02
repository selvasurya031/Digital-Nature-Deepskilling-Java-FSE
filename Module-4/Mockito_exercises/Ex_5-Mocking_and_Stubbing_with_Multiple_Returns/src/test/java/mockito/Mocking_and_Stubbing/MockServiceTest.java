package mockito.Mocking_and_Stubbing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;


public class MockServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);


        when(mockApi.getData()).thenReturn("First Call", "Second Call", "Third Call");


        MyService service = new MyService(mockApi);


        String result1 = service.fetchData();
        String result2 = service.fetchData();
        String result3 = service.fetchData();

   
        assertEquals("First Call", result1);
        assertEquals("Second Call", result2);
        assertEquals("Third Call", result3);
    }
}