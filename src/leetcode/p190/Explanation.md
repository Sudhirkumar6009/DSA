# Explanation

Given number = `43261596`

Bit representation = `00000010100101000001111010011100`

We needs to reverse it.

Output = `00111001011110000010100101000000`

# Solution using Bit Manipulation

Simple method using Bit manipulation is to traverse every bits and shift them to right direction upto 32 iterations.

### Using `>>` and `<<` Bits Shifting Operators
```
for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
```
