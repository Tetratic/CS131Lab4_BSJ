package Lab4_Starter.src;
//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args){
    
    FileProcessor fp = new FileProcessor("String1.txt",6);
		fp.processFile();
  }//end main
  
}//end class