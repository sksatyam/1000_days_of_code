// Write a Program to reverse an array using recursion
#include<iostream>
using namespace std;
int counter = 0;
void arrayreverse(int arr[],int n){
    if (n%%2 ==0){
        if (counter == (n/2)){
            return;

        }
        int temp = arr[counter];
        arr[counter] = arr[(n-1)-counter];
        arr[(n-1)-counter] = temp;
        counter++;
        return arrayreverse(arr,n);
    }
    else{
        if(counter == ((n-1)/2)){
            return;
        }
        int temp = arr[counter];
        arr[counter] = arr[(n-1)-counter];
        arr[(n-1)-counter] = temp;
        counter++;
        return arrayreverse(arr,n);
    }
}
int main(){
    int n;
    cout<< "Enter the size of array: ";
    int arr[n];
    cout << "Enter elements: ";
    for(int i = 0;i<n;i++){
        cin << arr[i];
    }
    arrayreverse(arr,n);
    cout << "The New array is : ";
    for(int i = 0;i<n;i++){
        cout << arr[i] << " ";
    }
    return 0;
}