
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object error extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - 404")),format.raw/*4.38*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("error")),format.raw/*11.22*/("""

    """),format.raw/*13.5*/("""<!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

<!-- Topbar -->
"""),_display_(/*20.2*/inc_topbar()),format.raw/*20.14*/("""

"""),format.raw/*22.1*/("""<!--/ Content /-->
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- 404 Error Text -->
                    <div class="text-center">
                        <div class="error mx-auto" data-text="404">404</div>
                        <p class="lead text-gray-800 mb-5">Page Not Found</p>
                        <p class="text-gray-500 mb-0">It looks like you found a glitch in the matrix...</p>
                        <a href="index.html">&larr; Back to Dashboard</a>
                    </div>

                </div>
                <!-- /.container-fluid -->
<!--/ End of Content /-->

    </div>
    <!-- End of Main Content -->

    <!-- Footer -->
    """),_display_(/*42.6*/inc_footer()),format.raw/*42.18*/("""

"""),format.raw/*44.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*55.6*/inc_bottom()),format.raw/*55.18*/("""

"""),format.raw/*57.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T11:59:00.017
                  SOURCE: D:/playframework/projects/starter/app/views/error.scala.html
                  HASH: f2e00dcd330f7396962d463e7b1fb4601521b4e6
                  MATRIX: 989->0|1068->53|1116->81|1147->86|1266->179|1307->199|1340->205|1525->364|1558->376|1587->378|2341->1106|2374->1118|2403->1120|2695->1386|2728->1398|2757->1400
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|73->42|73->42|75->44|86->55|86->55|88->57
                  -- GENERATED --
              */
          