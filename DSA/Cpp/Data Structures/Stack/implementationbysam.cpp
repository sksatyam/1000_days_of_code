#include<iostream>
using namespace std;
#define MAXSIZE 100
class stack_arr{
    
    int arr[MAXSIZE];
    int top = -1;


    public:
    // The push function
    void push(int ele){
        if (top == (MAXSIZE-1)){
            cout<<"The Stack Has already reached to its Maximum Limit!";
        }
        else{
            // cout<<"Enter the Element You Want to Push: ";
            top +=1;
            arr[top] = ele;
        }
    }

    void pop(){
        int temp;
        if(top == -1){
            cout<< "The Stack is Empty!"<<endl;
        }
        else{
            temp = arr[top--];
            cout<<"The Item Deleted is: "<<temp<<endl;

        }
    }
    void trivese(){
        if(top <= 0){
            cout<<"The STack is Empty!"<<endl;
        }
        else{
            for (int i = top;i>=0;i--){
                cout<<arr[i]<<endl;
            }

        }
    }


};
int main(){
    stack_arr s1;
    char again = 'n';
    do{
        int choice;
        cout<<"Chose Any One(1,2,3): "<<endl;
        cout<<"1. Push "<<endl<<"2. Pop "<<endl <<"3. Triverse"<<endl;
        cin >> choice;
        cout << endl;
        if(choice == 1){
            int push_temp;
            cout << "Enter a Element: ";
            cin>>push_temp;
            s1.push(push_temp);
            cout << endl;
        }
        else if(choice == 2){
            s1.pop();
        }
        else if(choice == 3){
            s1.trivese();
        }
        else{
            cout << "Invalid Input! ";
        }
        cout << "Do you want to continue (y/n): ";
        cin>>again;

    }while(again == 'y' || again == 'Y');

    // cout << endl<<endl;
    
    return 0;
}