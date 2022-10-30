package apiClickUp.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class ClickUpSteps {

 @Given("I create a Folder")
    public void createFolder(JSONObject obj){
     JSONObject object =new JSONObject();
     obj.put("name", "name of my Folder");

    }
    @And("I verify that the name is correct {string}")
    public void checkfoldername(String name){

    }
    @When("I create a new List in the Folder")
    public void addnewlist(String name){

    }
    @Then("In the List I create a Task")
    public void addtask(){

    }
     @ And("I verify that the Task name is correct")
     public void checktaskname(String name){

     }
     @ And("I remove the Task from the List")
     public void removetask(String [] args){

     }

}
