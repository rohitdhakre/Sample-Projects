package com.dhakre.rohit.algorithm.sorting;

public class HeapSortIncreasing {

	public static void main(String[] args) {
		int arr[] = { -5935536, -4857144, 8762611, -3710156, -62196, 5726532, 3880783, 8228893, 4557632, 8243459,
				8058689, -2004515, -2532128, -2809277, 6230123, -1534444, 7594023, 8030804, -808395, 3895414, -1042916,
				-6349277, 8056932, 6449041, -5776338, -5663713, -2118668, -7889996, -7194680, 4072724, 5817742, 52723,
				-9978630, -4565272, -905845, 2413011, 6580118, 7342503, 9920829, 3264328, -2498614, -7173602, 9550646,
				-3508831, 6660598, 7160307, -1454798, -7810912, -6934054, 5412837, -3256366, 5648256, 7539528, 8948739,
				-9432879, 540367, -683895, -4837582, 404577, -7427248, 7493712, -7517462, 59838, 7493355, 2624635,
				7528881, 4482783, 5371130, -7137887, 5776578, -4043963, -4861937, -5490722, -3065192, -1330264,
				-5049584, 8815653, -2956679, -3663308, 3294818, -3792431, -6884969, -6327570, -3304021, -7320937,
				-2754952, 5645257, 1616120, 2854718, 3721762, 9874605, 5629627, 5448934, 6511446, -4557691, 4035783,
				-4467467, 2150627, 6427050, 3916593 };
		HeapSortIncreasing h = new HeapSortIncreasing();
		h.printArray(arr);
		h.heapify(arr);
		h.printArray(arr);
		h.heapSort(arr);
		h.printArray(arr);
	}

	public void heapify(int[] arr) {
		int p = (arr.length) / 2;
		heapify(arr, p);
	}

	public void heapify(int[] arr, int p) {
		if (p < 1) {
			return;
		}
		heapifyProcess(arr, arr.length, p);
		heapify(arr, p - 1);
	}

	public void heapSort(int[] arr) {
		heapSort(arr, arr.length);
	}

	public void heapSort(int[] arr, int size) {
		if (size < 1) {
			return;
		}
		int temp = arr[size - 1];
		arr[size - 1] = arr[0];
		arr[0] = temp;
		heapifyProcess(arr, size - 1, 1);
		heapSort(arr, size - 1);
	}

	public void heapifyProcess(int[] arr, int size, int i) {
		int l = 2 * i;
		if (l > size) {
			return;
		}
		if (l + 1 <= size) {
			int r = l + 1;
			if (arr[l - 1] > arr[i - 1] || arr[r - 1] > arr[i - 1]) {
				if (arr[l - 1] > arr[r - 1]) {
					int temp = arr[l - 1];
					arr[l - 1] = arr[i - 1];
					arr[i - 1] = temp;
					heapifyProcess(arr, size, l);
				} else {
					int temp = arr[r - 1];
					arr[r - 1] = arr[i - 1];
					arr[i - 1] = temp;
					heapifyProcess(arr, size, r);
				}
			}
		} else if (arr[l - 1] > arr[i - 1]) {
			int temp = arr[l - 1];
			arr[l - 1] = arr[i - 1];
			arr[i - 1] = temp;
			heapifyProcess(arr, size, l);
		}
	}

	public void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}