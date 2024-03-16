// Write a program to sort a array. put the even evements at the begaining of the array and odd numbers at the end of the array
#include<iostream>
#include <vector>
using namespace std;
void sort_oddeven(vector<int> &v){
    int left =0,right = v.size()-1,temp;
    while(left<right){
        if(v[left]%2 != 0&&v[right]%2 == 0){
            temp = v[left];
            v[left] =v[right];
            v[right] = temp;
            right--;
            left++;
        }
        else if(v[left]%2 == 0){
            left ++;
        }
        else if(v[right]%2 !=0){
            right--;
        }
        
    }
    for(int i :v){
        cout << i <<" ";
    }
    return;
}
int main(){
    int size,t;
    vector<int> sam;
    cout << "Enter The Size of the array: ";
    cin >> size;
    cout<<"Enter the Elements: ";
    for (int i = 0;i<size;i++){
        cin >> t;
        sam.push_back(t);
    }
    sort_oddeven(sam);

    return 0;
}