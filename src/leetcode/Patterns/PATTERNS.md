# Data Structures & Algorithms Patterns Handbook

> A concise reference for the most common coding interview patterns.

---

# 1. Prefix Sum

## Definition
Prefix Sum is a preprocessing technique that stores cumulative sums of an array, allowing range sum queries to be answered in **O(1)** time.

For an array:

```
arr = [2, 4, 1, 5]
```

Prefix array:

```
prefix = [2, 6, 7, 12]
```

Formula:

```
prefix[i] = prefix[i-1] + arr[i]
```

Range Sum:

```
sum(L...R)

= prefix[R] - prefix[L-1]
```

---

## When to Use

- Range Sum Queries
- Count Subarrays
- Equal Prefix/Suffix Problems
- Running cumulative values

---

## Time Complexity

| Operation | Complexity |
|------------|------------|
| Build | O(n) |
| Query | O(1) |
| Space | O(n) |

---

## Common Problems

- Range Sum Query
- Subarray Sum Equals K
- Continuous Subarray Sum
- Pivot Index

---

## Template

```cpp
vector<int> prefix(n);

prefix[0]=arr[0];

for(int i=1;i<n;i++)
    prefix[i]=prefix[i-1]+arr[i];

int rangeSum(int l,int r){
    if(l==0) return prefix[r];
    return prefix[r]-prefix[l-1];
}
```

---

# 2. Two Pointer

## Definition

Two pointers traverse an array from different positions to reduce nested loops.

Usually:

- Left + Right
- Slow + Fast
- Same Direction

---

## When to Use

- Sorted Arrays
- Pair Sum
- Remove Duplicates
- Reverse Array
- Palindrome

---

## Time Complexity

Usually:

```
O(n)
```

---

## Common Problems

- Two Sum II
- Container With Most Water
- Remove Duplicates
- 3Sum

---

## Template

```cpp
int left=0;
int right=n-1;

while(left<right){

    if(condition){
        left++;
    }
    else{
        right--;
    }
}
```

---

# 3. Sliding Window

## Definition

Maintains a window over contiguous elements while expanding/shrinking dynamically.

Instead of recomputing every subarray, update incrementally.

---

## Types

### Fixed Size

Window size = k

Example:

Maximum sum of size k

---

### Variable Size

Expand

Shrink until valid

---

## When to Use

- Longest Substring
- Minimum Window
- Maximum Sum
- Distinct Characters

---

## Complexity

```
Time : O(n)

Space : O(1)
```

---

## Common Problems

- Longest Substring Without Repeating
- Minimum Window Substring
- Maximum Average Subarray
- Fruits Into Baskets

---

## Template

```cpp
int left=0;

for(int right=0;right<n;right++){

    // include right

    while(window invalid){

        // remove left

        left++;
    }

    // update answer
}
```

---

# 4. Fast & Slow Pointer

## Definition

Uses two pointers moving at different speeds.

Fast moves twice as quickly.

Useful for cycle detection.

---

## Applications

- Detect Cycle
- Find Middle Node
- Happy Number
- Remove Loop

---

## Complexity

```
Time : O(n)

Space : O(1)
```

---

## Common Problems

- Linked List Cycle
- Middle of Linked List
- Happy Number

---

## Template

```cpp
slow=head;
fast=head;

while(fast && fast->next){

    slow=slow->next;
    fast=fast->next->next;

    if(slow==fast)
        return true;
}
```

---

# 5. Linked List In-Place Reversal

## Definition

Reverse linked list without extra memory.

Uses three pointers.

---

## Three Pointers

```
prev
curr
next
```

---

## Complexity

```
Time : O(n)

Space : O(1)
```

---

## Common Problems

- Reverse Linked List
- Reverse Between
- Reverse K Group
- Palindrome Linked List

---

## Template

```cpp
ListNode* prev=NULL;

while(head){

    ListNode* nxt=head->next;

    head->next=prev;

    prev=head;

    head=nxt;
}

return prev;
```

---

# 6. Monotonic Stack

## Definition

Maintains increasing or decreasing order.

Used for nearest greater/smaller elements.

---

## Types

Increasing Stack

```
1 2 5 9
```

Decreasing Stack

```
9 6 4 1
```

---

## Applications

- Next Greater Element
- Histogram
- Daily Temperatures
- Stock Span

---

## Complexity

```
Time : O(n)

Space : O(n)
```

Each element pushed once and popped once.

---

## Template

```cpp
stack<int> st;

for(int i=0;i<n;i++){

    while(!st.empty() && arr[st.top()]<arr[i])
        st.pop();

    st.push(i);
}
```

---

# 7. Top K Elements

## Definition

Uses Heap/Priority Queue.

Efficiently retrieves largest/smallest k elements.

---

## Data Structure

Min Heap

or

Max Heap

---

## Complexity

```
Heap Size = K

Time:

O(n log k)
```

---

## Common Problems

- Top K Frequent
- K Closest Points
- Merge K Lists
- Kth Largest

---

## Template

```cpp
priority_queue<int,
vector<int>,
greater<int>> pq;

for(auto x:arr){

    pq.push(x);

    if(pq.size()>k)
        pq.pop();
}
```

---

# 8. Quick Select

## Definition

Find kth smallest/largest without full sorting.

Based on Quick Sort partition.

---

## Average Complexity

```
O(n)
```

Worst

```
O(n²)
```

---

## Applications

- Median
- Kth Largest
- Kth Smallest

---

## Template

```cpp
partition()

pivot

recurse only one side
```

---

# 9. Overlapping Intervals

## Definition

Sort intervals then merge overlapping ones.

---

## Steps

