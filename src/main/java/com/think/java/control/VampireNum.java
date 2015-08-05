package com.think.java.control;

public class VampireNum {

	public boolean isVampire(int number, int[] arr) {
		int num1 = number / 100;
		int num2 = number % 100;
		int[] part = new int[4];

		part[0] = num1 / 10;
		part[1] = num1 % 10;
		part[2] = num2 / 10;
		part[3] = num2 % 10;

		for (int i = 0; i < part.length; i++) {
			int result = 0;
			for (int j = 0; j < part.length; j++) {
				if (j == i)
					continue;
				for (int k = 0; k < part.length; k++) {
					if ((k == i) || (k == j))
						continue;
					for (int l = 0; l < part.length; l++) {
						if ((l == i) || (l == j) || (l == k))
							continue;
						arr[0] = part[i] * 10 + part[j];
						arr[1] = part[k] * 10 + part[l];
						result = arr[0] * arr[1];
						if (result == number) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}