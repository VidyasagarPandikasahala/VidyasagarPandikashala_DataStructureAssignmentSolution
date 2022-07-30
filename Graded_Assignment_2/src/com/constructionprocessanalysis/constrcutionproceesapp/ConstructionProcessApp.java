package com.constructionprocessanalysis.constrcutionproceesapp;

import java.util.Scanner;

import com.constructionprocessanalysis.constructionprocessanalysis.ConstructionProcess;
import com.constructionprocessanalysis.mergesort.MergeSort;

public class ConstructionProcessApp {

	public static void main(String[] args) {
		ConstructionProcess analyse = new ConstructionProcess();
		MergeSort decendingSort = new MergeSort();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of floors");
		int floors = scan.nextInt();

		int[] floorSize = new int[floors];
		int[] sortedfloorSize = new int[floors];

		for (int i = 0; i < floors; i++) {

			System.out.println("Enter the floor size on day " + (i + 1) + " :");
			floorSize[i] = scan.nextInt();
			sortedfloorSize[i] = floorSize[i];
		}

		decendingSort.performMergeSort(sortedfloorSize);
		analyse.constructionProcess(floorSize, sortedfloorSize);
		scan.close();
	}

}
