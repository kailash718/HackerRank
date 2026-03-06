class Solution {
    public int lengthOfLastWord(String s) {;
        String remove=s.trim();
        String arr[]=remove.split(" ");
            return(arr[arr.length-1].length());
    }
}