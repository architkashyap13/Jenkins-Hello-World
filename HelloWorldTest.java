import java.util.ArrayList;
import java.util.List;

public class HelloWorldTest {

	public static void main(String[] args) {

		List<Long> numbers = new ArrayList<>();

		for (long i = 0; i < 10l; i++) {
			numbers.add(i);
		}
		numbers.forEach(e -> System.out.println("Hello World : "+e));
	}
}