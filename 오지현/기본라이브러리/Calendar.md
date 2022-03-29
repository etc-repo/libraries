Calendar 클래스
=====
* 날짜와 시간을 다루는 클래스
* 추상 클래스이기 때문에 직접 new 하여 객체생성이 불가능함
* Calendar.getInstance()메소드를 사용하거나 Calendar 클래스를 상속받는 GregorianCalendar 클래스를 이용하여 객채를 상속할 수 있음

주요 상수
-------
* <code>static int YEAR	</code> : Calendar.YEAR	: 현재 년도
* <code>static int MONTH </code> : Calendar.MONTH	: 현재 월 (1월: 0)
* <code>static int DATE </code> : Calendar.DATE	: 현재 월의 날짜
* <code>static int WEEK_OF_YEAR	 </code> : Calendar.WEEK_OF_YEAR	: 현재 년도의 몇째 주
* <code>static int WEEK_OF_MONTH </code> : Calendar.WEEK_OF_MONTH	: 현재 월의 몇째 주

코드
----
```java
public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);
        
        int woy = today.get(Calendar.WEEK_OF_YEAR);
        int wom = today.get(Calendar.WEEK_OF_MONTH);
        
        int doy = today.get(Calendar.DAY_OF_YEAR);
        int dom = today.get(Calendar.DAY_OF_MONTH);
        int dow = today.get(Calendar.DAY_OF_WEEK);
        
        int hour12 = today.get(Calendar.HOUR);
        int hour24 = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);
        
        int milliSecond = today.get(Calendar.MILLISECOND);
        int timeZone = today.get(Calendar.ZONE_OFFSET);
        int lastDate = today.getActualMaximum(Calendar.DATE);
        
        System.out.println("오늘은 " + year +"년 " + month+1 + "월" + date +"일");
        System.out.println("오늘은 올해의 " + woy +"째주, 이번달의 " + wom + "째주. " + date +"일");
        System.out.println("오늘은 이번 해의 " + doy +"일이자, 이번 달의 " + dom + "일. 요일은 " + dow +"일 (1:일요일)");
        System.out.println("현재 시각은 " + hour12 +":"+ minute + ":"+ second +", 24시간으로 표현하면 " + hour24+":"+ minute + ":"+ second);
        System.out.println("오늘은 " + year +"년 " + month+1 + "월" + date +"일");
        System.out.println("1000분의 1초 (0~999): " + milliSecond);
        System.out.println("timeZone (-12~+12): " + timeZone/(60*60*1000)); // 1000분의 1초를 시간으로 표시하기 위해 60*60*1000
        System.out.println("이 달의 마지막 날: " + lastDate);
        
        
    }

```

메소드
----

* <code>static Calendar getInstance</code> : 현재 날짜와 시간 정보를 가진 Calendar 객체를 생성함
* <code>boolean after(Object when)</code> : when과 비교하여 현재 날짜 이후이면 true, 아니면 false를 반환함
* <code>boolean before(Object when)</code> : when과 비교하여 현재 날짜 이전이면 true, 아니면 false를 반환함
* <code>boolean equals(Object obj)</code> :같은 날짜값인지 비교하여 true, false를 반환함
* <code>int get(int field)</code> : 현재 객체의 주어진 값의 필드에 해당하는 상수 값을 반환한다.이 상수값은 Calendar 클래스의 상수중에 가짐


코드
-----

```java
public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
        
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        
        date1.set(1945, Calendar.AUGUST, 15);
        
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"요일이고, \n"
                + "date2(오늘)는 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"요일. " );
        
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/ 1000; 
        System.out.println("date1부터 지금까지 " + difference + "초가 지났고, \n"
                + "일(day)로 계산하면 " + difference/(24*60*60) +"일이 지났다. ");
    }
 
    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+ "년 " + (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) +"일 ";
    }
```

