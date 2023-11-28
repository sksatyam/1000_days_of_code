#include<stdio.h>
int main(){
    int arlen,odd_count=0,odd_sum=0;
    printf("Enter the length of the array that you want enter: ");
    scanf("%d",&arlen);
    int arr[arlen];
    printf("Enter elements of array seperate by whitespace: ");
    for (int i=0;i<arlen;i++){
        scanf("%d",&arr[i]);
    }
    for (int j=0;j<arlen;j++){
        if ((arr[j]%2)!=0){
            odd_sum += arr[j];
            odd_count += 1;
            }
    }
    printf("%d %d",odd_sum,odd_count);
    float av = odd_sum/odd_count;
    printf("Avarage of odd elements is: %f",av);
    return 0;

}