object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(59, 90, 14, 16, 4)
    assert(Policy.score(signalcase_1) == 108)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(92, 92, 8, 13, 4)
    assert(Policy.score(signalcase_2) == 206)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(104, 82, 24, 18, 8)
    assert(Policy.score(signalcase_3) == 182)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
