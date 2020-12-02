package november8;

public class Queue {
	
	protected int[] data;
	protected int front;
	protected int rear;
	protected int size;
	Queue(int cap){
		this.data = new int[cap];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueque(int item) throws Exception{
		if(size == data.length) {
			throw new Exception("Queue is full");
		}
		
		this.rear++;
		this.rear = this.rear % data.length ;
		this.data[this.rear] = item;
		if(this.front == -1) {
			front++;
		}
		this.size++;
	}
	
	public int dequeque() throws Exception{
		if(size == 0) {
			throw new Exception("Queue is empty");
		}
		int rv = this.data[this.front];
		this.front++;
		this.front = this.front % data.length ;
		this.size--;
		return rv;
	}

	public int getSize() {
		return size;
	}
	
	public int front() throws Exception{
		if(this.size ==0) {
			throw new Exception("Queue is empty");
		}
		
		return this.data[this.front];
	}
	
	public boolean empty() {
		return this.size ==0? true: false;
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(this.data[(this.front+i) % data.length] + " ");
		}
		System.out.println();
	}
}
