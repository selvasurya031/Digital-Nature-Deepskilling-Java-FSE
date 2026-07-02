package mockito.Mocking_and_Stubbing;



import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;
import org.mockito.InOrder;



public class MockServiceTest {

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);


        service.fetchData();


        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).getData();
    }
}