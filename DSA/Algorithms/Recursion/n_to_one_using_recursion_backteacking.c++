// Write a recursion function to print n to 1
#include <iostream>
using namespace std;
void printntoone(int n,int i){
    if (i>n){
        return;
    }
    printntoone(n,i+1);
    cout << i<< " ";
}
int main(){
    int n,i = 1;
    cout << "Enter the number: ";
    cin >> n;
    printntoone(n,i);
    return 0;
}