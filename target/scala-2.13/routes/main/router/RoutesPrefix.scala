// @GENERATOR:play-routes-compiler
// @SOURCE:D:/playframework/projects/starter/conf/routes
// @DATE:Sun Jan 31 12:13:07 ICT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
