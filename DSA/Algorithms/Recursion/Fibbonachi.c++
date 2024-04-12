#include<iostream>
using namespace std;
int fib (int n){
    if (n == 1|| n ==0 )return n; 
    return fib(n-1)+fib(n-2);
}
int main(){
    int num,num1;
    cout << "Enter a Number: ";
    cin >> num;
    num1 = fib(num);
    cout << num1;
    return 0;
}