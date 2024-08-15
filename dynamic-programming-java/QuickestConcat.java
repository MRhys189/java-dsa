import java.util.List;
import java.util.HashMap;
import java.lang.String;

class QuickestConcat {
    /**
     * Write a function, quickestConcat, that takes in a string and a vector of words as arguments. 
     * The function should return the minimum number of words needed to build the string by concatenating 
     * the words of the vector. You may use words of the vector as many times as needed.
     */
    public static void main(String[] args) {
        System.out.println(quickestConcat("caution", List.of("ca", "ion", "caut", "ut"))); //2
        System.out.println(quickestConcat("caution", List.of("ion", "caut", "caution"))); //1
        System.out.println(quickestConcat("respondorreact", List.of("re", "or", "spand", "act", "respond"))); //4
        System.out.println(quickestConcat("simchacindy", List.of("sim", "simcha", "acindy", "ch"))); //3
        System.out.println(quickestConcat("simchacindy", List.of("sim", "simcha", "acindy"))); //-1
        System.out.println(quickestConcat("uuuuuu", List.of("u", "uu", "uuu", "uuuu"))); //2
        System.out.println(quickestConcat("rongbetty", List.of("wrong", "bet")));//-1
        System.out.println(quickestConcat("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", List.of("u", "uu", "uuu", "uuuu", "uuuuu")));//7
    }

    private static int quickestConcat(String str, List<String> arr) {
        return quickestConcat(str, arr, new HashMap<String, Integer>());
    }

    private static int quickestConcat(String str, List<String> arr, HashMap<String, Integer> memo) {
        // base case
        if (str.length() == 0)
            return 0;
        
        if (memo.containsKey(str))
            return memo.get(str);
        
        
        int quickest = -1;

        for(String token: arr) {
            if (str.indexOf(token) == 0){
                String suffix = str.substring(token.length());
                int suffixCount = quickestConcat(suffix, arr, memo);

                if (suffixCount != -1){
                    int count = suffixCount + 1;
                    if (quickest == -1 || count < quickest){
                        quickest = count;
                    }
                }
                
            }
        }
        memo.put(str, quickest);
        return quickest;
    }
}