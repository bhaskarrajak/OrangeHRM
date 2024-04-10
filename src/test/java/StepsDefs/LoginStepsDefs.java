package StepsDefs;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDefs {
    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Given("^Chrome Browser is Open$")
    public void chrome_Browser_is_Open()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\brajak\\Desktop\\Chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^User is on Orange HRM Login Page$")
    public void user_is_on_Orange_HRM_Login_Page(){
        driver.get(url);
        System.out.println(driver.getCurrentUrl());
    }

    @When("^<Username> and <Password> is Entered$")
    public void username_and_Password_is_Entered()  {

    }

    @Then("^User Should be logged into Homepage$")
    public void user_Should_be_logged_into_Homepage()  {

    }
}
