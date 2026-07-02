package mockito.Mocking_and_Stubbing;



import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MockServiceTest {

    @Test
    public void testExternalApi() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("I am Sachin");

        MyService service = new MyService(mockApi);
        String result = service.fetchDataa();   // not fetchDataa()

        assertEquals("I am Sachin", result);
    }
}