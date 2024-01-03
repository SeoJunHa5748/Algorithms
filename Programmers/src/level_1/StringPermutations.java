package level_1;

import java.util.ArrayList;
import java.util.List;


public class StringPermutations {
    public static void main(String[] args) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        List<String> permutations = generatePermutations(arr);

        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(String[] arr) {
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        StringBuilder current = new StringBuilder();
        generatePermutationsHelper(arr, used, current, result);
        return result;
    }

    private static void generatePermutationsHelper(String[] arr, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == arr.length * arr[0].length()) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (!used[i]) {
                    used[i] = true;
                    current.append(arr[i].charAt(j));
                    generatePermutationsHelper(arr, used, current, result);
                    current.deleteCharAt(current.length() - 1);
                    used[i] = false;
                }
            }
        }
    }
}

