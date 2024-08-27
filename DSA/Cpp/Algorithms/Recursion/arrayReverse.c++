#include <iostream>
using namespace std;
void reverse_arr(int arr[],int size,int index){
    if (index>=(size/2)){
        return;
    }
    swap(arr[index],arr[size-index-1]);
    reverse_arr(arr,size,index+1);
}
int main(){
    int arr[10];
    for(int i = 0;i<10;i++){
        cin>>arr[i];
    }
    reverse_arr(arr,10,0);
    for (int i =0;i<10;i++){
        cout <<arr[i]<<endl;
    }
}
