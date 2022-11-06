package apiClickUp.clients;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static apiClickUp.constants.ProjectConstants.*;

public class ClickUpClients {

    private static final Object SPACEI_ID = clickUpSpec();
    private static Object spaceID;

    private static RequestSpecification clickUpSpec(){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("key", API_KEY)
                .queryParam("id", SPACEI_ID);
    }

    
    public static Response createFolder(JSONObject object){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .header("Autorization",API_KEY)
                .body(object)
                .when()
                .post("https://api.clickup.com/api/v2/space/{space_id}/folder' ")
                .then().log().all()
                .statusCode(200)
                .extract().response();

    }
    public static Response checkfoldername (String name){
        return RestAssured
                .given(clickUpSpec())
                .when()
                .get("https://api.clickup.com/api/v2/folder/{folder_id}")
                .then().log().all()
                .statusCode(200)
                .extract().response();
    }

    public static Response createList(String name, String spaceID){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("key", API_KEY)
                .queryParam("spaceID", SPACE_ID)
                .queryParam("name", name)
                .when()
                .post("https://api.clickup.com/api/v2/folder/{folder_id}/list")
                .then().log().all()
                .extract().response();
    }

    public static Response createTask(String spaceID, String taskId){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("key", API_KEY)
                .queryParam("spaceID", SPACE_ID)
                .queryParam("taskID", TASK_ID)
                .when()
                .post("https://api.clickup.com/api/v2/list/{list_id}/task/{task_id}")
                .then().log().all()
                .extract().response();
    }
    public static Response removetask(String id){
        return RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .queryParam("key", API_KEY)
                .queryParam("taskID", TASK_ID)
                .queryParam("closed", true)
                .when()
                .put("https://api.clickup.com/api/v2/list/{list_id}" + id)
                .then().log().all()
                .statusCode(200)
                .extract().response();
    }


}
