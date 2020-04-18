import java.util.Arrays;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
//		System.out.println(deletedAnagram("adddaas","ada"));
		System.out.println(findNumber(Arrays.asList(1, 2,3,4,5), 9));
	}
	

public static int deletedAnagram(final String first, final String second){
	char[] minor = first.toCharArray();
	char[] major = second.toCharArray();
	
	if(minor.length > major.length){
		char[] auxiliar = minor;
		minor = major;
		major = auxiliar;
	}
	char charNull = '\u0000';
	int amountEquals = 0;
	for(int indexMinor = 0; indexMinor < minor.length; indexMinor++){
		for(int indexMajor = 0; indexMajor < major.length; indexMajor++){
			if(minor[indexMinor] == major[indexMajor]){
				major[indexMajor] = charNull;
				amountEquals++;
				break;
			}
		}
	}
	
	return (minor.length - amountEquals) + (major.length - amountEquals);
}

public static Integer findNumber(List<Integer> numbers, int myNumber){
	Integer findedNumber = numbers.stream().filter(number -> number == myNumber).findAny().orElse(null);
	return findedNumber;
}
}
