import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		Map<String,Integer> map = Studnet.getAllStudent();

		List<Integer> resultSortedKey = new ArrayList<>();
		List<String> resultValues  = map.entrySet().stream()
				 	.filter(x -> x.getValue() >= 60)
				 	.sorted(Map.Entry.<String, Integer>comparingByKey())
	                .peek(e -> resultSortedKey.add(e.getValue()))
	                .map(x -> x.getKey())
	                .collect(Collectors.toList());
		
		
		System.out.println(resultValues );
	}
}

    // c:\Users\Tharsikan\Desktop\Exercise\Stream>javac Application.java
    // c:\Users\Tharsikan\Desktop\Exercise\Stream>java Application
    // [arul, john, rajani]