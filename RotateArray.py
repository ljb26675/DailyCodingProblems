
# Function to rotate the array left by one
def rotLeftOne(arr, n):
    val = arr[0]
    for i in range(n-1):
        arr[i] = arr[i+1]
        
    arr[n-1] = val
    
    
#define the function that will left rotate an array of size n, x times
def rotLeft(arr, n, x):
    for i in range(x):
        rotLeftOne(arr, n)
        
        
# print the array
def printArray(arr, size):
    for i in range(size):
        print("%d" %arr[i]),
        
#Test methods

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

print("Original array: "),
printArray(arr, 10)
rotLeft(arr, 10, 2)
print("")
print("Rotate left 2 times: "),
printArray(arr, 10)
