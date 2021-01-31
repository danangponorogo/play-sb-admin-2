
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

object inc_bottom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/("""<!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    
    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Bootstrap core JavaScript-->
    <script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*27.73*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*28.89*/("""" type="text/javascript"></script>
    
    <!-- Core plugin JavaScript-->
    <script src=""""),_display_(/*31.19*/routes/*31.25*/.Assets.versioned("vendor/jquery-easing/jquery.easing.min.js")),format.raw/*31.87*/("""" type="text/javascript"></script>
    
    <!-- Custom scripts for all pages-->
    <script src=""""),_display_(/*34.19*/routes/*34.25*/.Assets.versioned("js/sb-admin-2.min.js")),format.raw/*34.66*/("""" type="text/javascript"></script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T07:20:57.256
                  SOURCE: D:/playframework/projects/starter/app/views/inc_bottom.scala.html
                  HASH: 4dc772bf0d52e1913c51ceb3df84f5e142935d81
                  MATRIX: 994->4|2244->1227|2259->1233|2328->1281|2409->1335|2424->1341|2509->1405|2632->1501|2647->1507|2730->1569|2859->1671|2874->1677|2936->1718
                  LINES: 32->1|58->27|58->27|58->27|59->28|59->28|59->28|62->31|62->31|62->31|65->34|65->34|65->34
                  -- GENERATED --
              */
          