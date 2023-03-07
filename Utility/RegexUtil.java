package Utility;

import java.util.regex.Pattern;

public class RegexUtil {
	

		    public boolean isStartWithCapitalLatter(String input) {
		        boolean checkCondition = Pattern.matches(ERegexPattern.FIRST_NAME_PATTERN.getValue(), input);
		        if (checkCondition == false) {
		            System.out.println();
		            
		            System.out.println("Enter the first Word in first name should be capital");
		        }

		        return checkCondition;
		    }

		    public boolean isCheckMobileNumber(String input) {
		        boolean checkCondition = Pattern.matches(ERegexPattern.MOBILE_NO_PATTERN.getValue(), input);
		        if (checkCondition == false) {
		            System.out.println();
		       
		            System.out.println("Enter the Propar Number");
		         
		        }

		        return checkCondition;
		    }

		    public boolean isCheckEmailId(String input) {
		        boolean checkCondition = Pattern.matches(ERegexPattern.Email_ID_PATTERN.getValue(), input);
		        if (checkCondition == false) {
		            System.out.println();
		       
		            System.out.println("Enter the first Word in first name should be capital");

		        }

		        return checkCondition;
		    }
		}

