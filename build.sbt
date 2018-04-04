lazy val p = (project in file(".")).settings(
   name := "sbt-crosspublish",
   sbtPlugin := true,
   organization := "com.abhi",
   version := "1.0.0",
   scalaVersion:= "2.12.4",
   sbtVersion in Global := "1.0.0",
   crossSbtVersions := Seq("0.13.17", "1.0.0"),
   libraryDependencies ++= Seq(
       "com.typesafe" % "config" % "1.3.3"
   ),
   scalaCompilerBridgeSource := {
      val sv = appConfiguration.value.provider.id.version
      ("org.scala-sbt" % "compiler-interface" % sv % "component").sources
   }
)