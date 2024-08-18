package tobyspring.hellospring2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<String> scores = Arrays.asList("z", "a", "spring", "java");
		Collections.sort(scores, (o1, o2) -> o1.length() - o2.length());
		
		scores.forEach(System.out::println);
	}
}
