package com.wufan.hanshu

object HanshuTest01 {

  def main(args: Array[String]): Unit = {

    //将函数赋值给变量，下一次可以直接通过变量调用函数
    val sayHelloFunc = sayHello _

    //通过变量调用函数
    sayHelloFunc("scala")


    //匿名函数
    val helloSay = (name: String)=> print("匿名函数体")
    helloSay("name")

    //调用高阶函数
    greeting(helloSay,"nihao")




  }


  //高阶函数 func: (String)=>Unit 要传入的函数类型 name: String 传入函数的参数
  def greeting(func: (String)=>Unit,name: String){func(name)}



  def sayHello(name: String): Unit ={
    print("hello"+name)
  }

}
