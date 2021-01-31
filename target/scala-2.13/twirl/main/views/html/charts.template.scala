
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

object charts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),_display_(/*4.10*/inc_head("SB Admin 2 - Charts")),format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""</head>
    <body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">

<!-- sidebar -->
"""),_display_(/*11.2*/inc_sidebar("charts")),format.raw/*11.23*/("""

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
                    <h1 class="h3 mb-2 text-gray-800">Charts</h1>
                    <p class="mb-4">Chart.js is a third party plugin that is used to generate the charts in this theme.
                        The charts below have been customized - for further customization options, please visit the <a
                            target="_blank" href="https://www.chartjs.org/docs/latest/">official Chart.js
                            documentation</a>.</p>

                    <!-- Content Row -->
                    <div class="row">

                        <div class="col-xl-8 col-lg-7">

                            <!-- Area Chart -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Area Chart</h6>
                                </div>
                                <div class="card-body">
                                    <div class="chart-area">
                                        <canvas id="myAreaChart"></canvas>
                                    </div>
                                    <hr>
                                    Styling for the area chart can be found in the
                                    <code>/js/demo/chart-area-demo.js</code> file.
                                </div>
                            </div>

                            <!-- Bar Chart -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Bar Chart</h6>
                                </div>
                                <div class="card-body">
                                    <div class="chart-bar">
                                        <canvas id="myBarChart"></canvas>
                                    </div>
                                    <hr>
                                    Styling for the bar chart can be found in the
                                    <code>/js/demo/chart-bar-demo.js</code> file.
                                </div>
                            </div>

                        </div>

                        <!-- Donut Chart -->
                        <div class="col-xl-4 col-lg-5">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Donut Chart</h6>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-pie pt-4">
                                        <canvas id="myPieChart"></canvas>
                                    </div>
                                    <hr>
                                    Styling for the donut chart can be found in the
                                    <code>/js/demo/chart-pie-demo.js</code> file.
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
    """),_display_(/*98.6*/inc_footer()),format.raw/*98.18*/("""

"""),format.raw/*100.1*/("""</div>
<!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->
    
    <!-- Scroll to Top Button-->
    <!-- Logout Modal-->
    <!-- Bootstrap core JavaScript-->
    <!-- Core plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    """),_display_(/*111.6*/inc_bottom()),format.raw/*111.18*/("""
    
    """),format.raw/*113.5*/("""<!-- Page level plugins -->
    <script src=""""),_display_(/*114.19*/routes/*114.25*/.Assets.versioned("vendor/chart.js/Chart.min.js")),format.raw/*114.74*/("""" type="text/javascript"></script>
    
    <!-- Page level custom scripts -->
    <script src=""""),_display_(/*117.19*/routes/*117.25*/.Assets.versioned("js/demo/chart-area-demo.js")),format.raw/*117.72*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*118.19*/routes/*118.25*/.Assets.versioned("js/demo/chart-pie-demo.js")),format.raw/*118.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*119.19*/routes/*119.25*/.Assets.versioned("js/demo/chart-bar-demo.js")),format.raw/*119.71*/("""" type="text/javascript"></script>

    </body>
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
                  DATE: 2021-01-31T12:07:32.937
                  SOURCE: D:/playframework/projects/starter/app/views/charts.scala.html
                  HASH: c9f36e830430e99c2edca8bbbb12a66fa3921e94
                  MATRIX: 990->0|1069->53|1120->84|1151->89|1270->182|1312->203|1345->209|1530->368|1563->380|1592->382|5261->4025|5294->4037|5324->4039|5617->4305|5651->4317|5689->4327|5763->4373|5779->4379|5850->4428|5975->4525|5991->4531|6060->4578|6141->4631|6157->4637|6225->4683|6306->4736|6322->4742|6390->4788
                  LINES: 32->1|35->4|35->4|36->5|42->11|42->11|44->13|51->20|51->20|53->22|129->98|129->98|131->100|142->111|142->111|144->113|145->114|145->114|145->114|148->117|148->117|148->117|149->118|149->118|149->118|150->119|150->119|150->119
                  -- GENERATED --
              */
          