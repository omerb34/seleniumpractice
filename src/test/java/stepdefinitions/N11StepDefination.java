package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.N11Page;

public class N11StepDefination {
    N11Page n11 = new N11Page();

    @Then("kullanici tummagazalar butonuna tiklar")
    public void kullanici_tummagazalar_butonuna_tiklar() {
     n11.tummagazalar.click();

    }

    @And("kullanici default olarak A ile baslayan mağazaları goruntuledıgını dogrular")
    public void kullaniciDefaultOlarakAIleBaslayanMağazalarıGoruntuledıgınıDogrular() {
        Assert.assertTrue(n11.harfArama.getText().contains("A"));

    }
}