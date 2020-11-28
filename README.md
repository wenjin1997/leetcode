# Leetcode刷题笔记
## 7.[整数反转/Reverse Integer](https://leetcode-cn.com/problems/reverse-integer/)
### 题目描述
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。  
**注意**：假设我们的环境只能存储得下32位的有符号整数，则其数值范围为[−2^31^,2^31^−1]。请根据这个假设，如果反转后整数溢出，那么就返回0。
### 题解思路
分非负数和负数两种情况，先进行反转，先对绝对值转化，转化为为字符串后进行字符串反转,再转化为整数，反转后判断是否溢出，溢出则返回0.  
代码：reverse_integer.py
### 字符串切片及翻转
```
>>> a = '0123456'
>>> a[1:5]
'1234'
```
`a[1:5]`表示的是对字符串a进行切片，取第1位到第四位，注意这里不包含最后一位，也就是第5位元素。
```
>>> a = '0123456'
>>> a[1:5:2]
'13'
```
`a[1:5:2]`表示对第1~5位切片，步长为2。
```
>>> a = '0123456'
>>> a[::-1]
'6543210'
```
`a[::-1]`表示的是对字符串a从头到尾进行切片，步长为-1，由此也就实现了**字符串的翻转**。
## 169.[多数元素/Majority Element](https://leetcode-cn.com/problems/majority-element)
### 题目描述
给定一个大小为n的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于⌊n/2⌋的元素。  
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
### 排序法
将数组中的元素按递增或递减方式排序，根据题中已知条件，多数元素在数组中出现次数大于⌊n/2⌋的元素，因此排序后⌊n/2⌋下标的元素是多数元素。 
代码：majority_element.py 
注：[官方解题方法](https://leetcode-cn.com/problems/majority-element/solution/duo-shu-yuan-su-by-leetcode-solution/)