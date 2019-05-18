import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class BinarySearchTree {

	
	class Node{ 
		int value;
		Node left;
		Node right; 
	
	
	Node(int value)
	{
		this.value=value;
		left=null;
		right=null;
	}
	
	}
	
	Node root;
	BinarySearchTree()
	{
		root=null;
	}
	
	public void insert(int value)
	{
	  root = insertvalue(root,value);	
	}
	public Node insertvalue(Node current,int value)
	{
		if(current==null)
		{
			return new Node(value);
		}
		
		else if(value<current.value)
		{
			current.left=insertvalue(current.left,value);
		}
		else if(value>current.value)
		{
			current.right=insertvalue(current.right,value);
		}
		
		
		return current;
		
	}
			
	public void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
	
	
	public static void main(String args[])
	{
      BinarySearchTree bst=new BinarySearchTree();
	  bst.insert(7);
	  bst.insert(4);
	  bst.insert(10);
	  bst.insert(1);
	  bst.insert(6);
	  bst.insert(35);
	  
	  bst.preorder(bst.root);
	  
	}
}
