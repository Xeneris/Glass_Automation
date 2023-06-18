import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='login-form-username']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@id='login-form-password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-form-submit']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void sendUsername() {
        usernameField.sendKeys("codecooladmin");
    }

    public void sendPassword() {
        passwordField.sendKeys("AutoExpert20?");
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
