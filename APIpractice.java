package com.testapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class APIpractice {

    @Test
    public void getAllRecipes() {
        // Set Base URI
        RestAssured.baseURI = "https://dummyjson.com";

        // Send GET request and extract response
        Response response = 
            given()
                .when()
                .get("/recipes");

       
    }
}
