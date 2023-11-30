// Write a program to Add two matrix
#include<stdio.h>
int main(){
    int m1_r,m1_c,m2_r,m2_c;
    printf("Enter the number of rows for First matrix: ");
    scanf("%d",&m1_r);
    printf("Enter the number of columns for First matrix: ");
    scanf("%d",&m1_c);
    printf("Enter the number of rows for Second matrix: ");
    scanf("%d",&m2_r);
    printf("Enter the number of columns for Second matrix: ");
    scanf("%d",&m2_c);
    int mat1[m1_r][m1_c];
    int mat2[m2_r][m2_c];
    printf("Enter the elements of First array Seperate each element by space and press enter to go to the next row:\n");    
    for (int i=0;i<m1_r;i++){
        for (int j=0;j<m1_c;j++){
            scanf("%d",&mat1[i][j]);            
        }
        
    }
    printf("Enter the elements of Second Matrix in the same way of first:\n");
    for (int k=0;k<m2_r;k++){
        for (int l=0;l<m2_c;l++){
            scanf("%d",&mat2[k][l]);            
        }        
    }
    if ((m1_r==m2_r) && (m1_c ==m2_c)){
            int mat_res[m1_r][m1_c];
            printf("Your Resultant matrix is:\n");
            for (int m=0;m<m1_r;m++){
                for (int n=0;n<m1_c;n++){
                    mat_res[m][n] = mat1[m][n]+mat2[m][n];
                    printf("%d ",mat_res[m][n]);
                }
                printf("\n");
            }

        }
    else{
        printf("Addition is not possible may order is not same or something went wrong!");
        }
    return 0;
}