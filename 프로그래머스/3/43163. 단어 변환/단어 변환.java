import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        Queue<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(begin, 0));

        boolean[] visited = new boolean[words.length];

        while (!queue.isEmpty()) {
            WordNode current = queue.poll();

            if (current.word.equals(target)) {
                return current.steps;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canTransform(current.word, words[i])) {
                    visited[i] = true;
                    queue.add(new WordNode(words[i], current.steps + 1));
                }
            }
        }

        return 0;
    }

    private boolean canTransform(String word1, String word2) {
        int diffCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }

        return diffCount == 1;
    }

    class WordNode {
        String word;
        int steps;

        WordNode(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

}