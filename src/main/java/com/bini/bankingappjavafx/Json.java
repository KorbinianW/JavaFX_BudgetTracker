package com.bini.bankingappjavafx;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Json {



    String json;
    ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    public void toJson() throws Exception {
        {
            Data data = new Data();
            data.getName();
            data.getAmount();
            json = mapper.writeValueAsString(data);
            System.out.println(json);


        }
    }



}

