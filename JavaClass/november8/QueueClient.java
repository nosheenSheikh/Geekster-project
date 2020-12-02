package november8;

public class QueueClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
//		q.enqueque(10);
//		q.enqueque(20);
//		q.enqueque(30);
//		q.enqueque(40);
//		q.enqueque(50);
////		q.enqueque(60);
//		q.display();
//		System.out.println(q.dequeque());
//		System.out.println(q.dequeque());
//		q.enqueque(100);
//		q.display();
//		q.enqueque(120);
//		q.display();
		
		DynamicQueue dq = new DynamicQueue(5);
		dq.enqueque(100);
		dq.enqueque(200);
		dq.enqueque(300);
		dq.enqueque(400);
		dq.enqueque(500);
		dq.display();
		dq.enqueque(600);
		dq.display();
	}

}
