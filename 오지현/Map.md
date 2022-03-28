 map 클래스
=============
* key와 value를 가지는 자료구조
* map에 저장되는 모든 key들은 중복을 허용하지 않음
* key에 따른 값을 가지기 때문에 순서도 딱히 없음

메서드
-----------------
* <code>get(Object) : Object</code> : get에 key값을 넣어서 key에 해당하는 value를 가져올 수 있음
* <code>keySet() : Set</code> : 모든 키들을 set자료구조 형태로 가져올 수 있음
* <code>put(Object, Object) : void</code> : put(key, value)형식으로 값을 집어 넣을 수 있음
***
* map은 똑같은 key가 중복되어 들어갈 수 없음
* 중복되어 들어가게 되면 나중에 대입한 값으로 변환됨

코드
-----------------
<pre>
<code>
Map<String, String> map = new HashMap<>();
map.put("001","gildong");
map.put("002","minsu");
map.put("003","hoho"); //중복된 key값으로 나중에 value값으로 대체

System.out.println(map.size());
System.out.println(map.get("001");

Set<String> set = new HashSet<>();
set = map.keySet();

Iterator<String> iter = set.iterator();

while(iter.hasNext()){
String key = iter.next();
System.out.println("key : + key + "value: " + map.get(key));
}
</code>
</pre>

