#include<stdio.h>
void combine (int *arr,int start,int *result,int index,int n,int arr_len)
{
    for(int ct = start;ct < arr_len-index+1;ct++){
        result[n-index] = ct;
        if(index==1){
            for(int j = 0;j<n;j++) {
                printf("%d\t", arr[result[j]]);
            }
            printf("\n");
        }
        else{
            combine(arr,ct+1,result,index-1,n,arr_len);
        }
    }
}

int main()
{
	int Num = 6;
    int arr[Num]={1,2,3,4,5,6};
    int result[Num]={};
    int arr_len = sizeof(arr)/sizeof(int);

    for(int n = 1;n<=arr_len;n++){
        int start = 0;
        int index = n;
        combine(arr,start,result,index,n,arr_len);
    }

}