
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

object borders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - Borders")),format.raw/*4.42*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("borders")),format.raw/*11.24*/("""

    """),format.raw/*13.5*/("""<!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

<!-- Topbar -->
"""),_display_(/*20.2*/inc_topbar()),format.raw/*20.14*/("""

"""),format.raw/*22.1*/("""<!--/ Content /-->
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-1 text-gray-800">Border Utilities</h1>
                    <p class="mb-4">Bootstrap's default utility classes can be found on the official <a
                            href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities
                        below were created to extend this theme past the default utility classes built into Bootstrap's
                        framework.</p>

                    <!-- Content Row -->
                    <div class="row">

                        <!-- Border Left Utilities -->
                        <div class="col-lg-6">

                            <div class="card mb-4 py-3 border-left-primary">
                                <div class="card-body">
                                    .border-left-primary
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-secondary">
                                <div class="card-body">
                                    .border-left-secondary
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-success">
                                <div class="card-body">
                                    .border-left-success
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-info">
                                <div class="card-body">
                                    .border-left-info
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-warning">
                                <div class="card-body">
                                    .border-left-warning
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-danger">
                                <div class="card-body">
                                    .border-left-danger
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-left-dark">
                                <div class="card-body">
                                    .border-left-dark
                                </div>
                            </div>

                        </div>

                        <!-- Border Bottom Utilities -->
                        <div class="col-lg-6">

                            <div class="card mb-4 py-3 border-bottom-primary">
                                <div class="card-body">
                                    .border-bottom-primary
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-secondary">
                                <div class="card-body">
                                    .border-bottom-secondary
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-success">
                                <div class="card-body">
                                    .border-bottom-success
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-info">
                                <div class="card-body">
                                    .border-bottom-info
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-warning">
                                <div class="card-body">
                                    .border-bottom-warning
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-danger">
                                <div class="card-body">
                                    .border-bottom-danger
                                </div>
                            </div>

                            <div class="card mb-4 py-3 border-bottom-dark">
                                <div class="card-body">
                                    .border-bottom-dark
                                </div>
                            </div>

                        </div>

                    </div>

                </div>
                <!-- /.container-fluid -->
<!--/ End of Content /-->

    </div>
    <!-- End of Main Content -->

    <!-- Footer -->
    """),_display_(/*140.6*/inc_footer()),format.raw/*140.18*/("""

"""),format.raw/*142.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*153.6*/inc_bottom()),format.raw/*153.18*/("""

"""),format.raw/*155.1*/("""</body>
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
                  DATE: 2021-01-31T10:25:00.614
                  SOURCE: D:/playframework/projects/starter/app/views/borders.scala.html
                  HASH: 8ed2e1626bdc910995cf63fccc79e94d984c8129
                  MATRIX: 991->0|1070->53|1122->85|1153->90|1272->183|1315->205|1348->211|1533->370|1566->382|1595->384|6495->5257|6529->5269|6559->5271|6852->5537|6886->5549|6916->5551
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|171->140|171->140|173->142|184->153|184->153|186->155
                  -- GENERATED --
              */
          