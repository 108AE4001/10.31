package text_p40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_20 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Ոݔ���ִ�");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("Ոݔ���������ִ�");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("�ڣ�"+str1+")��������"+str2+"����Ԓ���͕�׃�ɣ�"+sb+"����");
	}

}
