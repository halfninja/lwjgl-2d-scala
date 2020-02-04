name := "lwjgl-2d-scala"

version := "0.1"

scalaVersion := "2.13.1"

val lwjglVersion = "3.2.3"

val natives = sys.props("os.name") match {
  case "Linux" => "natives-linux"
  case "Windows" => "natives-windows"
}

libraryDependencies ++= Seq(
  "org.lwjgl" % "lwjgl" % lwjglVersion,
  "org.lwjgl" % "lwjgl-glfw" % lwjglVersion,
  "org.lwjgl" % "lwjgl-opengl" % lwjglVersion,

  // Native libraries
  "org.lwjgl" % "lwjgl" % lwjglVersion classifier natives,
  "org.lwjgl" % "lwjgl-glfw" % lwjglVersion classifier natives,
  "org.lwjgl" % "lwjgl-opengl" % lwjglVersion classifier natives,
)
