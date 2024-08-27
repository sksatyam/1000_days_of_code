#include<iostream>
using namespace std;
int fact(int n){
    if (n == 1|| n==0){
        return 1;
    } 
    else{
       return n*fact(n-1);
    }
    
}



int main(){
    int num,num1;
    cout << "Enter A Number: ";
    cin >> num;
    num = fact(num);
    cout << num;
    return 0;
}