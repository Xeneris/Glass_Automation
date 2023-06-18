import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GlassProjectDocumentationPage extends BasePage {

    @FindBy(xpath = "//p[normalize-space()='Workflows']")//??
    public WebElement workflowBox;

    @FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[@class='aui-page-panel']/div[@class='aui-page-panel-inner']/main[@id='sidebar-page-container']/div[@id='app-root']/div/div/div/div/div/div[@class='scheme-container']/div[@aria-expanded='false']/div[@class='glass-card workflow-colored-border']/div[1]")
    public WebElement schemesDropdown;

    @FindBy(xpath = "//span[normalize-space()='GTP Workflow']")
    public WebElement workflowTable;

    @FindBy(xpath = "//span[@class='sc-jzJRlG jEoJKu']")
    public WebElement schemesDropdownNumber;

    public GlassProjectDocumentationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getWorkflowNumber(){
        wait.until(ExpectedConditions.visibilityOf(workflowBox));
        return workflowBox.getText();
    }
    public String getSchemesDropdownNumber(){
        wait.until(ExpectedConditions.visibilityOf(workflowBox));
        return schemesDropdownNumber.getText();
    }
}
