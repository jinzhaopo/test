package test;

public class Test1 {

	public static void main(String[] args) {
		for(int i=0;i<=9;i++){
			try {
				if(i==3)
					break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}

	}

}
