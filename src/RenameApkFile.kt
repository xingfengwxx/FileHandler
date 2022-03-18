import java.io.File

val PATH_APK_FOLDER = "D:\\APK\\release\\Healer-release-v2.4.0-20220120\\32bit"

val NEED_RENAME_ARR: Array<String> = arrayOf(
    "Healer-bzhan-release",
    "Healer-douyin-release",
    "Healer-douyinxxl-release",
    "Healer-dykoc01-release",
    "Healer-dykoc02-release",
    "Healer-dykoc03-release",
    "Healer-dykoc04-release",
    "Healer-mystore-release",
    "Healer-weibo-release",
    "Healer-zhihu-release",
)

val RENAME_FILE_NAME_ARR: Array<String> = arrayOf(
    "Todo-bzhan-release.apk",
    "Todo-douyin-release.apk",
    "Todo-douyinxxl-release.apk",
    "Todo-dykoc01-release.apk",
    "Todo-dykoc02-release.apk",
    "Todo-dykoc03-release.apk",
    "Todo-dykoc04-release.apk",
    "Todo-mystore-release.apk",
    "Todo-weibo-release.apk",
    "Todo-zhihu-release.apk",
)

fun main() {
    println("重命名apk文件 开始==================")

    val file = File(PATH_APK_FOLDER)
    val listFiles = file.listFiles()
    listFiles.forEach { file ->
//        println("apk file path: ${file.path}")
        NEED_RENAME_ARR.forEachIndexed { index, s ->
            if (file.name.contains(s)) {
                val destFile = File("$PATH_APK_FOLDER\\${RENAME_FILE_NAME_ARR[index]}")
                println("new apk file path: $destFile")
                file.renameTo(destFile)
            }
        }

    }

    println("重命名apk文件 结束==================")
}