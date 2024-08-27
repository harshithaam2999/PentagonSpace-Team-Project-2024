package pentagon.assignments;

class sysFile
{
    String file_name;
    static String file_extn;
    long file_size;
    
    public sysFile(String file_name,String file_extn,long file_size) 
    {
    	this.file_name=file_name;
    	this.file_extn=file_extn;
    	this.file_size=file_size;
    }
    
    public void DisplayFileInfo() 
    {
    	System.out.println("File Name is : " + file_name);
    	System.out.println("File Extension is :" + file_extn);
    	System.out.println("File Size is : " + file_size);
    	
    }
    
}

class jpgFile extends sysFile
{

	public jpgFile(String file_name, long file_size,String jpg) 
	{
		super(file_name, jpg, file_size);
	    
	}
	
	public void DisplayInfo()
	{
		super.DisplayFileInfo();
		System.out.println("File type is : JPEG ");
	}
	
	public void fileBehaviour() 
	{
		System.out.println("Displayed as flat file");
	}	
}

class pdfFile extends sysFile
{

	public pdfFile(String file_name, long file_size,String file_extn)
	{
		super(file_name, file_extn, file_size);
	}
	
	public void DisplayInfo() 
	{
		System.out.println("File type is : PDF ");
	}
	
	public void fileBehaviour() 
	{
		System.out.println("Displayed as image file with layers");
	}
	
}

class pngFile extends sysFile
{

	public pngFile(String file_name, long file_size,String file_extn)
	{
		super(file_name, file_extn, file_size);		
	}
	
	public void DisplayInfo()
	{
		System.out.println("File type is : PNG");
	}
	
	public void fileBehaviout() 
	{
		System.out.println("Displayed as document with layers");
	}
	
}

class photoShop
{
	public static void openFile(sysFile sf)
	{
		sf.DisplayFileInfo();
		if(sf instanceof jpgFile) 
		{
		   ((jpgFile) sf).fileBehaviour();
		}
		else if (sf instanceof pngFile) 
		{
			((pngFile) sf).fileBehaviout();
		}
		else if (sf instanceof pdfFile)
		{
			((pdfFile) sf).fileBehaviour();
		}
	}
	
}

public class OperatingSystem 
{

	public static void main(String[] args) 
	{
		sysFile jpg = new jpgFile("Photo",1024,"jpg");
		sysFile png = new pngFile("image",1025, "png");
		sysFile pdf = new pdfFile("Document",1026,"pdf");
		
		photoShop photoshop = new photoShop();
		
		photoShop.openFile(jpg);
		photoShop.openFile(png);
		photoShop.openFile(pdf);		

	}

}
