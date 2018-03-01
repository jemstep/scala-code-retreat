import org.specs2._
import org.specs2.mutable.Specification

class ExampleUnitSpec extends Specification {

  "Lists" should {

    "sum correctly" in {
      List.empty[Int].sum must_== 0
    }

  }
}
