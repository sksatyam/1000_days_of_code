// Create the Following Pattern
/*
1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
*/ 
#include<iostream>
using namespace std;
int main(){
    int userInput;
    cout << "Enter the Maximum Number od Column: ";
    cin>>userInput;
    for(int i = 1;i<=userInput;i++){
        for(int j = 1; j<=i;j++){
            cout<<j<<" ";
        }
        cout << endl;
    }
    return 0;
}