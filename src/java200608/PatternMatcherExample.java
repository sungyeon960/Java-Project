package java200608;
import java.util.regex.Pattern;

public class PatternMatcherExample {
	    public static void main(String[] args) {
	        String regId = "A5ngel1004";
	        String regex = "[a-zA-Z]\\w+{7,11}";
	        if(Pattern.matches(regex, regId))
	            System.out.println("사용 가능");
	        else
	            System.out.println("사용 불가능");
	    }
	}
