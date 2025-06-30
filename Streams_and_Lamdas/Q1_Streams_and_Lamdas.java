package Streams_and_Lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_Streams_and_Lamdas {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("alex","is","from","newyork","usa","hello");
		List<String> result = list.stream()
			    .map(String::toUpperCase)
			    .filter(s -> s.length() >= 4)
			    .collect(Collectors.toList());
		
		System.out.println(result);
		
	}

}
