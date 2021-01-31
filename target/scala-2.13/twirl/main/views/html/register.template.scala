
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    """),_display_(/*5.6*/inc_head("SB Admin 2 - Register")),format.raw/*5.39*/("""
"""),format.raw/*6.1*/("""</head>

<body class="bg-gradient-primary">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                            </div>
                            <form class="user">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="First Name">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control form-control-user" id="exampleLastName"
                                            placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                                        placeholder="Email Address">
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="password" class="form-control form-control-user"
                                            id="exampleInputPassword" placeholder="Password">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control form-control-user"
                                            id="exampleRepeatPassword" placeholder="Repeat Password">
                                    </div>
                                </div>
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    Register Account
                                </a>
                                <hr>
                                <a href="index.html" class="btn btn-google btn-user btn-block">
                                    <i class="fab fa-google fa-fw"></i> Register with Google
                                </a>
                                <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                    <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                                </a>
                            </form>
                            <hr>
                            <div class="text-center">
                                <a class="small" href="forgot-password.html">Forgot Password?</a>
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

    <!-- Bootstrap core JavaScript-->
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*74.73*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*75.89*/("""" type="text/javascript"></script>
    
    <!-- Core plugin JavaScript-->
    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("vendor/jquery-easing/jquery.easing.min.js")),format.raw/*78.87*/("""" type="text/javascript"></script>
    
    <!-- Custom scripts for all pages-->
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("js/sb-admin-2.min.js")),format.raw/*81.66*/("""" type="text/javascript"></script>    

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
                  DATE: 2021-01-31T11:48:27.079
                  SOURCE: D:/playframework/projects/starter/app/views/register.scala.html
                  HASH: d3984e2daee2ca1e274ab2f1a828c4e74c0b7906
                  MATRIX: 992->0|1067->50|1120->83|1148->85|4912->3822|4927->3828|4996->3876|5077->3930|5092->3936|5177->4000|5300->4096|5315->4102|5398->4164|5527->4266|5542->4272|5604->4313
                  LINES: 32->1|36->5|36->5|37->6|105->74|105->74|105->74|106->75|106->75|106->75|109->78|109->78|109->78|112->81|112->81|112->81
                  -- GENERATED --
              */
          