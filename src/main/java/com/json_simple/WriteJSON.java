package com.json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "yura@.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetailsTwo = new JSONObject();
        employeeDetailsTwo.put("firstName", "Brian");
        employeeDetailsTwo.put("lastName", "Schultz");
        employeeDetailsTwo.put("website", "example.com");

        JSONObject employeeObjectSecond = new JSONObject();
        employeeObjectSecond.put("employee", employeeDetailsTwo);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObjectSecond);

        try (FileWriter file = new FileWriter("employees.json")) {
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
