package com.example.jsondecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.jsondecode.Class.ModelClass;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    String response = "{\"menu\": {  \n" +
            "  \"id\": \"file\",  \n" +
            "  \"value\": \"File\",  \n" +
            "  \"popup\": {  \n" +
            "    \"menuitem\": [  \n" +
            "      {\"value\": \"New\", \"onclick\": \"CreateDoc()\"},  \n" +
            "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},  \n" +
            "      {\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}  \n" +
            "    ]  \n" +
            "  }  \n" +
            "}}  ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        try {
            JSONObject jsonObject = new JSONObject(response);  //Alt+Enter

            JSONObject menu = jsonObject.getJSONObject("menu");

            String id = menu.getString("id");
            String value = menu.getString("value");

            JSONObject popup = menu.getJSONObject("popup");

            JSONArray menuitem = popup.getJSONArray("menuitem");

            ArrayList<ModelClass> list = new ArrayList<>();

            for (int i=0;i<menuitem.length();i++)
            {
                JSONObject object = menuitem.getJSONObject(i);

                String value1 = object.getString("value");
                String onclick1 = object.getString("onclick");

                ModelClass modelClass = new ModelClass(value1,onclick1);

                list.add(modelClass);
            }

            Log.e("Activity2",""+list);

        } catch (JSONException e) {

            Log.e("Error",""+e);

        }
    }
}