/** Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, 
 * and deserialize(s), which deserializes the string back into the tree.
 * For example, given the following Node class
 *
 *	class Node:
 *		def __init__(self, val, left=None, right=None):
 *			self.val = val
 *			self.left = left
 *			self.right = right
 *	The following test should pass:
 *
 *	node = Node('root', Node('left', Node('left.left')), Node('right'))
 *	assert deserialize(serialize(node)).left.left.val == 'left.left'
 */
 
 public class Tree{
	 
	 public class Node {
		 
		 Node left = null;
		 Node right = null;
		 String val =  null;
		 
		 public Node(Node self, String val, Node left, Node right){
			 
			 this.left = left;
			 this.right = right;
			 this.val = val;
			 
		 }
		 
		 
	 }
	 
	 
	 public String serialize(Node root){
		 
		 
		 
		 
		 
	 }
	 
	 
	 public Node deserialize(String s){
		 
		 return null;
		 
	 }
	 
	 public static void main(String[] args){
		 
		 
	 }
	 
 }