class QDemo {
	private int arr[];
	private int i;
	private int j;
	public int length;

	QDemo(int size) {
		arr = new int[size];
		length = arr.length;
		i = 0;
		j = 0;
		

	}

	public boolean push(int s) {
		if (i < arr.length) {
			arr[i] = s;
			i++;
			return true;
		}
		return false;
	}


	public int pop(){
		if ( i > j ) {
			return arr[j++];
		}
			
		else{
			return -1;
		}


	}
}
class Queue {
	public static void main(String[] args) {
		QDemo k = new QDemo(5);

		k.push(7);
		k.push(5);
		System.out.println(k.pop());
		System.out.println(k.pop());

		for(int s = 0; s < k.length; s++) {

			if (k.push(s)) {
				System.out.println("Victory is mine!!!!");
			}
			else{
				System.out.println("Blast!!!!");
			}
			
		}

		for(int s = 0; s < k.length + 1; s++) {
			if ( s <= 1 ){
				System.out.println(k.push(s));
			}
			else {
				System.out.println(k.pop());

			}
		}
	}

}
