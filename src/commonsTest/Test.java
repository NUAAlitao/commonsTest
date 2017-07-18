package commonsTest;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myArrayUtils();
		myReverse();
		myContains();
		mylastIndexOf();
		myaddAll();
		myremove();
		myMaxMin();
		myisNumber();
		mysubstring();
		mytrim();
		mycontains();
		myprintln();
		myuppercase();
	}
	
	public static void myArrayUtils(){
		String [] array1 = {"123", "321"};
		String [] array2 = {"123" };
		System.out.println("���鳤���Ƿ���ͬ��"+ArrayUtils.isSameLength(array1, array2));
	}
	
	public static void myReverse(){
		String [] array1 = {"123", "321"};
		ArrayUtils.reverse(array1);
		System.out.println("�������������������"+ArrayUtils.toString(array1));	
	}
	
	public static void myContains(){
		String [] array1 = {"123", "321"};
		System.out.println("�ж��������Ƿ����'123':"+ArrayUtils.contains(array1, "123"));
	}
	
	public static void mylastIndexOf(){
		String [] array1 ={"123", "321", "123"};
		System.out.println("''123'�������������ֵ�λ�ã�"+ArrayUtils.lastIndexOf(array1, "123"));
	}
	
	public static void myaddAll(){
		String [] array1 ={"123"};
		String [] array2 ={"456"};
		String [] array3 = ArrayUtils.addAll(array1, array2);
		System.out.println("�����������飺"+ArrayUtils.toString(array3));
	}
	
	public static void myremove(){
		Integer [] array1 = {123, 456, 789};
		Integer [] array2 = ArrayUtils.removeElement(array1, 123);
		System.out.println("ɾ�������е�Ԫ�أ�"+ArrayUtils.toString(array2));
	}
	
	public static void myMaxMin(){
		int a = 123;
		int b = 234;
		int c = 456;
		System.out.println("���ֵ��"+NumberUtils.max(a,b,c));
		System.out.println("��Сֵ��"+NumberUtils.min(a,b,c));
	}
	
	public static void myisNumber(){
		String str = "123456";
		String str1 = "123456a";
		System.out.println("�Ƿ������֣�"+StringUtils.isNumeric(str));
		System.out.println("�Ƿ������֣�"+StringUtils.isNumeric(str1));
	}
	
	public static void mysubstring(){
		String str = "12adsf11sdflkdjg";
		System.out.println("�ַ��������λ�ǣ�"+StringUtils.substring(str, str.length()-3));
	}
	
	public static void mytrim(){
		String str = "  sfsdfjdf3434   ";
		System.out.println("ȥ���ַ�����λ�ո�: " + StringUtils.trim(str));
	}
	
	
	public static void mycontains(){
		String str = "sdffsd1222312df";
		String str1 = "123";
		System.out.println("str���Ƿ����str1��" + StringUtils.contains(str, str1));
	}
	
	public static void myprintln(){
		String str  = "*@*";
		System.out.println("�ظ������"+ StringUtils.repeat(str, 100));
	}
	
	public static void myuppercase(){
		String str = "sdff";
		System.out.println("����ĸת���ɴ�д��"+ StringUtils.upperCase(str));
	}
	
	public static void myuppercase1(){
		String str = "sdff";
		System.out.println("����ĸת���ɴ�д��"+ StringUtils.upperCase(str));
	}
}







