package com.mundox.adventofcode.twentythree

import com.mundox.adventofcode.twentythree.common.FilesAlg
import com.mundox.adventofcode.twentythree.one.{CalibrationAlg, program1}
import com.mundox.adventofcode.twentythree.two.domain.Game

object Entrypoint extends App:
  val initialTime = System.currentTimeMillis()
  val day1 = program1
  val fileContent = FilesAlg.impl.readFile(day1.getFilename)
  day1.run(fileContent)
  println(s"Time it takes ${System.currentTimeMillis() - initialTime}ms")