package com.op;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOp1
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fir = new FileInputStream("newsre.txt");
		FileOutputStream fr = new FileOutputStream("newscopy.txt");
		
		BufferedInputStream bi = new BufferedInputStream(fir);
		BufferedOutputStream br = new BufferedOutputStream(fr);
		
		int ch,num=0;
		
		while((ch = bi.read())!=-1)
		{
			if(Character.isAlphabetic((char)ch))
			{
				num = Character.toUpperCase((char)ch);
				System.out.println((char)num);
				br.write(num);
			}
			else
			{
				br.write(ch);
			}
		}
		br.flush();
	}
}

