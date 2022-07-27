# 数据结构与算法

- [数据结构与算法](#数据结构与算法)
- [基础了解](#基础了解)
  - [线性查找](#线性查找)
    - [常见的算法复杂度](#常见的算法复杂度)
      - [循环](#循环)
      - [数字 n 的 x 进制位](#数字-n-的-x-进制位)
      - [数字 n 的约数](#数字-n-的约数)
      - [长度为 n​ 的二进制数字](#长度为-n-的二进制数字)
      - [长度为 n​ 的数组的所有排列组合](#长度为-n-的数组的所有排列组合)
      - [判断数字 n​ 是否是偶数](#判断数字-n-是否是偶数)
    - [时间复杂度大小比较](#时间复杂度大小比较)
  - [基础排序算法](#基础排序算法)
    - [选择排序法](#选择排序法)
      - [时间复杂度](#时间复杂度)
    - [插入排序法](#插入排序法)
      - [插入排序算法优化](#插入排序算法优化)
      - [时间复杂度](#时间复杂度-1)
      - [插入排序重要特征](#插入排序重要特征)
- [数据结构](#数据结构)
  - [数组](#数组)
    - [泛型数组](#泛型数组)
    - [动态数组](#动态数组)
    - [时间复杂度](#时间复杂度-2)
    - [均摊复杂度](#均摊复杂度)
  - [栈和队列](#栈和队列)
    - [栈](#栈)
      - [复杂度分析](#复杂度分析)
      - [栈的应用](#栈的应用)
    - [队列](#队列)
      - [数组队列](#数组队列)
        - [复杂度分析](#复杂度分析-1)
      - [循环队列](#循环队列)
        - [复杂度分析](#复杂度分析-2)
      - [两种实现方式对比](#两种实现方式对比)
      - [双端队列](#双端队列)
  - [链表](#链表)
  - [Star History](#star-history)

# 基础了解

## 线性查找

- **01-Linear-Search**
  - `01-1-Linear-Search`
  - `01-2-Using-Generics`
  - `01-3-Using-Custom-Class`
  - `01-4-Test-Performance`

[循环不变量](https://zh.wikipedia.org/wiki/%E5%BE%AA%E7%8E%AF%E4%B8%8D%E5%8F%98%E9%87%8F)

### 常见的算法复杂度

#### 循环

$O(n)$

```java
for (int i = 0; i < data.length; i++)
```

$\mathrm{O}\left(n^{2}\right)$

```java
for (int i = 0; i < data.length; i++)
	for (int j = i + 1; j < data.length; j++)
        
for (int i = 0; i < data.length; i++)
	for (int j = 0; j < data.length; j++)
```

#### 数字 $n$ 的 $x$ 进制位

$\mathrm{O}\left(\log _{x} n\right) => \mathrm{O}(\log n)$

```java
while (n) {
    n % x;
    n /= x;
}
```

#### 数字 $n$ 的约数

$O(n)$

```java
for (int i = 0; i < = n; i++) {
    if (n % i == 0)
}
```

$\mathrm{O}(\sqrt{n})$

```java
for (int i = 0; i * i < = n; i++) {
    if (n % i == 0)
}
```

#### 长度为 $n$ 的二进制数字

$\mathrm{O}\left(2^{n}\right)$

#### 长度为 $n$ 的数组的所有排列组合

$\mathrm{O}(n !)$

#### 判断数字 $n$ 是否是偶数

$\mathrm{O}(1)$

### 时间复杂度大小比较

$$
\mathrm{O}(1)<\mathrm{O}(\log n)<\mathrm{O}(\sqrt{n})<\mathrm{O}(n)<\mathrm{O}(n \log n)<\mathrm{O}\left(n^{2}\right)<\mathrm{O}\left(2^{n}\right)<\mathrm{O}(n !)
$$

**01_4_1**

![Test-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/01_4_1.png)

## 基础排序算法

- **02-Selection-Sort**
  - `02-1-Selection-Sort`
  - `02-2-Using-Generics`
  - `02-3-Using-Comparable`
  - `02-4-Test-Performance`
- **03-Insertion-Sort**
  - `03-1-Insertion-Sort`
  - `03-2-Insertion-Sort-Optimized`
  - `03-3-Insertion-Sort-Features`

### 选择排序法

***6 4 2 3 1 5***

------

```java
for (int i = 0; i < arr.length - 1; i++) {//i < arr.length
    int minIndex = i;
    for (int j = i; j < arr.length; j++) {
        if (arr[j].compareTo(arr[minIndex]) < 0)
            minIndex = j;
    }
    swap(arr, i, minIndex);
}
```

（$i = 0$，$j = 0，1，2，3，4，5$）：遍历（$minIndex = 4$）

**1** 4 2 3 **6** 5



（$i = 1$，$j = 1，2，3，4，5$）：遍历（$minIndex = 2$）

1 **2** **4** 3 6 5



（$i = 2$，$j = 2，3，4，5$）：遍历（$minIndex = 3$）

1 2 **3** **4** 6 5



（$i = 3$，$j = 3，4，5$）：遍历（$minIndex = 3$）

1 2 3 4 6 5



（$i = 4$，$j = 4，5$）：遍历（$minIndex = 5$）

1 2 3 4 **5** **6**



下一步可以省略：

（$i = 5$，$j = 5$）：遍历（$minIndex = 5$）

1 2 3 4 5 6

#### 时间复杂度

$$
\begin{aligned}
& 1+2+3+\ldots+\mathrm{n} \\
=& \frac{(1+n) * n}{2} \\
=& \frac{1}{2} n^{2}+\frac{1}{2} n
\end{aligned}
$$

$\mathrm{O}\left(n^{2}\right)$

**02_4_1**

![Test-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/02_4_1.png)

### 插入排序法

***6 4 2 3 1 5***

------

```java
for (int i = 1; i < arr.length; i++) {// i = 0
    for (int j = i; j - 1 >= 0; j--) {
        if (arr[j].compareTo(arr[j - 1]) < 0)
            swap(arr, j - 1, j);
        else break;
    }
}

for (int i = 1; i < arr.length; i++) {// i = 0
	for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--)
		swap(arr, j - 1, j);
}
```

该步可以省略：

（$i = 0$）：直接跳出

6 4 2 3 1 5



（$i = 1$，$j = 1$）：遍历比较

4 6 2 3 1 5



（$i = 2$，$j = 2，1$）：遍历比较

2 4 6 3 1 5



（$i = 3$，$j = 3，2，1$）：遍历比较

2 3 4 6 1 5 



（$i = 4$，$j = 4，3，2，1$）：遍历比较

1 2 3 4 6 5 



（$i = 5$，$j = 5，4，3，2，1$）：遍历比较

1 2 3 4 5 6 

![Test-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_1_1.png)

#### 插入排序算法优化

```java
for (int i = 1; i < arr.length; i++) {// i = 0
    E t = arr[i];
    int j;
    for (j = i; j - 1 >= 0; j--) {
        if (t.compareTo(arr[j - 1]) < 0)
            arr[j] = arr[j - 1];
        else
            break;
    }
    arr[j] = t;
}

for (int i = 1; i < arr.length; i++) {// i = 0
	E t = arr[i];
    int j;
    for(j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j --){
        arr[j] = arr[j - 1];
    }
    arr[j] = t;
}
```

![Compare-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_2_1.png)

#### 时间复杂度

$\mathrm{O}\left(n^{2}\right)$

#### 插入排序重要特征

对于有序数组，插入排序的复杂度是 $O(n)$。因此，插入排序的复杂度小于等于选择排序。

![Compare-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_3_1.png)

# 数据结构

- 线性结构：数组、栈、队列、链表、哈希表
- 树结构：二叉树、二分搜索树、AVL、红黑树、Treap、Splay、堆、Trie、线段树、K-D树、并查集、哈夫曼树
- 图结构：领接矩阵、领接表

## 数组

- **04-Arrays**
  - `04-1-Our-Own-Array`
  - `04-2-Add-Element`
  - `04-3-Query-and-Update-Element`
  - `04-4-Contain-Find-and-Remove`
  - `04-5-Generic-Data-Structures`
  - `04-6-Dynamic-Array`
  - `04-7-Amortized-Time-Complexity`

封装属于我们的数组：

1. data：数组
2. capacity：数组最大容量
3. size：数组目前大小

- `Array()`
- `Array(int capacity)`
- `int getCapacity()`
- `int getSize()`
- `boolean isEmpty()`
- `void add(int index, E e)`
- `void addLast(E e)`
- `void addFirst(E e)`
- `E getElement(int index)`
- `void setElement(int index, E e)`
- `boolean contains(E e)`
- `int find(E e)`
- `E remove(int index)`
- `E removeLast()`
- `E removeFirst()`

### 泛型数组

![Generic-Array](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/04_5_1.png)

### 动态数组

![Dynamic-Array](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/04_6_1.png)

### 时间复杂度

|     操作      |   时间复杂度    |
| :-----------: | :-------------: |
|     `add`     | $\mathrm{O}(1)$ |
|   `addLast`   | $\mathrm{O}(n)$ |
|  `addFirst`   | $\mathrm{O}(n)$ |
|   `remove`    | $\mathrm{O}(1)$ |
| `removeLast`  | $\mathrm{O}(n)$ |
| `removeFirst` | $\mathrm{O}(n)$ |
| `setElement`  | $\mathrm{O}(1)$ |
| `getElement`  | $\mathrm{O}(1)$ |
|  `contains`   | $\mathrm{O}(n)$ |
|    `find`     | $\mathrm{O}(n)$ |

总结：

增：$\mathrm{O}(n)$

删：$\mathrm{O}(n)$

改：已知索引 $\mathrm{O}(1)$，未知索引 $\mathrm{O}(n)$

查：已知索引 $\mathrm{O}(1)$，未知索引 $\mathrm{O}(n)$

### 均摊复杂度

**均摊复杂度**

capacity=8，9次addLast：1 1 1 1 1 1 1 1 8+1 = 17

> 平均2次基本操作

**复杂度震荡**

为了避免

```java
/**
 * Remove array element
 *
 * @param index
 * @return
 */
public E remove(int index) {
    if (index < 0 || index >= size)
        throw new IllegalArgumentException("Remove failed. Index is illegal.");
    E ret = data[index];
    for (int i = index + 1; i < data.length; i++) {
        data[i - 1] = data[i];
    }
    size--;
    data[size] = null;
    if (size == data.length / 4 && data.length / 2 != 0)
        resize(data.length / 2);
    return ret;
}
```

## 栈和队列

**05-Stacks-and-Queues**

- `05-1-Array-Stack`
- `05-2-A-Stack-Problem-in-Leetcode`
- `05-3-Array-Queue`

### 栈

封装属于我们的栈：

- `ArrayStack()`

- `ArrayStack(int capacity)`
- `int getCapacity()`
- `int getSize()`
- `boolean isEmpty()`
- `void push(E e)`
- `E pop()`
- `E peek()`

#### 复杂度分析

|        操作         |     时间复杂度      |
| :-----------------: | :-----------------: |
|   `int getSize()`   |   $\mathrm{O}(1)$   |
| `boolean isEmpty()` |   $\mathrm{O}(1)$   |
|  `void push(E e)`   | 均摊$\mathrm{O}(1)$ |
|      `E pop()`      | 均摊$\mathrm{O}(1)$ |
|     `E peek()`      |   $\mathrm{O}(1)$   |

#### 栈的应用

[[20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/)](https://leetcode.cn/problems/valid-parentheses/)

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{'))
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```

### 队列

#### 数组队列

封装属于我们的数组队列：

- `ArrayQueue(int capacity)`
- `ArrayQueue()`
- `int getCapacity()`
- `int getSize()`
- `boolean isEmpty()`
- `void enqueue(E e)`
- `E dequeue()`
- `E getFront()`

##### 复杂度分析

|        操作         |     时间复杂度      |
| :-----------------: | :-----------------: |
|   `int getSize()`   |   $\mathrm{O}(1)$   |
| `boolean isEmpty()` |   $\mathrm{O}(1)$   |
| `void enqueue(E e)` | 均摊$\mathrm{O}(1)$ |
|    `E dequeue()`    |   $\mathrm{O}(n)$   |
|   `E getFront()`    |   $\mathrm{O}(1)$   |

#### 循环队列

- 队列为空（front == tail）

![Empty-Queue](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_4_1.png)

- 队列为满（（tail + 1）% c == front）

![Full-Queue](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_4_2.png)

封装属于我们的循环队列：

- `LoopQueue(int capacity)`
- `LoopQueue()`
- `int getSize()`
- `boolean isEmpty()`
- `void enqueue(E e)`
- `E dequeue()`
- `E getFront()`

队列遍历的两种方式：

```java
for (int i = 0; i < size; i++)
    data[(i + front) % data.length]
```

```java
for (int i = front; i != tail; i = (i + 1) % data.length) {
    data[i]
}
```

##### 复杂度分析

|        操作         |     时间复杂度      |
| :-----------------: | :-----------------: |
|   `int getSize()`   |   $\mathrm{O}(1)$   |
| `boolean isEmpty()` |   $\mathrm{O}(1)$   |
| `void enqueue(E e)` | 均摊$\mathrm{O}(1)$ |
|    `E dequeue()`    | 均摊$\mathrm{O}(1)$ |
|   `E getFront()`    |   $\mathrm{O}(1)$   |

#### 两种实现方式对比

![Compare-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_5_1.png)

主要影响在于出队操作！

#### 双端队列

封装属于我们的双端队列：

- `Deque(int capacity)`
- `Deque()`
- `int getCapacity()`
- `int getSize()`
- `boolean isEmpty()`
- `void addLast(E e)`
- `void addFirst(E e)` 
- `E removeLast()`
- `E removeFirst()`
- `E getFront()`
- `E getLast()`

## 链表

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=JiajiaLiang2001/Algorithm&type=Date)](https://star-history.com/#JiajiaLiang2001/Algorithm&Date)