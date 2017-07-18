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
		System.out.println("数组长度是否相同："+ArrayUtils.isSameLength(array1, array2));
	}
	
	public static void myReverse(){
		String [] array1 = {"123", "321"};
		ArrayUtils.reverse(array1);
		System.out.println("将数组内容逆序输出："+ArrayUtils.toString(array1));	
	}
	
	public static void myContains(){
		String [] array1 = {"123", "321"};
		System.out.println("判断数组中是否包含'123':"+ArrayUtils.contains(array1, "123"));
	}
	
	public static void mylastIndexOf(){
		String [] array1 ={"123", "321", "123"};
		System.out.println("''123'在数组中最后出现的位置："+ArrayUtils.lastIndexOf(array1, "123"));
	}
	
	public static void myaddAll(){
		String [] array1 ={"123"};
		String [] array2 ={"456"};
		String [] array3 = ArrayUtils.addAll(array1, array2);
		System.out.println("连接两个数组："+ArrayUtils.toString(array3));
	}
	
	public static void myremove(){
		Integer [] array1 = {123, 456, 789};
		Integer [] array2 = ArrayUtils.removeElement(array1, 123);
		System.out.println("删除数组中的元素："+ArrayUtils.toString(array2));
	}
	
	public static void myMaxMin(){
		int a = 123;
		int b = 234;
		int c = 456;
		System.out.println("最大值："+NumberUtils.max(a,b,c));
		System.out.println("最小值："+NumberUtils.min(a,b,c));
	}
	
	public static void myisNumber(){
		String str = "123456";
		String str1 = "123456a";
		System.out.println("是否是数字："+StringUtils.isNumeric(str));
		System.out.println("是否是数字："+StringUtils.isNumeric(str1));
	}
	
	public static void mysubstring(){
		String str = "12adsf11sdflkdjg";
		System.out.println("字符串最后三位是："+StringUtils.substring(str, str.length()-3));
	}
	
	public static void mytrim(){
		String str = "  sfsdfjdf3434   ";
		System.out.println("去除字符串首位空格: " + StringUtils.trim(str));
	}
	
	
	public static void mycontains(){
		String str = "sdffsd1222312df";
		String str1 = "123";
		System.out.println("str中是否包含str1：" + StringUtils.contains(str, str1));
	}
	
	public static void myprintln(){
		String str  = "*@*";
		System.out.println("重复输出："+ StringUtils.repeat(str, 100));
	}
	
	public static void myuppercase(){
		String str = "sdff";
		System.out.println("将字母转换成大写："+ StringUtils.upperCase(str));
	}
	
	public static void myuppercase1(){
		String str = "sdff";
		System.out.println("将字母转换成大写："+ StringUtils.upperCase(str));
	}
}







