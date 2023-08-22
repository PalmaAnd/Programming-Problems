const twoSum2 = require("../Problems/twoSum2.js");

test("Two Sum II - Input Array Is Sorted : Should return [1, 2]", () => {
    expect(twoSum2([2, 7, 11, 15], 9)).toEqual([1, 2]);
});

test("Two Sum II - Input Array Is Sorted: Should return [1, 3]", () => {
    expect(twoSum2([2, 3, 4], 6)).toEqual([1, 3]);
});

test("Two Sum II - Input Array Is Sorted: Should return [1, 3]", () => {
    expect(twoSum2([-1, 0], -1)).toEqual([1, 2]);
});
