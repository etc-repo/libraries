List 클래스
============
* Collection interface를 상속받음
* 중복된 값을 허용하며 순서도 가짐
* set 자료구조와 특징이 반대임




메소드
-------
* <code>get(index)</code> : 해당되는 index가 가지고 있는 값을 반환함   
***
* 리스트는 배열과 비슷하지만 배열과 다르게 저장공간이 필요에 따라 자유롭게 변경됨   
* List를 이용하여 구현하되 ArrayList를 많이 사용함
```java
//ArrayList생성
List<String> list = new ArrayList<>();
```
* Generic을 사용하면 위와 같이 선언하여 사용할 수 있음
* 길이가 정해져 잇지 않아서 길이를 알 수 없는 배열을 더할 때 유용하게 사용할 수 있음

코드
-----

```java
List<String>list = new ArrayList<>();
list.add("kim");
list.add("park");
list.add("kim"); //set는 달리 중복을 허용함

System.out.println(lisst.size());

//list의 길이만큼 반복해서 list안의 값들을 출력
for(int i = 0; i<list.size(); i++){
System.out.println(list.get(i));
}
```
