#include<iostream>
using namespace std;
int main(){
    // creating a pointer: datatype *pointername(datatype of the pointer must be the same as the datatype of the variable of which it is going to store address)
    int x = 12;
    int *p = &x; // '&' is called address of operator is used to access the address of any variable;

        
    int arr[3] = {4,6,10};
    int *ptr = &arr[1];

    // cout << (*ptr)++ << " " <<*ptr; // In this case where we first derefferencing and using postincrement then in this case the pointer will not affected but the value that stored at the point will be affected
    // cout << *ptr++ << " " <<*ptr; // In this case the pointer is incrementing instead of value because it reads from right to left
    // cout << *--ptr; // this will move pointer not original value
    cout <<--*ptr; // this will derefference firsr and than decrement the value at the address;



    // Types of pointers
    /*
    Majorly there are four types of pointers in c++ 
    i)   Null pointer: If we want to have a pointer variable which is just decleared  but get address latter to store, then in this case we creates a null pointer. the only problem with the null pointer is that is we try to derefference it then we will get segmentation fault error at run time.
    below are three ways to create a null pointer
    int *p = Null;
    int *p2 = 0; // 0 is specially reserved memory address in many os.
    int *p3 = '\0';

    ii)  Wild pointer: Awild pointer is a type of pointer where user decleares a pointer but not initalize it.Due top this it endup pointing some random memory location, Due to this we might get some undefined beheviour and crashes. In soe case we might get segmentation fault(it happens when we tries to access the memory that is not allocated to our program and or when we points any crupted area or when our memory is full.)

    iii) Dangling Pointer: It is a type of function that points to a memory location that is not valid
    
    iv)  Void Pointer
    */




    return 0;
}
