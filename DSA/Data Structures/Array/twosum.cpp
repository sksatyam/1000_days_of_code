#include<bits/stdc++.h>
using namespace std;
int main(){
    int ar_size,tnum;
    cout << "Enter the size of the array: ";
    cin>> ar_size;

    int array[ar_size];
    cout<< "Enter the elements: ";
    for(int i = 0;i<ar_size;i++){
        cin >> array[i];
    }
    cout<<"Enter the targeted number: ";
    cin >> tnum;
    // bool flag = false;
    for (int i = 0;i<ar_size;i++){
        for (int j = i; j <ar_size;j++){
            if(array[i]+array[j] == tnum){

                cout << "Yes";
                exit(1);
            }
        }
    }
    cout << "No";
    return 0;
}