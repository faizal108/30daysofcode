# 30daysofcode

Here is the 30 days of codeing challenge with Newton school and other community partners. they provide a new question daily. Here is then solution of the problems

<h1>Problems</h1>
<hr>
<details>
  <summary><h2>Day-1</h2></summary>
  <p>Newton went to a mall. There are N items in a shop. For each i=1, 2, …, N, the price of the i- th item is Ai Rs. Newton has K coupons. Each coupon can be used on one item. You can use any number of coupons, possibly zero, on the same item. Using k coupons on an item with a price of a Rs allows him to buy it for max{a−kX, 0} Rs.
Print the minimum amount of money Newton needs to buy all the items.
Input
Input is given from Standard Input in the following format:
N K X
A1 A2..... AN

Constraints
1≤N≤2×10^5
1≤K, X≤10^9
1≤Ai ≤10^9

All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
5 4 7
8 3 10 5 13

Sample Output 1
12

Sample Input 2
5 100 7
8 3 10 5 13

Sample Output 2
0

Sample Input 3
20 815 60
2066 3193 2325 4030 3725 1669 1969 763 1653 159 5311 5341 4671 2374 4513 285 810 742 2981 202

Sample Output 3
112</p>

</details>

<details>
  <summary><h2>Day-2</h2></summary>
  <p>The students of Newton School threw a grand party to celebrate their hard work and achievements. They danced and sang the night away, enjoying delicious food and creating memories that would last a lifetime.
There are N guests in the party and N-1 relationships are given. The guests are numbered 1, 2,. , N. The i- th relationship depicts that guest ai and guest bi are friends.
Determine whether a guest exists or not who is a friend of all other guests.
Here, we only consider the direct friendship.
Input
Input is given from Standard Input in the following format:

N

a1 b1
a2 b2
a3 b3
.
.
.
.
an-1 bn-1

Constraints
3 ≤ N ≤ 10^5
1 ≤ ai, bi ≤ N
i≤N
Output
If a guest exists or who is a friend of all other guests, print "Yes" else print "No".
Example
Sample Input 1
5
1 4
2 4
3 4
4 5

Sample Output 1
Yes

Sample Input 2
4
2 4
1 4
2 3

Sample Output 2
No

Sample Input 3
10
3 10
4 10
9 10
1 10
7 10
5 10
2 10
8 10
6 10

Sample Output 3
Yes</p>

</details>

<details>
  <summary><h2>Day-3</h2></summary>
  <p>Edward participated in one maths competition. He was asked to find the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive). The order does not matter.
Input
The input line contains only one input N.

Constraints
2≤N≤100
N is an integer.
Output
Print the number of ways to choose a pair of an even number and an odd number from the positive integers between 1 and N (inclusive).
Example
Sample Input 1
3

Sample Output 1
2

Sample Input 2
6

Sample Output 2
9

Sample Input 3
11

Sample Output 3
30</p>

</details>

<details>
  <summary><h2>Day-4</h2></summary>
  <p>Newton loves EVEN numbers.

You are given two integers N and M. Generate 5 unique even numbers for Newton between N and M (excluding both).
Input
The first and the only line of input contains integer N and integer M.


Constraints
-103 <= N <=M <= 103

M - N > 10
Output
The only line of output contains 5 singly spaced integers satisfying the constraints.
Example
Sample Input
0 20

Sample Output
2 6 8 18 14</p>

</details>

<details>
  <summary><h2>Day-5</h2></summary>
  <p>Emily was playing with triplets. She was excited to find out how many triples of non-negative integers (a, b, c) satisfy a+b+c≤S and a×b×c≤T, where S & T are non-negative integers.
Input
The input line contains S, and T separated by space.

Constraints
0≤S≤100
0≤T≤10000
S and T are integers.
Output
Print the number of triples of non-negative integers (a, b, c) satisfying the conditions.
Example
Sample Input 1
1 0

Sample Output 1
4

Sample Input 2
2 5

Sample Output 2
10

Sample Input 3
10 10

Sample Output 3
213</p>

</details>

<details>
  <summary><h2>Day-6</h2></summary>
  <p>Abhas likes to play with numbers. He is given integers N and K. Find the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K. The order of a, b, and c does matter, and some of them can be the same.
Input
The input line contains N and K separated by space.


