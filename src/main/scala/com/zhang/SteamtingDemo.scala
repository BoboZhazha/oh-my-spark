package com.zhang

//import org.apache.spark.streaming.kafka010.KafkaUtils
//import org.apache.spark.streaming.{Seconds, StreamingContext}
//import org.apache.kafka.common.serialization.StringDeserializer
//import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
//import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe

object SteamtingDemo {

//  def main(args: Array[String]): Unit = {
//    val ssc = new StreamingContext("local[*]","SteamtingDemo",Seconds(3))
//
//    val kafkaParams = Map[String, Object](
//      "bootstrap.servers" -> "localhost:9092,anotherhost:9092",
//      "key.deserializer" -> classOf[StringDeserializer],
//      "value.deserializer" -> classOf[StringDeserializer],
//      "group.id" -> "use_a_separate_group_id_for_each_stream",
//      "auto.offset.reset" -> "latest",
//      "enable.auto.commit" -> (false: java.lang.Boolean)
//    )
//
//    val topics = Array("test")
//    val stream = KafkaUtils.createDirectStream[String, String](
//      ssc,
//      PreferConsistent,
//      Subscribe[String, String](topics, kafkaParams)
//    ).map(_.value())
//    stream.print()
//    ssc.start()
//    ssc.awaitTermination()
//  }

}
