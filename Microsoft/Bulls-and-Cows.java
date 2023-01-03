// Q3 
// TIME - BEATS 92.94% 
// MEMORY - BEATS 85.88%
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] counts = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
            bulls++;
            } else {
            if (counts[s - '0']++ < 0) cows++;
            if (counts[g - '0']-- > 0) cows++;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
