package com.cba.omnia.cep

import sbt._
import Keys._

object Myplugin extends AutoPlugin{

  override lazy val projectSettings = Seq(commands += myCommand)

  lazy val myCommand =
    Command.command("hello") { (state: State) =>
      println("Hi!")
      state
    }

}

