// https://www.hackerrank.com/challenges/vector-erase/problem?isFullScreen=true

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, k, x, a, b;
    cin>>n;
    vector<int> nums;
    for (int i = 0; i < n; i++) {
        cin >> k;
        nums.push_back(k);
    }   
    cin>>x;
    cin>>a>>b;
    nums.erase(nums.begin()+(x-1));
    nums.erase(nums.begin()+a-1, nums.begin()+b-1);
    cout<<nums.size()<<endl;
    for (int j = 0; j < nums.size(); j++) {
        cout<<nums[j]<<" ";
    }
    return 0;
}
