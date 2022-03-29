HashMap 클래스
====
* Map으로 구현되어 있으므로, Map의 특징인 키와 값을 묶어 하나의 데이터로 저장함
* key와 value를 하나의 쌍(entry)으로 저장되는 구조이며, 해싱(hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는데 있어 뛰어난 성능을 보임
* 저장되는 key와 value는 null 값을 허용한다. 단, key는 중복 불가능함
* key, value의 쌍으로 관리하므로, Iteration 객체를 사용하지 않고 해당 key에서 데이터의 값을 바로 추출할 수 있음
* 동기화가 포함되지 않으므로, 멀티 스레드 환경에서의 구현이 아니라면 HashTable에 비해 처리 속도가 빠름
* List와 달리, Map에는 순서가 없음
* 유사한 성격의 클래스로는 HashTable, TreeMap 등이 있음

메소드
---
* <code>boolean containsKey(Object key)</code> : 지정된 key가 포함되어 있는지 여부를 반환함
* <code>boolean containsValue(Object value)</code> : 지정된 value가 포함되어 있는지 여부를 반환함
* <code>Set entrySet()</code> : 저장된 키와 값을 엔트리(키와 값의 결합)의 형태로 Set에 저장하여 반환함
* <code>Set keySet()</code> : 저장된 모든 key를 Set에 저장하여 반환함
* <code>void clear()</code> : 저장된 모든 객체(key, value)를 제거함


코드
---
* put/get
```java
Map<String, String> map = new HashMap<String, String>();
    
    //add value
    map.put("a", "A");
    map.put("a", "AA");
    map.put("b", "B");
    map.put("c", "C");
    map.put(null, "NullValue");
    
    //get value
    System.out.println(map.get("a"));
    System.out.println(map.get("d"));
    System.out.println(map.get(null));
```
* containsKey/containsValue
```java
Map<String, String> map = new HashMap<String, String>();
        
    //add value
    map.put("a", "A");
    map.put("a", "AA");
    map.put("b", "B");
    map.put("c", "C");
    map.put(null, "NullValue");
        
    //check if key/
    System.out.println(map.containsKey("a"));
    System.out.println(map.containsValue("Z"));
```
* keySet()/values()/entrySet()
```java
Map<String, String> map = new HashMap<String, String>();
        
    //add value        
    map.put("a", "A");
    map.put("a", "AA");
    map.put("b", "B");
    map.put("c", "C");
    map.put(null, "NullValue");
    
    //iteration 
    for (String key : map.keySet()) {
        System.out.print(map.get(key) + "/");
    }
        
    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.print(entry + "/");
    }

```
* replace()
```java
   //replace
    System.out.println("map_before: "+ map);        
    System.out.println(map.replace("a", "AA", "Z"));
    System.out.println("map_after: "+ map);

```

