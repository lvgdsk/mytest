package mytest;

public class TestMain {

	public static void main(String[] args) {
		int i = 1;
		i = i++; 
		int j = i++;
		int k = i + ++i * i++;
		System.out.println("i="+i);  //i=4
		System.out.println("j="+j);  //j=1
		System.out.println("k="+k);  //k=11
	}

}
