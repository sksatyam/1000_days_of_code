// 3. Write a program to print 1 to N using recursion.
#include<iostream>
using namespace std;
int cont = 0;
void zeroton(int n){
    if (cont == n+1){
        return;
    }
    cout << cont<<" ";
    cont++;
    return zeroton(n);
}
int main(){
    int n;
    cout << "Enter a number: ";
    cin >> n;
    zeroton(n);
    return 0;
}