Set 클래스
======
* Collection interface를 상속받는 클래스임
* 중복된 값을 허용하지 않으며 순서도 없는 자료구조임
* add메소드를 이용하여 값을 넣을 수 있음
* 값이 제대로 들어가지 않으면(중복된 값)false를 반환함

코드
-----
```java
Set<String> set1 = new HashSet<>();
boolean flag = set1.add("hoho");
boolean flag2 = set1.add("Hello");
boolean flag3 = set1.add("Hello");

System.out.println(set1.size()); // 중복된 값은 들어가지 않아서 '2'

System.out.println(flag);
System.out.println(flag2);
System.out.println(flag3); //똑같은 값이 입력돼서 false

```

