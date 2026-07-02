package mockito.Mocking_and_Stubbing;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData(String data) {
        externalApi.sendData("Hello");
    }
}