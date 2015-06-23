package com.comcast.csv.interview.problems;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.comcast.csv.meme.Meme;


public class LoopProblem {

	/**
	 * Using all forms of loops and recursions to iterate over a {@link List} of {@link Meme}s and log it's name and year.
	 * Format of the log message isn't important.
	 */
	public void displayValues(Collection<Meme> memes) {
		// TODO Auto-generated method stub
		List<Meme> list = (List<Meme>)memes;
		Iterator<Meme> itr = list.iterator();
		while(itr.hasNext()){
			 Meme meme= itr.next();
			 System.out.println("Name.."+ meme.getName());
			 System.out.println("Year."+ meme.getYear());
			
			      			
		}
	}
}
