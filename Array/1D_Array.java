// class GFG {
//     public static void main(String[] args) {

//         // primitive array
//         int arr[] = {10, 20, 30, 40, 50};
//         int n = arr.length;

//         System.out.println("Primitive Array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");

//             System.out.println();

//         }

//         }
//     }

// // Accessing array elements

// // class GFG {
// // public static void main(String[] args){
// // int [] arr ={10,20,30,40,50};

// // // Accessing fourth elements

// // System.out.println(arr[3]+ " ");

// // // Accessing first elements

// // System.out.println(arr[0]);

// // }
// // }

// // =====================================

// // Updation in array

// // class GFG {
// // public static void main(String[] args){
// // int [] arr ={10,20,30,40,50};

// // arr[3] =99;

// // System.out.println(arr[3]);

// // }
// // }

// // =====================================
// // Traverse an array

// // class GFG {
// // public static void main(String[] args){
// // int [] arr ={10,20,30,40,50,90,99,909};

// // // Travering and printing array elements

// // for(int i=0;i<arr.length;i++){
// // System.out.println(arr[i]+ " ");
// // }
// // }
// // }

// // =====================================
// // Size of an Array
// // class GFG{
// // public static void main(String []args)
// // {
// // int arr[]={101,102,103,104,105};
// // System.out.println("Size of array is : " + arr.length);
// // System.out.println("Size of array is : " + arr[0]);
// // System.out.println("Size of array is : " + arr[4]);

// // }
// // }

// // =====================================
// // Array of Objects in Java

// // class Student {
// // public int roll_no;
// // public String name;

// // Student(int roll_no, String name) {
// // this.roll_no = roll_no;
// // this.name = name;

// // }
// // }

// // public class GFG {
// // public static void main(String[] args) {

// // // declaring an Array of Students
// // Student[] arr;
// // // allocating memory for 5 objects of type student
// // arr = new Student[5];

// // // initialize the elements of the array
// // arr[0] = new Student(1, "Aman");
// // arr[1] = new Student(2, "Vaibhav");
// // arr[2] = new Student(3, "Shikar");
// // arr[3] = new Student(4, "Dharmesh");
// // arr[4] = new Student(5, "Mohit");

// // // accessing the elements of the specified array
// // for (int i = 0; i < arr.length; i++)
// // System.out.println("Element at " + i + " : { "
// // + arr[i].roll_no + " "
// // + arr[i].name+" }");

// // }
// // }

// // =====================================
// // What happens if we try to access out of bound index in Java Array size?

// // public class GFG{
// // public static void main(String[] args)
// // {
// // int arr[]=new int[4];
// // arr[0]=10;
// // arr[1]=20;
// // arr[2]=30;
// // arr[3]=40;
// // System.out.println("Trying to access elements outside the size of array");

// // System.out.println(arr[5]);//ArrayIndexOutOfBoundsException

// // }
// // }

// // =====================================
// // Passing Array to Method in java

// // public class GFG {
// // // Driver method
// // public static void main(String[] args) {
// // int arr[] = { 1,2,3,4,5};

// // // Passing array to method m1
// // sum(arr);
// // }
// // public static void sum(int[] arr)
// // {
// // // getting sum of array elements
// // int sum = 0;
// // for (int i = 0; i < arr.length; i++) {
// // sum += arr[i];

// // System.out.println("Sum of array elements :=>" + sum);
// // }
// // }
// // }
// // =====================================
// // RETURNING ARRAY FROM METHOD IN JAVA

// // class GFG {
// // public static void main(String[] args) {
// // int arr[] = Element();
// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");
// // }

// // }

// // public static int[] Element() {
// // // returning array
// // return new int[] { 1, 2, 3, 4, 5 };

// // }
// // }

// // ================= JAGGED Array====================
// // In Java, a Jagged array is a multidimensional array where each row can have a
// // different number of columns. When we work with a jagged array, one thing to
// // keep in mind is that the inner array can be of different lengths. It is like
// // a 2D array, but each row can have a different number of elements.

// // class GFG {
// // public static void main(String[] args) {
// // // declaring 2d array
// // int arr[][] = new int[2][];

// // // making the jaggeed array

// // arr[0] = new int[2];
// // arr[1] = new int[3];

// // // intializing array

// // int count = 0;
// // for (int i = 0; i < arr.length; i++)
// // for (int j = 0; j < arr[i].length; j++)
// // arr[i][j] = count++;

// // for (int i = 0; i < arr.length; i++) {
// // for (int j = 0; j < arr[i].length; j++)

// // System.out.print(arr[i][j] + " ");
// // System.out.println();

// // }
// // }

// // }

//+++++++++++++Problem 1 +++++++++++++
//Largest element in Array

// class LargestElement {
//     public static void main(String args[]) {

//         int[] arr = { 10, 20, 30, 40 };
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

//+++++++++++++++SecondLargest++++++
 class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10,20,5,45,18};

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest &&
                     arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}