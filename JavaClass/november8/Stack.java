package november8;

public class Stack {
	int[] data;
	int toss;
	Stack(int cap){
		data = new int[cap];
		toss = -1;
	}
	
	public void push(int item) throws Exception{
		if(this.toss == this.data.length -1) {
			throw new Exception("Stack is full");
		}
		
		this.toss++;
		this.data[this.toss] = item;
	}
	
	public int top() throws Exception{
		if(this.toss == -1) {
			throw new Exception("Stack is empty");
		}
		
		return this.data[this.toss];
	}
	
	public int pop() throws Exception{
		if(this.toss == -1) {
			throw new Exception("Stack is empty");
		}
		
		int rv = this.data[this.toss];
		this.toss--;
		return rv;
	}
	
	public boolean isEmpty() {
		if(this.toss == -1) {
			System.out.println("yes");
			return true;
		}else {
			System.out.println("no");
			return false;
		}
	}
	
	public int getSize() {
		System.out.println(this.toss+1);
		return this.toss+1;
	}
	
	public void display() {
		for(int i= this.toss;i>=0;i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}
}
