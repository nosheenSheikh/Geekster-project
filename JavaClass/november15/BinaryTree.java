package november15;

import java.util.*;


public class BinaryTree {
		
		private Node root;
		int size;
		
		private class Node {
			int data;
			Node left;
			Node right;
		}
		
		BinaryTree(int[] arr) {
			Stack<BinaryTree.Node> st = new Stack<>();
			
			for(int i=0;i< arr.length;i++) {
				if(arr[i] == -1) {
					st.pop();
				}else {
					Node node = new Node();
					this.size++;
					
					node.data = arr[i];
					if(st.size() > 0) {
						if(st.peek().left == null) {
							st.peek().left = node;
						}else {
							st.peek().right = node;
						}
					}else {
						this.root = node;
					}
					this.size++;
					st.push(node);
				}
			}
		}
		
		public void display() {
			display(this.root);
		}
		
		private void display(Node node) {
			if(node == null) {
				return;
			}
			else {
				String str = "";
				str += node.left != null ? node.left.data + "->" : "$->";
				str += node.right != null ? node.data + "<-" + node.right.data + "<-": node.data + "<-$";
				System.out.println(str);
				display(node.left);
				display(node.right);
			}
			
		}
		
		public int size1() {
			return size1(this.root);
		}
		
		private int size1(Node node) {
			//base case
			if(node == null) {
				return 0;
			}
			
			int lcSize = size1(node.left);
			int rcSize = size1(node.right);
			
			return lcSize  +rcSize+1;
		}
		
		
		public int max() {
			return max(this.root);
		}
		
		private int max(Node node) {
			if(node == null) {
				return Integer.MIN_VALUE;
			}
			
			int lmax = max(node.left);
			int rmax = max(node.right);
			
			int max = Math.max(lmax,rmax);
			
			return Math.max(node.data, max);
		}
		
		public int min() {
			return max(this.root);
		}
		
		private int mion(Node node) {
			if(node == null) {
				return Integer.MAX_VALUE;
			}
			
			int lmin = max(node.left);
			int rmin = max(node.right);
			
			int min = Math.max(lmin,rmin);
			
			return Math.min(node.data, min);
		}
		
		public int height() {
			return height(root);
		}
		
		private int height(Node node) {
			if(node == null) {
				return 0;
			}
			int ht = 0;
			int lh = height(node.left);
			int rh = height(node.right);
			ht = Math.max(lh, rh);
			ht++;
			return ht;
		}

		public boolean find(int val) {
			return find(this.root, val);
		}
		
		private boolean find(Node node, int val) {
			if(node == null) {
				return false;
			}
			if(node.data == val) {
				return true;
			}
			
			return (find(node.left, val) || find(node.right, val));
		}
		
		public void removeLeaves() {
			removeLeaves(root);
		}
		
		private void removeLeaves(Node node) {
			if(node == null) {
				return;
			}
			if(node.left == null && node.right == null) {
				return;
			}
			if(isLeaf(node.left)) {
				node.left = null;
			}
			
			if(isLeaf(node.right)) {
				node.right = null;
			}
			
			removeLeaves(node.left);
			removeLeaves(node.right);
		}
		
		private boolean isLeaf(Node node) {
			if(node.left == null && node.right == null) {
				return true;
			}else {
				return false;
			}
		}
		
		public void printSingleChild() {
			
			if(this.root == null) {
				return;
			}
			printSingleChild(this.root);
			
			
		}
		
		private void printSingleChild(Node node) {
			if(node.left == null && node.right == null) {
				return;
			}
			
			if(node.left != null && node.right == null) {
				System.out.println(node.left.data);
				printSingleChild(node.left);
			}else if(node.left == null && node.right != null) {
				System.out.println(node.right.data);
				printSingleChild(node.right);
			}else {
				printSingleChild(node.left);
				printSingleChild(node.right);
			}
			
		}
		
		public void printKthDesc(int val, int k){
			findNodeAndPrint(val, k, this.root);
		}
		
		private void findNodeAndPrint(int val, int k, Node node) {
			//base case
			if(node == null) {
				return;
			}
			
			//if node.data is val extra function printkthdescendant
			if(node.data == val) {
				printKthDescendant(k, node);
			}
			
			findNodeAndPrint(val, k, node.left);
			findNodeAndPrint(val, k, node.right);
		}
		
		private void printKthDescendant(int k, Node node){
			if(node == null) {
				return;
			}
			
			if(k==1) {
				System.out.println(node.data);
				return;
			}else {
				printKthDescendant(k-1, node.left);
				printKthDescendant(k-1, node.right);
			}
			
			}
		
		public int maxWidth() {
			return maxWidth(this.root).maxDiameter;
		}

		class pair{
			int height;
			int maxDiameter;
			pair(int h, int md){
				height = h;
				maxDiameter = md;
			}
		}
		
		public pair maxWidth(Node node) {
			if(node == null) {
				return new pair(0,0);
			}
			pair p1 = maxWidth(node.left);
			pair p2 = maxWidth(node.right);

			int height = Math.max(p1.height, p2.height) + 1;
			int myDaimeter = p1.height + p2.height  +1;
			
			int maxDiameter = Math.max(myDaimeter, Math.max(p1.maxDiameter, p2.maxDiameter));

			return new pair(height, maxDiameter);
			
		}
		
		public void preOrder() {
			preOrder(this.root);
		}
		
		private void preOrder(Node node) {
			if(node == null) {
				return;
			}
			
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		
		class pair1{
			Node node;
			int state;
			
			pair1(Node n, int s){
				node = n;
				state = s;
			}
		}
		
		public void preOrderIter() {
			Stack<pair1> st = new Stack<pair1>();
			
			pair1 p1 = new pair1(this.root, 0);
			
			st.push(p1);
			while(!st.isEmpty()) {
				pair1 topPair = st.peek();
				
				if(topPair.state == 0) {
					System.out.print(topPair.node.data + " ");
					topPair.state++;
				}else if(topPair.state == 1) {
					if(topPair.node.left != null) {
						st.push(new pair1(topPair.node.left, 0));
					}
					topPair.state++;
				}else if(topPair.state == 2) {
					if(topPair.node.right != null) {
						st.push(new pair1(topPair.node.right, 0));
					}
					topPair.state++;
				}else {
					st.pop();
				}
			}
			
		}
}
