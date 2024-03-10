//  Create the Following Program
/*

* * * * * 
* * * *
* * *
* *
*

*/ 
#include<iostream>
using namespace std;
int main(){
    int userInput;
    cout << "Enter the Maximum number of Rows: ";
    cin>>userInput;
    for(int i = userInput;i>0;i--){
        for(int j  = 1;j<=i;j++){
            cout<<"* ";

        }
        cout << endl;
    }
    return 0;
}