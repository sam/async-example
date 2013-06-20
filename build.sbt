import Dependencies._

name := "async-example"

scalaVersion := "2.10.2"

val root = Project("async-example", file(".")).dependsOn(async)