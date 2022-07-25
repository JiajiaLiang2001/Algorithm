# 数据结构与算法

[TOC]

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

### 算法复杂度大小比较

$$
\mathrm{O}(1)<\mathrm{O}(\log n)<\mathrm{O}(\sqrt{n})<\mathrm{O}(n)<\mathrm{O}(n \log n)<\mathrm{O}\left(n^{2}\right)<\mathrm{O}\left(2^{n}\right)<\mathrm{O}(n !)
$$

01-4_1

![Test-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/01_4_1.png)

## 基础排序算法

- **02-Selection-Sort**
  - `02-1-Selection-Sort`
  - `02-2-Using-Generics`
  - `02-3-Using-Comparable`

### 选择排序法

***6 4 2 3 1 5***

------

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

#### 算法复杂度

$$
\begin{aligned}
& 1+2+3+\ldots+\mathrm{n} \\
=& \frac{(1+n) * n}{2} \\
=& \frac{1}{2} n^{2}+\frac{1}{2} n
\end{aligned}
$$

$\mathrm{O}\left(n^{2}\right)$

### 插入排序法

![Test-Performance](https://github.com/JiajiaLiang2001/Algorithm/blob/master/images/02_4_1.png)