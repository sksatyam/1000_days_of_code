// Write a Program check if any element is present in the array or not if present then find its index

#include<iostream>
using namespace std;
int main(){
    int arrsize, element,idx;
    bool flag = true;
    cout << "Enter the Size of the Array: ";
    cin >> arrsize;

    int arr[arrsize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrsize; i++) {
        cin >> arr[i];
    }
    cout << "Enter the Element You want to Search: ";
    cin >> element;
    
    for(int i = 0; i<arrsize;i++){
        if(arr[i] == element){
            flag = false;
            idx = i;
        }
    }
    if (flag){
        cout << "The element you are looking for is not present in this array"<< endl;
    }
    else{
        cout<< "The element is on index "<< idx;
    }
    return 0;
}