package com.bridgelabz.DataStructures;

public class InsertionSort{

	public static void main(String[] args){
		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
		int count = 0;
		String sortedArray[] = sort_sub(arr, arr.length);
		for(int i=0;i<sortedArray.length;i++){
			System.out.println(sortedArray[i]);
		}
	}

	public static String[] sort_sub(String array[], int f){
		String temp="";
		for(int i=0;i<f;i++){
			for(int j=i+1;j<f;j++){
				if(array[i].compareToIgnoreCase(array[j])>0){
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}


