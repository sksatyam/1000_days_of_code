// Given an integer array 'a' sorted in non-decreasing a order, return an array of the squares if each number sorted un non-decreasing order.


#include<iostream>
#include <vector>
#include <cmath> // Include cmath for abs function
#include <algorithm> // Include algorithm for reverse function

using namespace std;

void squaresortedarray(vector<int> &vect){
    vector<int> newvec;
    int left = 0, right = vect.size() - 1;
    while(left <= right){
        if(abs(vect[left]) < abs(vect[right])){
            newvec.push_back(vect[right] * vect[right]);
            right--;
        }
        else{
            newvec.push_back(vect[left] * vect[left]);
            left++;
        }
    }
    reverse(newvec.begin(), newvec.end());
    for(int i : newvec){
        cout << i << "  ";
    }
    return;
}

int main(){
    int size;
    vector<int> vec;
    cout << "Enter the Size of array: ";
    cin >> size;
    cout << endl << "Enter the Elements: ";
    for(int i = 0; i < size; i++){
        int t;
        cin >> t;
        vec.push_back(t); 
    }
    squaresortedarray(vec);
    return 0;
}
