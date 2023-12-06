package com.mundox.adventofcode.twentythree.common

trait FilesAlg:
  def readFile(fileName: String): Vector[String]

object FilesAlg:
  def impl: FilesAlg = (fileName: String) =>
    val bufferedSource = io.Source.fromFile(fileName)
    val content = bufferedSource.getLines().toVector
    bufferedSource.close
    content
