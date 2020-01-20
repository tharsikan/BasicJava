import java.util.HashMap;
import java.util.Map;

public class Studnet {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Studnet [name=" + name + ", age=" + age + "]";
	}
	
	public static Map<String,Integer> getAllStudent(){
		Map<String,Integer> map = new HashMap<>();
		map.put("tharsikan",12);
		map.put("arul",67);
		map.put("rajani",78);
		map.put("john",99);
		
		return map;
	}
	
}