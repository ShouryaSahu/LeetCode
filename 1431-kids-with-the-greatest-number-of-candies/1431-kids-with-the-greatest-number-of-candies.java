class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candie : candies){
            if(candie > maxCandies){
                maxCandies = candie;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int candie : candies){
            int total = candie + extraCandies;
            if(total >= maxCandies) list.add(true);
            else list.add(false);
        }

        return list;

    }
}