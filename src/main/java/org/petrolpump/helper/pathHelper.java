package org.petrolpump.helper;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;


public class pathHelper 
{
	public static String completePath = "";
	public static Properties p = new Properties();
	public pathHelper()
	{
		try
		{
			Path currentDirectoryPath = FileSystems.getDefault().getPath("");
			String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
			System.out.println(currentDirectoryName);
			completePath = currentDirectoryName + "\\src\\main\\java\\resources\\db.properties";
			
			
			FileInputStream finf = new FileInputStream(completePath);

			p.load(finf);
			
		}catch(Exception ex)
		{
			System.out.println("Exception ex");
		}

	}
}


