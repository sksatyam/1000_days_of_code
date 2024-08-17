// Write a Program to Sort a array of only 0s and 1s

// #include<iostream>
// #include<vector>
// using namespace std;
// int main(){
//     vector<int> vector1;
//     int len;
//     cout <<"Enter the length for the array: ";
//     cin >>len;
//     cout << "Enter the elements: ";
//     for(int i = 0;i<len;i++){
//         int temp;
//         cin >> temp;
//         vector1.push_back(temp);
//     }
//     int temp = 0;
//     int len_copy = len;
//     for (int i = 0;i<len;i++){
//         if(vector1[i] == 0){
//             vector1[temp] = 0;
//             temp ++;
//         }
//         if (i == (len-1)){
//             len += (len_copy-temp-1);
//         }
//         if(i>len_copy){
//             vector1[temp] = 1;
//             temp ++;
//         }
//     }
//     for(int i:vector1){
//         cout<< i<<" ";
//     }
//     return 0;
// }


#include<iostream>
#include<vector>
using namespace std;

int main() {
    vector<int> vector1;
    int len;
    cout << "Enter the length for the array: ";
    cin >> len;

    cout << "Enter the elements (0s and 1s): ";
    for (int i = 0; i < len; i++) {
        int temp;
        cin >> temp;
        vector1.push_back(temp);
    }

    int left = 0, right = len - 1;
    while (left < right) {
        while (vector1[left] == 0 && left < right) {
            left++;
        }

        while (vector1[right] == 1 && left < right) {
            right--;
        }

        if (left < right) {
            swap(vector1[left], vector1[right]);
            left++;
            right--;
        }
    }

    cout << "Sorted array: ";
    for (int i : vector1) {
        cout << i << " ";
    }

    return 0;
}
   