class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        // adding 1 to first row[0] 
        result.get(0).add(1);


        for (int row = 1; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();
            // adding 1 to each start of new Row
            newRow.add(1);

            List<Integer> preRow = result.get(row - 1);
            
            for (int i = 1; i < row; i++) {
                newRow.add(preRow.get(i) + preRow.get(i - 1));
            }
            // adding 1 to each End of row
            newRow.add(1);

            result.add(newRow);
        }
        return result;   
    }
}