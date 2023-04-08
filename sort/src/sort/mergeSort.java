package sort;
public class mergeSort {

	
	
	static void mergeSort2(int[] list,int p, int r){
		if(r>p) {
			int q =(p+r)/2;//calculates the middle point
			mergeSort2(list,p,q);//recursive calls 
			mergeSort2(list,q+1,r);
			Merge(list,p,q,r);//merging seperate arrays.
		}
		
		//end of mergeSort
	}
	static void Merge(int[] list, int p,int q, int r) {
		//start of the Merge
		int n1=q-p+1;//calculating the left array size
		int n2 = r-q;// calculating the right array size
		int[] leftList = new int[n1];
		int[] rightList= new int[n2];
		for(int i =0; i<n1; i++) {//filling the left array
			leftList[i]=list[p+i];
			
		}
		for (int j = 0; j < n2; j++) {//filling the right array
			rightList[j]=list[q+j+1];
		}
		int i =0;//pointer for left list
		int j =0;//pointer for right list
		int k =p;//list index
		while (i < n1 && j < n2) //if two arrays have at least 1 member compare continous
        { 
            if (leftList[i] > rightList[j]) 
            { 
                list[k] = leftList[i]; 
                i++; 
            } 
            else
            { 
                list[k] = rightList[j]; 
                j++; 
            } 
            k++; 
        } 
		//if one of the arrays has 0 members then fills the main list with the array which still has members
        while (i < n1) 
        { 
            list[k] = leftList[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            list[k] = rightList[j]; 
            j++; 
            k++; 
        } 
        //end of Merge
	}
	static void MergeSort3(int[] list, int p, int r){
		if(r-p>=1) {
			
			int m1=p+((r-p)/3);  //calculating the first middle point
			int m2=p+ (2*((r-p)/3)+1);//calculating the second middle point
			MergeSort3(list, p, m1);//recursive 3 parts...
			MergeSort3(list, m1+1, m2);
			MergeSort3(list, m2+1, r);
			merge(list, p, m1,m2,r);//merging the seperate calculations
		}
		//end of the mergeSort3
		
		
		}
	static void merge(int[] list,int p, int m1, int m2, int r) {
		//start of the merge
		int n1= m1-p+1;//calculating array size
		int n2=m2-m1;//calculating array size
		int n3=r-m2;//calculating array size
		int[] left= new int[n1];
		int[] mid= new int[n2];
		int[] right= new int[n3];
		for (int i = 0; i < n1; i++) {//filling the left part according to main array...
			left[i]=list[p+i];
		}
		for (int i = 0; i < n2; i++) {//filling the mid part according to main array...
			mid[i]=list[m1+i+1];
		}
		for (int i = 0; i < n3; i++) {//filling the right part according to main array...
			right[i]=list[m2+i+1];
		}
		
		int i=0;//pointer for left array
		int j=0;//pointer for middle array
		int k=0;//pointer for right array
		int arrayIndex = p;//array index pointer
		int largest =0;
		while(n1>i && n2>j && n3>k) {//compares the arrays while all arrays have at least 1 member.
			largest=0;
			if(left[i]>= mid[j]&&left[i]>=right[k]) {
				largest=left[i];
				i++;
			}
			else if(left[i]>= mid[j]&&left[i]<right[k]){
				largest=right[k];
				k++;
			}
			else if(left[i]< mid[j]&&mid[j]>=right[k]){
				largest=mid[j];
				j++;
			}
			else if(left[i]< mid[j]&&left[i]<right[k]){
				largest=right[k];
				k++;
			}
			list[arrayIndex]=largest;//places the largest to the list
			arrayIndex++;
		}
		largest=0;
		while (n1>i && n2>j) {//if one of the arrays has 0 member continues with left 2 arrays. 
			if(left[i]>=mid[j]) {//compares left and mid arrays.
				list[arrayIndex++]= left[i++];
				
			}
			else {
				list[arrayIndex++]= mid[j++];
			}
		}
		while (n1>i&&n3>k) {//compares left and right array
			if(left[i]>=right[k]) {
				list[arrayIndex++]= left[i++];
				
			}
			else {
				list[arrayIndex++]= right[k++];
		}
		}
		while(n2>j && n3>k) {//compares mid and right array.
			if(mid[j]>=right[k]) {
				list[arrayIndex++]= mid[j++];
				
			}
			else {
				list[arrayIndex++]= right[k++];
		}
		
	}
		//if just one array has elements then fills the main list.
		while(n1>i) {
			list[arrayIndex++]=left[i++];
		}
		while(n2>j) {
			list[arrayIndex++]=mid[j++];
		}
		while(n3>k) {
			list[arrayIndex++]=right[k++];
		}
		//end of the merge
	}
}
		
		
		
	
