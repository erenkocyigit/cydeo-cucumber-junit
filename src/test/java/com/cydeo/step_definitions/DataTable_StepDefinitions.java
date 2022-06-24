package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")

    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(3));


    }
    @Given("User is on the drp[downs page of practice tool")
    public void user_is_on_the_drp_downs_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();


    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        Select select = new Select(dropdownsPage.monthDropdown  );
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String > actualOptions = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }

        Assert.assertEquals(expectedMonths,actualOptions);
        //Assert will check the size of the lists first. If it is matching it will check content 1 by 1.


    }


}
