// Write a program to copy a string from one variable to another

#include<stdio.h>
void strcopy(char *arr, char *arr2){
    int i;
    for (i=0;arr[i] != '\0' ;i++){
        arr2[i] = arr [i];
    }
    arr2[i] = '\0';
}
int main(){
    char str[] = "Sanjib Kumar Sah";
    char str2[50];
    strcopy(str,str2);
    printf("%s",str2);
    return 0;
}