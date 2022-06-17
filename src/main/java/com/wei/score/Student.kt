package com.wei.score

class Student(var name:String,var english:Int,var math:Int){
    init {
//        println("testing")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage():Int{
        return(english+math)/2
    }
}

fun main(){
    val student = Student("Jack",81,57);
    student.print()
}