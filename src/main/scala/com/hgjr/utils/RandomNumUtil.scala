package com.hgjr.utils
import java.util.Random
import scala.collection.mutable
object RandomNumUtil {
  val random = new Random()

  def randomInt(from: Int, to: Int): Int = {
    if (from > to) throw new IllegalArgumentException(s"from = $from 应该小于 to = $to")
    // [0, to - from)  + from [form, to -from + from ]
    random.nextInt(to - from + 1) + from
  }

  /**
   *
   * @param from
   * @param to
   * @return
   */
  def randomLong(from: Long, to: Long): Long = {
    if (from > to) throw new IllegalArgumentException(s"from = $from 应该小于 to = $to")
    random.nextLong().abs % (to - from + 1) + from
  }

  def randomMultiInt(from: Int, to: Int, count: Int, canReat: Boolean = true): List[Int] = {
    if (canReat) {
      (1 to count).map(_ => randomInt(from, to)).toList
    } else {
      val set: mutable.Set[Int] = mutable.Set[Int]()
      while (set.size < count) {
        set += randomInt(from, to)
      }
      set.toList
    }
  }

  def main(args: Array[String]): Unit = {
    println(randomMultiInt(1, 15, 10))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
    println(randomMultiInt(1, 8, 10, false))
  }
}