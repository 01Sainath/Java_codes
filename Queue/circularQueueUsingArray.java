
public class circularQueueUsingArray {
	
	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;
		Queue(int n){
			arr=new int[n];
			size=n;
		}
		
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		public static boolean isFull() {
			return (rear+1)%size == front;
		}
		
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Full queue.");
				return;
			}
			
			if(front==-1) {
				front=0;
			}
			rear = (rear+1)%size;
			arr[rear]=data;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty Queue.");
				return -1;
			}
			
			int result = arr[front];
			
			//Single element remove...
			
			if(rear == front) {
				rear=front=-1;
			}
			else {
				front=(front+1)%size;
			}
			
			return result;
				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		q.add(6);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
