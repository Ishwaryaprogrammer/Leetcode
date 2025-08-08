class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            boolean b = true;
            int a = candies[i]+extraCandies;
            for(int j=0; j<candies.length; j++){
                if(a<candies[j]){
                    b=false;
                    break;
                }
            }
            li.add(b);
        }
        return li;
    }
}