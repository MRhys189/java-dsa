package hackerrank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class IntegerContainer {

    public static void main(String[] args) {
        String[][] queries = {
            {"ADD", "1"},
            {"ADD", "2"},
            {"ADD", "5"},
            {"ADD", "2"},
            {"EXISTS", "2"},
            {"EXISTS", "5"},
            {"EXISTS", "1"},
            {"EXISTS", "4"},
            {"EXISTS", "3"},
            {"EXISTS", "0"}};
        
        solution(queries);
    }

    static String[] solution(String[][] queries) {
        List<String> storage = new ArrayList<>();
        List<String> solutionArray = new ArrayList<String>();
        for (int row = 0; row < queries.length; row++) {
            String[] command = queries[row];
            System.out.println(command[0] + " " + command[1]);
            boolean storageHasInt = checkIfStorageHasNumber(command[1], storage);
            if(!storageHasInt && command[0] == "ADD"){
                solutionArray.add("\"\"");
                System.out.println("Solution array: " + solutionArray);
                addNumber(command, storage);
            }
            else if (!storageHasInt && command[0] == "EXISTS"){
                solutionArray.add("\"false\"");
                System.out.println("Solution array: " + solutionArray);

            }
            else if (storageHasInt && command[0] == "ADD"){
                System.out.println("Solution array: " + solutionArray);
                solutionArray.add("\"\"");
            }
            else if (storageHasInt){
                System.out.println("Solution array: " + solutionArray);
                solutionArray.add("\"true\"");}
        }

        String[] solution = new String[solutionArray.size()];

        for (int i = 0; i < solutionArray.size(); i++) {
            solution[i] = solutionArray.get(i);
            System.out.println(solution[i]);
        };
        System.out.println(Arrays.toString(solution));
        return solution;
    }

    static List<String> addNumber(String[] command, List<String> storage) {
        if (storage.contains(command[1]))
            return storage;
        storage.add(command[1]);
        System.out.println(storage);
        return storage;
    }

    static Boolean checkIfStorageHasNumber(String val, List<String> storage) {
        // System.out.println("Checking storage if it has: " + val);
        if (storage.contains(val))
            return true;
        else
            return false;
    }



}


