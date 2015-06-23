package com.comcast.csv.interview.problems;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;

/**
 * Read a list of {@link Meme}s from a JSON source file that might be on the classpath or file system.
 */
public class FileJsonResourceProblem {

    /**
     * Read a list of memes from a JSON file stored on the filesystem
     * 
     * @param file the file to read
     * @return the list of memes read
     */
    public List<Meme> readFromFile(File file) throws YoureDoingItWrongException {
    	
    	//File file =  new File("C://Mahadev/personal/json/test.json");
    	Meme meme = null;
        ObjectMapper mapper = new ObjectMapper();
        try
        {
           meme =  mapper.readValue(file, Meme.class);
        } catch (JsonGenerationException e)
        {
           e.printStackTrace();
        } catch (JsonMappingException e)
        {
           e.printStackTrace();
        } catch (IOException e)
        {
           e.printStackTrace();
        }
        System.out.println(meme);
        List<Meme> list = new ArrayList<Meme>();
        list.add(meme);
        
        return list;
    	 	
		}

   

    /**
     * Read a list of memes from a JSON file stored on the classpath
     * 
     * @param path the path to the resource
     * @return the list of memes read
     */
   public List<Meme> readFromClasspath(String path) throws YoureDoingItWrongException {
	   
	   Meme meme = null;
       ObjectMapper mapper = new ObjectMapper();
       try
       {
          meme =  mapper.readValue(new File("/test.json"), Meme.class);
       } catch (JsonGenerationException e)
       {
          e.printStackTrace();
       } catch (JsonMappingException e)
       {
          e.printStackTrace();
       } catch (IOException e)
       {
          e.printStackTrace();
       }
       System.out.println(meme);
       List<Meme> list = new ArrayList<Meme>();
       list.add(meme);
       
       return list;
   	 	
		}

    }


