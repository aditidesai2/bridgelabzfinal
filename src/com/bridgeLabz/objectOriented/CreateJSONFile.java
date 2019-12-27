package com.bridgeLabz.objectOriented;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;

public class CreateJSONFile {
	@SuppressWarnings("unchecked")
	public static void main (String[] args) throws JSONException {
		JSONObject obj=new JSONObject();
		obj.put("name", "Adi");
		obj.put("location", "Blr");
		obj.put("zip", "580032");
		JSONArray list=new JSONArray();
		list.add("Java");
		list.add("AngularJS");
		list.add("SpringBoot");
		
		obj.put("course", list);
		
		try(FileWriter file=new FileWriter("myJSON.json))")){
			file.write(obj.toString());
			file.flush();
		}
		
		catch(IOException e) {
			e.printStackTrace();
			
		}
		System.out.println(obj);
	}
}