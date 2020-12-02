package november24;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {12, 25, 37, 50, 62, 75,87};
		int[] arr2 = new int[] {1,2,4,5,6,8,9};
		int[] arr3 = new int[] {2,5,10,11,12,20,23,25,35,40};
		BinarySearchTree bst = new BinarySearchTree(arr);
		bst.display();
		System.out.println(bst.max());
		System.out.println(bst.min());
		System.out.println(bst.find(55));
		System.out.println(bst.find(12));
		bst.pir(30, 55);
		System.out.println("\n------------------------");
		BinarySearchTree bst2 = new BinarySearchTree(arr2);
		bst2.replaceWithSumofLargerNodes();
		bst2.display();
		
		BinarySearchTree bst3 = new BinarySearchTree(arr3);
		bst3.display();
		bst3.add(6);
		System.out.println("\n----------\n");
		bst3.display();
		
		
	}

}
