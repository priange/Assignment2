fun main(args: Array<String>) {
greeting("Ada")
division(23,3)
    addition(12,4,67,7)
    Aboutme("I am a slow learner but i never give up on my ambition and i do anything to achieve what i want.")
}
  fun greeting (name: String){
     println("Hi $name")
  }
fun division(num1: Int, num2: Int): Int {
    var result= num1 % num2
    println(result)
    return(result)
}

fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1+num2+num3+num4
    println(sum)
    return(sum)

}
fun Aboutme(sentence: String) {
    println("$sentence")
}