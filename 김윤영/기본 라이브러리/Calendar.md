# Calendar 클래스
- java.util 패키지에 포함되어 있음
- 날짜와 시간에 관한 데이터를 손쉽게 처리할 수 있도록 제공하는 추상 클래스
- Calendar 클래스의 모든 필드는 클래스 변수이므로, 객체를 생성하지 않고도 바로 사용할 수 있다. 


## 클래스 변수
- 클래스 변수는 인스턴스 변수에 static만 붙이주면 됨
- 인스턴스 변수는 각각 고유한 값을 가지지만 클래스 변수는 모든 인스턴스가 공통된 값을 공유하게 됨
- 한 클래스의 모든 인스턴스들이 공통적인 값을 가져야할 때 클래스 변수로 선언함클래스가 로딩될 때 생성되어(그러므로 메모리에 딱 한번만 올라갑니다.) 
- 종료 될 때 까지 유지되는 클래스 변수는 public 을 붙이면 같은 프로그램 내에서 어디서든 접근할 수 있는 전역 변수가 됩니다. 
- 또한 인스턴스 변수의 접근법과 다르게 인스턴스를 생성하지 않고 클래스이름.클래스변수명 을 통해서 접근할 수 있습니다.


## Calendar 클래스의 주요 메소드


### add()
- 전달된 Calendar 필드에서 일정 시간 만큼을 더하거나 빼준다
- 특정 시간을 기준으로 일정 시간 전후의 날짜와 시간을 알 수 있다

``` java
Calendar time = Calendar.getInstance();
System.out.println(time.getTime());

 
time.add(Calendar.SECOND, 120);
System.out.println(time.getTime());

실행결과:
Thu Feb 16 08:57:29 KST 2017
Thu Feb 16 08:59:29 KST 2017

```



### before(), after()
- before() 메소드는 현재 Calendar 인스턴스(Calendar 클래스의 객체)가 전달된 객체가 나타내는 시간보다 앞서는지를 판단함
- after() 메소드는 현재 Calendar 인스턴스(Calendar 클래스의 객체)가 전달된 객체가 나타내는 시간보다 나중인지를 판단함

``` java
Calendar time1 = Calendar.getInstance();
Calendar time2 = Calendar.getInstance();
Calendar time3 = Calendar.getInstance();

time2.set(1982, 2, 19);
time3.set(2020, 2, 19);

System.out.println(time1.before(time2));
System.out.println(time1.before(time3));

실행 결과:
false
true


```




### get()
- Calendar 필드에 저장된 값을 반환함

``` java
Calendar time = Calendar.getInstance();
System.out.println(time.get(Calendar.DAY_OF_WEEK));

실행결과: 5

```



### set()
- Calendar 필드에 특정 값으로 설정함

``` java
Calendar time = Calendar.getInstance();
time.set(Calendar.YEAR, 2020);
System.out.println(time.getTime());

실행 결과: 
Sun Feb 16 08:58:01 KST 2020

```
