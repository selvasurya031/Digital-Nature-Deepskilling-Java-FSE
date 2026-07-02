package mockito.Mocking_and_Stubbing;



import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;



public class MockServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).sendData("Hello");

        // Step 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: Call service method
        service.processData("Hi");

        // Step 5: Verify interaction
        verify(mockApi).sendData("Hello");
    }
}