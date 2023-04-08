package sort;
public class sortTest {

	public static void main(String[] args) {
		//-------------------------------------------------------------------------------------------------------------------------------------------
		//ATTANTION IF YOU WANT TO CHECK THE SORTED AND UNSORTED ARRAYS PLEASE ENTER AN INTEGER TO THE SIZE AT MOST 1000.
		//IF YOU ENTER A SIZE BIGGER THEN 1000 PROGRAM WILL CALCULATE EVERYTHING NORMALLY BUT YOU WONT BE ABLE TO SEE THE UNSORTED AND SORTED ARRAYS.
		//BECAUSE IT DOESNT FITS THE CONSOL SO IT HAD BEEN PROHIBITED!
		//--------------------------------------------------------------------------------------------------------------------------------------------
		
		
		int[] list = new int[1000];// CHANGE HERE FOR 1000,10000,100000 how ever you want
		int[] temp = new int[list.length];//to make list same again after every sort operation!
		
		
		//Calculations starts
		//ALL ELEMENTS ARE SAME TEST
		if(temp.length<1001)//to make sure that no array bigger than 1000 prints on the screen
			System.out.print("our list is(before sort): ");
		for (int i = 0; i < temp.length; i++) {
			list[i]=1;
			if(temp.length<1001) {
				if(i%100==0)
					System.out.println(" ");
				System.out.print(list[i]+" ");
			}
			
		}
		System.out.println();
        long startTime = System.nanoTime(); 	//time calculation for mergeSort with 2 ways
		mergeSort.mergeSort2(list, 0, list.length-1);
		long estimatedTime = System.nanoTime() - startTime;
		long mergeSort2Time = estimatedTime;
		
		startTime = System.nanoTime(); //time calculation for mergeSort with 3 ways
		mergeSort.MergeSort3(list, 0, list.length-1);
		 estimatedTime = System.nanoTime() - startTime;
		 long mergeSort3Time = estimatedTime;
		
		startTime = System.nanoTime(); //time calculation for quickSort with First index integer pivot.
		quickSort.quickSortFirst(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		long quickSortFirstTime = estimatedTime;
		
		startTime = System.nanoTime();  //time calculation for quickSort with Random index integer pivot.
		quickSort.quickSortRandom(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		long quickSortRandomTime = estimatedTime;
		
		startTime = System.nanoTime();  //time calculation for quickSort with midOfFirstMidLast integer pivot.
		quickSort.quickSortMidOf(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		long quickSortMidOfTime = estimatedTime;
		//no need to print array because its all same. There is nothing to order
		//prints all values for equal array
		System.out.println("merge sort with 2 divide for EQUAL: "+ mergeSort2Time);
		System.out.println("merge sort with 3 divide for EQUAL: "+ mergeSort3Time);
		System.out.println("Quick Sort with First element pivot for EQUAL: "+ quickSortFirstTime);
		System.out.println("Quick Sort with Random element pivot for EQUAL: "+ quickSortRandomTime);
		System.out.println("Quick Sort with mid of FirstMidLast element pivot for EQUAL: "+ quickSortMidOfTime);
		
		System.out.println("------------------------------------------------------------");
		//--------------------------------------------------------------------
		

		//Randomly  created test
		list=temp;
		if(temp.length<1001)
			System.out.print("our list is(before sort): ");
		for (int i = 0; i < temp.length; i++) {
			list[i]=(int) (1000* Math.random());
			temp[i]=list[i];
			if(temp.length<1001) {
				if(i%100==0)
					System.out.println(" ");
				System.out.print(list[i]+" ");
			}
					
		}
		System.out.println();
		startTime = System.nanoTime(); //time calculation for mergeSort with 2 ways
		mergeSort.mergeSort2(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort2Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for mergeSort with 3 ways
		mergeSort.MergeSort3(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort3Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with First index integer pivot.
		quickSort.quickSortFirst(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortFirstTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with Random index integer pivot.
		quickSort.quickSortRandom(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortRandomTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with midOfFirstMidLast integer pivot.
		quickSort.quickSortMidOf(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortMidOfTime = estimatedTime;
		if(temp.length<1001) {//Prints the sorted list if its not too big to print.
			System.out.println("Our list is: (AFTER SORT)");
			for (int i = 0; i < temp.length; i++) {
				System.out.print(list[i]+" ");
				if(i%100==0 && i!=0)
					System.out.println(" ");
						
			}
		}
		
				System.out.println();
				//prints all values for randomly created array
				System.out.println("merge sort with 2 divide for Random: "+ mergeSort2Time);
				System.out.println("merge sort with 3 divide for Random: "+ mergeSort3Time);
				System.out.println("Quick Sort with First element pivot for Random: "+ quickSortFirstTime);
				System.out.println("Quick Sort with Random element pivot for Random: "+ quickSortRandomTime);
				System.out.println("Quick Sort with mid of FML element pivot for Random: "+ quickSortMidOfTime);
		System.out.println("---------------------------------------------------------------------------------------");
		//-------------------------------------------------------------------------------------------------------
		//INCREASING TEST
		list=temp;
		if(temp.length<1001)
			System.out.println("our list is(before sort): ");
		for (int i = 0; i < temp.length; i++) {
			list[i]=i;
			temp[i]=i;
			if(temp.length<1001) {
				if(i%100==0&& i!=0)
					System.out.println(" ");
				System.out.print(list[i]+" ");
			}
			
		}
		System.out.println();
        startTime = System.nanoTime(); //time calculation for mergeSort with 2 ways
		mergeSort.mergeSort2(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort2Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for mergeSort with 3 ways
		mergeSort.MergeSort3(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort3Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with First index integer pivot.
		quickSort.quickSortFirst(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortFirstTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with Random index integer pivot.
		quickSort.quickSortRandom(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortRandomTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with midOfFirstMidLast integer pivot.
		quickSort.quickSortMidOf(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortMidOfTime = estimatedTime;
		
		if(temp.length<1001)//Prints the sorted list if its not too big to print.
			System.out.println("Our list is: (AFTER SORT)");
		for (int i = 0; i < temp.length; i++) {
			if(temp.length<1001) {
				System.out.print(list[i]+" ");
				if(i%100==0&& i!=0)
					System.out.println(" ");
			}
		
		}
		System.out.println();
		//prints all values for INCEREASING array
		System.out.println("merge sort with 2 divide for INCEREASING: "+ mergeSort2Time);
		System.out.println("merge sort with 3 divide for INCEREASING: "+ mergeSort3Time);
		System.out.println("Quick Sort with First element pivot for INCEREASING: "+ quickSortFirstTime);
		System.out.println("Quick Sort with Random element pivot for INCEREASING: "+ quickSortRandomTime);
		System.out.println("Quick Sort with mid of FML element pivot for INCEREASING: "+ quickSortMidOfTime);

		System.out.println("------------------------------------------------------------");
		//------------------------------------------------------------------------------
		//DECREASING TEST
		 list=temp;
		if(temp.length<1001) 		
			System.out.println("our list is(before sort): ");
		for (int i = temp.length-1; i >= 0; i--) {
			list[i]=i;
			temp[i]=i;
			if(temp.length<1001) {
				if(i%100==0)
					System.out.println(" ");
				System.out.print(list[i]+" ");
			}
			
			}
		System.out.println();
		startTime = System.nanoTime(); //time calculation for mergeSort with 2 ways
		mergeSort.mergeSort2(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort2Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for mergeSort with 3 ways
		mergeSort.MergeSort3(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		mergeSort3Time = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with First index integer pivot.
		quickSort.quickSortFirst(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortFirstTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with Random index integer pivot.
		quickSort.quickSortRandom(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortRandomTime = estimatedTime;
		list=temp;
		startTime = System.nanoTime(); //time calculation for quickSort with midOfFirstMidLast integer pivot.
		quickSort.quickSortMidOf(list, 0, list.length-1);
		estimatedTime = System.nanoTime() - startTime;
		quickSortMidOfTime = estimatedTime;
		if(temp.length<1001)//Prints the sorted list if its not too big to print.
			System.out.println("Our list is: (AFTER SORT)");
		for (int i = 0; i < temp.length; i++) {
			if(temp.length<1001) {
				System.out.print(list[i]+" ");
				if(i%100==0&& i!=0)
					System.out.println(" ");
			}
			
					
		}
		System.out.println();
		//prints all values for DECREASING array
		System.out.println("merge sort with 2 divide for DECREASING: "+ mergeSort2Time);
		System.out.println("merge sort with 3 divide for DECREASING: "+ mergeSort3Time);
		System.out.println("Quick Sort with First element pivot for DECREASING: "+ quickSortFirstTime);
		System.out.println("Quick Sort with Random element pivot for DECREASING: "+ quickSortRandomTime);
		System.out.println("Quick Sort with mid of FML element pivot for DECREASING: "+ quickSortMidOfTime);

		System.out.println("------------------------------------------------------------");
		
		
	
				
	}

}
