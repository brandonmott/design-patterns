import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "brandonmott",
      scalaVersion := "2.12.3",
      version := "0.0.1"
    )),
    name := "design-patterns",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % scalaTest % Test,
      "org.scalacheck" %% "scalacheck" % scalaCheck % "test"
    )
  )
