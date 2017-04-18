class Queue {
	private int arr[];
	private int i,j;

	Queue(int size, int i, int j) {
		arr = new int[size];
		
	}

	public boolean push(int i, int c) {
		if(i) {
			arr[i] = c;
			return true;
		}
		return false;
	}

	public int pop() {
		return i;
	}
}