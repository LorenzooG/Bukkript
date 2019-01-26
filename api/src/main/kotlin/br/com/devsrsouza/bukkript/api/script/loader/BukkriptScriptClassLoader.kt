package br.com.devsrsouza.bukkript.api.script.loader

import br.com.devsrsouza.bukkript.api.ScriptDescription
import br.com.devsrsouza.bukkript.api.script.AbstractScript
import br.com.devsrsouza.bukkript.api.script.BukkriptCompiledScript
import java.net.URLClassLoader
import kotlin.reflect.KClass

abstract class BukkriptScriptClassLoader(
    loader: BukkriptScriptLoader,
    parent: ClassLoader,
    val bukkriptCompiledScript: BukkriptCompiledScript
) : URLClassLoader(emptyArray(), parent) {

    val description: ScriptDescription get() = bukkriptCompiledScript.description
    lateinit var scriptClass: KClass<AbstractScript>
}