class Solution {
    public boolean isAnagram(String s, String t) {
        //optimized
        int[] arr=new int[26];
        for(char ch:s.toCharArray()) arr[ch-'a']++;
        for(char ch:t.toCharArray()) arr[ch-'a']--;

        for(int a:arr){
            if(a!=0) return false;
        }
        return true;

        /*O(n) O(n)
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0) return false;
        }
        return true;*/

        /* O(nlogn) O(n)
        if(s.length()!=t.length()) return false;
        char[] schar=s.toCharArray();
        Arrays.sort(schar);
        char[] tchar=t.toCharArray();
        Arrays.sort(tchar);

        for(int i=0;i<s.length();i++){
            if(schar[i]!=tchar[i]) return false;
        }
        return true;
        */
    }
}
