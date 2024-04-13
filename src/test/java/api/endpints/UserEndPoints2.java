package api.endpints;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

//Created for perform Create, Read, Update, Delete requests the user api
public class UserEndPoints2 {


    //Method created for getting URL's from properties file
    static ResourceBundle getURL(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("routes"); //Load Properties File
        return resourceBundle;
    }
    public static Response createUser(User payload){

        String post_url = getURL().getString("post_url");
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(post_url);
        return response;
    }


    public static Response readUser(String userName){
        String get_url = getURL().getString("get_url");
        Response response = given()
                .pathParam("username",userName)
                .when()
                .get(get_url);
        return response;
    }

    public static Response updateUser(String userName, User payload){
        String update_url = getURL().getString("update_url");
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParam("username",userName)
                .when()
                .put(update_url);
        return response;
    }


    public static Response deleteUser(String userName){
        String delete_url = getURL().getString("delete_url");
        Response response = given()
                .pathParam("username",userName)
                .when()
                .delete(delete_url);
        return response;
    }
}
