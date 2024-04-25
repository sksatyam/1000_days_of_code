// Write a program to find the sum of first n numbers using recursion
#include<iostream>
using namespace std;
int ans = 0;
int nsum(int n){
    if (n == 0){
        return 0;
    }
    return n+nsum(n-1);
}
int nsum_backtrack(int n){
    if (n == 0){
        return 0;
    }
    nsum_backtrack(n-1);
    ans+=n;
    // cout << ans<< endl; // This line is just for understanding purpose;
    return ans;

}

int main(){
    int n,result,result2;
    cout << "Enter a number: ";
    cin >> n;
    result = nsum(n);
    cout << result << " Using normal recursion!"<< endl;
    result2 = nsum_backtrack(n);
    cout << result2<< " Using Back Tracking!"<< endl;
    return 0;
}