package com.mundox.adventofcode.twentythree.common

trait Program:
  def getFilename: String
  def run: Vector[String] => Unit
