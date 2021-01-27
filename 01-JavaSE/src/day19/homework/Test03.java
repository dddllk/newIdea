package day19.homework;
/*
	判断两个字符串是否相等
 */
public class Test03 {
	public static void main(String[] args) {
		String str1 = "I am a student.";
		String str2 = "I am a student.";
		String result = "";
		for (int i = 0, length = str1.length(); i < length; i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				result += Character.toString(str1.charAt(i));
			} else {
				result += "\"" + str2.charAt(i) + "\"";
			}
		}
		System.out.println(result);
	}
}
