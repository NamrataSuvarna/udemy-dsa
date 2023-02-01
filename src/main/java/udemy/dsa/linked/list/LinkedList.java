package udemy.dsa.linked.list;

public interface LinkedList {

	public void create(int value);

	public void delete(int location);

	public void destroy();

	public void insert(int value, int location);

	public void reverseTraverse();

	public boolean search(int value);

	public void traverse();

}