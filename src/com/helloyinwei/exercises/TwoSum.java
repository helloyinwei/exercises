package com.helloyinwei.exercises;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	static class Solution {
		// 通过HashMap来空间换时间
		public int[] twoSum(final int[] nums, final int target) {
			final Map<Integer, Integer> map = new HashMap<>();
			int index = 0;
			for (final int num : nums) {
				map.put(num, index);
				index++;
			}
			// 必须用index，不然对于重复key会有问题
			int index2 = -1;
			for (final int num : nums) {
				index2++;
				if (map.containsKey(target - num) && map.get(target - num) != index2) {
					return new int[] { index2, map.get(target - num) };
				}
			}
			throw new IllegalArgumentException("not found!");
		}
	}

	public static void main(final String[] args) {
		final int[] nums = new int[] { 2, 7, 11, 15 };
		final int[] nums2 = new int[] { 3, 3 };
		final Solution solution = new Solution();
		solution.twoSum(nums2, 6);
	}

}
