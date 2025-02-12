package pertemuan2;

public class Node {
	private int nilai;
	private Node next;
	
	public Node(int nilai) {
		this.nilai = nilai;
		this.next = null;
	}
	
	// setter and getter
	
	
	public void setNext(Node next) {
		this.next = next;
	}

	
	public int getNilai() {
		return nilai;
	}
	
	public Node getNext() {
		return this.next;
	}
	

	
}
