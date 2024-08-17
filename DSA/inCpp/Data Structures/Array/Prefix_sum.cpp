// Given an integer array 'a', return the prefix sum or running sum in the same array without creating a new array
#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> vec;
    int size, temp = 0;
    cout << "Enter the size of array: ";
    cin >> size;
    cout << "Enter the Elements: ";
    for(int i = 0;i<size;i++){
        int tmp;
        cin>> tmp;
        vec.push_back(tmp);
    }
    for(int i = 0;i<size;i++){
        vec[i] = temp+vec[i];
        temp = vec[i];
        cout << vec[i]<< " ";
    }
    return 0;
}