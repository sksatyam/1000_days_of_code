// Program to find the largest and second largest element in an array

#include<iostream>
using namespace std;

int main() {
    int arr[10];
    int lar, sec_lar;
    cout << "Enter array: " << endl;
    for (int i = 0; i < 10; i++) {
        cin >> arr[i];
    }

    lar = arr[0];
    for (int i = 1; i < 10; i++) {
        if (lar < arr[i]) {
            lar = arr[i];
        }
    }

    sec_lar = arr[0];

    for (int i = 0; i < 10; i++) {
        if (arr[i] != lar) { 
            if (arr[i] > sec_lar) {
                sec_lar = arr[i];
            }
        } else if (lar==sec_lar){
            sec_lar = arr[i+1];
        }
    }
    
    cout << "The second largest is: " << sec_lar << endl;
    cout << "The largest is: " << lar;

    return 0;
}