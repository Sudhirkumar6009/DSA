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

Below are the 24 core problem-solving patterns I'm using to structure my DSA learning. Each pattern includes a short explanation, when to reach for it, and the essential code segment (not a full solution) that captures the pattern's core logic.

---

### 1. Bit Manipulation

**Understanding:** Uses bitwise operators (`&`, `|`, `^`, `~`, `<<`, `>>`) to solve problems involving binary representations, often achieving O(1) space and fast constant-time checks.

**Example use case:** Checking if a number is a power of two, counting set bits, finding a single non-duplicate number in an array.

```java
boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

---

### 2. Prefix Sum

**Understanding:** Precomputes cumulative sums so that the sum of any subarray can be calculated in O(1) instead of recomputing it every time.

**Example use case:** Range sum queries, subarray sum equals K.

```java
int[] prefix = new int[nums.length + 1];
for (int i = 0; i < nums.length; i++) {
    prefix[i + 1] = prefix[i] + nums[i];
}
// sum of range [l, r] = prefix[r + 1] - prefix[l]
```

---

### 3. Two Pointer

**Understanding:** Uses two indices moving toward each other (or in the same direction) over a sorted or linear structure to avoid nested loops.

**Example use case:** Pair with target sum in a sorted array, removing duplicates in-place.

```java
int left = 0, right = arr.length - 1;
while (left < right) {
    int sum = arr[left] + arr[right];
    if (sum == target) return new int[]{left, right};
    else if (sum < target) left++;
    else right--;
}
```

---

### 4. Fast & Slow Pointer

**Understanding:** Also called Floyd's cycle detection. Two pointers move at different speeds through a sequence (usually a linked list) to detect cycles or find midpoints.

**Example use case:** Detecting a cycle in a linked list, finding the middle node.

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true; // cycle detected
}
return false;
```

---

### 5. Sliding Window

**Understanding:** Maintains a "window" of elements over a contiguous section of an array/string, expanding and shrinking it to avoid recomputation.

**Example use case:** Maximum sum subarray of size K, longest substring without repeating characters.

```java
int windowSum = 0, maxSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
maxSum = windowSum;
for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k];
    maxSum = Math.max(maxSum, windowSum);
}
```

---

### 6. Linked List In-Place Reversal

**Understanding:** Reverses pointers within a linked list without using extra space, by tracking `prev`, `curr`, and `next` nodes.

**Example use case:** Reverse a linked list, reverse nodes in K-groups.

```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
return prev;
```

---

### 7. Overlapping Intervals

**Understanding:** Sorts intervals by start time, then merges or compares adjacent intervals to resolve overlaps.

**Example use case:** Merge intervals, insert interval, meeting rooms.

```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> merged = new ArrayList<>();
for (int[] interval : intervals) {
    if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
        merged.add(interval);
    } else {
        merged.get(merged.size() - 1)[1] =
            Math.max(merged.get(merged.size() - 1)[1], interval[1]);
    }
}
```

---

### 8. Cyclic Sort

**Understanding:** Places each number in its correct index (value == index) when dealing with arrays containing numbers in a known range (like 1 to n), enabling O(n) missing/duplicate detection.

**Example use case:** Find missing number, find all duplicates in an array.

```java
int i = 0;
while (i < nums.length) {
    int correct = nums[i] - 1;
    if (nums[i] < nums.length && nums[i] != nums[correct]) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    } else {
        i++;
    }
}
```

---

### 9. Modified Binary Search

**Understanding:** Adapts classic binary search to work on rotated, nested, or otherwise non-trivially sorted structures by adjusting the comparison logic.

**Example use case:** Search in rotated sorted array, find element in a mountain array.

```java
int low = 0, high = nums.length - 1;
while (low <= high) {
    int mid = low + (high - low) / 2;
    if (nums[mid] == target) return mid;
    if (nums[low] <= nums[mid]) {
        if (nums[low] <= target && target < nums[mid]) high = mid - 1;
        else low = mid + 1;
    } else {
        if (nums[mid] < target && target <= nums[high]) low = mid + 1;
        else high = mid - 1;
    }
}
```

---

### 10. Monotonic Stack

**Understanding:** Maintains a stack that is always increasing or decreasing, used to efficiently find the "next greater/smaller" element in O(n).

**Example use case:** Next greater element, daily temperatures, largest rectangle in histogram.

