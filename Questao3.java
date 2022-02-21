import java.util.Arrays;
class questao3{
	public static void main(String[] args) 

	{

	String str1 = "ovo1";
	String str2 = "";
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
if(str1.length() == str2.length()) {

	char[] charArray1 = str1.toCharArray();
	char[] charArray2 = str2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	boolean result = Arrays.equals(charArray1, charArray2);
		if(result) 
	{

	System.out.println(str1 + " e " + str2 + " são anagramas");
	}
	
	else {

	System.out.println(str1 + " e " + str2 + " não são anagramas");
	}

	}
	else {
	
	System.out.println(str1 + " e " + str2 + " não são anagramas");
	}
	}
}