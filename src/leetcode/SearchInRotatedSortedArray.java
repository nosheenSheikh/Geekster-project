package leetcode;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

	public static int search(int[] nums, int target) {
		int index=-1;
        int low=0,high=nums.length-1;
        int pivot1=-1,pivot2=-1,flag=0;

        // check if nums length is 1
        if(nums.length ==1){
            if(nums[0] == target){
            	System.out.println("length is 1 and found target");
                return 0;
            }else{
            	System.out.println("length is 1 and target not found");
                return index;
            }
        }
        
        //for finding the pivot and set flag = 1 when you get the pivot
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
            	System.out.println("pivot found");
                flag=1;
                pivot1 = i;
                pivot2 = i+1;
                System.out.println("pivot1: "+pivot1);
                System.out.println("pivot2: "+pivot2);
                break;
            }
        }
        
     // if pivot found i.e. array is rotated   
     if(flag == 1){
    	 System.out.println("flag is 1");
    	 System.out.println("low: "+low);
    	 System.out.println("high: "+high);
    	 System.out.println("target:"+target);
    	 System.out.println("nums[low]:"+ nums[low]);
    	 System.out.println("pivot1: "+pivot1);
    	 if(target >= nums[pivot2] && target <= nums[high]){
            low = pivot2;   
            System.out.println("low became: "+low);
         }else if(target <= nums[pivot1] && target >= nums[low]){
        	 System.out.println("high became: "+high);
            high = pivot1;
     }
     }
     
        // iterate in the range where target is and find the index
        while(low<=high){
        	System.out.println("enters while");
            int mid = (low+high)/2;
            if(nums[mid] == target){
            	System.out.println("found target at mid: "+mid);
                index = mid;
                break;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return index;
	}
	
	public static void printDecreasing(int num) {
		if(num==0) {
			return;
		}
		System.out.println(num);
		printDecreasing(num-1);
	}
	
	public static void HiOddDecByeEvenInc(int num) {
		if(num==0) {
			return;
		}
		if(num%2 != 0) {
			System.out.println("Hi" + " " + num);
		}
		HiOddDecByeEvenInc(num-1);
		if(num%2 ==0){
			System.out.println("Bye" + " " + num);
		}
	}
	public static int printFactorial(int num) {
		if(num ==1) {
			return 1;
		}
		int fact = printFactorial(num-1);
		int fact1 = fact*num;
		return fact1;
	}
	
	public static int printPower(int num,int p) {
		if(p ==0) {
			return 1;
		}
		
		if(p==1) {
			return num;
		}
		int pow = num * printPower(num, p/2);
		if(num%2==0) {
			return pow*pow;
		}else {
			return pow*pow*2;
		}
		}
	
	public static int printFibonacci(int num) {
		if(num ==1) {
			return 0;
		}
		if(num ==2) {
			return 1;
		}
		int fibnm1 = printFibonacci(num-1);
		int fibnm2 = printFibonacci(num-2);
		int currFib = fibnm1 + fibnm2;
		System.out.println(currFib);
		return currFib;
	}
	
	public static void printArray(int[] arr,int n) {
		if(n<0) {
			return arr[]
		}
		System.out.print(arr[n] + " ");
		printArray(arr,n-1);
//		System.out.print(arr[n] + " ");
	}
	
	public static int printMaxArray(int[] arr, int n) {
		if(n<0) {
			return
		}
		int max = printMaxArray(arr, n-1);
		if(max > arr[n-1]) {
			return max;
		}else {
			return arr[n-1];
		}
	}
	
	public static int find(int[] arr, int vidx, int target) {
		if(vidx == arr.length-1 && arr[arr.length-1] != target) {
			return -1;
		}
		if(arr[vidx] == target) {
			return vidx;
		}
		return find(arr,vidx+1, target);
	}
	
	public static int findFirst(int[] arr, int vidx, int target) {
		if(vidx == arr.length-1 && arr[arr.length-1] != target) {
			return -1;
		}
		if(arr[vidx] == target) {
			return vidx;
		}
		return find(arr,vidx+1, target);
	}
	
	public static int findLast(int[] arr, int vidx, int target) {
		if(vidx == arr.length) {
			return -1;
		}
		int ind = find(arr,vidx+1, target);
		if(ind !=-1) {
			return ind;
		}else {
			if(arr[vidx] == target) {
				return vidx;
			}else {
				return -1;
			}
		}
	}
	static int x=0;
	public static int[] findAllIndices(int[] arr, int vidx, int target,int flag) {
		int [] res  = new int[arr.length-1];
		if(vidx == arr.length) {
			return res;
		}
			if(vidx == arr.length && flag==0) {
				res[0] = -1;
				return res;
			}
			if(arr[vidx] == target) {
				flag=1;
				res[x] = vidx;
				x++;
			}
			return findAllIndices(arr,vidx+1, target,flag);
	}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for(int in=0;in<n;in++) {
//			nums[in] = sc.nextInt();
//		}
//		int target = sc.nextInt();
//		int result = search(nums,target);
//		System.out.println("result: "+result);
//		printDecreasing(5);
//		HiOddDecByeEvenInc(6);
//		int fact = printFactorial(5);
//		System.out.println(fact);
//		printPower(2,32);
//		int fib = printFibonacci(5);
//		System.out.println(fib);
		int[] arr = new int[] {5, 2 ,100,6, 8 , 100,0, 3,9,100,20,30};
//		printArray(arr,arr.length-1);
//		int max = printMaxArray(arr, arr.length-1);
//		System.out.println(max);
//		int res =find(arr, 0,100);
//		System.out.println(res);
//		int index = findLast(arr,0,100);
//		System.out.println(index);
		int[] result = findAllIndices(arr, 0,100,0);
		for(int i=0;i<arr.length;i++) {
			System.out.println(result[i]);
		}
		
    }
	}

 
