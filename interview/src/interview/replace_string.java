package interview;

public class replace_string {

	public static void main(String[] args) {
		String str1="pawan";
		String str2="mukesh";
		System.out.println("\n String before replacing");
		System.out.println("str1:"+str1+"\n str2:"+str2);
		str1=str1.replace(str1,str2);
		System.out.println(" string after replacing");
		System.out.println("str1:"+str1+"\n str2:"+str2);
	}

}
