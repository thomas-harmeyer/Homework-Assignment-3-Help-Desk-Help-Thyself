package yeah_oops;
/**
 * Data Structures Linked List Node (DSLLNode)
 */
public class DSLLNode<T> 
{
	private T data;
	private DSLLNode<T> next;
	

	public DSLLNode(T data)
	{
		this(data, null);
	}
	public DSLLNode(T data, DSLLNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(DSLLNode<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return this.data;
	}
	
	public DSLLNode<T> getNext()
	{
		return this.next;
	}
}