```java
Deque<Integer> stack = new ArrayDeque<>();
int[] result = new int[nums.length];
Arrays.fill(result, -1);
for (int i = 0; i < nums.length; i++) {
    while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
        result[stack.pop()] = nums[i];
    }
    stack.push(i);
}
```

---

### 11. Quick Select

**Understanding:** A variation of quicksort's partitioning step used to find the Kth smallest/largest element in average O(n) time without fully sorting the array.

**Example use case:** Kth largest element in an array, median of an unsorted array.

```java
int quickSelect(int[] nums, int left, int right, int kSmallest) {
    if (left == right) return nums[left];
    int pivotIndex = partition(nums, left, right);
    if (kSmallest == pivotIndex) return nums[kSmallest];
    else if (kSmallest < pivotIndex) return quickSelect(nums, left, pivotIndex - 1, kSmallest);
    else return quickSelect(nums, pivotIndex + 1, right, kSmallest);
}
```

---

### 12. Top 'K' Elements

**Understanding:** Uses a heap (priority queue) of size K to efficiently track the top or bottom K elements without sorting the entire dataset.

**Example use case:** Top K frequent elements, Kth largest element in a stream.

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) minHeap.poll();
}
// minHeap now contains the top k elements
```

---

### 13. Matrix Traversal

**Understanding:** Systematically visits matrix cells using boundary pointers or direction vectors, often used for spiral, diagonal, or layer-by-layer processing.

**Example use case:** Spiral matrix traversal, rotate image, number of islands.

```java
int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
while (top <= bottom && left <= right) {
    for (int i = left; i <= right; i++) result.add(matrix[top][i]);
    top++;
    for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
    right--;
    if (top <= bottom) {
        for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
        bottom--;
    }
    if (left <= right) {
        for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
        left++;
    }
}
```

---

### 14. Depth-First Search (DFS)

**Understanding:** Explores as far as possible along each branch (using recursion or an explicit stack) before backtracking. Ideal for exhaustive exploration of trees/graphs.

**Example use case:** Number of islands, path sum, graph connectivity.

```java
void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
    visited[node] = true;
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) dfs(neighbor, visited, adj);
    }
}
```

---

### 15. Breadth-First Search (BFS)

**Understanding:** Explores nodes level by level using a queue, guaranteeing the shortest path in unweighted graphs.

**Example use case:** Shortest path in a maze, level order traversal, rotten oranges.

```java
Queue<Integer> queue = new LinkedList<>();
boolean[] visited = new boolean[n];
queue.offer(start);
visited[start] = true;
while (!queue.isEmpty()) {
    int node = queue.poll();
    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            visited[neighbor] = true;
            queue.offer(neighbor);
        }
    }
}
```

---

### 16. Tree Traversals

**Understanding:** Visits every node in a tree in a defined order — inorder, preorder, postorder (DFS-based), or level-order (BFS-based).

**Example use case:** Validate BST (inorder), serialize/deserialize tree, tree diameter.

```java
void inorder(TreeNode root, List<Integer> result) {
    if (root == null) return;
    inorder(root.left, result);
    result.add(root.val);
    inorder(root.right, result);
}
```

---

### 17. Divide & Conquer

**Understanding:** Breaks a problem into smaller independent subproblems, solves them recursively, then combines their results.

**Example use case:** Merge sort, quick sort, maximum subarray.

```java
void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;
    int mid = left + (right - left) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
}
```

---

### 18. Trie (Prefix Tree)

**Understanding:** A tree-like structure that stores strings character by character, enabling fast prefix-based lookups and insertions.

**Example use case:** Autocomplete, word search, implement a dictionary.

```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}

void insert(TrieNode root, String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        int idx = c - 'a';
        if (node.children[idx] == null) node.children[idx] = new TrieNode();
        node = node.children[idx];
    }
    node.isEnd = true;
}
```

---

### 19. K-Way Merge

**Understanding:** Merges K sorted lists/arrays simultaneously using a min-heap to always pick the smallest available element next.

**Example use case:** Merge K sorted lists, smallest range covering elements from K lists.

```java
PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
for (int i = 0; i < lists.length; i++) {
    if (lists[i] != null) minHeap.offer(new int[]{lists[i].val, i});
}
while (!minHeap.isEmpty()) {
    int[] top = minHeap.poll();
    // process top[0], then advance lists[top[1]] and re-offer if not null
}
```

---

### 20. Topological Sort

**Understanding:** Orders nodes of a Directed Acyclic Graph (DAG) so that every directed edge points from an earlier node to a later one. Commonly implemented with Kahn's algorithm (BFS + in-degree).

**Example use case:** Course schedule, build/task dependency ordering.

```java
int[] inDegree = new int[n];
for (List<Integer> edges : adj) for (int v : edges) inDegree[v]++;

