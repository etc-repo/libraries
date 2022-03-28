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

실행 결과: 1 2 3 4 5

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

실행 결과: 7 7 7 7 7 7 7 7 7 7

```

### copyOf()
- 전달받은 배열의 특정 길이만큼을 원본 배열과 같은 타입의 새로운 배열로 복사하여 반환함
	- 첫 번째 매개변수: 원본 배열
	- 두 번째 매개변수: 원본 배열에서 새로운 배열로 복사할 요소의 개수

- 새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소의 타입에 맞게 다음과 같은 기본값으로 채워짐


배열 요소의 타입 | 기본값
|:---:|:---:|
char|'\u0000'
byte, short, int|0
long|0L
float|0.0F
double|0.0 또는 0.0D
boolean|false
배열, 인스턴스 등|null

``` java
int[] arr1 = {1, 2, 3, 4, 5};

1) int[] arr2 = Arrays.copyOf(arr1, 3);

for (int i = 0; i < arr2.length; i++) {

    System.out.print(arr2[i] + " ");

}
// 1번 라인에서는 copyOf() 메소드를 사용하여 배열 arr1의 첫 번째 배열 요소부터 3개의 요소를 복사하여 배열 arr2에 대입하고 있습니다.

2) int[] arr3 = Arrays.copyOf(arr1, 10);

for (int i = 0; i < arr3.length; i++) {

    System.out.print(arr3[i] + " ");
// 2번 라인에서는 배열 arr1에서 10개의 배열 요소를 복사하여 배열 arr3에 대입하려고 합니다.
// 하지만 배열 arr1의 길이가 5밖에 안되므로, 배열 arr3의 나머지 배열 요소에는 int형의 기본값인 0이 채워지게 됩니다.
}

실행결과: 
1 2 3
1 2 3 4 5 0 0 0 0 0
```

---

### copyOfRange()
- 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환함


	- 첫 번째 매개변수: 복사의 대상이 될 원본 배열
	- 두 번째 매개변수: 원본 배열에서 복사할 시작 인덱스
	- 세 번째 매개변수: 복사될 배열 요소의 바로 다음 인덱스(세 번째 매개변수로 전달된 인덱스 바로 전까지의 배열 요소까지만 복사됨)

``` java

int[] arr1 = {1, 2, 3, 4, 5};

 

int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);

for (int i = 0; i < arr2.length; i++) {

    System.out.print(arr2[i] + " ");

}

실행결과: 3 4


```





