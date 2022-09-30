package cucumber.framework.scenariotest.jcadmin;

public enum JCAdminTesting {
	M1("User invalid login simpan"),
	M2("User invalid login klik submit"),
	M3("User invalid login input username"),
	M4("User valid login input password"),
	M5("User invalid login input password uppercase"),
	M6("User invalid login upper"),
	M7("User invalid login input spasi"),
	M8("User invalid login user tanpa format email");
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
