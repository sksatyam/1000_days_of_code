// 1. Write a program to recursively print from 0 to 5.

#include<iostream>
using namespace std;

int count = 0;
void printsum(){
    if(count  == 6){
        return;
    }
    cout << count;
    count ++;
    return printsum();
}

int main(){
    printsum();
    return 0;
}