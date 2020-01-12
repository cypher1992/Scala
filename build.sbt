name := "Scala"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "joda-time" % "joda-time" % "2.10.4",
  "org.joda" % "joda-convert" % "2.2.1",
  "io.github.mainstringargs" % "alpha-vantage-scraper" % "1.1",
  "org.scalatest" % "scalatest_2.13" % "3.1.0" % "test"
  //"org.scalatest" %% "scalatest" % "3.2.0-M2" % Test
)

