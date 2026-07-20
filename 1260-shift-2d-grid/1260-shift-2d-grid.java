class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;

        // convert grid into list
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                list.add(grid[i][j]);
            }
        }

        int total = list.size();
        k = k % total;  // Agr total 9 element hai toh 9 ke baad shifting apne aap reduce ho jayega like exactly 9 shifts, grid wapas original position me aa jayegi.  Har total shifts ke baad grid cycle complete kar leti hai. {effective shifts = remainder}


        // shifting the list.....
        for(int i = 0 ; i < k ; i++){
            int lastElement = list.get(total - 1);
            list.remove(total - 1);
            list.add(0, lastElement);
        }


        // convert again into 2D Grid...
         List<List<Integer>> answer = new ArrayList<>();

         int index = 0; // accessing element of list 

        for(int i = 0 ; i < rows ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j < cols; j++){
                row.add(list.get(index));
                index++;
            }
            answer.add(row);
        }

        return answer;
    }
}