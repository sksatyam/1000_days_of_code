#include<iostream>
using namespace std;

class Node{
    public:
    int Data;
    Node* Next;
    Node(int data){
        Data = data;
        Next =  nullptr;
    }

};
int main(){
    Node *n = new Node(2);
}