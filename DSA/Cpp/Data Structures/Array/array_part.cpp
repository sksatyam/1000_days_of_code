// Check if we can partition the array into two subarray with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.

#include<iostream>
#include<vector>
using namespace std;
int main(){
    int size,i;
    vector<int> vec;
    cout << "Enter the Size of the array: ";
    cin>> size;
    cout<<"Enter the Elements: ";
    for(int i = 0;i<size;i++){
        int tmp;
        cin>>tmp;
        vec.push_back(tmp);
    }

bool flag = false;
    for (i = 0; i <size;i++){
        int prefix_sum=0,suffix_sum=0;
        for(int j  =0;j<=i;j++){
            prefix_sum += vec[j];
        }
        for(int j = size-1;j>i;j--){
            suffix_sum += vec[j];
        }
        if(prefix_sum == suffix_sum){
            flag = true;
            break;
        }
    }
    if(flag == true){
        cout <<i<<" ";
    }
    else{
        cout<<"Not any possible";
    }

    return 0;
}