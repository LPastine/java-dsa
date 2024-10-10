# Arrays

- They are stored as one contiguous block in memory.

You don't have the items or elements in an Array scattered throughout
memory.

All of the items, they're all stored as one contiguous block.

They can't be resized because if they could be resized, then there
would be no guarantee that whenever the added extra space would be on 
that specific block of memory.

- Every element occupies the same amount of space in memory.

What's stored on the space of memory of the element is a reference
to the actual object. Because for example, we can create an array
of strings. And those strings can have different sizes or lengths.
But what's constant between them is the reference value of that object.

- If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the i<sup>th</sup> element by using the following expression: x + i * y
- If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

## Retrieve an Element from an Array

1. Multiply the size of the element by its index
2. Get the start address of the array
3. Add the start address to the result of the multiplication

For an int array, assume element starts at address 12. Each int is 4 bytes

To get intArray[0] = 12 + (0 * 4) = 12

To get intArray[1] = 12 + (1 * 4) = 16

To get intArray[2] = 12 + (2 * 4) = 20

To get intArray[3] = 12 + (3 * 4) = 24

So no matter the number of elements, the number of elements in the array,
the number of steps is always the same 3 listed above.

This results on O(n) algorithm.

The disadvantage of the array is that when we don't know the index
it's linear time complexity, so as the array increases its size
the longer it takes to retrieve that element.


| Operation                                         | Time complexity      |
|---------------------------------------------------|----------------------|
| Retrieve with index                               | O(1) - Constant Time |
| Retrieve without index                            | O(n) - Linear Time   |
| Add an element to a full array                    | O(n)                 |
| Add an element to the end of an array (has space) | O(1)                 |
| Insert or update an element at a specific index   | O(1)                 |
| Delete an element by setting it to null           | O(1)                 |
| Delete an element by shifting elements            | O(n)                 |
