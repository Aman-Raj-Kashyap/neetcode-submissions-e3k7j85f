class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //O(2n) O(n)
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            String freq=getFrequency(str);
            if(!map.containsKey(freq)){
                map.put(freq,new ArrayList<>());
            }
            map.get(freq).add(str);
        }
        return new ArrayList<>(map.values());

        /*O(n.klogk) O(n.k)
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());*/
    }

    private String getFrequency(String str){
        Map<Character,Integer> map=new TreeMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }
}
