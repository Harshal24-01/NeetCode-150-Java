class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);

        if (Arrays.equals(arr, arr1)) {
            return true;
        }
        return false;
    }
}