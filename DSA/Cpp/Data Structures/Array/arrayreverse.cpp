//  Write a program to Reverse an Array

#include<iostream>
using namespace std;
int main(){
    int arrsize;
    cout << "Enter the Size of the Array: ";
    cin >> arrsize;

    int arr[arrsize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrsize; i++) {
        cin >> arr[i];
    }
    int arr2[arrsize];
    for(int i = 0,j = arrsize-1;i<arrsize;i++,j--){
        arr2[i] = arr[j];
        cout<<arr2[i]<<" ";
    }
    return 0;
}