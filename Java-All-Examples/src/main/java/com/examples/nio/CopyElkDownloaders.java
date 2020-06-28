package com.examples.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyElkDownloaders {

	public static void main(String[] args) {
		int i = 0;
		File fileSource = null, fileTarget = null;
		
		File sourceDirectory = new File("/mnt/appedo/resource/elk/elkdownloads/");
		
		String strTargetPath = "/mnt/appedo/resource/elk/test_elk_folder/";

		String sourceFilenames[] = sourceDirectory.list();

		for (String filename : sourceFilenames) {
			fileSource = new File(sourceDirectory, filename);
			
			fileTarget = new File(strTargetPath, filename);
			
			if( !fileTarget.exists() && fileSource.isFile()){
				
				System.out.println("fileSource :"+fileSource);
				System.out.println("fileTarget :"+fileTarget);
				
				try {
					Files.copy(fileSource.toPath(), fileTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}

		}
		System.out.println(" " + "The total number of files/folder found is: " + i);
	}

}
