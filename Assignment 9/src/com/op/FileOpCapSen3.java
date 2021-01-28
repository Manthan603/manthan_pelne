package com.op;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOpCapSen3
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fir = new FileInputStream("newscopy.txt");
		BufferedInputStream bi = new BufferedInputStream(fir);
		
	
		int ch,num=0;
		boolean space = true;
		boolean dotchar = true;
		
		FileOutputStream fr = new FileOutputStream("newsre.txt");
		BufferedOutputStream br = new BufferedOutputStream(fr);
		
		while((ch = bi.read())!=-1)
		{
			if(Character.isLetter((char)ch))
			{

		        if(space && dotchar) 
		        {
		           ch = Character.toUpperCase((char)ch);
		           space = false;
		           dotchar = false;
		        }
		        
		        else if(Character.isUpperCase((char)ch))
				{
		        	ch = Character.toLowerCase((char)ch);
				}
					
		        br.write(ch);
		    }
			
			else if(ch == '.')
			{
	        	dotchar = true;
	        	br.write(ch);
			}

		    else
		    {
		    	br.write(ch);
		        space = true;
		    }
		}
		br.flush();
		
	}

}
