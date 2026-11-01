// 03-12-2025 DATA Structure( Space Complexity )

class Test_space_rnd
{
  static int square(int n)
  { 
   System.out.println(Integer.SIZE);//size bits
   return n*n;
  }
  public static void main(String args[])
  {
  int num =3;
  int value =square(num);
  System.out.println(value);
  }
}


//================================================================================================================
//Assignment :  Find the size(space Complexity) of the 'n' in the above program
/*
Step 1: Understanding the question
=====================================
The question asks for the size (space complexity) of n inside the square method.

Space complexity here refers to the memory space used by the parameter n when the method is called.

Step 2: Data type of n
========================
n is of type int.

In Java:

'int' is a primitive data type.

It has a fixed size regardless of its value.

Step 3: How much space does an int occupy?
===========================================
In Java, int is always 32 bits (4 bytes).

This is confirmed by the program itself:
System.out.println(Integer.SIZE); prints 32 (bits).

The size is defined by the Java language specification, not by the value stored in it
 (e.g., 1, 100, or 1000 all occupy 4 bytes).

Step 4: Answer for space complexity of n
==========================================
Since n is an int,
 its space complexity is O(1) (constant space).

But if they’re asking for the exact size (in terms of memory):

Size of n = 4 bytes (or 32 bits).

Final answer:
=============
4 bytes

(Space complexity = O(1), fixed size independent of input magnitude.)
*/