#  数据结构与算法

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
      - [复杂度分析](#复杂度分析-3)
    - [基于链表实现栈](#基于链表实现栈)
      - [链表栈和数组栈对比](#链表栈和数组栈对比)
    - [基于链表实现队列](#基于链表实现队列)
      - [链表队列和数组队列（单向和循环）对比](#链表队列和数组队列单向和循环对比)
    - [链表与递归](#链表与递归)
      - [链表实践](#链表实践)
      - [递归基础](#递归基础)
        - [举例：arr= [6,10]](#举例arr-610)
      - [链表&递归](#链表递归)
        - [举例：6 -> 7 -> 8 -> null](#举例6---7---8---null)
        - [tip：递归深度](#tip递归深度)
        - [使用递归实现链表的操作](#使用递归实现链表的操作)
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

|    操作     |     时间复杂度      |
| :---------: | :-----------------: |
| `getSize()` |   $\mathrm{O}(1)$   |
| `isEmpty()` |   $\mathrm{O}(1)$   |
| `push(E e)` | 均摊$\mathrm{O}(1)$ |
|   `pop()`   | 均摊$\mathrm{O}(1)$ |
|  `peek()`   |   $\mathrm{O}(1)$   |

#### 栈的应用

https://leetcode.cn/problems/valid-parentheses/

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

|      操作      |     时间复杂度      |
| :------------: | :-----------------: |
|  `getSize()`   |   $\mathrm{O}(1)$   |
|  `isEmpty()`   |   $\mathrm{O}(1)$   |
| `enqueue(E e)` | 均摊$\mathrm{O}(1)$ |
|  `dequeue()`   |   $\mathrm{O}(n)$   |
|  `getFront()`  |   $\mathrm{O}(1)$   |

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

|      操作      |     时间复杂度      |
| :------------: | :-----------------: |
|  `getSize()`   |   $\mathrm{O}(1)$   |
|  `isEmpty()`   |   $\mathrm{O}(1)$   |
| `enqueue(E e)` | 均摊$\mathrm{O}(1)$ |
|  `dequeue()`   | 均摊$\mathrm{O}(1)$ |
|  `getFront()`  |   $\mathrm{O}(1)$   |

#### 两种实现方式对比

```java
private static int opCount = 100000;
```

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

- **06-Linked-List**
  - `06-1-Linked-List`
  - `06-2-Add-Elements-in-LinkedList`
  - `06-3-DummyHead-in-LinkedList`
  - `06-4-Query-and-Update-in-LinkedList`
  - `06-5-Remove-Element-in-LinkedList`

![Linked-List-Structure](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_1_1.png)

![Linked-List-Structure](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_2_1.png)

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

![Compare-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_7_1.png)

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

![Compare-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/06_9_1.png)

### 链表与递归

#### 链表实践

https://leetcode.cn/problems/remove-linked-list-elements/

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

#### 递归基础

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

##### 举例：arr= [6,10]

$\operatorname{arr}=[6,10]$

- sum(arr,0) 

- sum(arr,1)

- sum(arr,2) return 0

- return arr[1] + sum(arr,2) = 10 + 0 = 10 (sum(arr,1))
- return arr[0] + sum(arr,0) = 6 + 10 = 16 (sum(arr,0))

#### 链表&递归

递归解决[上述问题](#链表实践)

![Recursive-Process-For-Removing-Elements](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_3_1.png)

```java
public ListNode removeElements(ListNode head, int val) {
    if (head == null) return null;// 1
    head.next = removeElements(head.next, val); // 2
    return head.val == val ? head.next : head;// 3
}
```

##### 举例：6 -> 7 -> 8 -> null

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

##### tip：递归深度

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

![Recursive-Debugging](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_4_1.png)

##### 使用递归实现链表的操作

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

![Doubly-Linked-List](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/doubly_linked_list.png)

```java
class Node{
    E e;
    Node next,prev;
}
```

![Circular-Linked-List](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/circular_linked_list.png)

```java
class Node{
    E e;
    int next;
}
```

![Array-Linked-List](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/array_linked_list.png)

### 链表相关习题

https://leetcode.cn/problems/reverse-linked-list/

#### 非递归

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

![Linked-List-Flip-Leetcode](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_1.png)

![Linked-List-Flip-Non-Recursive-1-2](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_2.png)

![Linked-List-Flip-Non-Recursive-3-456](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_3.png)

![Linked-List-Flip-Non-Recursive-3-456](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_4.png)

![Linked-List-Flip-Non-Recursive-3-456](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_5.png)

![Linked-List-Flip-Non-Recursive-3-456](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/07_6_6.png)

#### 递归

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

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=JiajiaLiang2001/Algorithm&type=Date)](https://star-history.com/#JiajiaLiang2001/Algorithm&Date)