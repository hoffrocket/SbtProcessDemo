import sbt._
import sbt.Process._

class SbtDemoProject(info: ProjectInfo) extends DefaultProject(info) {
 
  
  def helperFunction(name: String): String = {
    "Hello " + name
  }
  
  //more on this here: http://code.google.com/p/simple-build-tool/wiki/Process
  lazy val javaProc = task {
    ("ps auxwww") #| ("grep java") ! log
    None
  }
  
  lazy val hello = task{
    log.info(helperFunction("scooby doo"))
    None
  }
}