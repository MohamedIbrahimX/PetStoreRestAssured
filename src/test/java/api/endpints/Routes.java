package api.endpints;
import static io.restassured.RestAssured.given;
import com.github.javafaker.Faker;
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
public class Routes {
    public static String base_url = "https://petstore.swagger.io/v2";

    //User Module
    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";


    //Store Module
        //Here will create store module URLs

    //Pet Module
        //Here will create pet module URLs


}
