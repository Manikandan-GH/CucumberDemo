package stepDefinitions;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;



public class HookStepDefinition {

	@Before(order=0)
	public void beforetest() {
		System.out.println("before");
	}
	
	@After(order=0)
	public void aftertest() {
		System.out.println("after");
	}
	
	@Before(order=1)
	public void befsectest() {
		System.out.println("before1");
	}
	
	@After(order=1)
	public void aftertest1() {
		System.out.println("after1");
	}
	
	
	@Before("@first")
	public void setupi() {
		System.out.println("first");
	}
	
	@Before("@second")
	public void firsttest() {
		System.out.println("second");
	}
	
	@Before(order=2)
	public void sectest() {
		System.out.println("before");
	}
	
	@Given("^first sets$")
	public void first_sets() {
		System.out.println("first scenario");
	}
	
	@Given("^all data$")
	public void all_data() {
		System.out.println("second scenario");
	}
}
