
public class Queue {
	private Integer[] queue = new Integer[20];
	private int top = -1;

	public boolean enqueue(Integer value) {
		if (isFull()) {
			return false;
		} else {
			top++;
			queue[top] = value;

			return true;
		}
	}

	public Integer dequeue(){
		if(isEmpty()){
			return null;
		} else {
			Integer temp = queue[0];
		for (int i = 0; i < top- 1; i++) {
		 queue[i] = queue[i+1];
		}
		top--;
			return temp;
			
		}
	}
	
	public void printQueue(){
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]+ " ");
		}
		System.out.println();
	}
	
	public Integer peek(){
		if(isEmpty()){
		return null;
		} else {
	
		return queue[0];
		}
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}

		return false;
	}

	public boolean isFull() {
		if (top == (queue.length - 1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Queue myQueue = new Queue();
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.isFull());
		System.out.println(myQueue.peek());
		myQueue.printQueue();
		System.out.println(myQueue.dequeue());
		myQueue.enqueue(19);
		myQueue.enqueue(22);
		myQueue.enqueue(15);
		myQueue.enqueue(10);
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.isFull());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.dequeue());
		myQueue.printQueue();
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.isFull());
		System.out.println(myQueue.peek());
		
	}

}
