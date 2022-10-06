package com.wufan.hanshu

/**
 * 常用高阶函数
 * map-对传入的每一个元素进行处理，最终返回一个元素
 * flatMap-对传入的每一个元素进行处理，返回一个或者多个元素
 foreach-对传入的每一个元素进行处理，不进行返回，一般用于打印
 filter-对传入的每个元素进行条件判断，进行过滤，结果为true则保留，为false则过滤
 reduceLeft-从左侧元素开始进行聚合操作
 */
object ChangYongGaoJie {
  def main(args: Array[String]): Unit = {
    var array = Array(1,2,3,44,5)

    //map处理 对所有数据*2 num为一变量，接收num，返回num*2
    val mapp = array.map(num => {num * 2})
    //简写方式
    val mappp = array.map(_ * 2)


    println(mapp.foreach(i => println(i)))
  }
}
