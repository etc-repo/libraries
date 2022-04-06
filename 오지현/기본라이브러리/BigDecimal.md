BigDecimal 클래스
===
*  산술, 스케일 조작, 반올림, 비교, 해싱 및 형식 변환을 위한 작업을 제공함
*  돈 계산과 같이 중요한 작업을 할 때 사용

필드
---
<code>BigDecimal.ZERO</code> : 0  
<code>BigDecimal.ONE</code> : 1  
<code>BigDecimal.TEN</code> : 10   

메소드
---
<code>add(BigDecimal augend)</code> : 
<code>subtract(BigDecimal subtrahend)</code> :
<code>multiply(BigDecimal multiplicand)</code> :
<code>divide(BigDecimal divisor)</code> :  
  
<code>scale</code> : 소수점 첫째 자리부터 오른쪽부터 0이 아닌 수로 끝나는 위치까지의 총 소수점 자리수

코드
---
* float, double은 근사치를 제공할 뿐, 정확한 값을 제공하지 못함
```java
public class Ex1 {
	public static void main(String[] args) {
		double value = 1.0;
		for (int i = 0; i < 10; ++i) {
			value += 0.1;
			System.out.println(value);
		}
	}
}
```

```
1.1
1.2000000000000002
1.3000000000000003
1.4000000000000004
1.5000000000000004
1.6000000000000005
1.7000000000000006
1.8000000000000007
1.9000000000000008
2.000000000000001
```

```java
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal("0.1");
        for (int i = 0; i < 10; ++i) {
            value = value.add(addValue);
            System.out.println(value.toString());
        }
    }
}
```
```
1.1
1.2
1.3
1.4
1.5
1.6
1.7
1.8
1.9
2.0
```
* 주의해야 할 점
*  소수점 몇 자리까지 계산할 건지를 정해줘야 함
* 10을 3으로 나누면 3.333333333333.... 와 같이 값이 끝없이 나오기 때문에 에러가 발생함
```java
import java.math.BigDecimal;

public class Ex1 {
	public static void main(String[] args) {
		 BigDecimal a = new BigDecimal("250.125");
	        BigDecimal b = new BigDecimal("150.352");
	        
	        System.out.println("더하기 : " + a.add(b));
	        System.out.println("빼기   : " + a.subtract(b));
	        System.out.println("곱하기 : " + a.multiply(b));
	        System.out.println("나누기 : " + a.divide(b));
	}
}
```

```
더하기 : 400.477
빼기   : 99.773
곱하기 : 37606.794000
Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
	at java.base/java.math.BigDecimal.divide(BigDecimal.java:1766)
	at Ex1.main(Ex1.java:12)
```

```java
import java.math.BigDecimal;
import java.math.MathContext;


public class Ex1 {
	public static void main(String[] args) {
		 BigDecimal a = new BigDecimal("250.125");
	        BigDecimal b = new BigDecimal("150.352");
	        
	        System.out.println("더하기 : " + a.add(b));
	        System.out.println("빼기   : " + a.subtract(b));
	        System.out.println("곱하기 : " + a.multiply(b));
	        System.out.println("나누기 : " + a.divide(b,MathContext.DECIMAL32))
		//MathContext.DECIMAL32 : 계산 정밀도를 소수점 포함 7자리까지 설정
;


	}
}
```
```
더하기 : 400.477
빼기   : 99.773
곱하기 : 37606.794000
나누기 : 1.663596

```
