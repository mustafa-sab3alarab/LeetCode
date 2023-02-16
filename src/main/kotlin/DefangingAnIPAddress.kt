// Link Problem : https://leetcode.com/problems/defanging-an-ip-address/


fun main() {
    println(DefangingAnIPAddress().defangIPaddr("1.1.1.1")) // Output: "1[.]1[.]1[.]1"
    println(DefangingAnIPAddress().defangIPaddr("255.100.50.0")) // Output: "255[.]100[.]50[.]0"
}


class DefangingAnIPAddress {
    fun defangIPaddr(address: String) = address.replace(".", "[.]")
}