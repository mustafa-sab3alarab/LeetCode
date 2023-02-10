// Link problem : https://leetcode.com/problems/concatenation-of-array/
class ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        for (i in nums.indices) {
            ans[i] = nums[i]
            if (ans[i] == nums[i])
                ans[nums.size + i ] = nums[i]
        }
        return ans
    }
}

fun main() {
    val concatenationOfArray = ConcatenationOfArray()
    val arrayOfNumbers = IntArray(3)
    arrayOfNumbers[0] = 1
    arrayOfNumbers[1] = 2
    arrayOfNumbers[2] = 1
    concatenationOfArray.getConcatenation(arrayOfNumbers).forEach { print("$it ") }
    // Output : [1,2,1,1,2,1]
}