#include <iostream>
using namespace std;

template<class t>
    t GET_MIN(t a,t b){
        return (a>b) ? b:a;
    }

int main(){
    // int a = 1,b = 4, result;
    // char a = 'a',b = 'm',result;
    string a = "Sanjib",b = "Chandra Sreas",result;
    
    result = GET_MIN<string>(a,b); // Explicitly mentioning the data type 
    result = GET_MIN(a,b); // Not mentioning the data type as the variable that i am passing is already decleared with the data type so it automatically takes the data type from there

    cout << result;

}
