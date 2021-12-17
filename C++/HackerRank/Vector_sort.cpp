// https://www.hackerrank.com/challenges/vector-sort/problem?isFullScreen=true

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int a, k;
    cin >> a;
    vector<int> nums;
    for (int i = 0; i < a; i++) {
        cin >> k;
        nums.push_back(k);
    }
    sort(nums.begin(), nums.end());
    for (int j = 0; j < a; j++) {
        cout << nums[j] << " ";
    }
    return 0;
}
