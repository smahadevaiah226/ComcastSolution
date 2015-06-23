package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.comcast.csv.interview.util.ListUtility;
import com.comcast.csv.interview.util.YearComparator;
import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {
	
	public void sort(Collection<Meme> memes, boolean ascending) {
		
		List<Meme> memeList = new ArrayList<Meme>( memes );
		
		if(ascending){			
			Collections.sort( memeList, new YearComparator());	
				
		}else{			
			Collections.sort(memeList ,Collections.reverseOrder(new YearComparator()));	
			
		}		
		ListUtility.printList(memeList);
		
	}	
	
	/**
     * Adds a tag to all meme's that contain another tag
     * @param memes The collection of memes to mutate
     * @param tag The tag that is to be added
     */
	public void addTag(Collection<Meme> memes, String tag) {
		// TODO Auto-generated method stub
		List<Meme> list = (List<Meme>)memes;
		
		Iterator<Meme> itr = list.iterator();
		while(itr.hasNext()){
			String[] tags = itr.next().getTags();
			String[] newTags = new String[tags.length + 1];
			for(int i=0;i < tags.length;i++)
				newTags[i] = tags[i];
	        
			newTags[newTags.length-1] = tag;
	 
	        tags = newTags;
	       			
		}
	}



}
