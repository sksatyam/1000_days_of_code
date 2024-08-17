// Create teh FOllowing Pattern
/*

* * * * *
* * * * * 
* * * * *
* * * * *
* * * * *

*/
#include<iostream>
using namespace std;
int main(){
    int userInput;
    cout<<"Enter Maximum Number of Rows  or Column: ";
    cin>>userInput;
    for(int i = 0; i<userInput;i++){
        for(int j = 0;j<userInput;j++){
            cout<<"* ";
        }
        cout << endl;
    }
    return 0;
}