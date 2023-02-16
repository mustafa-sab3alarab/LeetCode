// Link problem : https://leetcode.com/problems/number-of-good-pairs/

class NumberOfGoodPairs {
    fun numIdenticalPairs(nums: MutableList<Int>): Int {
        var counter = 0
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] == nums[j] && i < j) counter++
            }
        }
        return counter
    }
}


fun main() {
    println(NumberOfGoodPairs().numIdenticalPairs(mutableListOf(1, 2, 3, 1, 1, 3)))
}