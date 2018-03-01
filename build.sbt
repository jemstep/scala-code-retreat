name := "code-retreat"

version := "0.1"

scalaVersion := "2.12.4"

val specs2Version = "4.0.2"
val specs2Deps = Seq("org.specs2" %% "specs2-core" % specs2Version % "test")

libraryDependencies ++= specs2Deps

scalacOptions in Test ++= Seq("-Yrangepos")
