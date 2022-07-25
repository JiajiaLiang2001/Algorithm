# 数据结构与算法

- [数据结构与算法](#数据结构与算法)
- [基础了解](#基础了解)
  - [线性查找](#线性查找)
    - [常见的算法复杂度](#常见的算法复杂度)
      - [循环](#循环)
      - [数字 $n$ 的 $x$ 进制位](#数字-n-的-x-进制位)
      - [数字 $n$ 的约数](#数字-n-的约数)
      - [长度为 $n$ 的二进制数字](#长度为-n-的二进制数字)
      - [长度为 $n$ 的数组的所有排列组合](#长度为-n-的数组的所有排列组合)
      - [判断数字 $n$ 是否是偶数](#判断数字-n-是否是偶数)
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
  - [栈和队列](#栈和队列)
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

封装属于我们的数组

1. data：数组
2. capacity：数组最大容量
3. size：数组目前大小

- `Array()`
- `Array(int capacity)`
- `int getCapacity()`
- `int getSize()`
- `boolean isEmpty()`
- `void add(int index, E e)`
  - `void resize(int newCapacity)`
- `void addLast(E e)`
- `void addFirst(E e)`
- `E getElement(int index)`
- `void setElement(int index, E e)`
- `boolean contains(E e)`
- `int find(E e)`
- `E remove(int index)`
  - `void resize(int newCapacity)`
- `E removeLast()`
- `E removeFirst()`
- `String toString()`

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

## 栈和队列

## 链表

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=JiajiaLiang2001/Algorithm&type=Date)](https://star-history.com/#JiajiaLiang2001/Algorithm&Date)