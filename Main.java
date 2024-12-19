class Main {

    // Linked list node
    static class Node {  //refines a nested static class Node representing a node in the linked list.
        int data; //Each node has an integer data and a reference to the next node.
        Node next; //Each node has an integer data and a reference to the next node.
    }

    // Function to remove the first node
    static Node removeFirst(Node head) {
        if (head == null) // check the condition for head
            return null;  //Checks if the head is null. If true, returns null

        // Move the head pointer to the next node Moves the head pointer to the next node, effectively removing the first node.
        head = head.next;

        return head; //returns updated head
    }

    // Function to add the first node at the head
    static Node addFirst(Node headReference, int newData) { //Defines a static method addFirst that adds a new node with the specified data at the beginning of the linked list.
        Node newNode = new Node(); //create a new node
        newNode.data = newData; //Creates a new node with the given data.
        newNode.next = headReference; //Sets the next reference of the new node to the current head.
        headReference = newNode; //updates the new head to the next node
        return headReference; //returns the updated head
    }

    // Function to add the last node
    static Node addLast(Node headReference, int newData) { //Defines a static method addLast that adds a new node with the specified data at the end of the linked list.
        Node newNode = new Node(); //Creates a new node with the given data and sets its next reference to null.
        newNode.data = newData;
        newNode.next = null;

        if (headReference == null) {
            // If the list is empty, set the new node as the head
            headReference = newNode;
        } else {
            // Traverse to the end of the list and add the new node
            Node temp = headReference;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        return headReference; //Returns the updated head.
    }

    // Function to remove the last element
    static Node removeLast(Node headReference) {
        if (headReference == null || headReference.next == null) {
            // If the list is empty or has only one element, return null
            return null;
        }

        Node previous = null;
        Node temp = headReference;

        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }

        // Remove the last element by setting the previous node's next to null
        previous.next = null;
        return headReference; //Returns the updated head
    }

    // Function to get the first node
    static Node getFirst(Node headReference) {
        return headReference;
    }

    // Function to get the last element
    static Node getLast(Node headReference) {
        if (headReference == null) {
            // If the list is empty, return null
            return null;
        }

        Node previous = null; //Initializes previous and temp nodes for traversal.
        Node temp = headReference;  //Initializes previous and temp nodes for traversal.

        while (temp != null) {
            previous = temp;
            temp = temp.next; //Traverses the list to find the last node.
        }

        return previous; //Returns the last node
    }

    // Function to get the size of the linked list
    static int getSize(Node headReference) {
        Node temp = headReference;
        int index = 0; //Initializes temp for traversal and index to 0.
        while (temp != null) {
            // Traverse the list and increment the index for each node
            index++;
            temp = temp.next;
        }
        return index; //returns the size of the list
    }

    // main class
    public static void main(String[] args) {
        // Starting with an empty list
        Node head = null;

        // Add elements at the beginning of the list
        head = addFirst(head, 14);
        head = addFirst(head, 5);
        head = addFirst(head, 29);
        head = addFirst(head, 7);
        head = addFirst(head, 10);

        // Remove the first element
        head = removeFirst(head); //moves the first element using the removeFirst method.

        // The rest of the operations can be done similarly

        // Display the list
        for (Node temp = head; temp != null; temp = temp.next) //Displays the elements of the linked list using a loop.
            System.out.print(temp.data + " ");
    }
}
