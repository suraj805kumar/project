package com.ok.example.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Arrays;

public class FolderReader {
	
	private static int count =0;

	public static void main(String[] args) {
		//readAllFiles("D:/my");
		//readFileContent("D:/my/tx.txt");
		//readLineByLine("D:\\my\\tx.txt");
		//readLineByLine("D:/my/tx.txt");
		
		
		
		Timestamp t = new Timestamp(45555555555555l);
//		System.out.println(t.after(null));
		
	}
	
	
	
	
	/**
	 * Read a folder and its all files.
	 * @param path
	 */
	public static void folderReader(String path) {
		File file = new File(path);
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
	}
	
	public static void readAllFiles(String path) {
		File file = new File(path);
		if(file.exists() && file.isFile()) {
			count++;
			System.out.println("File =>" + file.getName());
		} else {
			File[] files = file.listFiles();
			for(File f: files){
				System.out.println("Folder =>" + file.getName());
	            readAllFiles(f.getPath());
	        }
		}
		System.out.println(count);
	}
	
	public static void readFileContent(String filePath) {
		InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            System.out.println(is.available());
            byte content[] = new byte[2*1024];
            int readCount = 0;
            while((readCount = is.read(content)) > 0){
            	//System.out.println("==============================================="+ readCount +"===============================================");
                System.out.println(new String(content, 0, readCount-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
            } catch(Exception ex){
                 
            }
        }
	}
	
	public static void readLineByLine(String filePath) {
		BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader(filePath));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException => Unable to find the file: fileName");
        } catch (IOException e) {
            System.err.println("IOException => Unable to read the file: fileName");
        }
	}
	
	

}
















/*Output:

	apps
	backup
	db_scripts
	development
	git pull-push.txt
	logs
	my
	resume
	SMARTweb_Deployemnts
	spring-boot-tutorial-master
	System Volume Information
	toolbase
	TrueDelete
	workspace
*/