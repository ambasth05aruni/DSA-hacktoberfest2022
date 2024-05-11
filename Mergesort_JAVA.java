package Sorting;

public class Mergesort {

    //THE DIVIDE PART OF MERGE SORT
    static void divide(int[] arr,int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(arr, start, mid); //divide in first half
        divide(arr, mid+1, end);//divide in second half
        conquer(arr, start, mid, end);


    }

    //THE CONQUER PART
    static void conquer(int[] arr,int start, int mid, int end){
     int index1=start; // to follow the first divided array
     int index2=mid+1; // to followthe second divided arrray
     int x =0; //for the temporary array's index ko in check rakhne k liye
     int [] merger = new int[end-start+1]; //a temporaray array to store the merged data for copying in original array

     while(index1<=mid && index2<=end){ //when we are comparing data for the two didide arrays
    if(arr[index1]<=arr[index2]){
        merger[x++]=arr[index1++];
    }  
    else{
        merger[x++]=arr[index2++];
    }
     }
while (index1<=mid) {
    merger[x++]=arr[index1++];
}
while (index2<=end) {
    merger[x++]=arr[index2++];
}
for (int i = 0,  j=start; i < merger.length; i++, j++) {
    arr[j]=merger[i];
}

    }





    public static void main(String[] args) {
        int[] arr={2,3,4,2,5,2,4,6,3,3,6,7};
        int n= arr.length;
        divide(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
         }
    }
}

OUTPUT
