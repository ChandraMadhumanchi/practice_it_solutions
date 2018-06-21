package set1;

public class BinarySearchTree {
	
	Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insertWithOutRec(int id){
		
		Node newNode = new Node(id);
		
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.key){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	void insert(int key){
		root = insertRec(root, key);
	} 
	
	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
	
	void inorder(){
		inorderRec(root);
	}
	
	// A utility function to do inorder traversal of BST
	void inorderRec(Node root){
		
		if(root != null){
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.key);
			display(root.right);
		}
	}
	
	int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

	public Node search(Node root,int key){
		
		if(root == null || root.key == key)
			return root;
		
		if(root.key > key){
			return search(root.right,key);
		}else {
			return search(root.left,key);
		}
	}
	// Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // print inorder traversal of the BST
        tree.inorder();
    }
}

class Node{
	int key;
	Node left,right;
	
	public Node(int key){
		this.key = key;
		left = right = null;
	}
}
