package main

import com.example.subprojecta.SomeClassA
import com.example.subprojectb.SomeClassB
import com.example.subprojectc.SomeClassC

object Main {
  def main(args: Array[String]): Unit = {
    println("Output from Main")
    SomeClassA.outputSomething()
    SomeClassB.outputSomething()
    SomeClassC.outputSomething()
  }
}