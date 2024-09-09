#include<stdio.h>
int main(){
    int len =0;
    printf("Enter the length of array: ");
    scanf("%d",&len);
    int arr[len];
    for (int i=0;i<len;i++){
        scanf("%d",&arr[i]);
    }
    for (int i=0;i<len;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}