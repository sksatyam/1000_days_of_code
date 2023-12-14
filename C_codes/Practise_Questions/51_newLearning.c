#include<stdio.h>
int main(){
    // int i=5; // This will throw an error because when we decleare and initalize an array at a same time the length of the array will must be known to the compiler at the runtime otherwise it will through an error
    int const i=5; // to do so here in this case i am declearing it as constant.
    int arr[i]={1,2,3,4,5};
    return 0;

}