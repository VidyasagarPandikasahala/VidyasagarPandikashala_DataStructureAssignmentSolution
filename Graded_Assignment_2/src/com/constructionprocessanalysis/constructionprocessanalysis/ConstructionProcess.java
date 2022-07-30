package com.constructionprocessanalysis.constructionprocessanalysis;

import com.constructionprocessanalysis.mergesort.MergeSort;

public class ConstructionProcess {

	int lowestFloor;
	int midFloor;
	int topFloor;

	public ConstructionProcess() {
		super();
	}

	/***
	 * In this function for each day which floor is to be printed is done. This is
	 * done using Array Data structure
	 * 
	 * @param sortedFloorSize - it is the sorted array of the input floor sizes each
	 *                        day
	 * @param floorSize       - it is the input array from the console
	 */
	public static void constructionProcess(int[] floorSize, int[] sortedFloorSize) {

		MergeSort sort = new MergeSort();

		int size = floorSize.length;
		int[] temp = new int[size];
		int floorSizeIndex = 0;
		int sortedFloorSizeIndex = 0;
		String ch = "";
		int tempArrayIndex = 0;
		int sortedTempArrayIndex = 0;

		while (floorSizeIndex < size) {

			System.out.println("Day " + (floorSizeIndex + 1) + ":");
			System.out.println();
			/***
			 * in this condition if we traverse through both input and sorted floor size
			 * array and if we find the highest floor
			 * it goes into this loop and in an temporary array it is added and then it is
			 * sorted
			 */
			if (floorSize[floorSizeIndex] == sortedFloorSize[sortedFloorSizeIndex]) {

				temp[tempArrayIndex] = floorSize[floorSizeIndex];
				tempArrayIndex++;

				sort.performMergeSort(temp);

				while (sortedTempArrayIndex <= floorSizeIndex) {
					/***
					 * if the sorted temporary array has the highest floor in that day it will be
					 * added to the empty string
					 * then checks for the next highest floor size which received in the previous
					 * day then it will also be added to the string along
					 * with the highest
					 * if no next highest floor size then it will break out of the loop and then
					 * will print the string value.
					 */
					if (temp[sortedTempArrayIndex] == sortedFloorSize[sortedFloorSizeIndex]) {

						ch = ch + temp[sortedFloorSizeIndex] + " ";
						sortedFloorSizeIndex++;
						sortedTempArrayIndex++;
					} else {
						break;
					}

				}
				System.out.println(ch);
				System.out.println();

				ch = "";
				floorSizeIndex++;

			}
			/***
			 * here in this condition if we do not find the highest we just add the floor
			 * index value to temporary array
			 * this condition will be checked until we find the highest floor size(its
			 * available in the sortedFloorSizeArray
			 */
			else {
				temp[tempArrayIndex] = floorSize[floorSizeIndex];
				floorSizeIndex++;
				tempArrayIndex++;
			}
		}

	}
}
