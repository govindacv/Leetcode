class Solution {
public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new LinkedHashMap();
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Integer[] removedDuplicates = set.toArray(new Integer[set.size()]);

		for (int j = 0; j < removedDuplicates.length; j++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == removedDuplicates[j]) {

					count++;
				}
			}
			map.put(removedDuplicates[j], count);
		}

		Set<Integer> setOfkeys = map.keySet();
		int[] arrofValues = new int[setOfkeys.size()];
		int l = 0;
		for (int key : setOfkeys) {
			arrofValues[l++] = map.get(key);
		}
		Arrays.sort(arrofValues);

		for (int m = 0; m < arrofValues.length - 1; m++) {
			if (arrofValues[m] == arrofValues[m + 1]) {
				return false;
			}
		}

		return true;

	}

}
