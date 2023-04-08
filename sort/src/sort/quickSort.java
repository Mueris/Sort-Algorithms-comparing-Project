package sort;
public class quickSort {

	
	
	public static void quickSortFirst(int[]list, int p, int r) {//applies quickSort for pivot = first element
		if(r>p) {//recursive control
			int q = partitionFirst(list,p,r);//choosing the first element pivot
			quickSortFirst(list, p, q-1);//recursive call
			quickSortFirst(list, q+1, r);//recursive call
			//end of the quickSortFirst
		}
	}
	private static int partitionFirst(int[] list, int p, int r) {
		int x= list[p];//choosing pivot as first char
		int i=r+1;//i-1 will present the final location of the number
		for (int j = r; j >p; j--) {//loop for compare elements
			if(list[j]>=x) {//comparing with pivot
				i--;
				int temp=list[i];
				list[i]=list[j];
				list[j]=temp;
			}
		}
		list[p]= list[i-1];
		list[i-1]=x;
		return i-1;//return exact final location of x.
		//end of the partitionFirst
	}
	public static void quickSortRandom(int[]list, int p, int r) {//quick sort with random pivot
		if(r>p) {//stop point for divide
			int q = partitionRandom(list, p, r);//determining the pivot randomly
			quickSortRandom(list, p, q-1);//recursive call
			quickSortRandom(list, q+1, r);//recursive call
		}
		//end of the quickSortRandom
	}
	private static int partitionRandom(int[]list, int p, int r) {
		int indexOfx = (int) Math.floor(Math.random() *(r - p + 1) + p);//chooses a pivot point randomly
		int x=list[indexOfx];//pivot 
		int i =p-1;//final location of the pivot number will be i+1
		for (int j = p; j < r+1; j++) {//loop for compare elements
			if(x>list[j]) {//comparing with pivot
				i++;
				if(i==indexOfx) {//if index of pivot changes updates it.
					indexOfx=j;
				}
				int temp =list[i];// exchange operation
				list[i]=list[j];
				list[j]=temp;
			}
		}
		list[indexOfx]= list[i+1];//finalizing the location
		list[i+1]=x;
		return i+1;//returns final location of  pivot number
		//end of partitionRandom
	}
	public static void quickSortMidOf(int[]list, int p, int r) {
		if(r>p) {//stop point for divide
			int q = partitionMidOf(list, p, r);//determining the pivot
			quickSortMidOf(list, p, q-1);//Recursive call
			quickSortMidOf(list, q+1, r);//Recursive call
		}
		//end of quickSortMidOf
	}
	private static int partitionMidOf(int[]list, int p, int r) {
		int midIndex=(p+r)/2;//index of locally middle element
		int mid =list[midIndex];//value of locally middle element
		if((list[p]>=mid && mid >= list[r])||(list[r]>=mid && mid >= list[p])) {//determining middle of firstmidLast element
			mid= list[midIndex];//locally middle element is mid of FirstMidLast element
		}
		else if((list[r]>=list[p] && mid >= list[r])||(list[r]>=mid && list[p] >= list[r])) {//determining middle of firstmidLast element
			mid =list[r];//last element is mid of FirstMidLast element
			midIndex=r;
		}
		else {//determining middle of firstmidLast element
			mid = list[p];//first element is mid of FirstMidLast element
			midIndex=p;
		}
		int x =mid;//assigning the mid element of FirstMidLast to the pivot element
		int indexOfx= midIndex;//assigning the index of mid element of FirstMidLast to the pivot element
		
		int i =p-1;//final location of the pivot number will be i+1
		for (int j = p; j < r+1; j++) {//loop for compare elements
			if(x>list[j]) {//comparing with pivot
				i++;
				if(i==indexOfx) {//if index of pivot changes updates it.
					indexOfx=j;
				}
				int temp =list[i];// exchange operation
				list[i]=list[j];
				list[j]=temp;
			}
		}
		list[indexOfx]= list[i+1];//finalizing the location
		list[i+1]=x;
		return i+1;//returns final location of  pivot number
		//end of partitionMidOf
		
		
		
		
		
	}
}
