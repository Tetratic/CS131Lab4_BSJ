package Lab4_Starter.src;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		setFileName(fileName);
		setStringLength(stringLength);
			
	}//end empty-argument constructor
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getStringLength() {
		return stringLength;
	}

	public void setStringLength(int stringLength) {
		if (stringLength>=5) {
			this.stringLength = stringLength;
		}
		else {
			this.stringLength = 5;
		}
	}


	public int getArrayListSize() {
		return this.stringList.size();
	}//end getArrayListSize
	
	public void processFile() {
		File f = new File(this.fileName);
		
		try {
			input = new Scanner(f);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				if (line.length() > this.stringLength) {
					throw new StringTooLongException("The String on this line is too long!");
				}
				else {
					System.out.println(line);
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file found with name \"" + this.fileName + "\"");
		} catch (StringTooLongException e) {
			System.out.println(e);
		}

	}//end processFile
}//end class
