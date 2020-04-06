package ThirtyDaysChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * Input: ["eat","tea", "tan", "ate", "nat", "bat"], 
 * Output: [
 * ["ate","eat","tea"], ["nat","tan"], ["bat"] ] 
 * Note:
 * 
 * All inputs will be in lowercase. The order of your output does not matter.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(getAnagrams(new String[]{"eat","tea", "tan", "ate", "nat", "bat"}));

        System.out.println(getAnagrams(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"}));
    }

    public static List<List<String>> getAnagrams(String[] stringArr) {
        List<List<String>> response = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s:stringArr){
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String arrRep = new String(arr);
            if(map.containsKey(arrRep)){
                List<String> innerList = map.get(arrRep);
                innerList.add(s);
                map.put(arrRep,innerList);
            } else{
                List<String> innerList = new ArrayList<>();
                innerList.add(s);
                map.put(arrRep,innerList);
            }
        }

        map.forEach((k,v)->{
            response.add(v);
        });
       
        return response;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList>H = new HashMap<>();
         for(int i=0;i<strs.length;i++){
             char x[] = strs[i].toCharArray();
             Arrays.sort(x);
             String a = new String(x);
             if(H.containsKey(a)){
                 ArrayList<String>B = H.get(a);
                 B.add(strs[i]);
                 H.remove(a);
                 H.put(a,B);
             }
             else{
                 ArrayList<String>B = new ArrayList<>();
                 B.add(strs[i]);
                 H.put(a,B);
             }
         }
         List<List<String>>A = new LinkedList<>();
         for(String s: H.keySet()){
             List<String>B = H.get(s);
             A.add(B);
         }
         return A;
     }
}
