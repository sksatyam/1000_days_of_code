#include<iostream>
using namespace std;
#define max 100
class queue{
    int arr[max];
    int top =-1,bottom=0;
    int front,rear;
    public:

    void push(){
        if (top ==max-1){
            cout<<"Queue is Full!"<<endl;
        }
        else{
            
            cout<<"\nEnter an Element: "<<endl;
            cin>>arr[++top];
        }
    }
    void pop(){
        for(int i = 0;i<top;i++){
            arr[i] = arr[i+1];
        }
        top --;
    }

};

int main(){
    queue q1;
    char user = 'n';
    do{
        int choice;
        cout<< "Enter Your Choice: "<<endl;
        cout<<"1. Push"<<endl<<"2. Pop"<<endl;
        cin >> choice;
        switch (choice){
            case 1:
                q1.push();
                break;
            case 2:
                q1.pop();
                break;
            default:
                cout <<"Enter a Valid Choice!"<< endl;
            
        }
        cout<< "Do You want to coninue(y/n): ";
        cin >> user;


    }while(user == 'y' || user == 'Y');

    return 0;
}