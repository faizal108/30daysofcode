# 30daysofcode
Here is the 30 days of codeing challenge with Newton school and other community partners. they provide a new question daily. Here is then solution of the problems

<h1>Problems</h1>
<hr>
<h2>Day-1</h2>
Newton went to a mall. There are N items in a shop. For each i=1, 2, …, N, the price of the i- th item is Ai Rs. Newton has K coupons. Each coupon can be used on one item. You can use any number of coupons, possibly zero, on the same item. Using k coupons on an item with a price of a Rs allows him to buy it for max{a−kX, 0} Rs.
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
112

<h2>Day-2</h2>
The students of Newton School threw a grand party to celebrate their hard work and achievements. They danced and sang the night away, enjoying delicious food and creating memories that would last a lifetime.
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
Yes
