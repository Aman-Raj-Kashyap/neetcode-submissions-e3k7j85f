class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;

            List<String> group=new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;

            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }

    public boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;

        int[] arr=new int[26];
        for(char ch:s1.toCharArray()) arr[ch-'a']++;
        for(char ch:s2.toCharArray()) arr[ch-'a']--;

        for(int a:arr){
            if(a!=0) return false;
        }
        return true;
    }
}
