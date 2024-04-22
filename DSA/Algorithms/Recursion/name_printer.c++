// 2. Write a program to ask the user to enter n and their name, and then print their name n times using recursion.
#include<iostream>
using namespace std;
int counter = 1;
void printname(int n,string name){
    if(counter == n+1){
        return;
    } 
    cout << name << endl;
    counter ++;
    return printname(n,name);
}

int main(){
    int n;
    string name;
    cout <<"Enter the number of times: ";
    cin >> n;
    cin.ignore(); // to clear buffer space;
    cout << "Enter your name: ";
    getline(cin,name);
    printname(n,name);
    return 0;
}