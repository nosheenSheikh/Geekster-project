package october31;

public class LinkedList {
	
	public class Node{
		int data;
		Node next;
	}
	
	Node head;
	Node tail;
	int size=0;
	
	public void addLast(int data) {
		Node newNode  = new Node();
		newNode.data = data;
		
		if(size == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void addElementAtStart(int data) {
		Node newNode  = new Node();
		newNode.data = data;
		
		if(size == 0) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	public void addNodeAtFirst(Node newNode) {
		if(this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size++;
	}
	
	public void addElemAtSpecificLoc(int data, int loc) {
		if(loc < 0 || loc > size) {
			System.out.println("loction out of bound");
			return;
		}
		
		if(loc == 0) {
			addElementAtStart(data);
			return;
		}else if(loc == size) {
			addLast(data);
			return;
		}else {
				Node temp = head;
				int i=0;
				while(i+1 != loc) {
					temp = temp.next;
					i++;
				}
				Node newNode  = new Node();
				newNode.data = data;
				
				newNode.next = temp.next;
				temp.next = newNode;
				}
	
		size++;
	}
	
	//remove first
	public void removeFirst() {
		if(size==1) {
			head= null;
			tail=null;
		}else if(size ==0) {
			System.out.println("no elem present in the list");
			return;
		}
	
		head = head.next;
		size--;
	}
	//remove last
	public void removeLast() {
		if(size==1) {
			head= null;
			tail=null;
		}else if(size ==0) {
			System.out.println("no elem present in the list");
			return;
		}
		
		Node temp = head;
		while(temp.next.next !=null) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}
	//remove at
	public void removeAt(int loc) {
		if(loc < 0 || loc > size) {
			System.out.println("loction out of bound");
			return;
		}else if(loc == 0) {
			removeFirst();
			return;
		}else if(loc == size) {
			removeLast();
			return;
		}else {
			Node temp = head;
			int i=0;
			while(i+1 != loc) {
				temp = temp.next;
				i++;
			}
			temp.next = temp.next.next;
		}
		size--;
		
	}
	//get first
	public void getFirst() {
		if(size==0) {
			System.out.println("list is empty");
		}
		System.out.println(head.data);
	}
	//get last
	public void getLast() {
		if(size==0) {
			System.out.println("list is empty");
		}
		System.out.println(tail.data);
	}
	//get at
	public void getAt(int loc) {
		if(size==0) {
			System.out.println("list is empty");
		}
		Node temp =head;
		int i=0;
		while(i != loc) {
			temp = temp.next;
			i++;
		}
		System.out.println(temp.data);
	}
	
	//get node at
	public Node getNodeAt(int idx) {
		if(idx >= this.size || idx < 0) {
			return null;
		}
		
		int count=0;
		Node temp = this.head;
		while(count < idx) {
			temp = temp.next;
			count++;
		}
		return temp;
	}
	
	//is empty
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public int getSize(Node head) {
		return size;
	}
	
	//reverse list using Data iterative
	public void reverseDI() {
		int l=0;
		int r= this.size -1;
		
		while(l<r) {
			Node lNode = getNodeAt(l);
			Node rNode = getNodeAt(r);
			
			//swap
			int temp = lNode.data;
			lNode.data = rNode.data;
			rNode.data = temp;
			
			l++;
			r--;
		}
	}
	
	//reverse list using Pointer iterative
	public void reversePI() {
		Node curr= this.head;
		Node prev = null;
		
		while(curr !=null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		Node tempr = this.head;
		this.head = this.tail;
		this.tail = tempr;
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public int kFromLast(int k) {
		Node fast = this.head;
		Node slow = this.head;
		
		for(int i=0;i<k;i++) {
			fast = fast.next.next;
		}
		
		while(fast !=null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	class Helper{
		Node left;
	}
	
	public void fold() {
		Helper hp = new Helper();
		hp.left = this.head;
		Node right = this.head;
		fold(hp,right,0);
	}
	
	private void fold(Helper hp, Node right, int floor) {
		if(right == null) {
			return;
		}
		
		fold(hp,right.next,floor+1);
		Node currLeftNext = hp.left.next;
		hp.left.next = right;
		right.next = currLeftNext;
		hp.left = currLeftNext;
		
		if(floor == size/2) {
			//works for both even and odd sized list
			right.next = null;
			tail = right;
		}
		
	}
	
//	public static void LinkedList mergeTwoSortedList(LinkedList l1, LinkedList l2) {
//		
//	}
	
	public void removeDuplicates() {
		LinkedList list = new LinkedList();
		while(this.size !=0) {
			if(list.size ==0 || list.tail.data != this.head.data) {
				this.removeFirstNode();
				
			}
		}
	}
	public Node removeFirstNode() {
		if(size==0) {
			return null;
		}
		
		Node toReturn;
		toReturn = head;
		
		if(size==1) {
			head = null;
			tail = null;
		}else {
			head = head.next;
		}
		
		toReturn.next = null;
		size--;
		return toReturn;
	}
	
	public void addLastNode(Node newNode) {
		if(this.head ==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		tail.next = null;
		size++;
	}
	
	public void oddEvenSeperation() {
		LinkedList odd = new LinkedList();
		LinkedList even = new LinkedList();
		
		while(this.size !=0) {
			if(this.head.data %2 ==0) {
				even.addLastNode(this.removeFirstNode());
			}else {
				odd.addLastNode(this.removeFirstNode());
			}
		}
		
		odd.tail.next = even.head;
	}
	
	public void kReverse(int k) {
		LinkedList ans = new LinkedList();
		
		while(this.size > 0) {
			LinkedList temp = new LinkedList();
			for(int i=0; i<k && this.size>0;i++) {
				temp.addNodeAtFirst(this.removeFirstNode());
			}
			
			if(ans.head == null) {
				ans.head = temp.head;
				ans.tail = temp.tail;
			}else {
				ans.tail.next = temp.head;
				ans.tail = temp.tail;
			}
			ans.size += temp.size;
		}
		
		this.head = ans.head;
		this.tail = ans.tail;
		this.size = ans.size;
	}
	
}
