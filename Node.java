public class Node<T>{
	protected Node<T> left;
	protected Node<T> right;
	protected Comparable data;

	public Node(Comparable item) {
		this.data = item;
	}
}