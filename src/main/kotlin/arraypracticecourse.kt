fun main() {
    //project based on how arrays works!
    //So lets create array!
    var order_checks: Array<Int> = arrayOf(150, 250, 300, 100, 75, 50)
    //So we can make many interesting things with our array!
    //like we can print all numbers in our array!
    //Arrays helps us to storage one type texts
    println(order_checks.get(4))

    // we can set new number in our array by function set
    order_checks.set(2, 150)
    println(order_checks[2])
    //or print all our array
    order_checks.forEach{payment -> println(payment)}
    //or look how our array is big
    println(order_checks.size)
    //We can count it like a some traine for arrays in Kt! Bye
}
