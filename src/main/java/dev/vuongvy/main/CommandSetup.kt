package dev.vuongvy.main

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class CommandSetup : CommandExecutor {
    val all = "ABCDEFGHIJKLMNOPQRS"
    val mines = mutableListOf<Mine>()



    fun findNext(name: String): Mine {

        return
    }

    override fun onCommand(sender: CommandSender, cmd: Command, label: String, params: Array<out String>): Boolean {
        val letter = params[0] ?: return false

    }

    fun execute(sender: CommandSender, command: String) {

    }
}
