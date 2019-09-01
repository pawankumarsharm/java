package dsProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccuranceofWord {

	public static void main(String[] args) throws Exception {
		Map<String,Integer> cm=new HashMap<String,Integer>();
		FileInputStream fin=new FileInputStream("C:\\Users\\bikram chandra\\Desktop\\test/abc.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			String w=" ";
			while(Character.isAlphabetic(i))
			{
				w=w+(char)i;
				i=fin.read();
			}
			if(w.length()>0)
			{
				if(cm.containsKey(w))
						{
					cm.put(w, cm.get(w)+1);
						}
				else
				{
					cm.put(w,1);
				}
			}
		}
		
		Set entry=cm.entrySet();
		for(Object ob : entry) {
			System.out.println(ob);
		}
		
	}

}
