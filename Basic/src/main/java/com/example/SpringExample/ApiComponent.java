package com.example.SpringExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class ApiComponent {

    public Response getAll() throws IOException {
        Response response = new Response();
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        String uri;

        String responseJson1;
        uri = "http://localhost:8882/all";
        responseJson1 =  restTemplate.getForObject(uri, String.class);
        DataResponse dataResponse = objectMapper.readValue(responseJson1, DataResponse.class);

        response.addData(dataResponse);

        String responseJson2;
        uri = "http://localhost:8881/all";
        responseJson2 =  restTemplate.getForObject(uri, String.class);
        responseJson2 = responseJson2.substring(1,responseJson2.length());
        responseJson2 = responseJson2.substring(0,responseJson2.length()-2);
        responseJson2 = responseJson2.replace("\\","");
        DataResponse dataResponse2 = objectMapper.readValue(responseJson2, DataResponse.class);
        response.addData(dataResponse2);

        return response;
    }

}
