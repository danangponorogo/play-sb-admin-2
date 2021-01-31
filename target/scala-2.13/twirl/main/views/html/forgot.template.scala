
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

object forgot extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    """),_display_(/*5.6*/inc_head("SB Admin 2 - Forgot Password")),format.raw/*5.46*/("""
"""),format.raw/*6.1*/("""</head>

<body class="bg-gradient-primary">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-password-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-2">Forgot Your Password?</h1>
                                        <p class="mb-4">We get it, stuff happens. Just enter your email address below
                                            and we'll send you a link to reset your password!</p>
                                    </div>
                                    <form class="user">
                                        <div class="form-group">
                                            <input type="email" class="form-control form-control-user"
                                                id="exampleInputEmail" aria-describedby="emailHelp"
                                                placeholder="Enter Email Address...">
                                        </div>
                                        <a href="login.html" class="btn btn-primary btn-user btn-block">
                                            Reset Password
                                        </a>
                                    </form>
                                    <hr>
                                    <div class="text-center">
                                        <a class="small" href="register.html">Create an Account!</a>
                                    </div>
                                    <div class="text-center">
                                        <a class="small" href="login.html">Already have an account? Login!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src=""""),_display_(/*59.19*/routes/*59.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*59.73*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*60.89*/("""" type="text/javascript"></script>
    
    <!-- Core plugin JavaScript-->
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("vendor/jquery-easing/jquery.easing.min.js")),format.raw/*63.87*/("""" type="text/javascript"></script>
    
    <!-- Custom scripts for all pages-->
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("js/sb-admin-2.min.js")),format.raw/*66.66*/("""" type="text/javascript"></script>    

</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-31T11:50:16.068
                  SOURCE: D:/playframework/projects/starter/app/views/forgot.scala.html
                  HASH: 4d34a12aa377372ef9daf78071116e6938b23273
                  MATRIX: 990->0|1065->50|1125->90|1153->92|3708->2620|3723->2626|3792->2674|3873->2728|3888->2734|3973->2798|4096->2894|4111->2900|4194->2962|4323->3064|4338->3070|4400->3111
                  LINES: 32->1|36->5|36->5|37->6|90->59|90->59|90->59|91->60|91->60|91->60|94->63|94->63|94->63|97->66|97->66|97->66
                  -- GENERATED --
              */
          