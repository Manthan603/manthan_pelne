package com.op;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOp4and5
{
	public static void main(String[] args) throws IOException
	{
		
		FileReader fr = new FileReader("newsre.txt");
	
		int ch,num=0;
		int numberOfChar=0,numberOfWord=0,numberOfCharWithoutSpace=0;
		while((ch = fr.read())!=-1)
		{
			if(Character.isSpace((char)ch))
			{
				numberOfWord++;
			}
			else if(Character.isLetter((char)ch))
				numberOfChar++;
		}
		System.out.println("Number Of Charchter : " + numberOfChar);
		System.out.println("Number Of Word : " + (numberOfWord+1));
	}
}
