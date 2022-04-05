BigDecimal 클래스
===
*  산술, 스케일 조작, 반올림, 비교, 해싱 및 형식 변환을 위한 작업을 제공함
*  돈 계산과 같이 중요한 작업을 할 때 사용

코드
---
'''java
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
'''
