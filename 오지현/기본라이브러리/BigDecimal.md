BigDecimal 클래스
===
*  산술, 스케일 조작, 반올림, 비교, 해싱 및 형식 변환을 위한 작업을 제공함
*  돈 계산과 같이 중요한 작업을 할 때 사용


BigDecimal의 연산
---
<code>BigDecimal add(BigDecimal val)</code>
<code>BigDecimal subtract(BigDecimal val)</code>
<code>BigDecimal divide(BigDecimal val)</code>
<code>BigDecimal remainder(BigDecimal val)</code>

코드
---
```java
double a = 10.0000;
double b = 3.0000;

// 기대값: 13
// 실제값: 13.000001999999999
a + b;

// 기대값: 7
// 실제값: 6.999999999999999
a - b;

// 기대값: 30
// 실제값: 30.000013000000997
a * b;

// 기대값: 3.33333...
// 실제값: 3.333332555555814
a / b;
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

```java
BigDecimal a = new BigDecimal("10");
BigDecimal b = new BigDecimal("3");

// 더하기
// 13
a.add(b);

// 빼기
// 7
a.subtract(b);

// 곱하기
// 30
a.multiply(b);

// 나누기
// 3.333333...
a.divide(b);

// 나누기
// 3.333
a.divide(b, 3, RoundingMode.HALF_EVEN);

// 나누기 후 나머지
// 전체 자리수를 34개로 제한
// 1
a.remainder(b, MathContext.DECIMAL128);

// 절대값
// 3
new BigDecimal("-3").abs();

// 두 수 중 최소값
// 3
a.min(b);

// 두 수 중 최대값
// 10
a.max(b);
```
