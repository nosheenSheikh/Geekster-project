package november15;

import java.util.*;
public class GenericTree {

	private class Node{
		int data;
		ArrayList<Node> children  = new ArrayList<>();
	}

	private Node root;
	private int size;
	
	public GenericTree(int[] arr) {
		Stack<Node> st = new Stack<>();
		
		for(int i=0;i< arr.length;i++) {
			if(arr[i] == -1) {
				st.pop();
			}else {
				Node node = new Node();
				this.size++;
				
				node.data = arr[i];
				if(st.size() > 0) {
					st.peek().children.add(node);
				}else {
					this.root = node;
				}
				
				st.push(node);
			}
		}
	}
	
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		System.out.print(node.data + "->");
		
		for(Node child: node.children) {
			if(child == null) {
				continue;
			}
			System.out.print(child.data + ", ");
		}
		System.out.println(".");
		
		for(Node child: node.children) {
			if(child == null) {
				continue;
			}
			display(child);
		}
	}
	
	public int size2() {
		return size2(root);
	}
	
	private int size2(Node node) {
		int size=0;
		
		for(Node child: node.children) {
			int csize = size2(child);
			size += csize;
		}
		
		size++;
		return size;
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		int max = node.data;
		
		for(Node child: node.children) {
			int myMax= max(child);
			max = Math.max(myMax, max); 
		}
		
		return max;
	}
	
	public boolean find(int val) {
		return find(root,val);
	}
	
	private boolean find(Node node, int val) {
		
		if(node.data == val) {
			return true;
		}
		for(Node child: node.children) {
			boolean childRes =  find(child, val);
			if(childRes == true) {
				return true;
			}
		}
		
		return false;
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		int ht = 0;
		
		for(Node child: node.children) {
			int currH = height(child);
			ht  = Math.max(ht, currH);
		}
		
		ht++;
		return ht;
	}
	
	public ArrayList<Integer> nodeToRootPath(int data){
		return nodeToRootPath(root, data);
	}
	
	private ArrayList<Integer> nodeToRootPath(Node node, int data){
		
		if(node.data == data) {
			ArrayList<Integer> toReturn = new ArrayList<>();
			toReturn.add(node.data);
			return toReturn;
		}
		ArrayList<Integer> mRes = new ArrayList<>();
		
		for(Node child: node.children) {
			ArrayList<Integer> rRes = nodeToRootPath(child, data);
			
			if(rRes.size() > 0) {
				rRes.add(node.data);
				return rRes;
			}
			
		}
		
		return new ArrayList<>();
	}
	
	public void removeLeaves() {
		removeLeaves(root);
	}
	
	private void removeLeaves(Node node) {
		for(int i= node.children.size()-1; i>=0 ; i--) {
			Node child = node.children.get(i);
			
			if(child.children.size() == 0) {
				node.children.remove(child);
			}else {
				removeLeaves(child);
			}
		}
	}
	
	public void removeLeaves2() {
		removeLeaves2(root, null, 0);
	}
	
	private void removeLeaves2(Node node, Node parent, int idx) {
		if(node.children.size() == 0) {
			parent.children.set(idx, null);
		}
		
		for(int i=0;i< node.children.size();i++) {
			Node child = node.children.get(i);
			removeLeaves2(child, node, i);
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node node) {
		System.out.print(node.data + " ");
		
		for(Node child: node.children) {
			preOrder(child);
		}
	}
	
	public void postOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node node) {
		
		for(Node child: node.children) {
			postOrder(child);
		}
		System.out.print(node.data + " ");
	}
	
	public void levelOrder() {
		LinkedList<Node> q = new LinkedList<>();
		
		q.addLast(this.root);
		
		while(q.size()>0) {
			Node node = q.removeFirst();
			System.out.print(node.data + " ");
			
			for(Node child: node.children) {
				q.addLast(child);
			}
		}
		System.out.println();
	}
	
	public void levelOrderLineWise() {
		LinkedList<Node> currq = new LinkedList<GenericTree.Node>();
		LinkedList<Node> nextq = new LinkedList<GenericTree.Node>();
		
		currq.add(this.root);
		
		while(currq.size() > 0) {
			Node node = currq.removeFirst();
			System.out.print(node.data +" ");
			for(Node child: node.children) {
				nextq.addLast(child);
			}
			
			if(currq.size() == 0) {
				currq = nextq;
				nextq = new LinkedList<GenericTree.Node>();
				System.out.println();
			}
		}
	}
	
	public void printLevelOrderZigZag() {
		Stack<Node> currStack = new Stack<>();
		Stack<Node> nextStack = new Stack<>();
		
		
		currStack.push(this.root);
		int level = 0;
		while(currStack.size()>0) {
			Node node  = currStack.pop();
			System.out.print(node.data + " ");
			
			if(level%2 == 0) {
				for(int i=0;i< node.children.size();i++) {
					nextStack.push(node.children.get(i));
				}
			}else {
				for(int i=node.children.size()-1;i>=0;i--) {
					nextStack.push(node.children.get(i));
				}
			}
			
			if(currStack.size() == 0) {
				currStack = nextStack;
				nextStack = new Stack<>();
				System.out.println();
				level++;
			}
			
		}
	}
	
	public void mirror() {
		mirror(this.root);
	}
	
	private void mirror(Node node) {
		for(Node child: node.children) {
			mirror(child);
		}
		
		Collections.reverse(node.children);
	}
	
	public int lowestCommonAncestor(int a, int b) {
		return lowestCommonAncestor(this.root,a,b);
	}
	
	private int lowestCommonAncestor(Node node, int a, int b) {
		ArrayList<Integer> pathOfa = nodeToRootPath(node, a);
		ArrayList<Integer> pathOfb = nodeToRootPath(node, b);

		int i=0;
		while( i<pathOfa.size() &&  i<pathOfb.size() && pathOfa.size() == pathOfb.size()) {
			i++;
		}
		
		return pathOfa.get(i-1);
	}
	
	public void linearize() {
		linearize(this.root);
	}
	
	private void linearize(Node node) {
		for(Node child: node.children) {
			linearize(child);
		}
		
		for(int i = node.children.size()-1; i>0;i--) {
			Node lc = node.children.get(i);
			Node sl = node.children.get(i-1);
			Node sltail = getTail(sl);
			sltail.children.add(lc);
			
		}
	}
	
	private Node getTail(Node node) {
		Node temp = node;
		
		while(node.children.size() !=0) {
			temp  = temp.children.get(0);
		}
		
		return temp;
	}
	
	public boolean isSymmetric() {
		return isSymmetric(this.root, this.root);
	}
	
	private boolean isSymmetric(Node n1, Node n2) {
		
		
		if(n1.data != n2.data) {
			return false;
		}
		
		if(n1.children.size() != n2.children.size()) {
			return false;
		}
		
		int left =0;
		int right = n1.children.size()-1;
		while(left < n1.children.size()) {
			Node lc = n1.children.get(left);
			Node rc = n1.children.get(right);
			
			boolean isSymmetricLR = isSymmetric(lc,rc);
			
			if(isSymmetricLR == false) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
}
