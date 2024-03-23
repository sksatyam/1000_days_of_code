// Given a shorted array of 0s and 1s find the row with maximum number of 1s

#include<iostream>
#include<vector>
using namespace std;
int index_of_max_1s(vector<vector<int>> &v){
    int max1s = 0;
    int max1sIndex;
    int size = v[0].size();
    for(int i =0;i<v.size();i++){
        for(int j = 0; j<v[i].size();j++){
            if (v[i][j]==1){
                if(max1s<(size-j)){
                    max1s = size-j;
                    max1sIndex = i;
                }
            }
        }
    }
    return max1sIndex;

}

int main(){
    int m,n;
    cout<< "Enter the size of the 2d array: ";
    cin >> m >>n;
    vector<vector<int>> sam(m,vector<int>(n));
    cout << "Enter the Elements: "<< endl;
    for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            cin>> sam[i][j];
        }
    }
    cout << index_of_max_1s(sam);
    return 0;
}