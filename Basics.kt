fun main(args: Array<String>) {

    val sample1 = 0x3A
    var sample2 = 58
    var heartRate = 85
    var deposits = 135002796
    val acceleration = 9.8001f
    var mass = 14.6f
    var distance = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral = '∫'
    var greeting = "Hello"
    var name = "Karen"

    if(sample1 == sample2){
        println("They are equal")
    } else{
        println("They are not equal")
    }

    if( heartRate > 40 && heartRate <= 80){
        println("Heart rate is normal")
    } else{
        println("Heart rate is not normal")
    }

    if(deposits >= 100000000){
        println("You are exceedingly wealthy" )
    } else{
        println("Sorry you are so poor")
    }

    var force = (mass * acceleration)

    println("Force = " + force)
    println( "$distance is the distance")

    if(lost == true && expensive == true){
        println("I am really sorry! I will get the manager.")
    } else if(lost == true && expensive == false){
        println("Here is coupon for 10% off.")
    }

    when(choice){
        1 -> println("You chose 1")
        2 -> println("You chose 2")
        3 -> println("You chose 3")
        else -> println("You made an unknown choice")
    }

    println("$integral is an integral")

    for(i in 5..10){
        println("i = $i")
    }

    var age: Int = 0

    while(age < 6){
        println("Age is $age")
        age++
    }

    println("$greeting $name")
}