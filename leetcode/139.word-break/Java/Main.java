import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        
        System.out.println("The word: " + s);
        System.out.print("The wordlist: ");
        Iterator itr = wordDict.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();
        System.out.println("The final answer: " + sol.wordBreak(s, wordDict));
    }
}