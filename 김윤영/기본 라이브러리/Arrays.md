# Arrays 클래스
- java.util 패키지에 포함되므로, 반드시 import문으로 java.util 패키지를 불러오고 나서야 사용해야 함
- 배열을 다루기 위한 다양한 메소드가 포함되어 있음
- Arrays 클래스의 모든 메소드는 클래스 메소드이므로 객체를 생성하지 않고도 바로 사용할 수 있음



## java.util 패키지
- 프로그램을 개발하는 데 사용할 수 있는 유용한 유틸리티 클래스가 다수 포함되어 있음.
- import 문을 사용하지 않아도 바로 사용할 수 있는 java.lang 패키지와 달리 java.util 패키지는 import문으로 패키지를 불러오고 나서야 클래스 이름만으로 사용 가능


## Arrays 클래스의 주요 메소드

### binarySearch()
- 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후, 해당 위치를 반환함
	- 첫 번째 매개변수: sort()를 사용하여 미리 정렬된 배열
	- 두 번째 매개변수: 검색할 값
	- 반환 타입: int

![화면 캡처 2022-03-29 000118](https://user-images.githubusercontent.com/81403841/160428570-7c5b54ea-9f59-4341-918c-b039cb2f0bbf.png)



### sort()
- 전달받은 배열의 모든 요소를 오름차순으로 정렬함
	- 매개변수: 정렬한 배열

``` java
int[] arr = {5, 3, 4, 1, 2};

 

Arrays.sort(arr);

for (int i = 0; i < arr.length; i++) {

    System.out.print(arr[i] + " ");

}

//실행 결과: 1 2 3 4 5

```

### fill()
- 전달 받은 배열의 모든 요소를 특정 값으로 초기화함
	- 첫 번째 매개변수: 초기화할 배열
	- 두 번째 매개변수: 초기값

``` java
int[] arr = new int[10];

 

Arrays.fill(arr, 7);

for (int i = 0; i < arr.length; i++) {

    System.out.print(arr[i] + " ");

}
// 실행 결과: 7 7 7 7 7 7 7 7 7 7

```

### copyOf()
- 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환함
	- 첫 번째 매개변수: 원본 배열
	- 두 번째 매개변수: 원본 배열에서 새로운 배열로 복사할 요소의 개수







