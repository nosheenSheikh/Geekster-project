package november8;

public class DynamicQueue extends Queue{

	DynamicQueue(int cap){
		super(cap);
	}
	
	@Override
	public void enqueque(int item) throws Exception{
		if(this.size == this.data.length) {
			int[] oa = data;
			data = new int[2*oa.length];
			
			for(int i=0;i<size;i++) {
				data[i] = oa[(front + i) % oa.length];
			}
			this.front = 0;
			this.rear = this.size-1;
		}
		
		this.rear++;
		this.rear = this.rear % data.length;
		this.data[this.rear] = item;
		if(this.front == -1) {
			this.front++;
		}
		this.size++;
	}
	
	
}
