package ThirtyDaysChallenge;

import java.util.Stack;

/*
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:
*/
public class BackspaceStringCompare {
    public static void main(String[] args) {

        System.out.println(compareBackspace("ab#c","ad#c"));
    }

    public static boolean compareBackspace(String s , String t) {
        return reducedString(s).equalsIgnoreCase(reducedString(t));
    }

    private static String reducedString(String S) {
        Stack<Character> q = new Stack<Character>();  
  
    for (int i = 0; i < S.length(); ++i)  
    {  
        if (S.charAt(i) != '#')  
            q.push(S.charAt(i));  
        else if (!q.isEmpty())  
            q.pop();  
    }  
  
    // build final string  
    String ans = "";  
  
    while (!q.isEmpty()) 
    {  
        ans += q.pop();  
    }  
  
    // return final string  
    String answer = ""; 
    for(int j = ans.length() - 1; j >= 0; j--) 
    { 
        answer += ans.charAt(j); 
    } 
    return answer;
    }



    public static boolean backspaceCompare(String s, String t) {
        int cntS = 0;
        int cntT=  0;
        int indexS = s.length() - 1;
        int indexT = t.length() - 1;
        while(indexS >= 0 || indexT >= 0){
            //System.out.println(indexS + " " + indexT);
            while(indexS >= 0 && (s.charAt(indexS) == '#' || cntS > 0)){
                if(s.charAt(indexS) == '#')
                    cntS ++;
                else
                    cntS--;
                indexS--;
            }
            while(indexT >= 0 && (t.charAt(indexT) == '#' || cntT > 0)){
                if(t.charAt(indexT) == '#')
                    cntT ++;
                else
                    cntT--;
                indexT--;
            }
            if(indexS == -1 && indexT == -1)
                return true;
            if(indexS == -1 || indexT == -1)
                return false;
            if(s.charAt(indexS) != t.charAt(indexT))
                return false;
            indexS--;
            indexT--;

        }
        
        return true;
    }
}