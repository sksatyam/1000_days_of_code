#include<iostream>
using namespace std;

int fib(int n){
    if (n<=1){
        return n;
    }
    return fib(n-1)+fib(n-2);
}

int main(){
    int userinp,res;
    cout <<"Enter a number: ";
    cin >> userinp;
    

    for (int i = 1; i <=userinp ; i++){
        res = fib(i);
        cout<<res<<endl;
    }
     
    return 0;
}