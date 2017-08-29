/**
  * Created by pcliu on 2017/8/29.
  */
package com.liu

import org.apache.spark.sql.SparkSession
object Test {
  def main(args:Array[String]): Unit ={
    val spark = SparkSession.builder().appName("TestAppNAME").getOrCreate()
    val text=spark.sparkContext.textFile("/user/pcliu/spark/README.md")
    val result=text.flatMap(_.split(' ')).map((_,1)).reduceByKey(_+_).collect()
    result.foreach(println)
  }
}