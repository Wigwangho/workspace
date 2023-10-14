import java.util.map

public MapInstance{//서점에서 고객의 정보를 보관할 때 map
Map<String, String> map = new HashMap<String, String>();
map.put("이름","김독서");
map.put("연령대","10대");
map.put("선호도서","문제집");
map.put("포인트","500");//고객 김독서에 대한 정보
Map<String, String> map2 = new HashMap<String, String>();
map2.put("이름","공부안");
map2.put("연령대","10대");
map2.put("선호도서","만화책");
map2.put("포인트","3000");
List<String> customers = new ArrayList<String>();
customers.add(map);
customers.add(map2);
//두 맵이 하나의 리스트 안으로 편입됨

}
