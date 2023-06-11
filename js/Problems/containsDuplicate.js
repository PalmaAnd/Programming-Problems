/**
 * Runtime efficient version.
 * I never learned what a set is until now: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set?retiredLocale=de
 * A set works good in this case, because it can never have an element twice.
 * 
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let helperarr = new Set();
    for (const element of nums){
        if(helperarr.has(element))
            return true;
        else
            helperarr.add(element);
    }
    return false;
};

/**
 * A solution that is 50/50 between memory and runtime
 * 
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate3 = function(nums) {
    let set = new Set(nums);
    return set.size != nums.length;
};

/**
 * Memory efficient version
 * 
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate2 = function(nums) {
    let helperarr = [];
    for (let i = 0; i < nums.length; i++){
        if(helperarr.includes(nums[i]))
            return true;
        else
            helperarr[i] = nums[i];
    }
    return false;
};