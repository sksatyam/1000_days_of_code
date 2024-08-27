// Write a program to rotate an array by 'k' steps where k is non-negative number. Note that k can be more than n, where n is the length of the array

#include<iostream>
using namespace std;
int main(){
    int arrsize, k,t1,t2;
    cout << "Enter the Size of the Array: ";
    cin >> arrsize;

    int arr[arrsize];
    cout << "Enter the Elements: ";
    for (int i = 0; i < arrsize; i++) {
        cin >> arr[i];
    }
    cout << "Enter 'k' steps: : ";
    cin >> k;
    if (k>arrsize){
        k = k%arrsize;
    }
    for(int i =0;i<k;i++){
        t1 = arr[arrsize-1];
        for(int j =arrsize-1;j>=0;j--){
            if(j!=0){
                arr[j] = arr[j-1];
            }
            else{
                arr[j] = t1;
            }

        }

    }
    for(int i =0;i<arrsize;i++){
        cout << arr[i] << " ";
    }

    return 0;
}