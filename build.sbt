lazy val commonSettings = Seq(
  organization := "kr.oddly",
  version := "0.1.0",
  scalaVersion := "2.10.5"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
	settings(
	  name := "hello"
	)

val projectMainClass = "kr.oddly.ct01.part5.TipCalc"

mainClass in (Compile, run) := Some(projectMainClass)
