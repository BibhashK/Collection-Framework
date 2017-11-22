
public class LinkedListLogic<T> {
Node1 head;

	// creating head which is null

	public LinkedListLogic() {
		head = null;
	}
	
	// adding a new node insertion
	
public void add(Object value){
	Node1 newNode = new Node1(value,null);
	if(head == null)
		head = newNode;
	else{
		newNode.next = head;
		head = newNode;
	}
	
}
// delete operation of linked list
public void delete(){
	head = head.next;
}

//display the list
public void display(){
	Node1 n = head;
	while(n!=null){
		System.out.println((T)n.value);
		n = n.next;
	}
}
}
