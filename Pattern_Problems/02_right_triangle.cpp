// Create the following pattern
/*

* 
* *
* * *
* * * * 
* * * * * 

*/
#include<iostream>
using namespace std;
int main(){
    int userInput;
    cout << "Enter the Maximum Number od Column: ";
    cin>>userInput;
    for(int i = 1;i<=userInput;i++){
        for(int j = 1; j<=i;j++){
            cout<<"* ";
        }
        cout << endl;
    }
    return 0;
}