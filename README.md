#  	数据结构与算法

- [数据结构与算法](#数据结构与算法)
- [基础了解](#基础了解)
  - [线性查找](#线性查找)
    - [常见的算法复杂度](#常见的算法复杂度)
      - [循环](#循环)
      - [数字 n​ 的 x 进制位](#数字-n-的-x-进制位)
      - [数字 n​ 的约数](#数字-n-的约数)
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
    - [队列](#队列)
      - [数组队列](#数组队列)
        - [复杂度分析](#复杂度分析-1)
      - [循环队列](#循环队列)
        - [复杂度分析](#复杂度分析-2)
      - [双端队列](#双端队列)
  - [链表](#链表)
      - [复杂度分析](#复杂度分析-3)
    - [基于链表实现栈](#基于链表实现栈)
      - [链表栈和数组栈对比](#链表栈和数组栈对比)
    - [基于链表实现队列](#基于链表实现队列)
      - [链表队列和数组队列（单向和循环）对比](#链表队列和数组队列单向和循环对比)
    - [链表与递归](#链表与递归)
      - [理论](#理论)
    - [关于链表的更多](#关于链表的更多)
- [递归](#递归)
  - [归并排序](#归并排序)
    - [自顶向下](#自顶向下)
      - [图解](#图解)
      - [时间复杂度大小比较](#时间复杂度大小比较-1)
      - [优化](#优化)
    - [自底向上](#自底向上)
      - [优化](#优化-1)
    - [逆序对](#逆序对)
  - [快速排序](#快速排序)
    - [二路快排](#二路快排)
    - [三路快排](#三路快排)
    - [快速排序应用](#快速排序应用)
  - [二分查找](#二分查找)
    - [非递归实现](#非递归实现)
    - [递归实现](#递归实现)
    - [前闭后开](#前闭后开)
      - [归并排序](#归并排序-1)
  - [二分搜索树](#二分搜索树)
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

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/01_4_1.png" title="Compare-Performance" height="50%" width="50%">
</div>


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

（i = 0​，​j = 0，1，2，3，4，5​）：遍历（​minIndex = 4​）

**1** 4 2 3 **6** 5



（i = 1​，​j = 1，2，3，4，5​）：遍历（​minIndex = 2​）

1 **2** **4** 3 6 5



（i = 2​，​j = 2，3，4，5​）：遍历（​minIndex = 3​）

1 2 **3** **4** 6 5



（i = 3​，​j = 3，4，5​）：遍历（​minIndex = 3）

1 2 3 4 6 5



（i = 4​，​j = 4，5​）：遍历（​minIndex = 5​）

1 2 3 4 **5** **6**



下一步可以省略：

（i = 5​，​j = 5​）：遍历（​minIndex = 5​）

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

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/02_4_1.png" title="Test-Performance" height="50%" width="50%">
</div>

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

（i = 0​）：直接跳出

6 4 2 3 1 5



（i = 1​，​j = 1​）：遍历比较

4 6 2 3 1 5



（i = 2​，j = 2，1​）：遍历比较

2 4 6 3 1 5



（i = 3​，j = 3，2，1​）：遍历比较

2 3 4 6 1 5 



（i = 4​，j = 4，3，2，1​）：遍历比较

1 2 3 4 6 5 



（i = 5，j = 5，4，3，2，1​）：遍历比较

1 2 3 4 5 6 

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_1_1.png" title="Test-Performance" height="50%" width="50%">
</div>

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

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_2_1.png" title="Compare-Performance" height="50%" width="50%">
</div>

#### 时间复杂度

$\mathrm{O}\left(n^{2}\right)$

#### 插入排序重要特征

对于有序数组，插入排序的复杂度是 $O(n)$。因此，插入排序的复杂度小于等于选择排序。

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/03_3_1.png" title="Compare-Performance" height="50%" width="50%">
</div>

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

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/04_5_1.png" title="Generic-Array" height="50%" width="50%">
</div>


### 动态数组

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/04_6_1.png" title="Dynamic-Array" height="50%" width="50%">
</div>


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

增： $\mathrm{O}(n)$

删： $\mathrm{O}(n)$

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
- `05-4-Loop-Queue`
- `05-5-Queues-Comparison`
- `05-6-Loop-Queue-without-Wasting-One-Space`
- `05-7-Loop-Queue-without-Size-Member`
- `05-8-Deque`

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

|    操作     |      时间复杂度      |
| :---------: | :------------------: |
| `getSize()` |   $\mathrm{O}(1)$    |
| `isEmpty()` |   $\mathrm{O}(1)$    |
| `push(E e)` | 均摊 $\mathrm{O}(1)$ |
|   `pop()`   | 均摊 $\mathrm{O}(1)$ |
|  `peek()`   |   $\mathrm{O}(1)$    |

[Leetcode 20. Valid Parentheses](https://leetcode.cn/problems/valid-parentheses/)

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

|      操作      |      时间复杂度      |
| :------------: | :------------------: |
|  `getSize()`   |   $\mathrm{O}(1)$    |
|  `isEmpty()`   |   $\mathrm{O}(1)$    |
| `enqueue(E e)` | 均摊 $\mathrm{O}(1)$ |
|  `dequeue()`   |   $\mathrm{O}(n)$    |
|  `getFront()`  |   $\mathrm{O}(1)$    |

#### 循环队列

- 队列为空（front == tail）

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_4_1.png" title="Empty-Queue" height="50%" width="50%">
</div>

- 队列为满（（tail + 1）% c == front）

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_4_2.png" title="Full-Queue" height="50%" width="50%">
</div>

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

|      操作      |      时间复杂度      |
| :------------: | :------------------: |
|  `getSize()`   |   $\mathrm{O}(1)$    |
|  `isEmpty()`   |   $\mathrm{O}(1)$    |
| `enqueue(E e)` | 均摊 $\mathrm{O}(1)$ |
|  `dequeue()`   | 均摊 $\mathrm{O}(1)$ |
|  `getFront()`  |   $\mathrm{O}(1)$    |

```java
private static int opCount = 100000;
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/05_5_1.png" title="Compare-Performance" height="50%" width="50%">
</div>
>
> 主要影响在于出队操作！
>

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

- **06-Linked-List**
  - `06-1-Linked-List`
  - `06-2-Add-Elements-in-LinkedList`
  - `06-3-DummyHead-in-LinkedList`
  - `06-4-Query-and-Update-in-LinkedList`
  - `06-5-Remove-Element-in-LinkedList`
  - 06-6-Implement-Stack-in-LinkedList
  - `06-7-Compare-LinkedList-Stack-and-Array-Stack`
  - `06-8-Implement-Queue-in-LinkedList`
  - `06-9-Compare-LinkedList-Queue-LoopQueue-and-Array-Queue`
- **07-Linked-List-and-Recursion**
  - `07-1-Linked-List-Problems-in-Leetcode`
  - `07-2-Recursion-Basics`
  - `07-3-LinkedList-and-Recursion`
  - `07-4-Recursive-Debugging`
  - `07-5-Recursive-LinkedList`
  - `07-6-Another-Linked-List-Problems-in-Leetcode`

<div align=center>
  	<img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_1_1.png" title="Linked-List-Structure" height="50%" width="50%">
    <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_2_1.png" title="Linked-List-Structure" height="50%" width="50%">
</div>

封装属于我们的链表：

```java
private class Node {
    public E e;
    public Node next;
    public Node(E e, Node next) {
        this.e = e;
        this.next = next;
    }
    public Node(E e) {
        this(e, null);
    }
    public Node() {
        this(null, null);
    }
    @Override
    public String toString() {
        return e.toString();
    }
}
```

- `LinkedList()`
- `int getSize()`
- `boolean isEmpty()`
- `void add(int index, E e)`
- `void addFirst(E e)`
- `void addLast(E e)`
- `E get(int index)`
- `E getFirst()`
- `E getLast()`
- `void set(int index, E e)`
- `boolean contains(E e)`
- `E remove(int index)`
- `E removeFirst()`
- `E removeLast()`

#### 复杂度分析

|     操作      |   时间复杂度    |
| :-----------: | :-------------: |
|  `getSize()`  | $\mathrm{O}(1)$ |
|  `isEmpty()`  | $\mathrm{O}(1)$ |
|     `add`     | $\mathrm{O}(n)$ |
|  `addFirst`   | $\mathrm{O}(1)$ |
|   `addLast`   | $\mathrm{O}(n)$ |
|     `get`     | $\mathrm{O}(n)$ |
|  `getFirst`   | $\mathrm{O}(1)$ |
|   `getLast`   | $\mathrm{O}(n)$ |
|     `set`     | $\mathrm{O}(n)$ |
|  `contains`   | $\mathrm{O}(n)$ |
|   `remove`    | $\mathrm{O}(n)$ |
| `removeFirst` | $\mathrm{O}(1)$ |
| `removeLast`  | $\mathrm{O}(n)$ |

### 基于链表实现栈

使用[链表](#链表)封装属于我们的栈：

- `LinkedListStack()`
- `int getSize()`
- `boolean isEmpty()`
- `void push(E e)`
- `E pop()`
- `E peek()`

#### 链表栈和数组栈对比

```java
private static int opCount = 100000;
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_7_1.png" title="Compare-Performance" height="50%" width="50%">
</div>

### 基于链表实现队列

使用[链表](#链表)封装属于我们的队列：

- `LinkedListQueue()`
- `int getSize()`
- `boolean isEmpty()`
- `void enqueue(E e)`
- `E dequeue()`
- `E getFront()`

#### 链表队列和数组队列（单向和循环）对比

```java
private static int opCount = 100000;
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_9_1.png" title="Compare-Performance" height="50%" width="50%">
</div>
### 链表与递归



[203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements)



常规解法（分开讨论）：

```java
public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val)
        head = head.next;
    if (head == null)
        return null;
    else {
        ListNode prev = head;
        while (prev.next != null)
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        return head;
    }
}
```

虚拟头节点：

```java
public ListNode removeElements(ListNode head, int val) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode prev = dummyHead;
    while (prev.next != null)
        if (prev.next.val == val)
            prev.next = prev.next.next;
        else
            prev = prev.next;
    return dummyHead.next;
}
```

#### 理论

 $\operatorname{Sum}(\operatorname{arr}[0 \ldots n-1])=\operatorname{arr}[0]+\operatorname{Sum}(\operatorname{arr}[1 \ldots n-1])$

 $\operatorname{Sum}(\operatorname{arr}[1 \ldots n-1])=\operatorname{arr}[1]+\operatorname{Sum}(\operatorname{arr}[2 \ldots n-1])$

$......$

$\operatorname{Sum}(\operatorname{arr}[n-1 \ldots n-1])=\operatorname{arr}[n-1]+\operatorname{Sum}([])$

转换为最基本问题 $\operatorname{Sum}([])$ 的求解！

```java
private static int sum(int[] arr, int l) {
    if (l == arr.length)
        return 0;
    return arr[l] + sum(arr, l + 1);
}
```

**举例：arr= [6,10]**

$\operatorname{arr}=[6,10]$

- sum(arr,0) 

- sum(arr,1)

- sum(arr,2) return 0

- return arr[1] + sum(arr,2) = 10 + 0 = 10 (sum(arr,1))
- return arr[0] + sum(arr,0) = 6 + 10 = 16 (sum(arr,0))

**链表&递归**

![Recursive-Process-For-Removing-Elements](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_3_1.png)

```java
public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;// 1
    head.next = removeElements(head.next, val); // 2
    return head.val == val ? head.next : head;// 3
}
```

**举例：6 -> 7 -> 8 -> null**

$6 \rightarrow7 \rightarrow8 \rightarrow null$

- $head：6 \rightarrow7 \rightarrow8 \rightarrow null$：removeElements(head,6) 
  - 1
  - 2
  - $head：7 \rightarrow8 \rightarrow null$：removeElements(head,6) 
    - 1
    - 2
    - $head：8 \rightarrow null$：removeElements(head,6) 
      - 1
      - 2 
      - $head：null$：removeElements(head,6) 
        - 1：return null
      - 8 -> null
      - **3：return 8 -> null**
  - 7 -> 8 -> null
  - **3：return 8 -> null**
- 6 -> 8 -> null
- **3：return 6 -> 8 -> null**

![Linked-List-Recursion-Diagram](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_3_2.png)

**递归深度**

```java
public ListNode removeElements(ListNode head, int val, int depth) {
    String depthString = generateDepthString(depth);
    System.out.print(depthString);
    System.out.println("Call: remove " + val + " in " + head);
    if (head == null) {
        System.out.print(depthString);
        System.out.println("Return: " + head);
        return head;
    }
    ListNode res = removeElements(head.next, val, depth + 1);
    System.out.print(depthString);
    System.out.println("After remove " + val + ": " + res);
    ListNode ret;
    if (head.val == val)
        ret = res;
    else {
        head.next = res;
        ret = head;
    }
    System.out.print(depthString);
    System.out.println("Return: " + ret);
    return ret;
}
```



<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_4_1.png" title="Recursive-Debugging" height="50%" width="50%">
</div>



**使用递归实现链表的操作**

- *add*

![Recursive-LinkedList-add](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_5_1.png)

- *get*

![Recursive-LinkedList-get](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_5_2.png)

- *set*

![Recursive-LinkedList-set](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_5_3.png)

- *contains*

![Recursive-LinkedList-contains](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_5_4.png)

- *remove*

![Recursive-LinkedList-remove](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_5_5.png)

### 关于链表的更多

```java
class Node{
    E e;
    Node next,prev;
}
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/doubly_linked_list.png" title="Doubly-Linked-List" height="50%" width="50%">
</div>

```java
class Node{
    E e;
    Node next,prev;
}
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/circular_linked_list.png" title="Doubly-Linked-List" height="50%" width="50%">
</div>

```java
class Node{
    E e;
    int next;
}
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/array_linked_list.png" title="Array-Linked-List" height="50%" width="50%">
</div>


[Leetcode 206. Reverse Linked List](https://leetcode.cn/problems/reverse-linked-list/)



- **非递归**

```java
public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while (cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}
```

|                             初步                             |                             1-2                              |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| ![Linked-List-Flip-Leetcode](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_1.png) | ![Linked-List-Flip-Non-Recursive-1-2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_2.png) |

<div align=left>
  	<img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_3.png" title="Linked-List-Flip-Non-Recursive-3-456-1" height="50%" width="50%">
	<img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_4.png" title="Linked-List-Flip-Non-Recursive-3-456-2" height="50%" width="50%">
    <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_5.png" title="Linked-List-Flip-Non-Recursive-3-456-3" height="50%" width="50%">
    <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_6.png" title="Linked-List-Flip-Non-Recursive-3-456-4" height="50%" width="50%">
</div>
- **递归**

```java
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
        return head;
    ListNode rev = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return rev;
}
```

![Linked-List-Flip-Leetcode](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_7.png)

![Linked-List-Flip-Non-Recursive-*](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_8.png)

# 递归

## 归并排序

### 自顶向下

- **08-MergeSort**
  - `08-1-MergeSort`
  - `08-2-MergeSort-Track`
  - `08-3-MergeSort-Complexity`
  - `08-4-MergeSort-Basic-Optimization`
  - `08-5-MergeSort-Advanced-Optimization`
  - `08-6-MergeSort-Memory-Optimization`
  - `08-7-Bottom-Up`
  - `08-8-Bottom-Up-Optimization`
  - `08-9-Reverse-Pairs`

**算法模板**：

```java
MergerSort(arr,l,r){
	if(l >= r) return;
	int mid = (l + r) / 2;
    // 对arr[l,mid]进行排序
	MergerSort(arr,l,mid);
    // 对arr[mid+1,r]进行排序
	MergerSort(arr,mid+1,r);
    //将arr[l,mid]和arr[mid+1,r]合并
	merge(arr,l,mid,r);
}
```

#### 图解

![MergeSort](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_1_1.png)

打印跟踪



<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_2_1.png" title="MergeSort-Track" height="50%" width="50%">
</div>



#### 时间复杂度大小比较



<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_3_1.png" title="Test-Performance" height="50%" width="50%">
</div>


#### 优化

- 优化一（增加判断）

```java
if (arr[mid].compareTo(arr[mid + 1]) > 0)// arr[mid] < arr[mid + 1],
    merge(arr, l, mid, r);
```

同其他排序（选择排序、插入排序）比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_4_1.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_4_2.png) |

优化前后自身比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_4_3.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_4_4.png) |

- 优化二（插入排序）

在优化一的基础上测试

```java
if (arr[mid].compareTo(arr[mid + 1]) > 0)// arr[mid] < arr[mid + 1],
    merge(arr, l, mid, r);
```

同其他排序（选择排序、插入排序）比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_5_1.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_5_2.png) |

优化前后自身比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_5_3.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_5_4.png) |

- 优化三（临时空间）

在优化一、二的基础上测试

```java
E[] temp = Arrays.copyOf(arr, arr.length);
...
System.arraycopy(arr, l, temp, l, r - l + 1);
int i = l, j = mid + 1;
for (int k = l; k <= r; k++) {
    if (i > mid)
        arr[k] = temp[j++];
    else if (j > r)
        arr[k] = temp[i++];
    else if (temp[i].compareTo(temp[j]) <= 0)
        arr[k] = temp[i++];
    else
        arr[k] = temp[j++];
}
```

同其他排序（选择排序、插入排序）比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_6_1.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_6_2.png) |

优化前后自身比较

| 随机数组                                                     | 有序数组                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![MergeSort1](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_6_3.png) | ![MergeSort2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_6_4.png) |

### 自底向上

```java
public static <E extends Comparable<E>> void sortBU(E[] arr) {
    int n = arr.length;
    E[] temp = Arrays.copyOf(arr, n);
    for (int size = 1; size < n; size += size) {
        // Merge [i , i + sz -1] and [i + sz , min(i + 2 * sz -1 , n - 1)]
        for (int i = 0; i + size < n; i += 2 * size)
            merge(arr, i, i + size - 1, Math.min(i + 2 * size - 1, n - 1), temp);
    }
}
```

***6 4 2 3 1 5***

------

- size = 1（i < 5）
  - i = 0
    - [0] [1] `merge(arr, 0, 0, 1, temp);`
  - i = 2
    - [2] [3] `merge(arr, 2, 2, 3, temp);`
  - i = 4
    - [4] [5] `merge(arr, 4, 4, 5, temp);`

***4 6 2 3 1 5***

- size = 2（i < 4）
  - i = 0
    - [0,1] [2,3] `merge(arr, 0, 1, 3, temp);`

***2 3 4 6 1 5***

- size = 4（i < 2）
  - i = 0
    - [0,3] [4,5] `merge(arr, 0, 3, 5, temp);`

***1 2 3 4 5 6***

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_7_1.png" title="Compare-Performance" height="50%" width="50%">
</div>


#### 优化

```java
public static <E extends Comparable<E>> void sortBU2(E[] arr) {
    int n = arr.length;
    E[] temp = Arrays.copyOf(arr, n);
    for (int i = 0; i < n; i += K + 1)
        InsertionSort.sort(arr, i, Math.min(n - 1, i + K));
    for (int size = K + 1; size < n; size += size) {
        // Merge [i , i + sz -1] and [i + sz , min(i + 2 * sz -1 , n - 1)]
        for (int i = 0; i + size < n; i += 2 * size) {
            int l = i, mid = i + size - 1, r = Math.min(i + 2 * size - 1, n - 1);
            merge(arr, l, mid, r, temp);
        }
    }
}
```

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/08_8_1.png" title="Compare-Performance" height="50%" width="50%">
</div>


### 逆序对

https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/

## 快速排序

- **09-Quick-Sort**
  - `09-1-QuickSort`
  - `09-2-QuickSort-Optimized-by-Random`
  - `09-3-QuickSort-2-Ways`
  - `09-4-QuickSort-3-Ways`
  - `09-5-Sort-Colors`
  - `09-6-Select-K`

![QuickSort](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/09_1_1.png)

![Partition](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/09_1_2.png)

对于有序数组：

![QuickSort](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/09_2_1.png)

时间复杂度： $\mathrm{O}\left(n^{2}\right)$

递归深度： $O(n)$

------

随机选择（选中最小值）：

$\frac{1}{n} \times \frac{1}{n-1} \times \frac{1}{n-2} \times \ldots \times \frac{1}{1}=\frac{1}{n !}$，概率很低。

### 二路快排

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/09_3_1.png" title="Two-Way- Quicksort" height="50%" width="50%">
</div>

### 三路快排

<div align=center>
  <img src="https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/09_4_1.png" title="Three-Way- Quicksort" height="50%" width="50%">
</div>

### 快速排序应用

[Leetcode 75. Sort Colors](https://leetcode.cn/problems/sort-colors/)



[Leetcode 剑指 Offer 40. 最小的k个数](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/submissions/)

[Leetcode 215. Kth Largest Element in an Array](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/)

[面试题 17.14. 最小K个数](https://leetcode.cn/problems/smallest-k-lcci/)

## 二分查找

- **10-Binary-Search**
  - `10-1-Recursive-Binary-Search`
  - `10-2-Binary-Search`
  - `10-3-Select-K-Non-Recursive`

### 非递归实现

```java
public static <E extends Comparable<E>> int search(E[] data, E target) {
    int l = 0, r = data.length - 1;
    while(l <= r){
        int mid = l + (r - l) / 2;
        if(data[mid].compareTo(target) == 0)
            return mid;
        if(data[mid].compareTo(target) < 0)
            l = mid + 1;
        else
            r = mid - 1;
    }
    return -1;
}
```

### 递归实现

```java
public static <E extends Comparable<E>> int searchR(E[] data, E target) {
    return searchR(data, 0, data.length - 1, target);
}
private static <E extends Comparable<E>> int searchR(E[] data, int l, int r, E target) {
    if (l > r) return -1;
    int mid = l + (r - l) / 2;
    if (data[mid].compareTo(target) == 0)
        return mid;
    if (data[mid].compareTo(target) < 0)
        return searchR(data, mid + 1, r, target);
    return searchR(data, l, mid - 1, target);
}
```

### 前闭后开

包括递归与非递归

```java
public static <E extends Comparable<E>> int search(E[] data, E target) {
    int l = 0, r = data.length;
    while (l < r) {
        int mid = l + (r - l) / 2;
        if (data[mid].compareTo(target) == 0)
            return mid;
        if (data[mid].compareTo(target) < 0)
            l = mid + 1;// [mid + 1 , r)
        else
            r = mid;// [l , mid)
    }
    return -1;
}
public static <E extends Comparable<E>> int searchR(E[] data, E target) {
    return searchR(data, 0, data.length, target);
}
private static <E extends Comparable<E>> int searchR(E[] data, int l, int r, E target) {
    if (l >= r) return -1;
    int mid = l + (r - l) / 2;
    if (data[mid].compareTo(target) == 0)
        return mid;
    if (data[mid].compareTo(target) < 0)
        return searchR(data, mid + 1, r, target);// [mid + 1 , r)
    return searchR(data, l, mid, target);// [l , mid)
}
```

#### 归并排序

$[l, \mathrm{mid})$

$[mid, \mathrm{r})$

## 二分搜索树

# Star History

[![Star History Chart](https://api.star-history.com/svg?repos=JiajiaLiang2001/Algorithm&type=Date)](https://star-history.com/#JiajiaLiang2001/Algorithm&Date)