
# Array

-> Array is a data type representing a collection of elements selected by one or more indices.

-> Array indices always start from '0', which means the first element index is "0".

-> If the size of an array is 'n' then the last element of the array will be at index n-1.

## Syntax

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
