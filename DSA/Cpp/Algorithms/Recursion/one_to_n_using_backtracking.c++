// Write a program to print 1 to n natural numbers using backtracking method
// Bbacktracking is a methodlogy of recursion in which we go to the last recursive function call nat that after that our main logic starts after last function call


#include <iostream>
using namespace std;
void printnatural(int i,int n){
    if (n<i){
        return;
    }
    printnatural(i,n-1);
    cout << n<< " ";
}
int main(){
    int n,i =1;
    cout << "Enter a Number: ";
    cin>> n;
    printnatural(i,n);
    return 0;
}