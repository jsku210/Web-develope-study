import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/Temp/DDD");
		File f2 = new File("C:/Temp/test1.txt");
		
		if(f1.exists()== false) {f1.mkdirs();}
		if(f2.exists()==false) {f2.createNewFile();}
		
		File f3 = new File("C:/Temp");
		File[] list = f3.listFiles();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy MM dd   a  HH:mm");
		for(int i =0; i< list.length;i++) {
			if(list[i].isDirectory()) {
			System.out.println(list[i].getName()+"\t"+fm.format(list[i].lastModified())+"\t"+list[i].length());
			}
			System.out.println(list[i].getName()+"\t"+fm.format(list[i].lastModified())+"\t"+list[i].length());
		}
	}
}
