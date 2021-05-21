
public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int numOfItems;
	

	@Override
	public void insert(T data) {
		
		if(root == null) {
//			If this is the first item in the linked list
			root = new Node<>(data);
		} else {
//			we know that this is not the first item in the linked list
			insertBeginning(data);
		}
		
		
	}

//	update the references
	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	
//	We have to start with the root node
	private void insertEnd(T data, Node<T> node) {
		if(node.getNextNode() != null) {
//			looking for the last node recursively...
			insertEnd(data, node.getNextNode());
		} else {
//			we have found the last node
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		
		if(root == null) return;
		
		if(root.getData().compareTo(data) == 0) {
//		removing the first node (root)
			root = root.getNextNode();
		} else {
//		removing any other node
			remove(data, root, root.getNextNode());
			
		}
		
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
//		First we have to find the node we want to remove
		while(actualNode != null) {
//			This is the node we want to remove
			if(actualNode.getData().compareTo(data) == 0) {
//				Update the references
				numOfItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverse() {
		if(root == null) return;
		
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		return numOfItems;
	}

	
	
}
