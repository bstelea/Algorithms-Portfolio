# String Matching

This directory contains 3 example programs for performing string matching, i.e. finding the first index of a string in another string.

This task has been approached from 3 angles:
* A `Naive` approach (Bruteforce)
* Using the `Knuth-Morris-Pratt` algorithm
* Using the `Boyer-Moore-Horspool` algorithm

All three approaches prompt the user to input two strings, `T` and `P`, where `T` is the base string and `P` is the shorter string which is being sought in the `T` string.

## Naive Approach

The naive approach mathes the pattern string against the other string at each index. This approach is used in the [Naive.java](./Java/Naive.java) program.

### Runtime Complexity

The runtime complexity for this algorithm is `O(n**2)`, where `n = T.length()`

## Knuth-Morris-Pratt

The `Knuth-Morris-Pratt` algorithm takes advantage of the fact that is a `mismatch` occurs at index `q + 1` in the `Naive` approach, the first `q` characters of the `P` pattern match a subsequence in the `T` string.

The `Knuth-Morris-Pratt` matcher uses a prefix table, where the entries contain the index where the matching process needs to be restarted in case of a mismatch. The `qth` element in the prefix table for the string `P` is defined to be the length of the longes prefix of `P[:q + 1]` that is also a proper suffix of `P[:q + 1]`.

The `Knuth-Morris-Pratt` algorithm is implemented in the [KnuthMorrisPratt.java](./Java/KnuthMorrisPratt.java) file.

### Runtime Complexity

Assuming the prefix table is already precomputed, the `Knuth-Morris-Pratt` algorithm takes `O(n)`, where `n = T.length()`.

## Boyer-Moore-Horspool

The `Boyer-Moore-Horspool` algorithm uses the alphabet from the `T` string and `P` pattern to skip large distances. The comparisons start from the `end` of the pattern.

The `Boyer-Moore-Horspool` algorithm is implemented in the [BoyerMooreHorspool.java](./Java/BoyerMooreHorspool.java) file.

### Runtime Complexity

Worst case time complexity for the algorithm is `O(m * (n - m + 1))`. Best case time complexity for the algorithm is `O(Math.floor(n / m))`, where `n = T.length()`, and `m = P.length()`