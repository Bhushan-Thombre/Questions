// https://www.hackerrank.com/challenges/variable-sized-arrays/problem?isFullScreen=true

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q, k, value, which, index;
    cin>>n;
    cin>>q; 
    vector<vector<int>> nums;  
    for (int i = 0; i < n; i++) {
        cin>>k;
        vector<int> arr;
        for (int j = 0; j < k; j++) {
            cin>>value;
            arr.push_back(value);
        }
        nums.push_back(arr);
    }
    for (int l = 0; l < q; l++) {
        cin>>which>>index;
        cout<<nums[which][index]<<endl;
    }
    return 0;
}
