import java.lang.String;
class OverlapSubSequence {
    /**
     * Write a function, overlapSubsequence, that takes in two strings as arguments. 
     * The function should return the length of the longest overlapping subsequence.
     * A subsequence of a string can be created by deleting any characters of the string, 
     * while maintaining the relative order of characters.
     */
    public static void main(String[] args) {
        System.out.println(overlapSubsequence("dogs", "daogt")); // 3
        System.out.println(overlapSubsequence("xcyats", "criaotsi")); // 4
        System.out.println(overlapSubsequence("xfeqortsver", "feeeuavoeqr")); // 5
        System.out.println(overlapSubsequence("kinfolklivemustache", "bespokekinfolksnackwave")); // 5

    }
    public static int overlapSubsequence(String subStr, String str) {
        return _overlapSubsequence(subStr, str, 0, 0);
    }

    public static int _overlapSubsequence(String subStr, String str, int subStrIdx, int strIdx) {
        // base case
        if (subStr.length() == subStrIdx || str.length() == strIdx)
            return 0;

        if (subStr.charAt(subStrIdx) == str.charAt(strIdx))
            return 1 + _overlapSubsequence(subStr, str, subStrIdx + 1, strIdx + 1);
        else
            return Math.max(_overlapSubsequence(subStr, str, subStrIdx + 1, strIdx),
                _overlapSubsequence(subStr, str, subStrIdx, strIdx + 1));
        
        
    }


}