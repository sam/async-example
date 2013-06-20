import sbt._

object MyBuild extends Build {
  lazy val root = Project("async-example", file(".")).dependsOn(async)

  lazy val async = RootProject(uri("git://github.com/scala/async.git"))
}