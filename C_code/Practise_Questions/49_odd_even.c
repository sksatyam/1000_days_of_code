#include<stdio.h>
void printarr(int arr[10]){
    for (int i=0;i<10;i++){
        printf("%d ",arr[i]);
    }
}

int main(){
    int i,a[] ={1,2,3,4,5,6,7,8,9,10},b[10],c[10],o=0,e=0;
    for (i=0;i<10;i++){
        if ((a[i]%2)==0)
        {
            c[e] = a[i];
            e += 1; 
        }
        else{
            b[o] = a[i];
            o += 1;
        }
    }
    printf("The elements of array a are: ");
    printarr(a);
    printf("\n");
    printf("The elements of array b are: ");
    printarr(b);
    printf("\n");
    printf("The elements of array c are:");
    printarr(c);
    


    return 0;
}