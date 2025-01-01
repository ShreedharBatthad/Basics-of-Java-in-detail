
# Array

-> Array is a data type representing a collection of elements selected by one or more indices.

-> Array indices always start from '0', which means the first element index is "0".

-> If the size of an array is 'n' then the last element of the array will be at index n-1.

## There are three types of arrays.
1) Single Dimensional Array.
2) Two Dimensional Array.
3) Three Dimensional Array.

## Syntax of Single Dimensional Array:

* String [] array = new String[];  
         
## 1) How to declare an Array?

* datatype data;
     
     -Example: String data;

## 2) How do we allocate memory?

* String data = new String[10];

   In Above Syntax:-
   
   1) Allcoated the Total size or length of the array.

## 3) How to declare and initialize the arrays in Java?

There are two ways:-
* Method 1: String data = {"animal", "pets", "birds"};

* Method 2: String data = new String[3];
            data[0] = "animal";
            data[1] = "pets";
            data[2] = "birds";
## 4) How to access the array elements?
* Syntax: array[index];

* Example: system.out.println(data[0]);

## 5) For Each Loop in Array:-

Syntax:

 for(datatype a : b)
 
 {
    
 }

Example: 

for(String a: birds)
 
  {

    System.out.println(a);
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

# String

A String is a variable that contains a collection of characters surrounded by double quotes.

* A String is a sequence of characters.

     Syntax:   String str = new String ("Happy New Year").
    
* String will inherit the object classes.
* String will implement the CharSeqence, Serializable, and Comparable.
                     
        "Serializable" interface is used when need to store a copy of the object and send it to another process that runs on the same system or over the network.
        "Comparable" interface is used to order the objects of the class. it has only one method. 
        i.e compareTo()

* String size is not fixed.
* String is a non-primitive data type because it references a memory location where data is stored in the Heap Memory.

* Strings objects are immutable.
    Once the object is created we cannot be modified.
* We can create three classes using:
     1) String.
     2) StringBuffer.
     3) StringBuilder.


## How to create a string objects?
-> There are 2 ways to create an object.

            1) By string Literal.
            2) By new Keyword.

1) String Literal.
  - String  Literal is created by using double quotes.

            Example: String s = "Welcome".
  - Only a one-time object is created in the "String Constant Pool (SCP) Area.          
   - If we have the same value in the string constant pool, then it will not create a brand new object, only a new reference will be assigned to the existing value.
   - Most of the time, we use this object-creation process, because of memory management.

2) By new Keyword.

  - Here we use the new Keyword for object creation.

            Example: String s = new String("Happy New Year");
  - Object is created in 2 areas that is "Heap Year" and "String Constant Pool" Area.

  - The first object is reference is done by the user is "Heap Area" and another is by JVM, which is "String Constant pool.
