lazy val commonSettings = Seq(
  organization := "com.michaelpollmeier",
  scalaVersion := "2.13.4",
  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % "4.4.9",
    "org.scalatest" %% "scalatest" % "3.2.5" % "test",
    "org.specs2" %% "specs2-core" % "4.10.0" % "test"
  ),
  //addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M5" cross CrossVersion.full),
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
  homepage := Some(url("https://github.com/mpollmeier/scalameta-tutorial"))
)

scalacOptions in Test ++= Seq("-Yrangepos")

lazy val scalameta_code = project.in(file("."))
  .settings(commonSettings: _*)

lazy val examples = project.in(file("examples"))
  .settings(commonSettings: _*)
  .dependsOn(scalameta_code)

