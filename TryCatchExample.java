import java.io.*;
public class TryCatchExample{
	public static void main(String[] args)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A:");
		int a=Integer.parseInt(bf.readLine());
		System.out.println("Enter B:");
		int b=Integer.parseInt(bf.readLine());
		int c;
		try{
			c=a-b;
			if(c>32768){
				throw new ArithmeticException("Pay out Bound");
			}
			System.out.println("Answer: "+c);
		}catch(ArithmeticException e){
			System.out.println("Error:"+e.getMessage());
		}
	}
}