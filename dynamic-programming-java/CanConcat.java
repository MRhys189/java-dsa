import java.util.List;
import java.lang.String;
import java.util.HashMap;


class CanConcat {
    /**
     * Write a function, canConcat, that takes in a string and a vector of words as arguments. 
     * The function should return boolean indicating whether or not it is possible to concatenate words 
     * of the vector together to form the string.You may reuse words of the vector as many times as needed.
     */
    public static void main(String[] args) {
        System.out.println(canConcat("oneisnone", List.of("is", "one", "n"))); //true
        System.out.println(canConcat("oneisnone", List.of("on", "e", "is"))); //false
        System.out.println(canConcat("oneisnone", List.of("on", "e", "is", "n"))); //true
        System.out.println(canConcat("foodisgood", List.of("is", "g", "ood", "f"))); //true
        System.out.println(canConcat("santahat", List.of("santah", "hat"))); //false
        System.out.println(canConcat("santahat", List.of("satah", "san", "hat", "tahat"))); //true
        System.out.println(canConcat("rrrrrrrrrrrrrrrrrrrrrrrrrrx", List.of("r", "rr", "rrr", "rrrr", "rrrrr", "rrrrrr"))); //false
        System.out.println(canConcat("fooisgood", List.of("foo", "is", "g", "ood", "f"))); //true
    }

    private static Boolean canConcat(String str, List<String> arr) {
        return canConcat(str,arr, new HashMap<String, Boolean>());
    }


    private static Boolean canConcat(String str, List<String> arr, HashMap<String, Boolean> memo) {
        // base case
        if (str.length() == 0)
            return true;

        if (memo.containsKey(str))
            return memo.get(str);
        
        for (String token: arr) {
            if(str.indexOf(token, 0) == 0){
                if(canConcat(str.substring(token.length()), arr, memo))
                    return true;
            }
        }
        return false; 
    }
}