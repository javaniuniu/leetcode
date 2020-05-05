#include <iostream>
#include <vector>
using namespace std;

/**
 * 55. 跳跃游戏
 * */
bool canJumps(vector<int> vector);

using namespace std;
int main() {
//    Solution solution;
    vector<int> nums{0,3,1,1,4};
    bool d = canJumps(nums);
    cout<< d << endl;
    return 0;
}

bool canJumps(vector<int> nums)
{
    int k = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (i > k)
            return false;
        k = max(k, i + nums[i]);
    }
    return true;
}