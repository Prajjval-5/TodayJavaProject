package com.bct.javafeatures.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a collection
		List<String> names = new ArrayList<String>();
		// add the elements to the list
		names.add("sachin");
		names.add("anil");
		names.add("wipro");
		names.add("technology");
		names.add("banglore");
		
		// i would like to count the number of elements present in the list
		
		int count=0;
		for (String ele:names ){ 
			if(ele.length()<6) 
				count++;
			}
			System.out.println("there are "+count+" strings with length less than 6");
			System.out.println("----------------------------------------------------");
	
	
		// lets apply stream now! using lambda expression
		int number = (int) names.stream().filter(ele -> ele.length()<6).count();
		System.out.println("there are "+number+" string with length less than 6");
	}

}
