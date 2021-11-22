package Ch5;

import java.util.*;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int zerocnt = 0;
		int matched = 0;

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zerocnt++;
			} else {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						matched++;
					}
				}
			}
		}
		int max = matched + zerocnt;
		int min = matched;
		
		int maxrank = 7 - max;
		int minrank = 7 - min;
		
		int[] answer = {maxrank, minrank};
		
		return answer;
	}
}

public class P01 {

	public static void main(String[] args) {
		Solution ss = new Solution();
		ss.solution([3,5,5,5,5,5], [4,6,4,4,4,4]);
		
	}
}