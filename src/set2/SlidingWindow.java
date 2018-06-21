package set2;

import java.util.Arrays;
import java.util.LinkedList;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 2, 5, 3, 7, 9 };

		int[] result = maxSlidingWindow(arr, 3);

		System.out.println(Arrays.toString(result));

	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return new int[0];

		int[] result = new int[nums.length - k + 1];
		System.out.println("lenght" + result.length);
		LinkedList<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!deque.isEmpty() && deque.peekFirst() == i - k)
				deque.poll();

			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.removeLast();
			}

			deque.offer(i);

			if (i + 1 >= k)
				result[i + 1 - k] = nums[deque.peek()];
		}

		return result;
	}
}
