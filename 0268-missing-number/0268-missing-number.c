int missingNumber(int* nums, int numsSize) {
    int sum=(numsSize+1)*(numsSize)/2,tot=0;
    for(int i=0;i<numsSize;i++)tot+=nums[i];
    return sum-tot;
}