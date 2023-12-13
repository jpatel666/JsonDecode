package com.example.jsondecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    //{} JsonObject, [] JsonArray, String, Integer, Boolean, Float

    //JSON Check:-JsonViewer And JsonValidator

    String str = "{  \n" +
            "    \"employee\": {  \n" +
            "        \"name\":       \"sonoo\",   \n" +
            "        \"salary\":      56000,   \n" +
            "        \"married\":    true  \n" +
            "    }  \n" +
            "}  ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            JSONObject jsonObject = new JSONObject(str);  //Alt+Enter

            JSONObject employee = jsonObject.getJSONObject("employee");
            String name = employee.getString("name");
            int salary = employee.getInt("salary");
            boolean married = employee.getBoolean("married");

            Log.e("Demo",""+employee);

        } catch (JSONException e) {

        }
    }
}