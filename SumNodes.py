# Python2 program that finds two nodes in a tree that equal sum

import math
import sys

class Node:
    def __init__(self,data):
        self.data = data
        self.right = None
        self.left = None
        
        
# insert method to create a binary tree
def insert(root, data):
    #if no root
    if root is None:
        return Node(data)
    #if data is less than root data, insert it to left
    if(data < root.data):
        root.left = insert(root.left, data)
    # if greater than, insert it to the right.
    if(data > root.data): 
        root.right = insert(root.right, data) 
    return root 
        
def utility(root, sum, unsorted_set):
    if root is None:
        return False
    if utility(root.left, sum, unsorted_set):
        return True
    if unsorted_set and (sum-root.data) in unsorted_set:
        print("Pair Found: ({0}, {1})".format(sum-root.data, root.data)) 
        return True
    else:
        unsorted_set.add(root.data)
            
    return utility(root.right, sum, unsorted_set)
        
def sumNodes(root, sum):
    unsorted_set = set()
    if(not utility(root,sum,unsorted_set)): 
        print("Pair does not exist!") 
        
        
# test functions
<<<<<<< HEAD
root= None
root = insert(root,10) 
root = insert(root,5) 
root = insert(root,15) 
root = insert(root,11) 
root = insert(root,15) 
sum = 20
sumNodes(root, sum) 
=======
if __name__=='__main__': 
    root= None
    root = insert(root,10) 
    root = insert(root,5) 
    root = insert(root,15) 
    root = insert(root,11) 
    root = insert(root,15) 
    sum = 20
    sumNodes(root, sum) 
>>>>>>> edd28b41e6e589e6190f7884a402404a7930e8c5
