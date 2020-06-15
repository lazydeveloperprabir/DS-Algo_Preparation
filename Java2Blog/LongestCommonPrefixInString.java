/**
 * LongestCommonPrefixInString Algorithm 1. Find the Minimum length string 2.
 * Iterate over array of String and if we find any mismatch with minimum length
 * String, we break the loop and that index will give us longest common prefix
 * of this array of String,
 */
public class LongestCommonPrefixInString {

    public static void main(String[] args) {
        String[] strArr = { "java2blog", "javaworld", "javabean", "javatemp" };
        //String longestPrefix = getLongestCommonPrefix(strArr);
        //System.out.println("Longest Prefix : " + longestPrefix);

        System.out.println(longestCommonPrefix(strArr));
    }

    public static String getLongestCommonPrefix(String[] strArr) {
        if (strArr.length == 0)
            return "";
        // Find minimum length String
        String minStr = getMinString(strArr);

        int minPrefixStrLength = minStr.length();
        for (int i = 0; i < strArr.length; i++) {
            int j;
            for (j = 0; j < minPrefixStrLength; j++) {
                if (minStr.charAt(j) != strArr[i].charAt(j))
                    break;
            }
            if (j < minPrefixStrLength)
                minPrefixStrLength = j;
        }
        return minStr.substring(0, minPrefixStrLength);
    }

    public static String getMinString(String[] strArr) {
        String minStr = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() < minStr.length())
                minStr = strArr[i];
        }
        return minStr;
    }

    
    private static String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) {
            return " ";
        }
        
        String minString = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(minString) != 0) {
                minString = minString.substring(0, minString.length() - 1);
                if (minString.isEmpty())
                    return " ";
            }
        }
        return minString;
        
    }
}