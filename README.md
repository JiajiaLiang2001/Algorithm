# 数据结构与算法

## 线性查找

- 01-Linear-Search
  - 1-Linear-Search
  - 2-Using-Generics
  - 3-Using-Custom-Class
  - 4-Test-Performance

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

![Test-Performance]()

