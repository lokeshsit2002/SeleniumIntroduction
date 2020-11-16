package IntroPackage;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamExamples {

	public static void main(String[] args) {

		// Simple way
		// Count of the names starting with "A"
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alexa");
		names.add("Adam");
		names.add("Betty");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("A")) {
				count++;
			}

		}

		System.out.println("Simple way:Count of the names starting with \"A\" : " + count);

		// JavaStream way1
		// Count of the names starting with "A"

		long jcount1 = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println("JavaStream way1:Count of the names starting with \"A\" : " + jcount1);

		// JavaStream way2 with multiple lines in filter
		// Count of the names starting with "A" and the length is greater than 4

		long jcount2 = names.stream().filter(s -> {
			boolean result1 = s.startsWith("A");
			boolean result2 = s.length() > 4;
			return (result1 & result2);
		}).count();

		System.out.println(
				"JavaStream way2:Count of the names starting with \"A\" and its length is greater than 4 : " + jcount2);

		// JavaStream way3
		// Print all names starting with "R" in the array list
		System.out.println("JavaStream way3:Print all names starting with \"R\" in the array list");
		Stream.of("Ram", "Shyam", "Krishna", "Ramnuj", "RamPyaare").filter(s -> s.startsWith("R"))
				.forEach(s -> System.out.println(s));

		// JavaStream way4
		// Print all names ending with "m" with Uppercase
		System.out.println("JavaStream way4 :Print all names ending with \"m\" with Uppercase");
		Stream.of("Ram", "Shyam", "Krishna", "Ramnuj", "RamPyaare").filter(s -> s.endsWith("m"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// JavaStream way5
		// Print first name staring with "R"
		System.out.println("JavaStream way5 :Print first name staring with \"R\"");
		Stream.of("Ram", "Shyam", "Krishna", "Ramnuj", "RamPyaare").filter(s -> s.endsWith("m")).limit(1)
				.forEach(s -> System.out.println(s));

		// JavaStream way6
		// Convert array as list
		// Print names ending with "m" with uppercase and sorted

		List<String> alist = Arrays.asList("Ram", "Shyam", "GhanShyam", "Krishna", "Ramnuj", "RamPyaare");
		System.out.println("JavaStream way6 :Print all names ending with \"m\" with Uppercase and Sorted");
		alist.stream().filter(s -> s.endsWith("m")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// JavaStream way7
		// Merging two javastreams
		// Print unique names with uppercase and sorted

		List<String> blist1 = Arrays.asList("Ram", "Shyam", "GhanShyam");
		List<String> blist2 = Arrays.asList("Ram", "Krishna", "Ramnuj", "RamPyaare");

		System.out.println("JavaStream way7 :First concatenate & then Print all names with Uppercase and Sorted");
		Stream.concat(blist1.stream(), blist2.stream()).distinct().sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// JavaStream way8
		// Applying conditions
		// Check "Krishna" is present in the list
		System.out.println("JavaStream way8 :Check \"Krishna\" is present in the list");
		boolean check1 = Stream.of("Ram", "Shyam", "Krishna", "Ramnuj", "RamPyaare")
				.anyMatch(s -> s.equalsIgnoreCase("Krishna"));
		System.out.println(check1);
		Assert.assertTrue(check1);

		/******************************************************************************
		 * JavaStream way9 How to save stream into collection Check "Krishna" is present
		 * in the list
		 *******************************************************************************/
		System.out.println("JavaStream way9:How to save streams into collection");
		List<String> clist =Stream.of("Ram", "Shyam", "Krishna", "Ramnuj", "RamPyaare").filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(clist.get(2));
		
		/******************************************************************************
		 * JavaStream way10: Print unique numbers in sorted order from the list
		 *******************************************************************************/
		List<Integer> values1= Arrays.asList(1,9,9,2,5,3,3,6,4,4,4,8,7);
		System.out.println("JavaStream way10: Print unique numbers in sorted order from the list");
		values1.stream().distinct().sorted().forEach(s-> System.out.println(s));
		
		/******************************************************************************
		 * JavaStream way11: Print 3rd value after performing unique numbers in sorted order from the list
		 *******************************************************************************/
		List<Integer> values2= Arrays.asList(1,9,2,5,3,3,6,4,4,4,8,7);
		System.out.println("JavaStream way10: Print unique numbers in sorted order from the list");
		List<Integer> finalList1=values2.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(finalList1.get(2));
		
		

	}

}
