# DSA Practice Repository

Welcome to my **Data Structures and Algorithms (DSA)** practice repository!
This repository showcases my hands-on efforts to learn and understand the core concepts of DSA. I've worked through various problems and implemented solutions to strengthen my foundational knowledge.

### Contents:
- Arrays
- Linked Lists
- Lists
- Other introductory data structures

This space is dedicated to personal growth, and every solution reflects my learning journey. Happy coding!

---

## DSA Patterns Cheat Sheet (Java)

Below are the **31 core problem-solving patterns** I'm using to structure my DSA learning. Each pattern includes:
- **Understanding** – what the pattern is and why it works
- **When to use it** – the signal / clue in a problem statement that points to this pattern
- **Recognize it by** – the "expected pattern" fingerprint (constraints, keywords, input shape)
- **Core Template (Java)** – the essential code segment (not a full solution) that captures the pattern's core logic
- **Example Problems** – classic problems to practice

### Table of Contents
1. [Prefix Sum](#1-prefix-sum)
2. [Two Pointers](#2-two-pointers)
3. [Sliding Window](#3-sliding-window)
4. [Modified Binary Search](#4-modified-binary-search)
5. [Bit Manipulation](#5-bit-manipulation)
6. [Hashing (Map & Set)](#6-hashing-map--set)
7. [Fast & Slow Pointer](#7-fast--slow-pointer)
8. [Linked List](#8-linked-list)
9. [Linked List In-Place Reversal](#9-linked-list-in-place-reversal)
10. [Stack](#10-stack)
11. [Queue & Deque](#11-queue--deque)
12. [Monotonic Stack](#12-monotonic-stack)
13. [Heap / Priority Queue](#13-heap--priority-queue)
14. [Top K Elements](#14-top-k-elements)
15. [Quick Select](#15-quick-select)
16. [Intervals](#16-intervals)
17. [Greedy](#17-greedy)
18. [Matrix Traversal](#18-matrix-traversal)
19. [Binary Tree Traversals](#19-binary-tree-traversals)
20. [DFS](#20-dfs)
21. [BFS](#21-bfs)
22. [Backtracking](#22-backtracking)
23. [Trie](#23-trie)
24. [Graph Traversal](#24-graph-traversal)
25. [Union Find (DSU)](#25-union-find-dsu)
26. [Topological Sort](#26-topological-sort)
27. [Shortest Path](#27-shortest-path)
28. [Minimum Spanning Tree](#28-minimum-spanning-tree)
29. [Dynamic Programming](#29-dynamic-programming)
30. [Segment Tree & Fenwick Tree](#30-segment-tree--fenwick-tree)
31. [String Algorithms (KMP, Z, Rabin-Karp)](#31-string-algorithms-kmp-z-algorithm-rabin-karp)
32. [Math & Number Theory](#32-math--number-theory)

---

### 1. Prefix Sum
**Understanding:** Precompute cumulative sums so any range-sum query becomes O(1) instead of O(n). `prefix[i] = arr[0] + ... + arr[i-1]`, so `sum(l, r) = prefix[r+1] - prefix[l]`.

**When to use it:** Repeated range-sum / range-count queries on a static (non-mutating) array; subarray-sum-equals-K problems; 2D region sums.

**Recognize it by:** "sum of subarray", "number of subarrays with sum = k", multiple range queries, immutable array.

**Core Template (Java):**
```java
int[] prefix = new int[n + 1];
for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + arr[i];
int rangeSum = prefix[r + 1] - prefix[l];

// Subarray sum equals K (prefix sum + hashmap)
Map<Integer, Integer> freq = new HashMap<>();
freq.put(0, 1);
int sum = 0, count = 0;
for (int x : arr) {
    sum += x;
    count += freq.getOrDefault(sum - k, 0);
    freq.merge(sum, 1, Integer::sum);
}
```
**Example Problems:** Subarray Sum Equals K, Range Sum Query - Immutable, Product of Array Except Self, Continuous Subarray Sum.

---

### 2. Two Pointers
**Understanding:** Two indices move through a (usually sorted) structure from opposite ends or at different speeds to avoid nested loops, reducing O(n²) to O(n).

**When to use it:** Sorted array/list; need pairs/triplets meeting a condition; comparing from both ends; in-place partitioning.

**Recognize it by:** "sorted array", "pair sum", "remove duplicates in place", "reverse in place", "palindrome check".

**Core Template (Java):**
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    int sum = arr[left] + arr[right];
    if (sum == target) { /* found */ break; }
    else if (sum < target) left++;
    else right--;
}
```
**Example Problems:** Two Sum II, 3Sum, Container With Most Water, Trapping Rain Water, Valid Palindrome.

---

### 3. Sliding Window
**Understanding:** Maintain a window `[left, right]` over a sequence and expand/shrink it incrementally instead of recomputing from scratch, turning O(n²) brute force into O(n).

**When to use it:** Contiguous subarray/substring problems with a size or condition constraint (max/min length, sum, distinct chars).

**Recognize it by:** "contiguous subarray/substring", "longest/shortest/at most K", "no repeating characters".

**Core Template (Java):**
```java
int left = 0, best = 0;
Map<Character, Integer> window = new HashMap<>();
for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    window.merge(c, 1, Integer::sum);
    while (/* window invalid, e.g. window.size() > k */ false) {
        char lc = s.charAt(left);
        window.merge(lc, -1, Integer::sum);
        if (window.get(lc) == 0) window.remove(lc);
        left++;
    }
    best = Math.max(best, right - left + 1);
}
```
**Example Problems:** Longest Substring Without Repeating Characters, Minimum Window Substring, Longest Repeating Character Replacement, Max Sliding Window.

---

### 4. Modified Binary Search
**Understanding:** Adapt classic binary search (halve the search space by comparing to a mid element) to answer questions beyond "find exact value" — rotated arrays, boundaries, or "search on the answer".

**When to use it:** Sorted (or partially sorted / rotated) array; monotonic predicate `f(x)` where you binary search on the *answer space*.

**Recognize it by:** "sorted", "rotated sorted array", "find minimum x such that...", "peak element", O(log n) requirement.

**Core Template (Java):**
```java
int lo = 0, hi = arr.length - 1;
while (lo <= hi) {
    int mid = lo + (hi - lo) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) lo = mid + 1;
    else hi = mid - 1;
}
// return -1 (not found) or lo (insertion point)

// Binary search on the answer
int binarySearchOnAnswer(int lo, int hi) {
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (feasible(mid)) hi = mid;
        else lo = mid + 1;
    }
    return lo;
}
```
**Example Problems:** Search in Rotated Sorted Array, Find Minimum in Rotated Sorted Array, Find Peak Element, Koko Eating Bananas, Median of Two Sorted Arrays.

---

### 5. Bit Manipulation
**Understanding:** Uses bitwise operators (`&`, `|`, `^`, `~`, `<<`, `>>`) to solve problems involving binary representations, often achieving O(1) space and fast constant-time checks.

**When to use it:** Finding unique/missing numbers, counting set bits, toggling states, subset generation, XOR tricks.

**Recognize it by:** "without extra space", "find the single/missing number", "power of two", "subsets via bitmask".

**Core Template (Java):**
```java
// XOR cancels out duplicate pairs -> finds the single number
int single = 0;
for (int x : nums) single ^= x;

// Check / set / clear / toggle bit i
boolean isSet = (num & (1 << i)) != 0;
num |= (1 << i);      // set
num &= ~(1 << i);     // clear
num ^= (1 << i);      // toggle

// Count set bits (Brian Kernighan)
int count = 0;
while (num != 0) { num &= (num - 1); count++; }

// Iterate all subsets using a bitmask
for (int mask = 0; mask < (1 << n); mask++) {
    for (int i = 0; i < n; i++) if ((mask & (1 << i)) != 0) { /* i is in subset */ }
}
```
**Example Problems:** Single Number, Number of 1 Bits, Counting Bits, Sum of Two Integers, Subsets via Bitmask.

---

### 6. Hashing (Map & Set)
**Understanding:** A HashMap/HashSet gives O(1) average lookup/insert, trading space for time to avoid nested loops or repeated scans.

**When to use it:** Need fast membership checks, frequency counting, grouping, or complement lookups.

**Recognize it by:** "have you seen this before", "count occurrences", "group by", "complement/pair exists".

**Core Template (Java):**
```java
// Frequency map
Map<Integer, Integer> freq = new HashMap<>();
for (int x : nums) freq.merge(x, 1, Integer::sum);

// Complement lookup (Two Sum)
Map<Integer, Integer> seen = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int need = target - nums[i];
    if (seen.containsKey(need)) return new int[]{seen.get(need), i};
    seen.put(nums[i], i);
}

// Grouping (Anagrams)
Map<String, List<String>> groups = new HashMap<>();
for (String s : strs) {
    char[] c = s.toCharArray(); Arrays.sort(c);
    groups.computeIfAbsent(new String(c), k -> new ArrayList<>()).add(s);
}
```
**Example Problems:** Two Sum, Group Anagrams, Longest Consecutive Sequence, Contains Duplicate, Valid Anagram.

---

### 7. Fast & Slow Pointer
**Understanding:** Two pointers traverse a sequence/linked list at different speeds (typically 1x and 2x). If there's a cycle, they must meet; the meeting point also reveals structural info (cycle start, middle node).

**When to use it:** Cycle detection, finding the middle of a linked list, detecting duplicate numbers via implicit linked list.

**Recognize it by:** "linked list has a cycle", "find the middle", "detect duplicate number without extra space" (Floyd's).

**Core Template (Java):**
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) { /* cycle detected */ break; }
}
// To find cycle start: reset one pointer to head, move both 1 step at a time
```
**Example Problems:** Linked List Cycle, Linked List Cycle II, Find the Duplicate Number, Middle of the Linked List, Happy Number.

---

### 8. Linked List
**Understanding:** A chain of nodes linked via `next` pointers; operations rely on careful pointer manipulation, often using a **dummy head** to simplify edge cases.

**When to use it:** Any problem stated directly on `ListNode` structures — insertion, deletion, merging, reordering.

**Recognize it by:** Problem gives `ListNode` / singly/doubly linked list as input.

**Core Template (Java):**
```java
ListNode dummy = new ListNode(0, head);
ListNode prev = dummy, curr = head;
while (curr != null) {
    // example: remove nodes matching a condition
    if (curr.val == target) prev.next = curr.next;
    else prev = curr;
    curr = curr.next;
}
return dummy.next;

// Merge two sorted lists
ListNode mergeDummy = new ListNode(-1), tail = mergeDummy;
while (l1 != null && l2 != null) {
    if (l1.val <= l2.val) { tail.next = l1; l1 = l1.next; }
    else { tail.next = l2; l2 = l2.next; }
    tail = tail.next;
}
tail.next = (l1 != null) ? l1 : l2;
```
**Example Problems:** Merge Two Sorted Lists, Remove Nth Node From End, Add Two Numbers, Copy List with Random Pointer.

---

### 9. Linked List In-Place Reversal
**Understanding:** Reverse (all or part of) a linked list using O(1) extra space by rewiring `next` pointers with a `prev / curr / next` triple as you walk the list.

**When to use it:** "Reverse the list", "reverse in groups of k", "reverse between positions m and n" without extra memory.

**Recognize it by:** "in place", "O(1) space", "reverse a linked list / sublist / k-group".

**Core Template (Java):**
```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode next = curr.next; // store next
    curr.next = prev;          // reverse pointer
    prev = curr;                // advance prev
    curr = next;                // advance curr
}
return prev; // new head
```
**Example Problems:** Reverse Linked List, Reverse Linked List II, Reverse Nodes in k-Group, Swap Nodes in Pairs, Palindrome Linked List.

---

### 10. Stack
**Understanding:** LIFO structure; excellent for tracking nested/most-recent state — matching pairs, undo history, expression evaluation, DFS iterative simulation.

**When to use it:** Nested structures (parentheses, brackets), "most recent unmatched element", expression parsing.

**Recognize it by:** "valid parentheses", "evaluate expression", "nested", "undo/redo".

**Core Template (Java):**
```java
Deque<Character> stack = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    if (isOpening(c)) stack.push(c);
    else {
        if (stack.isEmpty() || !matches(stack.pop(), c)) return false;
    }
}
return stack.isEmpty();
```
**Example Problems:** Valid Parentheses, Min Stack, Evaluate Reverse Polish Notation, Daily Temperatures, Basic Calculator.

---

### 11. Queue & Deque
**Understanding:** FIFO structure (Queue) or double-ended structure (Deque) supporting push/pop from both ends — the backbone of BFS and sliding-window-max problems.

**When to use it:** Level-order processing, need to add/remove from both front and back, BFS traversal.

**Recognize it by:** "level order", "process in order added", "sliding window maximum".

**Core Template (Java):**
```java
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}

// Deque as sliding window
Deque<Integer> dq = new ArrayDeque<>(); // stores indices
dq.offerFirst(0); dq.pollLast(); dq.peekFirst();
```
**Example Problems:** Binary Tree Level Order Traversal, Sliding Window Maximum, Design Circular Queue, Rotting Oranges.

---

### 12. Monotonic Stack
**Understanding:** A stack kept in strictly increasing or decreasing order. When a new element violates the order, pop elements — the popped element's answer (e.g. "next greater element") is resolved by the current element.

**When to use it:** "Next greater/smaller element", "largest rectangle in histogram", "daily temperatures".

**Recognize it by:** Need the nearest element to the left/right that is greater/smaller than current; O(n) required over O(n²) brute force.

**Core Template (Java):**
```java
Deque<Integer> stack = new ArrayDeque<>(); // stores indices
int[] result = new int[n];
for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        int idx = stack.pop();
        result[idx] = i - idx; // e.g. distance to next greater element
    }
    stack.push(i);
}
```
**Example Problems:** Daily Temperatures, Next Greater Element I/II, Largest Rectangle in Histogram, Trapping Rain Water.

---

### 13. Heap / Priority Queue
**Understanding:** A binary heap keeps the min (or max) element accessible in O(1), with O(log n) insert/remove — ideal when you repeatedly need the "current best" element.

**When to use it:** Need running min/max, merge k sorted lists, scheduling by priority.

**Recognize it by:** "kth largest/smallest (streaming)", "merge k sorted", "task scheduler", "median of a stream".

**Core Template (Java):**
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();               // natural order
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<int[]> byFirst = new PriorityQueue<>((a, b) -> a[0] - b[0]);

minHeap.offer(x);
int smallest = minHeap.poll();

// Two-heap median-of-stream pattern
PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
PriorityQueue<Integer> hi = new PriorityQueue<>();                          // min-heap
```
**Example Problems:** Kth Largest Element in a Stream, Merge K Sorted Lists, Find Median from Data Stream, Task Scheduler.

---

### 14. Top K Elements
**Understanding:** Maintain a heap of bounded size K (or use Quick Select) so you never need to fully sort — O(n log k) instead of O(n log n).

**When to use it:** "Top/most frequent K elements", "kth largest/smallest (static array)".

**Recognize it by:** Explicit "K" in the problem, only care about a small subset of extremes.

**Core Template (Java):**
```java
PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]); // [value, freq]
for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
    minHeap.offer(new int[]{e.getKey(), e.getValue()});
    if (minHeap.size() > k) minHeap.poll(); // evict smallest
}
```
**Example Problems:** Top K Frequent Elements, Kth Largest Element in an Array, K Closest Points to Origin.

---

### 15. Quick Select
**Understanding:** A variant of Quicksort's partition step that recurses into only *one* side, finding the kth order statistic in average O(n) time without fully sorting.

**When to use it:** "Kth largest/smallest" in a static array when average O(n) is desired over heap's O(n log k).

**Recognize it by:** "find the kth largest/smallest element", no need for the full sorted order.

**Core Template (Java):**
```java
int quickSelect(int[] nums, int lo, int hi, int k) { // k = 0-indexed target rank
    int pivot = nums[hi], p = lo;
    for (int i = lo; i < hi; i++) {
        if (nums[i] < pivot) { swap(nums, i, p); p++; }
    }
    swap(nums, p, hi);
    if (p == k) return nums[p];
    else if (p < k) return quickSelect(nums, p + 1, hi, k);
    else return quickSelect(nums, lo, p - 1, k);
}
```
**Example Problems:** Kth Largest Element in an Array, K Closest Points to Origin, Wiggle Sort II.

---

### 16. Intervals
**Understanding:** Sort intervals (usually by start time), then sweep once, merging/comparing adjacent intervals to detect overlap, merge ranges, or insert new ranges.

**When to use it:** Meeting rooms, merging ranges, inserting an interval into a sorted set.

**Recognize it by:** Input is `[start, end]` pairs; "overlapping", "merge", "free time", "minimum rooms".

**Core Template (Java):**
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> merged = new ArrayList<>();
for (int[] curr : intervals) {
    if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < curr[0]) {
        merged.add(curr);
    } else {
        merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], curr[1]);
    }
}
```
**Example Problems:** Merge Intervals, Insert Interval, Non-overlapping Intervals, Meeting Rooms II.

---

### 17. Greedy
**Understanding:** Make the locally optimal choice at each step, trusting (with proof) that it leads to a globally optimal solution — no backtracking needed.

**When to use it:** Problem has an "exchange argument" or matroid-like structure; optimal substructure without needing to explore all options.

**Recognize it by:** "maximum/minimum ... choose at each step", scheduling/interval problems, "can you reach the end".

**Core Template (Java):**
```java
// Generic greedy skeleton: sort by a key, then sweep making the best local choice
Arrays.sort(items, (a, b) -> a.key - b.key);
int result = 0, state = initialState;
for (Item item : items) {
    if (feasible(state, item)) { state = update(state, item); result++; }
}
```
**Example Problems:** Jump Game, Gas Station, Task Scheduler, Non-overlapping Intervals, Candy.

---

### 18. Matrix Traversal
**Understanding:** Treat a 2D grid as an implicit graph; visit cells via DFS/BFS/row-col scanning while tracking visited state, often with the 4-directional (or 8-directional) delta array.

**When to use it:** Grid/board problems — islands, flood fill, shortest path on a grid, spiral traversal.

**Recognize it by:** Input is `int[][]` / `char[][]` grid; "islands", "flood fill", "shortest path in grid", "spiral order".

**Core Template (Java):**
```java
int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
boolean[][] visited = new boolean[rows][cols];

void dfs(int r, int c) {
    if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || grid[r][c] == 0) return;
    visited[r][c] = true;
    for (int[] d : dirs) dfs(r + d[0], c + d[1]);
}
```
**Example Problems:** Number of Islands, Flood Fill, Rotting Oranges, Spiral Matrix, Word Search.

---

### 19. Binary Tree Traversals
**Understanding:** Systematically visit every node — Pre-order (root, left, right), In-order (left, root, right — sorted for BSTs), Post-order (left, right, root), and Level-order (BFS by depth).

**When to use it:** Any tree problem needing node ordering, subtree aggregation, or serialization.

**Recognize it by:** Problem gives `TreeNode`; "traverse", "serialize", "validate BST", "path sum".

**Core Template (Java):**
```java
void inorder(TreeNode node, List<Integer> out) {
    if (node == null) return;
    inorder(node.left, out);
    out.add(node.val);
    inorder(node.right, out);
}
// swap the three lines' order for preorder / postorder

// Iterative in-order with an explicit stack
Deque<TreeNode> stack = new ArrayDeque<>();
TreeNode curr = root;
while (curr != null || !stack.isEmpty()) {
    while (curr != null) { stack.push(curr); curr = curr.left; }
    curr = stack.pop();
    // process curr.val
    curr = curr.right;
}
```
**Example Problems:** Binary Tree Inorder Traversal, Validate BST, Diameter of Binary Tree, Lowest Common Ancestor, Serialize/Deserialize Binary Tree.

---

### 20. DFS
**Understanding:** Explore as deep as possible along one branch before backtracking, using recursion (implicit stack) or an explicit stack. General-purpose for trees, graphs, and grids.

**When to use it:** Need to explore full paths, connected components, or exhaustively search branches.

**Recognize it by:** "explore all paths", "connected component", "is there a path from A to B", tree/graph recursion.

**Core Template (Java):**
```java
void dfs(int node, Set<Integer> visited, Map<Integer, List<Integer>> graph) {
    if (visited.contains(node)) return;
    visited.add(node);
    for (int neighbor : graph.getOrDefault(node, List.of())) {
        dfs(neighbor, visited, graph);
    }
}
```
**Example Problems:** Number of Provinces, Course Schedule, Clone Graph, Max Area of Island, Path Sum.

---

### 21. BFS
**Understanding:** Explore level by level using a queue, guaranteeing the shortest path in an unweighted graph the first time a node is reached.

**When to use it:** Shortest path / minimum steps in unweighted graphs or grids, level-order tree traversal.

**Recognize it by:** "shortest path", "minimum number of steps/moves", "level order", unweighted edges.

**Core Template (Java):**
```java
Queue<Integer> queue = new LinkedList<>();
Set<Integer> visited = new HashSet<>();
queue.offer(start); visited.add(start);
int steps = 0;
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        int node = queue.poll();
        if (node == target) return steps;
        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) { visited.add(neighbor); queue.offer(neighbor); }
        }
    }
    steps++;
}
```
**Example Problems:** Word Ladder, Rotting Oranges, Shortest Path in Binary Matrix, Open the Lock, 01 Matrix.

---

### 22. Backtracking
**Understanding:** DFS + explicit "choose → explore → un-choose" — build a partial solution, recurse, and undo the choice to try the next branch, pruning invalid paths early.

**When to use it:** Need *all* valid combinations/permutations/subsets, or constraint satisfaction (N-Queens, Sudoku).

**Recognize it by:** "generate all", "find all possible", "permutations/combinations/subsets", puzzle solving.

**Core Template (Java):**
```java
void backtrack(List<Integer> path, int start, int[] nums, List<List<Integer>> result) {
    result.add(new ArrayList<>(path)); // record current state (for subsets)
    for (int i = start; i < nums.length; i++) {
        path.add(nums[i]);              // choose
        backtrack(path, i + 1, nums, result); // explore
        path.remove(path.size() - 1);   // un-choose
    }
}
```
**Example Problems:** Subsets, Permutations, Combination Sum, N-Queens, Word Search, Sudoku Solver.

---

### 23. Trie
**Understanding:** A prefix tree where each node represents a character; shared prefixes share nodes, enabling O(L) prefix/word lookup where L is word length.

**When to use it:** Prefix search, autocomplete, word dictionary with wildcard search.

**Recognize it by:** "prefix", "autocomplete", "search word with wildcard", many words sharing prefixes.

**Core Template (Java):**
```java
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false;
}

void insert(TrieNode root, String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        node = node.children.computeIfAbsent(c, k -> new TrieNode());
    }
    node.isEnd = true;
}

boolean search(TrieNode root, String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        node = node.children.get(c);
        if (node == null) return false;
    }
    return node.isEnd;
}
```
**Example Problems:** Implement Trie, Word Search II, Design Add and Search Words, Longest Word in Dictionary.

---

### 24. Graph Traversal
**Understanding:** Represent relationships as nodes + edges (adjacency list/matrix) and systematically visit them via DFS/BFS to answer connectivity, reachability, or component questions.

**When to use it:** Any problem framed as nodes and relationships — social networks, dependency graphs, maps.

**Recognize it by:** Explicit "graph", "nodes and edges", adjacency list/matrix input.

**Core Template (Java):**
```java
Map<Integer, List<Integer>> graph = new HashMap<>();
for (int[] edge : edges) {
    graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
    graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]); // if undirected
}
// then run DFS or BFS (see patterns #20 / #21) over `graph`
```
**Example Problems:** Number of Connected Components, Clone Graph, Course Schedule, Pacific Atlantic Water Flow.

---

### 25. Union Find (DSU)
**Understanding:** Disjoint Set Union maintains groups of connected elements with near O(1) `find` (with path compression) and `union` (by rank/size) — efficient for dynamic connectivity.

**When to use it:** Dynamically merging groups and querying connectivity; cycle detection in undirected graphs; Kruskal's MST.

**Recognize it by:** "connected components (dynamic)", "redundant connection", "accounts merge", "number of provinces".

**Core Template (Java):**
```java
int[] parent, rank_;
int find(int x) {
    if (parent[x] != x) parent[x] = find(parent[x]); // path compression
    return parent[x];
}
boolean union(int x, int y) {
    int rx = find(x), ry = find(y);
    if (rx == ry) return false; // already connected -> cycle
    if (rank_[rx] < rank_[ry]) { int t = rx; rx = ry; ry = t; }
    parent[ry] = rx;
    if (rank_[rx] == rank_[ry]) rank_[rx]++;
    return true;
}
```
**Example Problems:** Number of Provinces, Redundant Connection, Accounts Merge, Graph Valid Tree, Kruskal's MST.

---

### 26. Topological Sort
**Understanding:** Linear ordering of nodes in a DAG such that every directed edge `u → v` places `u` before `v`. Computed via Kahn's algorithm (BFS + in-degree) or DFS post-order reversal.

**When to use it:** Task scheduling with prerequisites/dependencies; detecting cycles in a directed graph.

**Recognize it by:** "prerequisites", "build order", "course schedule", directed dependency edges.

**Core Template (Java):**
```java
int[] indegree = new int[n];
Map<Integer, List<Integer>> graph = new HashMap<>();
for (int[] edge : edges) { // edge = [from, to]
    graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
    indegree[edge[1]]++;
}
Queue<Integer> queue = new LinkedList<>();
for (int i = 0; i < n; i++) if (indegree[i] == 0) queue.offer(i);

List<Integer> order = new ArrayList<>();
while (!queue.isEmpty()) {
    int node = queue.poll();
    order.add(node);
    for (int next : graph.getOrDefault(node, List.of())) {
        if (--indegree[next] == 0) queue.offer(next);
    }
}
// if order.size() < n -> cycle exists, no valid topological order
```
**Example Problems:** Course Schedule I/II, Alien Dictionary, Sequence Reconstruction.

---

### 27. Shortest Path
**Understanding:** Find the minimum-cost path between nodes. BFS solves unweighted graphs; **Dijkstra** solves non-negative weighted graphs; **Bellman-Ford** handles negative weights; **Floyd-Warshall** computes all-pairs shortest paths.

**When to use it:** Weighted graph, "minimum cost/distance to reach", network delay time.

**Recognize it by:** Edges have weights/costs; "cheapest", "minimum cost", "shortest time".

**Core Template (Java):**
```java
// Dijkstra's algorithm
int[] dist = new int[n]; Arrays.fill(dist, Integer.MAX_VALUE);
dist[src] = 0;
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); // [node, dist]
pq.offer(new int[]{src, 0});
while (!pq.isEmpty()) {
    int[] curr = pq.poll();
    int node = curr[0], d = curr[1];
    if (d > dist[node]) continue; // stale entry
    for (int[] edge : graph.get(node)) { // edge = [neighbor, weight]
        int nd = d + edge[1];
        if (nd < dist[edge[0]]) { dist[edge[0]] = nd; pq.offer(new int[]{edge[0], nd}); }
    }
}
```
**Example Problems:** Network Delay Time, Cheapest Flights Within K Stops, Path With Minimum Effort, Floyd-Warshall All-Pairs.

---

### 28. Minimum Spanning Tree
**Understanding:** A subset of edges connecting all nodes with minimum total weight and no cycles. **Kruskal's** sorts edges + Union-Find; **Prim's** grows the tree greedily with a min-heap.

**When to use it:** Connect all nodes at minimum total cost, network design problems.

**Recognize it by:** "connect all points/cities at minimum cost", "minimum cost to connect all nodes".

**Core Template (Java):**
```java
// Kruskal's algorithm
Arrays.sort(edges, (a, b) -> a[2] - b[2]); // sort by weight
int mstWeight = 0, edgesUsed = 0;
for (int[] edge : edges) { // edge = [u, v, weight]
    if (union(edge[0], edge[1])) { // from Union-Find (#25)
        mstWeight += edge[2];
        edgesUsed++;
        if (edgesUsed == n - 1) break;
    }
}
```
**Example Problems:** Min Cost to Connect All Points, Connecting Cities With Minimum Cost, Optimize Water Distribution.

---

### 29. Dynamic Programming
**Understanding:** Break a problem into overlapping subproblems, solve each once, and cache the result (memoization = top-down, tabulation = bottom-up) to avoid exponential recomputation. Requires optimal substructure.

**When to use it:** "Maximum/minimum/count the number of ways", choices with overlapping subproblems, optimization over sequences/grids.

**Recognize it by:** Brute force naturally recurses but recomputes the same state repeatedly; keywords "number of ways", "min/max cost to...".

**Core Template (Java):**
```java
// Top-down memoization
Map<Integer, Integer> memo = new HashMap<>();
int solve(int state) {
    if (base case) return baseValue;
    if (memo.containsKey(state)) return memo.get(state);
    int result = /* combine solve(subState1), solve(subState2), ... */ 0;
    memo.put(state, result);
    return result;
}

// Bottom-up tabulation (1D example: climbing stairs style)
int[] dp = new int[n + 1];
dp[0] = 1; dp[1] = 1;
for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];

// 2D DP (e.g. Longest Common Subsequence)
int[][] dp2 = new int[m + 1][n + 1];
for (int i = 1; i <= m; i++)
    for (int j = 1; j <= n; j++)
        dp2[i][j] = (a.charAt(i-1) == b.charAt(j-1))
            ? dp2[i-1][j-1] + 1
            : Math.max(dp2[i-1][j], dp2[i][j-1]);
```
**Example Problems:** Climbing Stairs, House Robber, Longest Common Subsequence, 0/1 Knapsack, Coin Change, Edit Distance, Longest Increasing Subsequence.

---

### 30. Segment Tree & Fenwick Tree
**Understanding:** Trees that support O(log n) range queries (sum/min/max) **and** point/range updates on a mutable array — Fenwick (Binary Indexed Tree) is a compact variant for prefix sums; Segment Tree is more general.

**When to use it:** Array is mutable AND you need repeated range queries — prefix sum alone breaks once updates happen.

**Recognize it by:** "range sum/min/max query" combined with "update element" in the same problem.

**Core Template (Java):**
```java
// Fenwick Tree (Binary Indexed Tree) - 1-indexed
int[] tree; int n;
void update(int i, int delta) {
    for (; i <= n; i += i & (-i)) tree[i] += delta;
}
int query(int i) { // prefix sum [1..i]
    int sum = 0;
    for (; i > 0; i -= i & (-i)) sum += tree[i];
    return sum;
}
int rangeSum(int l, int r) { return query(r) - query(l - 1); }

// Segment Tree (recursive, sum variant)
int[] seg;
void build(int[] arr, int node, int start, int end) {
    if (start == end) { seg[node] = arr[start]; return; }
    int mid = (start + end) / 2;
    build(arr, 2*node, start, mid);
    build(arr, 2*node+1, mid+1, end);
    seg[node] = seg[2*node] + seg[2*node+1];
}
```
**Example Problems:** Range Sum Query - Mutable, Range Sum Query 2D, Count of Smaller Numbers After Self, Falling Squares.

---

### 31. String Algorithms (KMP, Z Algorithm, Rabin-Karp)
**Understanding:** Specialized linear-time string matching / pattern-search algorithms that avoid the O(n·m) naive comparison:
- **KMP** builds a "longest proper prefix-suffix" (LPS) table to skip re-comparisons on mismatch.
- **Z-Algorithm** computes, for each index, the length of the longest substring starting there that matches the prefix.
- **Rabin-Karp** uses rolling hashes to compare substrings in O(1) after O(n) preprocessing.

**When to use it:** Exact pattern matching in text, finding all occurrences, string periodicity, plagiarism/substring detection at scale.

**Recognize it by:** "find all occurrences of pattern in text", "shortest repeating substring", large text with many pattern searches.

**Core Template (Java):**
```java
// KMP - build LPS (failure) array
int[] buildLPS(String pat) {
    int[] lps = new int[pat.length()];
    int len = 0, i = 1;
    while (i < pat.length()) {
        if (pat.charAt(i) == pat.charAt(len)) { lps[i++] = ++len; }
        else if (len > 0) len = lps[len - 1];
        else lps[i++] = 0;
    }
    return lps;
}
// Then scan text with two pointers using lps[] to skip on mismatch.

// Rabin-Karp - rolling hash
long hash = 0, power = 1, base = 31, mod = 1_000_000_007L;
for (char c : pattern.toCharArray()) hash = (hash * base + c) % mod;
// slide window over text, recompute hash in O(1) per step, compare hash then verify chars
```
**Example Problems:** Implement strStr() / Find the Index of the First Occurrence, Repeated String Match, Shortest Palindrome, Longest Happy Prefix.

---

### 32. Math & Number Theory
**Understanding:** Covers GCD/LCM, primality testing (Sieve of Eratosthenes), modular arithmetic (mod inverse, fast exponentiation), and combinatorics — foundational tools that show up inside other patterns.

**When to use it:** Problems explicitly about divisibility, primes, combinatorics, or requiring results "modulo 10^9+7".

**Recognize it by:** "modulo", "prime", "GCD/LCM", "number of ways" combined with huge input bounds (needs O(n log log n) sieve or O(log n) fast power).

**Core Template (Java):**
```java
// GCD / LCM
int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
int lcm(int a, int b) { return a / gcd(a, b) * b; }

// Sieve of Eratosthenes
boolean[] isComposite = new boolean[n + 1];
for (int i = 2; (long) i * i <= n; i++) {
    if (!isComposite[i]) {
        for (int j = i * i; j <= n; j += i) isComposite[j] = true;
    }
}

// Fast modular exponentiation
long modPow(long base, long exp, long mod) {
    long result = 1; base %= mod;
    while (exp > 0) {
        if ((exp & 1) == 1) result = result * base % mod;
        base = base * base % mod;
        exp >>= 1;
    }
    return result;
}
```
**Example Problems:** Count Primes, Greatest Common Divisor of Strings, Pow(x, n), Unique Paths, Nth Digit.

---

## How to Use This Cheat Sheet

1. **Recognize** — read the "Recognize it by" clue for each pattern to map a new problem to the right bucket.
2. **Recall** — pull up the Core Template and adapt variable names/conditions to the specific problem.
3. **Practice** — solve 3–5 problems per pattern before moving to the next; revisit patterns after 1 week (spaced repetition).
4. **Combine** — many real interview problems stack two patterns (e.g. Sliding Window + Hashing, DFS + Backtracking, BFS + Topological Sort). Don't expect every problem to be a single pure pattern.

---

*This cheat sheet is a living document — as I solve more problems, I'll refine the templates and add edge cases I discover along the way.*