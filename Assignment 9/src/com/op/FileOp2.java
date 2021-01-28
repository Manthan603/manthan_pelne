package com.op;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOp2
{
	public static void main(String []args) throws IOException
	{
		FileInputStream fir = new FileInputStream("newscopy.txt");
		FileOutputStream fr = new FileOutputStream("newsre.txt");
		
		BufferedInputStream bi = new BufferedInputStream(fir);
		BufferedOutputStream br = new BufferedOutputStream(fr);
	
		int ch;
		int num;
	
		while((ch = bi.read())!=-1)
		{
			if(Character.isAlphabetic((char)ch))
			{
				num = Character.toLowerCase((char)ch);
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
