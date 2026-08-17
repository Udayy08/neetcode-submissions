class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);


        return sorted.equals(sorted1);
    }
}
