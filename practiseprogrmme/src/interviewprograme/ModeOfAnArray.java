package interviewprograme;

public class ModeOfAnArray {

	public static void main(String[] args) {
		int a[]= {70,70,80,70,60,80,70,80,90,90,70,90,80,90};
		int[] temp=new int[a.length];
		int j=0;
		for (int i = 0; i <a.length-1; i++) {
			if(a[i]==a[i+1]) {
			}
			temp[j]=a[a.length-1];
		}
		System.out.println("mode of the array are "+temp[j]);
	}
}
