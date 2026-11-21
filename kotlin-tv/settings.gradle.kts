
settings.pluginManagement {
repositories {

google(); mavenCentral(); gradlePluginPortal() } 
}
}
}
allprojects {
repositories {
maven { url 'https://maven.aliyun.com/repository/google' }
maven { url 'https://maven.aliyun.com/repository/public' }
}
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 国内打包节点优先从镜像解析 AndroidX，避免 Google Maven TLS 连接失败。
        maven("https://maven.aliyun.com/repository/google") {
            content { includeGroupByRegex("androidx\\..*") }
        }
        google()
        mavenCentral()
    }
}
rootProject.name = "HongguoTVNative"
include(":core", ":app")
