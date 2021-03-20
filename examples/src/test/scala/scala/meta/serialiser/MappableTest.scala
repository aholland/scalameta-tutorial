package scala.meta.serialiser

import org.scalatest._
//import org.scalatest.matchers.must._
//import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec
import org.specs2._

object TestEntities {
  @mappable case class SimpleCaseClass(i: Int, s: String)
}

class MappableTest extends WordSpec with Matchers {
  import TestEntities._

  "simple case class" should {
    "deserialise to map" in {
      val testInstance = SimpleCaseClass(i = 42, s = "something")
      testInstance.toMap shouldBe Map("i" -> 42, "s" -> "something")
    }
  }

}
