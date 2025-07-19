package pack1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test_Java8 {
	public static void main(String[] args) {
	//	findSecondHighestUsingJava8();
	//	groupWordsAsList();
	//	joinWords();
	//	uniqueWords();
	//	duplicateWords();
		frequencyofWords();
		frequencyofCharacters();
		
	}
	
	private static void test1()
	{
		
	}
	private static void test2()
	{
		
	}

	private static void frequencyofCharacters() {
		String st="Big black bug bit a big black dog on his big black nose";
		String str=st.replace(" ", "");
		Map<Character, Long> frequency =  str.chars().mapToObj(c -> (char)c)
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequency);
		
		System.out.println("Hello Git, this is message 1");
		
		System.out.println("From git x");
	
		
	}

	private static void frequencyofWords() {
		String st="Big black bug bit a big black dog on his big black nose";
		String[] st1=st.split(" ");
		List<String> st2=Arrays.asList(st1);
	Map<String, Long>	st3=st2.stream().collect(Collectors.groupingBy(a->a, Collectors.counting()));
	System.out.println(st3);
	
	System.out.println("---------------------------X---------------------------------------");
		
	}

	private static void duplicateWords() {
		 List<String> fruits = Arrays.asList("apple", "orange", "banana", "apple", "mango", "orange", "kiwi");

		    Map<String, Long> duplicates = fruits.stream()

		        .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));
		    System.out.println(duplicates);
		    
		    /*
		     *  List<String> fruits = Arrays.asList("apple", "orange", "banana", "apple", "mango", "orange", "kiwi");

    List<String> duplicates = fruits.stream()

        .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()))

        .entrySet()

        .stream()

        .filter(entry -> entry.getValue() > 1)

        .map(Map.Entry::getKey)

        .collect(Collectors.toList());

    System.out.println("Duplicates: " + duplicates);
		     */
		
	}

	private static void uniqueWords() {
		String s="Java is fun and Java is powerful";
		List<String> l=Arrays.stream(s.split(" ")).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
		System.out.println(l);
		
	}

	private static void joinWords() {
		List<String> l=Arrays.asList("Hello"," ", "world", "!");
		  String s=l.stream().collect(Collectors.joining());
		  System.out.println(s);
		
	}

	private static void groupWordsAsList() {
		List<String> l=Arrays.asList("apple","banana", "pear", "grap");
	  Map<Integer, List<String>> mp=	 l.stream().collect(Collectors.groupingBy(String::length));
	  
	  System.out.println(mp);
		
	}

	private static void findSecondHighestUsingJava8() {
		Integer arr[]= {3,5,7,1,2,8};
		
		Integer result1=	Arrays.asList(arr).stream().distinct().sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		
		Integer result=	Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
		
		System.out.println(result1);
		
	}

}