Constraints
1≤N, K≤2×10^5

N and K are integers.
Output
Print the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K.
Example
Sample Input 1
3 2

Sample Output 1
9

Sample Input 2
5 3

Sample Output 2
1

Sample Input 3
35897 932

Sample Output 3
114191</p>

</details>

<details>
  <summary><h2>Day-7</h2></summary>
  <p>You are given two strings S and T. Determine whether it is possible to make S and T equal by doing the following operation at most once:

Choose two adjacent characters in S and swap them.

Note that it is allowed to choose not to do the operation.
Input
The input line contains two strings in separate lines.

Constraints
Each of S and T is a string of length between 2 and 100 (inclusive) consisting of lowercase English letters.
S and T have the same length.
Output
If it is possible to make S and T equal by doing the operation in Problem Statement at most once, print Yes; otherwise, print No.
Example
Sample Input 1
abc
acb

Sample Output 1
Yes

Sample Input 2
aabb
bbaa

Sample Output 2
No

Sample Input 3
abcde
abcde

Sample Output 3
Yes</p>

</details>

<details>
  <summary><h2>Day-8</h2></summary>
  <p><pre>You are given strings S and T consisting of lowercase English letters. Determine whether T is a (contiguous) substring of S.

A string Y is said to be a (contiguous) substring of X if and only if Y can be obtained by performing the operation below on X zero or more times.

Do one of the following.
i) Delete the first character in X.
ii) Delete the last character in X.
For instance, the tag is a (contiguous) substring of voltage, while ace is not a (contiguous) substring of atcoder.
Input
The input is given from Standard Input in the following format:
S
T

Constraints
S and T consist of lowercase English letters.
1≤∣S∣, ∣T∣≤100 (∣X∣ denotes the length of a string X. )
Output
If T is a (contiguous) substring of S, print Yes; otherwise, print No.
Example
Sample Input 1
voltage
tag
Sample Output 1
Yes

Sample Input 2
gorilla
gorillagorillagorilla
Sample Output 2
No</pre></p>
</details>

<details>
  <summary><h2>Day-9</h2></summary>
  <p><pre>Bob is at the origin of a number line. He wants to reach a goal at coordinate X.
There is a wall at coordinate Y, which Bob cannot go beyond at first. However, after picking up a hammer at coordinate Z, he can destroy that wall and pass through.
Determine whether Bob can reach the goal. If he can, find the minimum total distance he needs to travel to do so.
Input
The input is given from Standard Input in the following format:

X Y Z

Constraints
−1000≤X, Y, Z≤1000
X, Y, and Z are distinct, and none of them is 0.
All values in the input are integers.
Output
If Bob can reach the goal, print the minimum total distance he needs to travel to do so. If he cannot, print -1 instead.
Example
Sample Input 1
10 -10 1
Sample Output 1
10

Sample Input 2
20 10 -10
Sample Output 2
40</pre></p>
</details>

<details>
  <summary><h2>Day-10</h2></summary>
  <p><pre>There are A Bacterias.
Each time Jerry shouts, the bacterias multiply by K times.
In order to have B or more slimes, at least how many times does Jerry need to shout?
Input
Input is given from Standard Input in the following format:
A B K

Constraints
1≤A≤B≤10^9
2≤K≤10^9
All values in input are integers.
Output
Print the answer.
Example
Sample Input 1
1 4 2
Sample Output 1
2

Sample Input 2
7 7 10
Sample Output 2
0

Sample Input 3
31 415926 5
Sample Output 3
6</pre></p>
</details>

<details>
  <summary><h2>Day-11</h2></summary>
  <p><pre>
  Mahi hates the number 7.

We are interested in integers without the digit 7 in both decimal and octal. How many such integers are there between 1 and N (inclusive)?
Input
Input is given from Standard Input in the following format:
N

Constraints
1≤N≤10^5

N is an integer.
Output
Print an integer representing the answer.
Example
Sample Input 1
20
Sample Output 1
17
Sample Input 2
100000
Sample Output 2
30555</pre>
  </p>
</details>

<details>
  <summary><h2>Day-12</h2></summary>
  <p><pre>Alexa Loves to play with 0's and 2's. Among the positive integers that consist of 0's and 2's when written in base 10, he wanted to find the Kth smallest integer. Help him find that.
Input
Input is given from Standard Input in the following format:

