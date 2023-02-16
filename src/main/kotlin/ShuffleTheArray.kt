// Link problem : https://leetcode.com/problems/shuffle-the-array/


fun main() {
    val n = 3
    val nums = arrayOf(2, 5, 1, 3, 4, 7)
    ShuffleTheArray().shuffle(nums, n).forEach { print("$it ") } // Output: [2,3,5,4,1,7]
    println()
    ShuffleTheArray().shuffle1(nums.toIntArray(), n).forEach { print("$it ") } // Output: [2,3,5,4,1,7]
}


class ShuffleTheArray {
    fun shuffle(nums: Array<Int>, n: Int): MutableList<Int> {
        val result = mutableListOf<Int>()
        for (i in 0 until n) {
            result.add(nums[i])
            if (i + n < nums.size)
                result.add(nums[i + n])
        }
        return result
    }

    fun shuffle1(nums: IntArray, n: Int) = nums.zip(nums.drop(n)).flatMap { it.toList() }

}