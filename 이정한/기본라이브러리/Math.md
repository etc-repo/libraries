# Math
- 수학 연산 관련 라이브러리
- static 메서드로만 이루어짐 (편리)
- static import로 메소드 또는 `*`로 선언을 해 놓으면 클래스 이름(Math)없이 메서드 이름으로만 사용 가능


## 필드
- E: 자연 상수 값
- PI: 원주율 값


## 메서드
- `abs(a)`: a의 절댓값
- `sin(a), cos(a), tan(a)`: sin, cos, tan 값
- `ceil(a)`: 천장 올림법
- `floor(a)`: 바닥 내림법
- `hypot(a, b)`: 피타고라스 법칙으로 c 
- `log(a)`: a의 로그(밑: e)
- `log10(a)`: a의 로그(밑: 10)
- `max(a, b)`: a와 b중 큰것 리턴
- `min(a,b )`: a와 b중 작은것 리턴
- `pow(a, b)`: a의 b제곱
- `random()`: 0.0 < 1.0 사이의 랜덤 소수 (시드: 시간)
- `round(a)`: 소수점 반올림
- `sqrt(a)`: a의 제곱근
- `toDegrees(a)`: radian > degree
- `toRadians(a)`: degree > radian



# 코드
```java
import static java.lang.Math.*;

public class MathTest {
	public static void main(String[] args) {
		print("E", E);

		print("PI", PI);

		print("abs(-123)", abs(-123));

		print("ceil(2.3)", ceil(2.3));

		print("hypot(3, 4)", hypot(3, 4));

		print("max(1, 2)", max(1, 2));

		print("pow(2, 3)", pow(2, 3));

		print("sqrt(25)", sqrt(25));

		/*
		E: 2.718281828459045
		PI: 3.141592653589793
		abs(-123): 123
		ceil(2.3): 3.0
		hypot(3, 4): 5.0
		max(1, 2): 2
		pow(2, 3): 8.0
		sqrt(25): 5.0
		
		 */
	}

	static <T> void print(T a) {
		print("", a);
	}

	static <T> void print(String name, T a) {
		System.out.println(name + ": " + a);
	}

}
```
