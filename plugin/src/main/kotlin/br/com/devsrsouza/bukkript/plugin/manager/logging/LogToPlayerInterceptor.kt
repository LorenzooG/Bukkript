package br.com.devsrsouza.bukkript.plugin.manager.logging

import br.com.devsrsouza.bukkript.script.definition.api.LogLevel
import br.com.devsrsouza.kotlinbukkitapi.collections.OnlinePlayerMap
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.msg
import org.bukkit.entity.Player

class LogToPlayerInterceptor(
    val players: OnlinePlayerMap<MutableList<String>>
) {
    fun interceptor(scriptName: String, level: LogLevel, message: String): String? {
        for ((player, scripts) in players)
            if(scriptName in scripts)
                player.msg(message)

        return message
    }
}