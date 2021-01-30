- `int length()` 
> 返回构建器或缓冲器中代码单元数量
- `StringBuilder append(String str)`
> 追加一个字符串。返回this
- `void setCharAt(int i, char c)
> 将第i个代码单元设为c
- `StringBuilder insert(int offset, char c)`
> 在offset处插入一个字符并返回this
- `StringBuilder delete(int startIndex, int endIndex)`
> 删除偏移量从startIndex到endIndex-1位置的代码单元并返回this

1. `char charAt(int index)`
>返回给定位置的代码单元
2. `int codePointAt(int index)`
> 返回从给定位置开始的码点
3. `int offsetByCodePoints(int startIndex, int cpCount)`
>
4. `int compareTo(String other)`
>
5. `IntStream codePoints()`
>
6. `new String(int[] codePoints, int offset, int count)`
>
7. `boolean empty()`
>
8. `boolean blank()`
>
9. `boolean equals(Object other)`
>
10. `boolean equalsIgnoreCase(String other)`
>
11. `boolean startsWith(String prefix)`
>
12. `boolean endsWith(String suffix)`
>
13. `boolean indexOf(String str)`
>
14. `boolean indexOf(String str, int fromIndex)`
>
15. `boolean indexOf(int cp)`
>
16. `boolean indexOf(int cp, int fromIndex)`
>
17. `int lastIndexOf(String str)`
>
18. `int lastIndexOf(String str, int fromIndex)`
>
19. `int lastIndexOf(int cp)`
>
20. `int lastIndexOf(int cp, int fromIndex)`
>
21. `int length()`
>
22. `int codePointCount(int startIndex, int endIndex)`
>
23. `String replace(CharSequence oldStr, CharSequence newStr)`
>
24. `String substring(int beginIndex)`
>
25. `String substring(int beginIndex, int endIndex)`
>
26. `String toLowCase()`
>
27. `String toUpperCase()`
>
28. `String trim()`
>
29. `String strip()`
>
30. `String join(CharSequence delimiter, CharSequence... elements)`
>
31. `String repeat(int count)`
>