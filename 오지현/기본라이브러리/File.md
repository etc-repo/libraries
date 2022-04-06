file 클래스
====
* 파일 및 디렉터리 경로 이름의 추상적 표현
* 따라서 File 인스턴스는 파일일 수도 있고 디렉터리일 수도 있음

필드
---
<code>pathSeparator</code> : 편의를 위해 문자열로 표시되는 시스템 종속 경로 분리기 문자  
<code>pathSeparatorChar</code> : 시스템에 종속된 경로 분리기 문자  
<code>separator</code> : 편의를 위해 문자열로 표시되는 시스템 종속 기본 이름 구분 문자  
<code>separatorChar</code> : 시스템에 종속된 기본 이름 구분 문자  

생성자
---
<code>File(File parent, String child)</code> : 주어진 부모 파일의 pathname과 자식 pathname으로 새로운 File 객체를 생성함
<code>File(String pathname)</code> : pathname에 해당되는 파일의 File객체를 생성함
<code>File(String parent, String child)</code> : 부모 pathname과 자식 pathname으로 새로운 File 객체를 생성함
<code>File(URI uri)</code> : file url 경로에 대한 파일의 File 객체를 생성함  

메서드
---
<code>canExecute()</code> : 응용프로그램이 표시된 파일을 실행할 수 있는지 여부를 테스트
<code>canRead()</code> : 응용 프로그램이 표시된 파일을 읽을 수 있는지 여부를 테스트  
<code>canWrite()</code> : 응용 프로그램이 표시된 파일을 수정할 수 있는지 여부를 테스트  
<code>createNewFile()</code> : 새로운 파일을 생성  

코드
---
```java
import java.io.*;

class Ex2

{

	public static void main(String[] args) {
		File f = new File("F:\\eclipse-workspace\\Week2\\src\\Ex2.java");
		// File 인스턴스를 생성했다고 해서 파일이나 디렉터리가 생성되는 것은 아님

		String fileName = f.getName();

		int pos = fileName.lastIndexOf(".");

		System.out.println("File.pathSeparator - " + File.pathSeparator); // 파일 전체 path 구분자. ;

		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);

		System.out.println("File.separator - " + File.separator); // 디렉터리 구분자. /

		System.out.println("File.separatorChar - " + File.separatorChar);

		System.out.println();

	}
}
```

```
File.pathSeparator - ;
File.pathSeparatorChar - ;
File.separator - \
File.separatorChar - \
```

```java
//기존에는 없는 파일을 새로 생성하는 코드
import java.io.*;

class Ex2

{

	public static void main(String[] args) throws IOException {

		File f = new File("F:\\\\eclipse-workspace\\\\Week2\\\\src", "Ex3.txt");
		f.createNewFile();
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}
}
```
```
true
true
true
```
![image](https://user-images.githubusercontent.com/86463944/161928621-87a6a511-afe9-4aef-86b6-400c6ce74617.png)
