#include<iostream>
using namespace std;
#define max 100
class queue{
    int arr[max];
    int top =-1;
    int front,rear;
    void push(){
        if (top ==max-1){
            cout<<"Queue is Full!";
        }
        else{
            
            cout<<"\nEnter an Element: ";
            cin>>arr[++top];
        }
    }
    void pop(){
        
    }

};

int main(){
    cout<<"hello world";
    return 0;
}