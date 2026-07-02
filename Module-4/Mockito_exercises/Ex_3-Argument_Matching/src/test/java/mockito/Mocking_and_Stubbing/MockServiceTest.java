package mockito.Mocking_and_Stubbing;



import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;



public class MockServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);


        MyService service = new MyService(mockApi);


        service.fetchDataById(101);

        verify(mockApi).getDataById(anyInt());
    }
}