public class Node 
{ 
	//**** LINK TO THE NEXT NODE *****// 
	public Node next; 
	
	//**** CONTENT OF THIS NODE *****// 
	private String content1; 
	private String content2; 
	// … there are many more members here 

	// Feel free to add helper functions if needed here. 

	// Note: removalRequests_Length is the same as removalRequests.Length 
	
} 

static public Node Remove(Node firstNode, int[] removalRequests, int removalRequests_Length) 
{
	int currRemoveIndex; //the current node we want to remove, indexed from removalRequests
	int currentNodeNumber = 1; //the node we are currently on, 0 index so starts at firstnode.next, which is 1
	Node currentNode = firstNode.next; //iterator to the currently searched node
	Node previousNode = firstNode; //iterator to the node before it
	if (!(removalRequests_Length == 0)) //check to see if the length of array is 0
		currRemoveIndex = 0; 
	else
		return firstNode;
		
	while(!((currRemoveIndex + 1) > removalRequests_Length)) {//while we haven't removed all nodes
		if ((currentNodeNumber) == removalRequests[currRemoveIndex]) { //if the next node is the one we want to remove
			previousNode.next = currentNode.next; //change the reference to the next next node, removing the middle node
			currRemoveIndex++;
		}
		currentNode = currentNode.next;
		previousNode = previousNode.next;
		currentNodeNumber++;
	}
	return firstNode; //returns the stored first node; Never should change because never asked to move the head node
} 