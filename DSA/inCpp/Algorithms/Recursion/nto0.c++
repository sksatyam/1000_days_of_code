// 4. Write a program to print N to 1 using recursion.
#include<iostream>
using namespace std;

void ntozero(int n){
    if (n == -1){
        return;
    }
    cout << n << " ";
    return ntozero(n-1);
}
int main(){
    int n;
    cout <<"Enter a number: ";
    cin >> n;
    ntozero(n);

    return 0;
}