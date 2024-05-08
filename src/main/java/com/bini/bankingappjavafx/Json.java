package com.bini.bankingappjavafx;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;

public class Json {


    String json;
    ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public Json() throws IOException {
    }

    public String toJson() throws JsonProcessingException {
        {
            Data data = new Data();
            json = mapper.writeValueAsString(data);
            System.out.println(json);
            return json;
        }
    }

    public void toData() throws IOException {
        Data test = mapper.readValue(spendingsFile, Data.class);
        System.out.println(test);
    }


    File spendingsFile = new File(Pathname.PATHNAME);

    FileWriter fileWriter = new FileWriter(spendingsFile);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    public void toFile() throws Exception {


        bufferedWriter.write(toJson());
        bufferedWriter.newLine();
        //bufferedWriter.flush();
        //bufferedWriter.close();
    }




}

