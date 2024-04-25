// Write a program to find the sum of first n numbers using recursion
#include<iostream>
using namespace std;
int nsum(int n){
    if (n == 0){
        return 0;
    }
    return n+nsum(n-1);
}
int main(){
    int n,result;
    cout << "Enter a number: ";
    cin >> n;
    result = nsum(n);
    cout << result;
    return 0;
}