1. Sort
2. Compare end
3. Merge if overlap

---

## Complexity

```
Sorting

O(n log n)
```

---

## Common Problems

- Merge Intervals
- Insert Interval
- Meeting Rooms

---

## Template

```cpp
sort(intervals.begin(),intervals.end());

for(auto interval:intervals){

    if(ans.empty() || ans.back()[1]<interval[0])
        ans.push_back(interval);

    else
        ans.back()[1]=max(ans.back()[1],interval[1]);
}
```

---

# 10. Modified Binary Search

## Definition

Binary Search on modified conditions.

---

## Applications

- Rotated Array
- Peak Element
- Infinite Array
- First/Last Position

---

## Complexity

```
Time

O(log n)
```

---

## Template

```cpp
while(low<=high){

    int mid=(low+high)/2;

    if(found)
        return mid;

    else if(condition)
        low=mid+1;

    else
        high=mid-1;
}
```

---

# 11. Depth-First Search (DFS)

## Definition

Explore one branch completely before backtracking.

Uses:

- Recursion
- Stack

---

## Applications

- Tree Traversal
- Graph Traversal
- Connected Components
- Cycle Detection

---

## Complexity

```
Time

O(V+E)
```

---

## Recursive Template

```cpp
void dfs(int node){

    visited[node]=true;

    for(auto next:graph[node]){

        if(!visited[next])
            dfs(next);
    }
}
```

---

# 12. Breadth-First Search (BFS)

## Definition

Explore level by level.

Uses Queue.

---

## Applications

- Shortest Path
- Level Order
- Multi-source BFS

---

## Complexity

```
Time

O(V+E)
```

---

## Template

```cpp
queue<int> q;

q.push(start);

visited[start]=true;

while(!q.empty()){

    int node=q.front();

    q.pop();

    for(auto next:graph[node]){

        if(!visited[next]){

            visited[next]=true;

            q.push(next);
        }
    }
}
```

---

# 13. Matrix Traversal

## Definition

Traverse 2D grids using loops, DFS, or BFS.

---

## Directions

```cpp
int dx[4]={-1,1,0,0};

int dy[4]={0,0,-1,1};
```

---

## Applications

- Number of Islands
- Flood Fill
- Rotten Oranges
- Shortest Path in Grid

---

## Complexity

```
O(rows × cols)
```

---

## Template

```cpp
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

    }
}
```

---

# 14. Backtracking

## Definition

Try all possibilities.

Undo changes after recursive call.

"Choose → Explore → Unchoose"

---

## Applications

- Sudoku
- N Queens
- Permutations
- Combinations
- Word Search

---

## Complexity

Usually Exponential

```
O(b^d)
```

---

## Template

```cpp
void backtrack(){

    if(base){

        answer.push_back(path);

        return;
    }

    for(choice){

        choose();

        backtrack();

        undo();
    }
}
```

---

# 15. Dynamic Programming

## Definition

Solve overlapping subproblems once and reuse results.

---

## Properties

### 1. Overlapping Subproblems

Repeated calculations.

### 2. Optimal Substructure

Optimal answer built from smaller answers.

---

## Approaches

### Memoization

Top Down

Recursive

---

### Tabulation

Bottom Up

Iterative

---

## Complexity

Usually

```
Time

O(n²)

or

O(n)
```

Depends on state transitions.

---

## Common Problems

- Fibonacci
- Knapsack
- Longest Common Subsequence
- Coin Change
- House Robber
- Edit Distance

---

## DP Design Steps

1. Define State
2. State Transition
3. Base Case
4. Memo/Table
5. Compute Answer

---

## Memoization Template

```cpp
int solve(int state){

    if(base)
        return value;

    if(dp[state]!=-1)
        return dp[state];

    return dp[state]=...
}
```

---

## Tabulation Template

```cpp
dp[0]=base;

for(int i=1;i<n;i++){

    dp[i]=...
}
```

---

# Pattern Selection Cheat Sheet

| Pattern | Best For | Complexity |
|----------|----------|------------|
| Prefix Sum | Range Sum | O(n) Build |
| Two Pointer | Sorted Arrays | O(n) |
| Sliding Window | Contiguous Subarray | O(n) |
| Fast & Slow | Cycle Detection | O(n) |
| Reverse Linked List | In-place Reversal | O(n) |
| Monotonic Stack | Next Greater/Smaller | O(n) |
| Top K | Heap Problems | O(n log k) |
| Quick Select | Kth Element | O(n) Avg |
| Overlapping Intervals | Merge Ranges | O(n log n) |
| Modified Binary Search | Search Space | O(log n) |
| DFS | Deep Traversal | O(V+E) |
| BFS | Level Traversal | O(V+E) |
| Matrix Traversal | Grid Problems | O(R×C) |
| Backtracking | All Possibilities | Exponential |
| Dynamic Programming | Optimization | Depends |

---

# Interview Strategy

When solving a problem, ask:

1. Is it a range query? → Prefix Sum
2. Is the array sorted? → Two Pointers / Binary Search
3. Is it a contiguous subarray? → Sliding Window
4. Need cycle detection? → Fast & Slow Pointer
5. Linked list reversal? → In-place Reversal
6. Need nearest greater/smaller? → Monotonic Stack
7. Need top k elements? → Heap
8. Need kth smallest/largest? → Quick Select
9. Working with intervals? → Sort + Merge
10. Searching efficiently? → Modified Binary Search
11. Tree/Graph exploration? → DFS/BFS
12. Grid traversal? → Matrix Traversal
13. Need all combinations? → Backtracking
14. Repeated subproblems? → Dynamic Programming

---

**End of Handbook**