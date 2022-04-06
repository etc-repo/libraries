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
<code>File(File parent, String child)</code> : 부모 추상 경로 이름과 자식 경로 이름 문자열에서 새 인스턴스를 만듦   
<code>File(String pathname)</code> : 지정된 경로 이름 문자열을 추상 경로 이름으로 변환하여 새 인스턴스를 만듦  
<code>File(String parent, String child)</code> : 부모 경로 이름 문자열과 자식 경로 이름 문자열에서 새 인스턴스를 만듦  
<code>File(URI uri)</code> : 지정된 URI를 추상 경로 이름으로 변환하여 새 인스턴스를 만듦  

메서드
---
<code>canExecute()</code> : 응용 프로그램이 이 추상 경로 이름으로 표시된 파일을 실행할 수 있는지 여부를 테스트합니다  
<code>canRead()</code> : 응용 프로그램이 이 추상 경로 이름으로 표시된 파일을 실행할 수 있는지 여부를 테스트합니다  
<code>canWrite()</code> : 응용 프로그램이 이 추상 경로 이름으로 표시된 파일을 수정할 수 있는지 여부를 테스트합니다.  
<code>createNewFile()</code> : 두 추상 경로 이름을 사전적으로 비교합니다.  

코드
---
```java
import java.io.*;

class Ex2

{

	public static void main(String[] args) {
		File f = new File("F:\\eclipse-workspace\\Week2\\src\\Ex2.java");

		String fileName = f.getName();

		int pos = fileName.lastIndexOf(".");

		System.out.println("경로를 제외한 파일이름 - " + f.getName());

		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos));

		System.out.println("확장자 - " + fileName.substring(pos + 1));

		System.out.println("경로를 포함한 파일이름 - " + f.getPath());

		System.out.println("파일의 절대경로        - " + f.getAbsolutePath());

		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());

		System.out.println();

		System.out.println("File.pathSeparator - " + File.pathSeparator); // 파일 전체 path 구분자. ;

		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);

		System.out.println("File.separator - " + File.separator); // 디렉터리 구분자. /

		System.out.println("File.separatorChar - " + File.separatorChar);

		System.out.println();

		System.out.println("user.dir=" + System.getProperty("user.dir"));

		System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
	}
}
```

```
경로를 제외한 파일이름 - Ex2.java
확장자를 제외한 파일이름 - Ex2
확장자 - java
경로를 포함한 파일이름 - F:\eclipse-workspace\Week2\src\Ex2.java
파일의 절대경로        - F:\eclipse-workspace\Week2\src\Ex2.java
파일이 속해 있는 디렉토리 - F:\eclipse-workspace\Week2\src

File.pathSeparator - ;
File.pathSeparatorChar - ;
File.separator - \
File.separatorChar - \

user.dir=F:\eclipse-workspace\Week2
sun.boot.class.path=null
```
```java
//기존에는 없는 파일을 새로 생성하는 코드
import java.io.*;

class Ex2

{

	public static void main(String[] args) throws IOException {

		File i = new File("F:\\eclipse-workspace\\Week2\\src", "Ex3.java");

		i.createNewFile();

	}
}
```
![image](https://user-images.githubusercontent.com/86463944/161923784-550023d0-30ee-44b5-b9bb-2eb6819578b7.png)
