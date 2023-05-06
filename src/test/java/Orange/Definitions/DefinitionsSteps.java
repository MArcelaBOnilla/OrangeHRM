package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Steps.Questions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
    private LoginPage LoginPage = new LoginPage(driver);
	
	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^the user fill out name (.*) and password (.*)$")
    public void fillOutLogin(String userName, String password){
		this.LoginPage = new LoginPage(driver);
		this.LoginPage.fillOutLogin(userName, password);
	}
	@Then("^the user validate page Dashboard$")
	public void validateDashboard(){
		this.LoginPage = new LoginPage(driver);
	    this.LoginPage.validateDashboard();
	}

}