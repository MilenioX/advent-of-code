package com.mundox.adventofcode.twentythree.one

import com.mundox.adventofcode.twentythree.common.Program

object program1 extends Program:
  override def getFilename: String = "../challenges/1-dataset"

  override def run: Vector[String] => Unit = content =>
    val alg = CalibrationAlg.impl
    println(alg.processMessage(content))