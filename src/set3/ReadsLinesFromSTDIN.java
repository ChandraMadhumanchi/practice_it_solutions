package set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ReadsLinesFromSTDIN {

	public static void main(String[] args) throws IOException {
		
		List<Interval> intervals = readIntervals(System.in);
		List<Interval> missedIntervals = uncovered(intervals);
	}
	
	public static List<Interval> uncovered(List<Interval> intervals){
		
		List<Interval> uncovered = new ArrayList<Interval>();
		
		intervals.sort(Comparator.comparingInt(a -> a.end));
		
		return uncovered;
	}
	public static List<Interval> readIntervals (InputStream is) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		List<Interval> intervals = new ArrayList<Interval>();
		String line;
		while( (line = reader.readLine()) != null && line.length() != 0){
			final String[] arr = line.split(" ");
			intervals.add(new Interval(Integer.valueOf(arr[0]),Integer.valueOf(arr[1])));
		}
		
		return intervals;
	}
}
