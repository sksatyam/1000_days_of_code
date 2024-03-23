// We can also ceate a vector, Its nothing but just vector of vector
#include<iostream>
#include<vector>
using namespace std;
int main(){
    int row=5, col=6;
    // vector<vector<int>> vec; // this is how we creates a 2d vector
    vector<vector<int>> vec(row,vector<int>(col,0)); // this is how we creates a 2d vector with its size and initalize it
    // int si=vec[0].size(); // here v[0],v[1],v[2],.... are all vectors so all the functions will work on it
    

    
    return 0;
}