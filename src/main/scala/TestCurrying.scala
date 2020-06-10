import java.io.PrintWriter

/**
 * 测试柯里化函数
 */
object TestCurrying {

  /**
   * 定义一个柯里化函数
   *
   * @param path
   * @param func
   */
  def withPrintWriter(path: String)(func: PrintWriter => Unit) = {
    val writer = new PrintWriter(path)
    try {
      func(writer)
    } finally {
      writer.close()
    }
  }

  def main(args: Array[String]): Unit = {
    withPrintWriter("d:/out.txt") {
      printer => {
        printer.println("good good study")
      }
    }

    val o = Option("gs")
    o.getOrElse(() => {
      "asdgas"
    })
  }
}
