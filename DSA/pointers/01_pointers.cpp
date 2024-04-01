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
    i)   Null pointer
    ii)  Wild pointer: Awild pointer is a type of pointer where user decleares a pointer but not initalize it.Due top this it endup pointing some random memory location, Due to this we might get some undefined beheviour and crashes. In soe case we might get segmentation fault(it happens when we tries to access the memory that is not allocated to our program and or when we points any crupted area or when our memory is full.)
    iii) Dangling Pointer
    iv)  Void Pointer
    */




    return 0;
}
