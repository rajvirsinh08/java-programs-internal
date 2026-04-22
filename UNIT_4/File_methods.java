import java.io.File;
import java.io.IOException;
import java.util.Date;
class File_methods
{
	public static void main(String[] args) throws IOException
	{
		
		File f=new File("Demo.txt");
		if(f.createNewFile())
		{
			System.out.println("File created\n");
		}else
		{
			System.out.println("Already created\n");
		}
		//file information
		System.out.println("File Name: "+f.getName());
		System.out.println("File Path: "+f.getPath());
		System.out.println("File Absolute Path: "+f.getAbsolutePath());
		System.out.println("File Is Absolute: "+f.isAbsolute());
		
		//File properties
		System.out.println("File Exists: "+f.exists());
		System.out.println("File Can Readable: "+f.canRead());
		System.out.println("File Can Write: "+f.canWrite());
		System.out.println("File Can Execute: "+f.canExecute());
		
		//File permissions
		f.setReadable(true);
		f.setWritable(false);
		f.setExecutable(false);
		System.out.println("Readable: "+f.canRead());
		System.out.println("Write: "+f.canWrite());
		System.out.println("Execute: "+f.canExecute());
		
		//File Size
		System.out.println("File Length"+f.length());
		
		//Last Modified
		System.out.println("Default Last modified: "+f.lastModified());
		long lm=f.lastModified();
		Date d2=new Date(lm);
		System.out.println("Fomrated Last Modified: "+d2);
		/*
		//file Delete
		if(f.delete())
		{
			System.out.println("File Deleted Success Full");
		}else
		{
			System.out.println("File Not delete");
		}*/
	}
}