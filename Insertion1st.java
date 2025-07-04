public class Insertion1st {
   
        Node head;
        class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
    
        }
        // insert the node at the very end in the linked list
        public void insertAtEnd(int newData){
            // initialize the newNode with the newData enterd by the user
          Node newNode =new Node(newData);
          // linked list is empty 
          if(head == null){
            head = new Node(newData);
            return;
          }
          // linked list is not empty
           newNode.next = null;
           // traversing the linkedlist at the end of the node
           Node temp = head;
           while(temp.next != null){
            temp =temp.next;
    
           }
           temp.next = newNode;
           return;
    
        }
       // implemetion of insertion of a node at the beginning
         public void insertAtBeginning (int newData){
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
         }
    
    
    
    // implemention of displaying the linkedlist
        public void printNodes(){
            Node current=head;
            while (current!= null){
                // printing the element in linked list
                System.out.println(current.data+"");
                current = current.next;
    
            }
        }
        public static void main(String [] args){
            Insertion1st llist = new  Insertion1st();
        // before the element present in the linked list
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
    
        System.out.println("Before insertion of 10");
         llist.printNodes();
        System.out.println();
        
        
        // insert a new element in linked list in 
        llist.insertAtEnd(10);
        llist.insertAtBeginning (1);
        llist.insertAtBeginning (19);
       
        System.out.println("Linked list after successful insertion of all the nodes:");
        llist.printNodes();
        System.out.println();
    
    
        }
    }

    

