# File 클래스란

- 파일이나 디렉터리에 대해, 경로명, 크기, 타입, 수정 날짜 등의 속성 정보를 제공하고, 
파일 삭제, 디렉터리 생성, 파일 이름 변경,  디렉터리 내의 파일 리스트 제공 등 다양한 파일 관리 작업을 지원한다
- 경로명은 java.io.File
- File 클래스는 파일 입출력 기능이 없어 파일을 읽고 쓰는 것은 FileInputStream, FileOutputStream, FileReader, FileWriter 등 
파일 입출력 클래스를 이용해야 함


## 객체 생성

- File클래스의 생성자

메소드|설명
|:--:|:--:|
File(File parent, String child)|parent 디렉터리에 child 이름의 서브 디렉터리나 파일을 나타내는 File 객체 생성
File(String pathname)|pathname의 완전 경로명이 나타내는 File 객체 생성
File(String parent, String child)|parent 디렉터리에 child 이름의 서브 디렉터리나 파일을 나타내는 File 객체 생성
File(URI uri)|file:URI를 추상 경로명으로 변환하여 File 객체 생성

``` java
File f = new File("c:\\Temp\\test.txt");
File f = new File("c:\\Temp", "test.txt"); //디렉터리와 파일명을 나누어 전달
```



## 메소드
- 파일 크기와 타입을 알아내고, 파일 삭제, 이름 변경, 디렉터리 생성,디렉터리의 파일 리스트 얻기 등 다양한 파일 관리 작업을 수행 가능



### 파일 생성, mkdir()
- boolean mkdir(): 새로운 디렉터리 생성

```java
File f1 = new File("c:\\windows\\system.ini");
if(!f1.exists()) {  // f1디렉토리가 존재하는지 검사
  f1.mkdir();       // 존재하지 않으면 디렉토리 생성
}

```

### 파일 크기, length()
- 파일이나 디렉터리의 크기를 리턴
- 파일이 존재하지 않거나, length()는 운영체제에 따라 0을 리턴하기도 함

```java
File f = new File("c:\\windows\\system.ini"); // 파일 크기는 219바이트
long size = f.length(); //size = 219
```



### 파일의 경로명, getName(), getPath(), getParent()
- getName(): 파일명
- getPath(): 완전 경로명
- getParent(): 부모 디렉터리를 문자열로 반환

```java
File f = new File("c:\\windows\\system.ini");
String filename = f.getName(); //"system.ini"
String path = f.getPath();     //"c:\\windows\\system.ini"
String parent = f.getParent(); //"c:\\windows"
```


### 파일 타입 판별, isFile(), isDirectory()
- isFile(): 경로명이 파일인지에 따라 true/false를 리턴
- isDirectory(): 경로명이 디렉토리에 따라 true/false를 리턴

```java
File f = new File("c:\\windows\\system.ini");
if(f.isFile())
  System.out.println(f.getPath() + "는 파일입니다.");
else if(f.isDirectory())
  System.out.println(f.getPath() + "는 디렉터리입니다.");

// c:\\windows\system.ini는 파일입니다.
```







