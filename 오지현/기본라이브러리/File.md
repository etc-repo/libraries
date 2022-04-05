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