K
Output
Print the answer as an integer.
Here, the exact value must be printed as an integer, even if it is big. Unnecessary leading zeros such as 0523 are not allowed.
Example
Sample Input 1
3
Sample Output 1
22

Sample Input 2
11
Sample Output 2
2022

Sample Input 3
923423423420220108
Sample Output 3
220022020000202020002022022000002020002222002200002022002200</pre></p>
</details>

<details>
  <summary><h2>Day-13</h2></summary>
  <p><pre>You are given a sequence of length N consisting of integers:
A=(A1, A2,...., AN)
Find the smallest non-negative integer not in (A1, A2,....,AN).
Input
The input contains N and elements of sequence separated by a new line.
N
A1, A2,. , AN

Constraints
1≤N≤2000
0≤Ai≤2000
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
8
0 3 2 6 2 1 0 0
Sample Output 1
4

Sample Input 2
3
2000 2000 2000
Sample Output 2
0</pre></p>
</details>

<details>
  <summary><h2>Day-14</h2></summary>
  <p><pre>Alexa loves to play with strings. She is given a string S consisting of lowercase English letters.
If 'a' appears in S, print the last index at which it appears; otherwise, print −1. (The index starts at 1. )
Input
The input contains only one string.
S

Constraints
1 <= |S| <= 100
Output
Print the answer.
Example
Sample Input 1
abcdaxayz
Sample Output 1
7

Sample Input 2
bcbbbz
Sample Output 2
-1</pre></p>
</details>

<details>
  <summary><h2>Day-15</h2></summary>
  <p><pre>There was an exam consisting of three problems worth 1, 2, and 4 points.
Alexa, Edward, and Bob took this exam. Alexa scored A points, and Edward scored B points.

Bob solved all of the problems solved by at least one of Alexa and Edward and failed to solve any of the problems solved by, neither of them.

Find Bob's score.
It can be proved that Bob's score is uniquely determined under the Constraints of this problem.
Input
The input contains two integers separated by a space
A B

Constraints
0≤A, B≤7
A and B are integers.
Output
Print Bob's score as an integer.
Example
Sample Input 1
1 2
Sample Output 1
3

Sample Input 2
5 3
Sample Output 2
7

Sample Input 3
0 0
Sample Output 3
0</pre></p>
</details>

<details>
  <summary><h2>Day-16</h2></summary>
  <p><pre>You are given two strings S and T consisting of lowercase English letters. Determine if S is a prefix of T.
Input
The input contains two strings separated by a new line.
S
T

Constraints
S and T are strings of lengths between 1 and 100 (inclusive) consisting of lowercase English letters.
Output
Print "Yes" if S is a prefix of T, "No" otherwise.

Note: that the judge is case-sensitive.
Example
Sample Input 1
new
newton
Sample Output 1
Yes

Sample Input 2
ewt
newton
Sample Output 2
No

Sample Input 3
aaaa
aa
Sample Output 3
No</pre></p>
</details>


<details>
  <summary><h2>Day-17</h2></summary>
  <p><pre>You are given integers L, R, and a string S consisting of lowercase English letters.
Print this string after reversing (the order of) the L-th through R-th characters.
Input
The input line contains L and R separated by space. The next line S
L R
S

Constraints
S consists of lowercase English letters.
1≤ |S| ≤ 10^5 (|S| is the length of S. )
L and R are integers.
1 ≤ L ≤ R ≤ |S|
Output
Print the specified string.
Example
Sample Input 1
3 7
abcdefgh
Sample Output 1
abgfedch

Sample Input 2
1 7
reviver
Sample Output 2
reviver

Sample Input 3
4 13
merrychristmas
Sample Output 3
meramtsirhcyrs</pre></p>
</details>


<details>
  <summary><h2>Day-18</h2></summary>
  <p><pre>You are given positive integers A and B.
Let us calculate A+B (in decimal). If it does not involve a carry, print Easy; if it does, print Hard.
Input
The input contains two space separated numbers:
A B

Constraints
A and B are integers.
1 ≤ A, B ≤ 10^18
Output
If the calculation does not involve a carry, print Easy; if it does, print Hard.
Example
Sample Input 1
229 390
Sample Output 1
Hard

Sample Input 2
123456789 9876543210
Sample Output 2
Easy</pre></p>
</details>
