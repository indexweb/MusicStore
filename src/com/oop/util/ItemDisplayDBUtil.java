package com.oop.util;
import com.oop.util.DBConnect;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Songs;

public class ItemDisplayDBUtil {

	public static List<Songs> getSongDetails (String id){
		
		ArrayList<Songs> songDetails = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return songDetails;
	}
}
