package november8;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack s = new Stack(10);
		
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.getSize();
		s.display();
		
		s.pop();
		s.pop();
		s.display();
		s.isEmpty();
		s.getSize();
		s.top();
		
	}

}
