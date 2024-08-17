//  Create the following Problem 
/*

1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1

*/ 

#include<iostream>
using namespace std;
int main(){
    int userInput;
    cout << "Enter the Maximum number of Rows: ";
    cin>>userInput;
    for(int i = userInput;i>0;i--){
        for(int j  = 1;j<=i;j++){
            cout<<j<<" ";

        }
        cout << endl;
    }
    return 0;
}