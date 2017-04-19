package com.cba.omnia.cep

import sbt._
import Keys._

object Myplugin extends Plugin{

  override lazy val settings = Seq(commands += myCommand)

  lazy val myCommand =
    Command.command("hello") { (state: State) =>
      println("Hi!")
      state
    }

}

