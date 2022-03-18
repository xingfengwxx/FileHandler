import java.io.*

val PATH_IMG_SOURCE = "E:\\壁纸\\img_source.jpg"

val PAHT_IMG_OUTPUT_FOLDER = "E:\\GenFiles\\"

fun main() {
    println("批量生成图片 开始==================")

    val imgFile = File(PATH_IMG_SOURCE)
    for (i in 0 .. 20000) {
        val destFile = File("$PAHT_IMG_OUTPUT_FOLDER\\img_${i}.jpg")
        println("write img file path: $destFile")
        copyFile(imgFile, destFile)
    }

    println("批量生成图片 结束==================")
}

fun copyFile(srcFile: File, destFile: File) {

    var fis = FileInputStream(srcFile);
    var fos = FileOutputStream(destFile)

    var bis = BufferedInputStream(fis)
    var bos = BufferedOutputStream(fos)


    var buf = ByteArray(1024)

    var len = 0;
    while (true) {
        len = bis.read(buf)
        if (len == -1) break;
        bos.write(buf, 0, len)
    }
    fis.close()
    fos.close()

}