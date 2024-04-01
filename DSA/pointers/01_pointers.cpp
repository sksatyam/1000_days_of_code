#include<iostream>
using namespace std;
int main(){
    int arr[3] = {4,6,10};
    int *ptr = &arr[1];

    // cout << (*ptr)++ << " " <<*ptr; // In this case where we first derefferencing and using postincrement then in this case the pointer will not affected but the value that stored at the point will be affected
    // cout << *ptr++ << " " <<*ptr; // In this case the pointer is incrementing instead of value because it reads from right to left
    // cout << *--ptr; // this will move pointer not original value
    cout <<--*ptr; // this will derefference firsr and than decrement the value at the address;
    return 0;
}
