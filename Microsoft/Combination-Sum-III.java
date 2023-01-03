// Q2
// Runtime (0 ms) Beats 100%
// Memory (39.7 MB) Beats 93.98%
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
  List<List<Integer>> combinations = new ArrayList<>();

  if (k == 0 || n <= 0 || n > 45) {
    // k must be positive and n must be within the range 1 to 45
    return combinations;
  }

  List<Integer> combination = new ArrayList<>();
  combinationSum3Backtracking(k, n, 1, combination, combinations);

  return combinations;
}

void combinationSum3Backtracking(int k, int n, int start, List<Integer> combination, List<List<Integer>> combinations) {
  if (n == 0 && k == 0) {
    // found a valid combination
    combinations.add(new ArrayList<>(combination));
  } else {
    for (int i = start; i <= 9; i++) {
      if (n - i >= 0 && k > 0) {
        combination.add(i);
        combinationSum3Backtracking(k - 1, n - i, i + 1, combination, combinations);
        combination.remove(combination.size() - 1);
      }
    }
  }
}

}
