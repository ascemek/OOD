package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Folder extends Component{
	
	// folder is a composite class

	private List<Folder> folders;
	private List<File> files;
	
	Folder(String folderName)
	{
		super(folderName, 0.0);
		folders = new ArrayList<Folder>();
		files = new ArrayList<File>();
	}
	
	
	public void addFolder(Folder f){ 
		folders.add(f); 
	}
	
	public void addFile(File f){ 
		files.add(f); 
	}
	
	public void removeFolder(Folder f) { 
		
		folders.remove(f); 
	
	}
	public void removeFile(File f) { 
		files.remove(f); 
		}
	
	public void removeFolder(int index) { 
		
		if(index < folders.size())
			folders.remove(index);

	}
	public void removeFile(int index) { 

		if(index < files.size())
			files.remove(index);
	}
	
	public Double getSize()
	{
		Double currentSize = 0.0;
		for (File f : files)
			currentSize += f.getSize();
		for (Folder f: folders)
			currentSize += f.getSize();
		this.setSize(currentSize);
		return currentSize;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Folder: ").append(this.getName()).append(", size: ").
					append(this.getSize()).append("\n").
						append(String.join("", Collections.nCopies(50, "-"))).append("\n");
		
		Iterator fileIterator = files.iterator();
		
		while(fileIterator.hasNext())
		{
			sb.append(this.getName() + ">>" + fileIterator.next().toString()+"\n");
		}
		
		Iterator folderIterator = folders.iterator();
		
		while(folderIterator.hasNext())
		{
			sb.append(this.getName() + ">>" + folderIterator.next().toString()+"\n");
		}
		
		return sb.toString();
	}
	
}

