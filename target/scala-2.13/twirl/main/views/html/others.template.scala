
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

object others extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - Others")),format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("others")),format.raw/*11.23*/("""

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
                    <h1 class="h3 mb-1 text-gray-800">Other Utilities</h1>
                    <p class="mb-4">Bootstrap's default utility classes can be found on the official <a
                            href="https://getbootstrap.com/docs">Bootstrap Documentation</a> page. The custom utilities
                        below were created to extend this theme past the default utility classes built into Bootstrap's
                        framework.</p>

                    <!-- Content Row -->
                    <div class="row">

                        <div class="col-lg-6">

                            <!-- Overflow Hidden -->
                            <div class="card mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Overflow Hidden Utilty</h6>
                                </div>
                                <div class="card-body">
                                    Use <code>.o-hidden</code> to set the overflow property of any element to hidden.
                                </div>
                            </div>

                            <!-- Progress Small -->
                            <div class="card mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Progress Small Utility</h6>
                                </div>
                                <div class="card-body">
                                    <div class="mb-1 small">Normal Progress Bar</div>
                                    <div class="progress mb-4">
                                        <div class="progress-bar" role="progressbar" style="width: 75%"
                                            aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    <div class="mb-1 small">Small Progress Bar</div>
                                    <div class="progress progress-sm mb-2">
                                        <div class="progress-bar" role="progressbar" style="width: 75%"
                                            aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                    Use the <code>.progress-sm</code> class along with <code>.progress</code>
                                </div>
                            </div>

                            <!-- Dropdown No Arrow -->
                            <div class="card mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Dropdown - No Arrow</h6>
                                </div>
                                <div class="card-body">
                                    <div class="dropdown no-arrow mb-4">
                                        <button class="btn btn-secondary dropdown-toggle" type="button"
                                            id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">
                                            Dropdown (no arrow)
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                    Add the <code>.no-arrow</code> class alongside the <code>.dropdown</code>
                                </div>
                            </div>

                        </div>

                        <div class="col-lg-6">

                            <!-- Roitation Utilities -->
                            <div class="card">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Rotation Utilities</h6>
                                </div>
                                <div class="card-body text-center">
                                    <div class="bg-primary text-white p-3 rotate-15 d-inline-block my-4">.rotate-15
                                    </div>
                                    <hr>
                                    <div class="bg-primary text-white p-3 rotate-n-15 d-inline-block my-4">.rotate-n-15
                                    </div>
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
    """),_display_(/*120.6*/inc_footer()),format.raw/*120.18*/("""

"""),format.raw/*122.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*133.6*/inc_bottom()),format.raw/*133.18*/("""

"""),format.raw/*135.1*/("""</body>
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
                  DATE: 2021-01-31T10:27:36.528
                  SOURCE: D:/playframework/projects/starter/app/views/others.scala.html
                  HASH: 0b17498ce23b5744d53950c9be3b34cc04f876bd
                  MATRIX: 990->0|1069->53|1120->84|1151->89|1270->182|1312->203|1345->209|1530->368|1563->380|1592->382|6933->5696|6967->5708|6997->5710|7290->5976|7324->5988|7354->5990
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|151->120|151->120|153->122|164->133|164->133|166->135
                  -- GENERATED --
              */
          