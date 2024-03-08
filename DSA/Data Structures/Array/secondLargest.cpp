// Write a Program to find the largest and second largest element in an Array

#include<iostream>
using namespace std;
int main(){
        int arrsize, lnum,slnum,min;
    cout << "Enter the Size of the Array: ";
    cin >> arrsize;

    int arr[arrsize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrsize; i++) {
        cin >> arr[i];
    }
    min =arr[0];
    for (int i = 0; i<arrsize;i++){
        if (arr[i]>min){
            min = arr[i];
        }
    }
    lnum = min;
    min = arr[0];
    for(int i = 0;i<arrsize;i++){
        if(arr[i]>min && arr[i]!=lnum){
            min = arr[i];
        }
    }
    slnum =min;
    cout << "The Largest is : "<< lnum<<endl;
    cout << "The Second Largest is : "<< slnum <<endl;
    return 0;
}
