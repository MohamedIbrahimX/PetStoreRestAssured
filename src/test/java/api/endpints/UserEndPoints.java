package api.endpints;
import static io.restassured.RestAssured.given;

import api.payloads.User;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

//Created for perform Create, Read, Update, Delete requests the user api
public class UserEndPoints {

    public static Response createUser(User payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);
        return response;
    }


    public static Response readUser(String userName){
        Response response = given()
                .pathParam("username",userName)
                .when()
                .get(Routes.get_url);
        return response;
    }

    public static Response updateUser(String userName, User payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .pathParam("username",userName)
                .when()
                .put(Routes.update_url);
        return response;
    }


    public static Response deleteUser(String userName){
        Response response = given()
                .pathParam("username",userName)
                .when()
                .delete(Routes.delete_url);
        return response;
    }
}
