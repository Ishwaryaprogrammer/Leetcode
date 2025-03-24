class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map= new HashMap<>();
        for(String st:s1.split(" ")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(String st:s2.split(" ")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        List<String> res = new ArrayList<>();
        int z=0;
        for(String st:map.keySet()){
            if(map.get(st)==1){
                res.add(st);
            }
        }
         String[] result = res.toArray(new String[0]);
        return result;
    }
}