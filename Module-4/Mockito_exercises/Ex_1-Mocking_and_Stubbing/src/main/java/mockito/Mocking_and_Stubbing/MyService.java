package mockito.Mocking_and_Stubbing;

public class MyService {
	private ExternalApi externalApi;
	public MyService(ExternalApi externalApi) {
		this.externalApi =externalApi;
	}
	public String fetchDataa() {
		return externalApi.getData();
	}
}
