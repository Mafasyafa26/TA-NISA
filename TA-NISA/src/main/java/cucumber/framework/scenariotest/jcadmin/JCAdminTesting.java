package cucumber.framework.scenariotest.jcadmin;

public enum JCAdminTesting {
	T1("User valid login"),
	T2("User valid login upper"),
	T3("User valid login uplow"),
	T4("User valid login uplow dua");
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
