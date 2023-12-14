#include<stdio.h>
int main(){
    char ar[10] = {1,2,3,4,5,6,7,8,9,10}, ar2[10];
    for (int i=0;i<10;i++){
        ar2[i] = ar[i];       
    }
    for (int j=0;j<10;j++){
        printf("%d ",ar2[j]);
    }
    return 0;
}