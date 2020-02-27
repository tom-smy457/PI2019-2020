package com.example.SpringExample;

import java.util.ArrayList;
import java.util.List;

public class Response {
    List<DataResponse> data;

    public Response() {
        data = new ArrayList<>();
    }

    public void addData(DataResponse dataResponse){
        data.add(dataResponse);
    }

    public List<DataResponse> getData() {
        return data;
    }
}
