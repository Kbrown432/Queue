class QDemo {
	private int arr[];
	private int i;
	public int length;

	QDemo(int size) {
		arr = new int[size];
		length = arr.length;
		i = 0;
		

	}

	public boolean push(int s) {
		if(i < arr.length) {
			arr[i] = s;
			i++;
			return true;
		}
		return false;
	}

}
class Queue {
	public static void main(String[] args) {
		QDemo k = new QDemo(5);

		for(int s = 0; s < k.length + 1; s++) {
			if(k.push(s)) {
				System.out.println("Victory is mine!!!!");
			}
			else{
				System.out.println("Blast!!!!");
			}
		}
	}

}
