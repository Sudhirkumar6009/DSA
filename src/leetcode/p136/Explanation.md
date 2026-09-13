# Leetcode 136 Single Number

### Example 1

#### Input: nums = [2,2,1]
#### Output: 1

### Example 2

#### Input: [4,1,2,1,2] 
#### Output: [4]

### Example 3

#### Input: [1]
#### Output: 1

### Constraints

`1 <= nums.length <= 3 * 104`

`-3 * 104 <= nums[i] <= 3 * 104`

## Solution with Coding

Understanding working of XOR Operation `^` 

| INPUT1 | INPUT2 | OUTPUT |
|--------|--------|--------|
| 0      | 0      | 0      |
| 0      | 1      | 1      |
| 1      | 0      | 1      |
| 1      | 1      | 0      |

### Simplification of [4,1,2,1,2] with Each steps

Iterate throughout each elements with applying `^` operator for all consecutive elements

#### Step 1

res = 0; `Blank element for starting`

    0000 ^ 1000 (4) = 1000

res = 1000 (4)

#### Step 2

    1000 ^ 0001 (1) = 1001

res = 1001 (5)

#### Step 3


    1001 ^ 0010 (2) = 1011

res = 1011 (7)

#### Step 4

    1011 ^ 0001 (1) = 1010

res = 1010 (6)

#### Step 5

    1010 ^ 0010 (2) = 1000

res = 1000 (4)

## Array is completed upto end and Final Output = 4