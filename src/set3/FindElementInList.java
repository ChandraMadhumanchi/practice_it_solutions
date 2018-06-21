package set3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Attribute> stringList = new ArrayList<Attribute>();

		stringList.add(new Attribute("Mohan", "Indugula"));
		stringList.add(new Attribute("Chandra", "Madhumanchi"));
		stringList.add(new Attribute("Madhu", "Raj"));
		stringList.add(new Attribute("Lucky", "John"));

		List<Attribute> queryResult = stringList.stream().filter(value -> value != null)
				.filter(value -> value.getName().equalsIgnoreCase("Lucky")).collect(Collectors.toList());

				
		if (!queryResult.isEmpty()) {
			String n = queryResult.get(0).getName();
			String v = queryResult.get(0).getValue();

			System.out.println("name:" + n);
			System.out.println("value:" + v);
		}
	}

}
