package november15;

public class GenericTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		int[] arr2 = new int[] {1, 2, 4, -1, 5, -1, -1, 3, 6, -1, 7, -1, -1, -1};
//		int [] arr2 = {1,2,1,-1,1,-1,1,-1,-1,3,-1,2,1,-1,1,-1,1,-1,-1,-1};
//		GenericTree gt = new GenericTree(arr2);
		
//		gt.display();
//		System.out.println(gt.size2());
//		System.out.println(gt.max());
//		
//		System.out.println(gt.find(40));
//		System.out.println(gt.find(400));
//		
//		System.out.println(gt.height());
//		
//		System.out.println(gt.nodeToRootPath(120));
//		
////		gt.removeLeaves();
////		gt.display();
//		
//		gt.removeLeaves2();
//		gt.display();
		
//		gt.preOrder();
//		
//		System.out.println();
//		gt.postOrder();
		
//		gt.levelOrder();
//		
//		gt.levelOrderLineWise();
		
//		gt.printLevelOrderZigZag();
		
//		gt.mirror();
//		
//		gt.display();
		
//		int ans = gt.lowestCommonAncestor(70, 120);
//		System.out.println(ans);
		
//		gt.linearize();
//		gt.display();
		
//		System.out.println(gt.isSymmetric());
		
		BinaryTree bt = new BinaryTree(arr);
//		
//		bt.display();
//		System.out.println(bt.size1());
//		System.out.println(bt.max());
//		System.out.println(bt.min());
//		System.out.println(bt.height());
//		
//		System.out.println(bt.find(400));
//		System.out.println("---------");
//		bt.removeLeaves();
//		bt.display();
//		System.out.println("*****");
//		bt.printKthDesc(20,2);
		bt.preOrderIter();
	}
	
	
}
