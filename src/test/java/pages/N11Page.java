package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Page {
    public N11Page(){
        PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy(xpath = "(//*[.='Tüm Mağazalar'])[1]")
    public WebElement tummagazalar;

    @FindBy(xpath = "//span[@class=\"infoText\"]")
    public WebElement harfArama;

    }

