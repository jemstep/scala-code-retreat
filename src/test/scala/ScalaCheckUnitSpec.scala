import org.specs2._
import org.specs2.mutable.Specification
import org.specs2.ScalaCheck

class ScalaCheckUnitSpec extends Specification with ScalaCheck {

  "Numbers" should {

    "double correctly" in prop { (x: Int) =>
      x * 2 must_== x + x
    }

    "multiply correctly" in prop { (x: Int, y: Int) =>
      x * y must_== y * x
    }

  }
}
