repositories {  }
dependencies {
    compileOnly(project(":api"))

    shadow(kotlin("scripting-jvm"))
    shadow(kotlin("script-util"))

    /*compile("com.jcabi:jcabi-aether:0.10.1")
    compile("org.sonatype.aether:aether-api:1.13.1")
    compile("org.apache.maven:maven-core:3.0.3")*/
}