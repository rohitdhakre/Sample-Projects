package com.dhakre.rohit.practice.random;

class QuickSort {

	public static void main(String args[]) {
		int[] a = {2, 12, 42, 1, 3, 11, 1};
		QuickSort q = new QuickSort();
		q.printArray(a);
		q.quickSort(a);
		q.printArray(a);
	}

	void printArray(int[] a) {
		boolean x = false;
		for(int data : a) {
			if(x) {
				System.out.print(", ");
			}
				x = true;
				System.out.print(data);
		}
		System.out.println();
	}

	void quickSort(int[] a) {
		split(a, 0, a.length - 1);
	}

	void split(int[] a, int start, int end) {
		if(start < end) {
			int pIndex = partition(a, start, end);
			split(a, start, pIndex - 1);
			split(a, pIndex + 1, end);
		}
	}

	int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int pIndex = start;
		int temp;
		for (int i = start; i < end; i++) {
			if (a[i] < pivot) {
				temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
		temp = pivot;
		a[end] = a[pIndex];
		a[pIndex] = temp;
		return pIndex;
	}
	
}