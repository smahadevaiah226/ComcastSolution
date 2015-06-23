package com.comcast.csv.interview.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.comcast.csv.meme.Meme;

public class ListUtility {
	
	
	
    public static void printList(List<Meme> memeList){    	
    	for (Iterator<Meme> iterator = memeList.iterator(); iterator.hasNext();) {
			Meme meme = (Meme) iterator.next();
			System.out.println("Name :: " + meme.getName());
			System.out.println("Year:: " + meme.getYear());
			System.out.println("Tags:: " + Arrays.toString(meme.getTags()));			
		}  
    }

}