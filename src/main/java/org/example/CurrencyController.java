package org.example;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.fxml.FXML;
import java.io.IOException;


public class CurrencyController {
    @FXML
    public void backToPrincipal() throws IOException{
        App.setRoot("principal");
    }

    public void testApi() throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://currency-converter-by-api-ninjas.p.rapidapi.com/v1/convertcurrency?have=USD&want=EUR&amount=5000")
                .header("X-RapidAPI-Key", "89a7b75272msh71797811b6ec330p149887jsne6ef0b48d4af")
                .header("X-RapidAPI-Host", "currency-converter-by-api-ninjas.p.rapidapi.com")
                .asString();
        System.out.println(response.getHeaders().get("Content-Type"));
    }

}
