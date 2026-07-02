package mockito.Mocking_and_Stubbing;



import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MockServiceTest {

    public void testVoidMethodThrowsException() {

        ExternalApi mockApi = mock(ExternalApi.class);


        doThrow(new RuntimeException("API Error"))
                .when(mockApi).sendData("Hello");


        MyService service = new MyService(mockApi);

 
        assertThrows(RuntimeException.class, () -> {
            service.processData("Hello");
        });


        verify(mockApi).sendData("Hello");
    }
}