package com.zhang

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object NetWorkWordCount {


  def main(args: Array[String]): Unit = {


    val sparkConf = new SparkConf().setMaster("local[2]").setAppName("NetWorkWordCount")

    val ssc = new StreamingContext(sparkConf,Seconds(5))

    val lines = ssc.socketTextStream("localhost",8888)

    val result = lines.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)

    result.print()

    ssc.start()

    ssc.awaitTermination()


  }



}
