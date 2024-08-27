#include<bits/stdc++.h>
#include<string>
using namespace std; 

// int inde = 0;

bool reverse_str(string user_input, int size, int inde){
    if (inde>=(size/2)){
        return;
    }
    swap(user_input[inde],user_input[size-inde-1]);
    reverse_str(user_input,size, inde+1);
}

int main(){
    int i =0;
    string user_input;
    cout << "Enter a string: "; 
    cin >> user_input; 
    
    for(i=0; user_input[i]!='\0'; i++);

    reverse_str(user_input, i, 0);

    cout << user_input;
    return 0;
}