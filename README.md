# Leetcode刷题笔记
## 169.[多数元素/Majority Element](https://leetcode-cn.com/problems/majority-element)
### 题目描述
给定一个大小为n的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于⌊n/2⌋的元素。  
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
### 排序法
将数组中的元素按递增或递减方式排序，根据题中已知条件，多数元素在数组中出现次数大于⌊n/2⌋的元素，因此排序后⌊n/2⌋下标的元素是多数元素。  
注：[官方解题方法](https://leetcode-cn.com/problems/majority-element/solution/duo-shu-yuan-su-by-leetcode-solution/)