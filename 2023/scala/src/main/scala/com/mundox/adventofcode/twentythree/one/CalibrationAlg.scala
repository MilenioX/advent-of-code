package com.mundox.adventofcode.twentythree.one

trait CalibrationAlg:
  def getCalibrationValue(value: String): Int
  def processMessage(message: Vector[String]): Int

object CalibrationAlg:
  def impl: CalibrationAlg = new CalibrationAlg:
    override def getCalibrationValue(value: String): Int =
      val filteredInt : String = value.filter(_.isDigit)
      s"${filteredInt.charAt(0)}${filteredInt.charAt(filteredInt.length - 1)}".toInt

    override def processMessage(message: Vector[String]): Int =
      message.map(getCalibrationValue).sum