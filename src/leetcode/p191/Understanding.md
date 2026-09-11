We can simply get answer with Recursive method through n%2 as values of 1,
and closing value as n == 0 as base condition upto n/2 recursive rounds.


Division -> Divisor -> Remainder
--------    -------    ---------
1.
```
11 (1011)

11/2 -> 5 -> 1
5/2 -> 2 -> 1
2/2 -> 1 -> 0
1/2 -> 1 -> 1

(Down to Top Remainder is conversion)
```
2.
```
128 (10000000)

128/2 -> 64 -> 0
64/2 -> 32 -> 0
32/2 -> 16 -> 0
16/2 -> 8 -> 0
8/2 -> 4 -> 0
4/2 -> 2 -> 0
2/2 -> 1 -> 0
1/2 -> 1 -> 1

(Down to Top Remainder is conversion)
```
3.
```
2147483645 (01111111111111111111111111111101
)

2147483645 / 2 = 1073741822 remainder 1
1073741822 / 2 = 536870911  remainder 0
536870911  / 2 = 268435455  remainder 1
268435455  / 2 = 134217727  remainder 1
134217727  / 2 = 67108863   remainder 1
67108863   / 2 = 33554431   remainder 1
33554431   / 2 = 16777215   remainder 1
16777215   / 2 = 8388607    remainder 1
8388607    / 2 = 4194303    remainder 1
4194303    / 2 = 2097151    remainder 1
2097151    / 2 = 1048575    remainder 1
1048575    / 2 = 524287     remainder 1
524287     / 2 = 262143     remainder 1
262143     / 2 = 131071     remainder 1
131071     / 2 = 65535      remainder 1
65535      / 2 = 32767      remainder 1
32767      / 2 = 16383      remainder 1
16383      / 2 = 8191       remainder 1
8191       / 2 = 4095       remainder 1
4095       / 2 = 2047       remainder 1
2047       / 2 = 1023       remainder 1
1023       / 2 = 511        remainder 1
511        / 2 = 255        remainder 1
255        / 2 = 127        remainder 1
127        / 2 = 63         remainder 1
63         / 2 = 31         remainder 1
31         / 2 = 15         remainder 1
15         / 2 = 7          remainder 1
7          / 2 = 3          remainder 1
3          / 2 = 1          remainder 1
1          / 2 = 0          remainder 1

(Down to Top Remainder is conversion)
```