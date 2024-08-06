# Programming-Problems

This repository contains my solutions to various LeetCode problems. The solutions are implemented in both Java and JavaScript. The Java solutions are located in the `Java/src/` directory, while the JavaScript solutions are divided into problem implementations in `js/Problems/` and corresponding Jest test cases in `js/Tests/`.

## Links to my profiles

- [Project Euler](https://projecteuler.net/progress=PalmaAnd)
- [LeetCode](https://leetcode.com/PalmaAnd/)

## Table of Contents

- [Programming-Problems](#programming-problems)
  - [Links to my profiles](#links-to-my-profiles)
  - [Table of Contents](#table-of-contents)
  - [Current Solutions](#current-solutions)
  - [Java Solutions](#java-solutions)
  - [JavaScript Solutions](#javascript-solutions)
  - [Getting Started](#getting-started)
  - [Running Tests](#running-tests)
  - [License](#license)

## Current Solutions

Here is a list of the problems I've solved along with links to the corresponding LeetCode problem:

| Problem                                                                                               | Solution                                                                           |
| ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| [Two Sum](https://leetcode.com/problems/two-sum/)                                                     | [JavaScript](js/Problems/twoSum.js)                                                |
| [Palindrome Number](https://leetcode.com/problems/palindrome-number/)                                 | [JavaScript](js/Problems/isPalindrome.js)                                          |
| [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)                               | [JavaScript](js/Problems/containsDuplicate.js)                                     |
| [Valid Anagram](https://leetcode.com/problems/valid-anagram/)                                         | [JavaScript](js/Problems/isAnagram.js)                                             |
| [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                                   | [JavaScript](js/Problems/isPalindrome.js)                                          |
| [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | [JavaScript](js/Problems/twoSum2.js)                                               |
| [Group Anagrams](https://leetcode.com/problems/group-anagrams/)                                       | [Java](Java/src/main/java/problems/leetcode/arrays_hashing/GroupAnagrams.java)     |
| [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)           | [Java](Java/src/main/java/problems/leetcode/arrays_hashing/ProductExceptSelf.java) |
| [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)                     | [Java](Java/src/main/java/problems/leetcode/arrays_hashing/TopKFrequent.java)      |
| [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)                               | [Java](Java/src/main/java/problems/leetcode/arrays_hashing/MergeSortedArrays.java) |
| [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)                       | [Java](Java/src/main/java/problems/leetcode/linked_list/MergeTwoSortedLists.java)  |
| [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)                             | [Java](Java/src/main/java/problems/leetcode/linked_list/ReverseLinkedList.java)    |
| [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)                               | [Java](Java/src/main/java/problems/leetcode/stack/DailyTemperatures.java)          |
| [Min Stack](https://leetcode.com/problems/min-stack/)                                                 | [Java](Java/src/main/java/problems/leetcode/stack/MinStack.java)                   |
| [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)   | [Java](Java/src/main/java/problems/leetcode/stack/ReversePolish.java)              |
| [3Sum](https://leetcode.com/problems/3sum/)                                                           | [Java](Java/src/main/java/problems/leetcode/two_pointers/ThreeSum.java)            |
| [Remove Element](https://leetcode.com/problems/kth-distinct-string-in-an-array)                       | [Java](Java/src/main/java/problems/leetcode/two_pointers/RemoveElement.java)         |
| [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix)                          | [Java](Java/src/main/java/problems/leetcode/others/LongestCommonPrefix.java)       |
| [Roman to Integer](https://leetcode.com/problems/roman-to-integer)                                    | [Java](Java/src/main/java/problems/leetcode/hash_table/RomanToInteger.java)        |
| [Roman to Integer](https://leetcode.com/problems/remove-element/)                                     | [Java](Java/src/main/java/problems/leetcode/hash_table/KthDistinctStringInArray.java)|

## Java Solutions

The `Java/src/` directory contains my Java implementations for LeetCode problems. Each problem is implemented in its own Java file and test file.
Java is build ontop of a Maven project for easier testing and in general structure.

## JavaScript Solutions

The JavaScript solutions are divided into two parts:

1. **Problem Implementations**: The JavaScript problem implementations are located in the `js/Problems/` directory. Each problem is implemented in its own JavaScript file.

2. **Jest Test Cases**: The corresponding Jest test cases for the JavaScript problems are located in the `js/Tests/` directory. Each problem has its own test file that ensures the correctness of the implementation.

## Getting Started

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

    ```bash
    git clone https://github.com/PalmaAnd/Programming-Problems.git
    ```

2. **Navigate to the Directory**: Change into the repository directory:

    ```bash
    cd Programming-Problems
    ```

3. **Select a Solution**: Navigate to the directory of the specific problem you're interested in. For Java solutions, navigate to `Java/src/`. For JavaScript solutions, navigate to `js/Problems/`.

## Running Tests

1. **Install Dependencies**: Before running the tests, make sure you have Node.js and npm installed on your machine. Then, navigate to the project's root directory and install the required dependencies:

    ```bash
    npm install
    ```

2. **Run Tests**: To run the Jest tests for the JavaScript solutions, navigate to the `js/Tests/` directory and execute the following command:

    ```bash
    npm test
    ```

    This command will run all the test cases and display the results.

## License

This project is licensed under the [MIT License](LICENSE).