Queue<Integer> queue = new LinkedList<>();
for (int i = 0; i < n; i++) if (inDegree[i] == 0) queue.offer(i);

List<Integer> order = new ArrayList<>();
while (!queue.isEmpty()) {
    int node = queue.poll();
    order.add(node);
    for (int neighbor : adj.get(node)) {
        if (--inDegree[neighbor] == 0) queue.offer(neighbor);
    }
}
```

---

### 21. Union-Find (Disjoint Set Union)

**Understanding:** Tracks a set of elements partitioned into disjoint subsets, supporting efficient `find` (which group) and `union` (merge groups) operations, usually with path compression and union by rank.

**Example use case:** Detect cycle in a graph, number of connected components, Kruskal's MST.

```java
int find(int[] parent, int x) {
    if (parent[x] != x) parent[x] = find(parent, parent[x]);
    return parent[x];
}

void union(int[] parent, int[] rank, int x, int y) {
    int rootX = find(parent, x), rootY = find(parent, y);
    if (rootX == rootY) return;
    if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
    else if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
    else { parent[rootY] = rootX; rank[rootX]++; }
}
```

---

### 22. Greedy Method / Kadane's Algorithm

**Understanding:** Makes the locally optimal choice at each step, hoping it leads to a globally optimal solution. Kadane's algorithm is the classic greedy pattern for maximum subarray sum.

**Example use case:** Maximum subarray sum, jump game, activity selection.

```java
int maxSoFar = nums[0], maxEndingHere = nums[0];
for (int i = 1; i < nums.length; i++) {
    maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
    maxSoFar = Math.max(maxSoFar, maxEndingHere);
}
```

---

### 23. Backtracking

**Understanding:** Explores all possible candidates for a solution incrementally, abandoning ("backtracking" from) a path as soon as it determines it cannot lead to a valid solution.

**Example use case:** Subsets, permutations, N-Queens, sudoku solver.

```java
void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);
        backtrack(i + 1, nums, current, result);
        current.remove(current.size() - 1);
    }
}
```

---

### 24. Dynamic Programming

**Understanding:** Solves complex problems by breaking them into overlapping subproblems, storing results (memoization or tabulation) to avoid redundant computation.

**Example use case:** Fibonacci, longest common subsequence, knapsack problem.

```java
int fib(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != 0) return memo[n];
    return memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
}
```

---

## Summary Table

| # | Pattern | Core Idea |
|---|---------|-----------|
| 1 | Bit Manipulation | Bitwise ops for binary-level tricks |
| 2 | Prefix Sum | Precomputed cumulative sums |
| 3 | Two Pointer | Two indices scanning inward/forward |
| 4 | Fast & Slow Pointer | Different-speed pointers for cycles |
| 5 | Sliding Window | Growing/shrinking contiguous window |
| 6 | Linked List In-Place Reversal | Reverse pointers with O(1) space |
| 7 | Overlapping Intervals | Sort + merge/compare intervals |
| 8 | Cyclic Sort | Place values at their index |
| 9 | Modified Binary Search | Binary search on altered sorted data |
| 10 | Monotonic Stack | Increasing/decreasing stack |
| 11 | Quick Select | Partition-based Kth element |
| 12 | Top 'K' Elements | Heap of size K |
| 13 | Matrix Traversal | Boundary/direction-based traversal |
| 14 | DFS | Explore deep, then backtrack |
| 15 | BFS | Explore level by level |
| 16 | Tree Traversals | Inorder/preorder/postorder/level |
| 17 | Divide & Conquer | Split, solve, combine |
| 18 | Trie | Prefix-based tree of characters |
| 19 | K-Way Merge | Min-heap merge of sorted lists |
| 20 | Topological Sort | DAG ordering via in-degree |
| 21 | Union-Find | Disjoint set tracking with path compression |
| 22 | Greedy / Kadane's | Locally optimal choices |
| 23 | Backtracking | Try, recurse, undo |
| 24 | Dynamic Programming | Overlapping subproblems + memoization |

---

*This file is part of my ongoing DSA journey in Java — building pattern recognition to solve problems faster and more confidently.*
