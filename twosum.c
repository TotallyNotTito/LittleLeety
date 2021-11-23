/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int len = sizeof(nums) / sizeof(nums[0]);
    for (int i = 0; i < len; ++i) {
        for (int j = 1; j < len; ++j) {
           if (nums[i] + nums[j] == target) {
               int * indices = (int *) malloc(sizeof(int) * 2);
               indices[0] = i;
               indices[1] = j;
               printf("[%d,%d]\n",indices[0],indices[1]);
               return indices;
           }         
        }
    
    }
    return NULL;
}
